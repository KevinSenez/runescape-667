import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class137 implements Interface15 {

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Lclient!sb;")
    public final js5 aJs5_39;

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!sb;)V")
    public Class137(@OriginalArg(0) js5 arg0) {
        this.aJs5_39 = arg0;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I")
    @Override
    public int method6465() {
        return this.aJs5_39.isComplete() ? 100 : this.aJs5_39.method7582();
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Lclient!kf;")
    @Override
    public Class206 method6464() {
        return Static326.aClass206_1;
    }
}
