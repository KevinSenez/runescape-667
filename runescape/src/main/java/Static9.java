import com.jagex.ServerProt;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "F")
    public static float aFloat1;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int anInt121;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
    public static int[] anIntArray18 = new int[2];

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___3 = new ServerProt(98, 6);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
    public static final int[] anIntArray19 = new int[3];

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method123() {
        Static594.A_WEIGHTED_CACHE___193.reset();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BZ)V")
    public static void method124(@OriginalArg(0) byte[] arg0) {
        @Pc(15) Packet local15 = new Packet(arg0);
        while (true) {
            @Pc(19) int local19 = local15.g1();
            if (local19 == 0) {
                return;
            }
            if (local19 == 1) {
                @Pc(34) int local34 = local15.g2();
                if (Static597.anInt8821 == -1) {
                    Static597.anInt8821 = local34;
                }
            }
        }
    }
}
