import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Date;

public final class Static356 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int anInt5773;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IJ)V")
    public static void method5196(@OriginalArg(1) long arg0) {
        Static260.aCalendar1.setTime(new Date(arg0));
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
    public static int method5199(@OriginalArg(0) int arg0) {
        @Pc(1) int local1 = -1;
        for (@Pc(3) int local3 = 0; local3 < Static549.anInt9424 - 1; local3++) {
            if (arg0 < Static537.anIntArray633[local3] + Static621.anIntArray766[local3]) {
                local1 = local3;
                break;
            }
        }
        if (local1 == -1) {
            local1 = Static549.anInt9424 - 1;
        }
        return local1;
    }

}
