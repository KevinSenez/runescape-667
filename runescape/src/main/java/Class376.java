import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class376 {

    @OriginalMember(owner = "client!uja", name = "l", descriptor = "I")
    public int anInt9689 = 2;

    @OriginalMember(owner = "client!uja", name = "m", descriptor = "I")
    public int anInt9693 = -1;

    @OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
    public int anInt9690 = 64;

    @OriginalMember(owner = "client!uja", name = "k", descriptor = "Z")
    public boolean aBoolean747 = false;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "Z")
    public boolean aBoolean748 = false;

    @OriginalMember(owner = "client!uja", name = "i", descriptor = "I")
    public int anInt9697 = 1;

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "I")
    public int anInt9696 = 64;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!ge;IBI)V")
    public void method8510(@OriginalArg(0) Node_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
        if (arg2 == 1) {
            this.anInt9693 = arg0.method7382();
            if (this.anInt9693 == 65535) {
                this.anInt9693 = -1;
            }
        } else if (arg2 == 2) {
            this.anInt9696 = arg0.method7382() + 1;
            this.anInt9690 = arg0.method7382() + 1;
        } else if (arg2 == 3) {
            arg0.method7377();
        } else if (arg2 == 4) {
            this.anInt9689 = arg0.method7396();
        } else if (arg2 == 5) {
            this.anInt9697 = arg0.method7396();
        } else if (arg2 == 6) {
            this.aBoolean748 = true;
        } else if (arg2 == 7) {
            this.aBoolean747 = true;
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(IBLclient!ge;)V")
    public void method8511(@OriginalArg(0) int arg0, @OriginalArg(2) Node_Sub21 arg1) {
        while (true) {
            @Pc(13) int local13 = arg1.method7396();
            if (local13 == 0) {
                return;
            }
            this.method8510(arg1, arg0, local13);
        }
    }
}
