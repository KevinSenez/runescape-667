package com.jagex.core.util;

import com.jagex.core.util.SystemTimer;
import com.jagex.core.util.TickScheduler;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class DefaultTickScheduler extends TickScheduler {

    @OriginalMember(owner = "client!au", name = "j", descriptor = "J")
    public long aLong18 = 0L;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public int anInt631 = 0;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "[J")
    public final long[] aLongArray1 = new long[10];

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public int anInt630 = 1;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "J")
    public long aLong19 = 0L;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "J")
    public long aLong20 = 0L;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    @Override
    public void reset() {
        this.aLong20 = 0L;
        if (this.aLong19 > this.aLong18) {
            this.aLong18 += this.aLong19 - this.aLong18;
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)J")
    @Override
    protected long getDelay() {
        this.aLong18 += this.method734();
        return this.aLong18 < this.aLong19 ? (this.aLong19 - this.aLong18) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)J")
    @Override
    public long getTickTime() {
        return this.aLong18;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BJ)I")
    @Override
    protected int schedule(@OriginalArg(1) long arg0) {
        if (this.aLong19 > this.aLong18) {
            this.aLong20 += this.aLong19 - this.aLong18;
            this.aLong18 += this.aLong19 - this.aLong18;
            this.aLong19 += arg0;
            return 1;
        }
        @Pc(47) int local47 = 0;
        do {
            local47++;
            this.aLong19 += arg0;
        } while (local47 < 10 && this.aLong18 > this.aLong19);
        if (this.aLong18 > this.aLong19) {
            this.aLong19 = this.aLong18;
        }
        return local47;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(B)J")
    public long method734() {
        @Pc(10) long local10 = SystemTimer.safetime() * 1000000L;
        @Pc(16) long local16 = local10 - this.aLong20;
        this.aLong20 = local10;
        if (local16 > -5000000000L && local16 < 5000000000L) {
            this.aLongArray1[this.anInt631] = local16;
            this.anInt631 = (this.anInt631 + 1) % 10;
            if (this.anInt630 < 10) {
                this.anInt630++;
            }
        }
        @Pc(61) long local61 = 0L;
        for (@Pc(63) int local63 = 1; local63 <= this.anInt630; local63++) {
            local61 += this.aLongArray1[(this.anInt631 + 10 - local63) % 10];
        }
        return local61 / (long) this.anInt630;
    }
}
