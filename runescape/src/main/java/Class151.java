import com.jagex.collect.ref.ReferenceCache;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class151 {

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!dla;")
    public final ReferenceCache aReferenceCache_79 = new ReferenceCache(64);

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!sb;")
    public final js5 aJs5_51;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "Lclient!sb;")
    public final js5 aJs5_50;

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(ILclient!sb;Lclient!sb;)V")
    public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) js5 arg1, @OriginalArg(2) js5 arg2) {
        this.aJs5_51 = arg2;
        this.aJs5_50 = arg1;
        if (this.aJs5_50 != null) {
            this.aJs5_50.method7608(0);
        }
        if (this.aJs5_51 != null) {
            this.aJs5_51.method7608(0);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Lclient!bq;")
    public DoublyLinkedNode_Sub2_Sub3 method3234(@OriginalArg(1) int arg0) {
        @Pc(11) DoublyLinkedNode_Sub2_Sub3 local11 = (DoublyLinkedNode_Sub2_Sub3) this.aReferenceCache_79.get((long) arg0);
        if (local11 != null) {
            return local11;
        }
        @Pc(28) byte[] local28;
        if (arg0 < 32768) {
            local28 = this.aJs5_50.getfile(arg0, 0);
        } else {
            local28 = this.aJs5_51.getfile(arg0 & 0x7FFF, 0);
        }
        local11 = new DoublyLinkedNode_Sub2_Sub3();
        if (local28 != null) {
            local11.method1180(new Packet(local28));
        }
        if (arg0 >= 32768) {
            local11.method1186();
        }
        this.aReferenceCache_79.put(local11, (long) arg0);
        return local11;
    }
}
