import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Calendar;

public final class Static647 {

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!kda;")
    public static final Class204 aClass204_13 = new Class204(6, 1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Z")
    public static boolean method8468() {
        return MainLogicManager.step >= 1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(JZII)Ljava/lang/String;")
    public static String method8474(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
        Static356.method5196(arg0);
        @Pc(16) Calendar local16 = Static260.aCalendar1;
        @Pc(20) int local20 = local16.get(5);
        @Pc(24) int local24 = local16.get(2);
        @Pc(28) int local28 = local16.get(1);
        @Pc(32) int local32 = local16.get(11);
        @Pc(36) int local36 = local16.get(12);
        return arg1 == 3 ? Static120.method2198(arg0, arg1) : Integer.toString(local20 / 10) + local20 % 10 + "-" + Static19.aStringArrayArray1[arg1][local24] + "-" + local28 + " " + local32 / 10 + local32 % 10 + ":" + local36 / 10 + local36 % 10;
    }
}
