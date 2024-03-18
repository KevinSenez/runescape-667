package com.jagex.collect.ref;

import com.jagex.collect.DoublyLinkedNode;
import com.jagex.collect.HashTable;
import com.jagex.collect.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dla")
public final class ReferenceCache {

    @OriginalMember(owner = "client!dla", name = "j", descriptor = "Lclient!jga;")
    public final Queue history;

    @OriginalMember(owner = "client!dla", name = "h", descriptor = "I")
    public int remaining;

    @OriginalMember(owner = "client!dla", name = "r", descriptor = "Lclient!av;")
    public final HashTable table;

    @OriginalMember(owner = "client!dla", name = "c", descriptor = "I")
    public final int capacity;

    @OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(I)V")
    public ReferenceCache(@OriginalArg(0) int size) {
        this(size, size);
    }

    @OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(II)V")
    public ReferenceCache(@OriginalArg(0) int max, @OriginalArg(1) int min) {
        this.history = new Queue();
        this.capacity = max;
        this.remaining = max;
        @Pc(14) int buckets;
        for (buckets = 1; (max > (buckets + buckets)) && (buckets < min); buckets += buckets) {
        }
        this.table = new HashTable(buckets);
    }

    @OriginalMember(owner = "client!dla", name = "c", descriptor = "(I)I")
    public int remaining() {
        return this.remaining;
    }

    @OriginalMember(owner = "client!dla", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public Object first() {
        @Pc(19) ReferenceNode current = (ReferenceNode) this.table.first();
        while (current != null) {
            @Pc(25) Object object = current.get();

            if (object == null) {
                @Pc(29) ReferenceNode copy = current;
                current = (ReferenceNode) this.table.next();
                copy.remove();
                copy.remove2();
                this.remaining += copy.size;
            } else {
                return object;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dla", name = "d", descriptor = "(I)I")
    public int capacity() {
        return this.capacity;
    }

    @OriginalMember(owner = "client!dla", name = "a", descriptor = "(II)V")
    public void clean(@OriginalArg(0) int maxAge) {
        if (SoftReferenceFactory.INSTANCE == null) {
            return;
        }

        for (@Pc(15) ReferenceNode node = (ReferenceNode) this.history.first(); node != null; node = (ReferenceNode) this.history.next()) {
            if (node.isSoft()) {
                if (node.get() == null) {
                    node.remove();
                    node.remove2();
                    this.remaining += node.size;
                }
            } else if (++node.key2 > (long) maxAge) {
                @Pc(42) ReferenceNode softReference = SoftReferenceFactory.INSTANCE.create(node);
                this.table.put(node.key, softReference);
                DoublyLinkedNode.attachAfter(node, softReference);
                node.remove();
                node.remove2();
            }
        }
    }

    @OriginalMember(owner = "client!dla", name = "b", descriptor = "(B)I")
    public int hardCount() {
        @Pc(5) int count = 0;
        for (@Pc(11) ReferenceNode node = (ReferenceNode) this.history.first(); node != null; node = (ReferenceNode) this.history.next()) {
            if (!node.isSoft()) {
                count++;
            }
        }
        return count;
    }

    @OriginalMember(owner = "client!dla", name = "a", descriptor = "(ILclient!vw;)V")
    public void remove(@OriginalArg(1) ReferenceNode arg0) {
        if (arg0 != null) {
            arg0.remove();
            arg0.remove2();
            this.remaining += arg0.size;
        }
    }

    @OriginalMember(owner = "client!dla", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
    public void put(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
        this.put(arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!dla", name = "a", descriptor = "(B)V")
    public void clearSoft() {
        for (@Pc(14) ReferenceNode local14 = (ReferenceNode) this.history.first(); local14 != null; local14 = (ReferenceNode) this.history.next()) {
            if (local14.isSoft()) {
                local14.remove();
                local14.remove2();
                this.remaining += local14.size;
            }
        }
    }

    @OriginalMember(owner = "client!dla", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public Object next() {
        @Pc(19) ReferenceNode current = (ReferenceNode) this.table.next();
        while (current != null) {
            @Pc(25) Object object = current.get();
            if (object != null) {
                return object;
            }
            @Pc(29) ReferenceNode copy = current;
            current = (ReferenceNode) this.table.next();
            copy.remove();
            copy.remove2();
            this.remaining += copy.size;
        }
        return null;
    }

    @OriginalMember(owner = "client!dla", name = "a", descriptor = "(JLjava/lang/Object;II)V")
    public void put(@OriginalArg(0) long key, @OriginalArg(1) Object object, @OriginalArg(2) int size) {
        if (size > this.capacity) {
            throw new IllegalStateException("s>cs");
        }

        this.remove(key);
        this.remaining -= size;

        while (this.remaining < 0) {
            @Pc(32) ReferenceNode first = (ReferenceNode) this.history.removeFirst();
            this.remove(first);
        }

        @Pc(48) HardReferenceNode node = new HardReferenceNode(object, size);
        this.table.put(key, node);
        this.history.add(node);
        node.key2 = 0L;
    }

    @OriginalMember(owner = "client!dla", name = "a", descriptor = "(JI)V")
    public void remove(@OriginalArg(0) long key) {
        @Pc(15) ReferenceNode node = (ReferenceNode) this.table.get(key);
        this.remove(node);
    }

    @OriginalMember(owner = "client!dla", name = "b", descriptor = "(JI)Ljava/lang/Object;")
    public Object get(@OriginalArg(0) long key) {
        @Pc(12) ReferenceNode node = (ReferenceNode) this.table.get(key);
        if (node == null) {
            return null;
        }

        @Pc(26) Object object = node.get();
        if (object == null) {
            node.remove();
            node.remove2();
            this.remaining += node.size;
            return null;
        }

        if (node.isSoft()) {
            @Pc(65) HardReferenceNode hardReference = new HardReferenceNode(object, node.size);
            this.table.put(node.key, hardReference);
            this.history.add(hardReference);
            hardReference.key2 = 0L;
            node.remove();
            node.remove2();
        } else {
            this.history.add(node);
            node.key2 = 0L;
        }

        return object;
    }

    @OriginalMember(owner = "client!dla", name = "a", descriptor = "(Z)V")
    public void reset() {
        this.history.clear();
        this.table.clear();
        this.remaining = this.capacity;
    }
}