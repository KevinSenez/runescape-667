import com.jagex.ServerProt;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

    @OriginalMember(owner = "client!jka", name = "l", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___126 = new ServerProt(9, 10);

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IB)V")
    public static void method4428(@OriginalArg(0) int arg0) {
        if (!Static470.method6387()) {
            return;
        }
        if (Static129.anInt2409 != arg0) {
            Static319.aString51 = "";
        }
        Static129.anInt2409 = arg0;
        ConnectionManager.LOBBY.close();
        MainLogicManager.setStep(5);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!ge;B)Lclient!gha;")
    public static Class138_Sub2 method4430(@OriginalArg(0) Packet arg0) {
        @Pc(15) Class138 local15 = Class138.method8359(arg0);
        @Pc(19) int local19 = arg0.g4();
        @Pc(23) int local23 = arg0.g4();
        @Pc(27) int local27 = arg0.g2();
        return new Class138_Sub2(local15.aHorizontalAlignment_10, local15.aVerticalAlignment_10, local15.anInt4423, local15.anInt4412, local15.anInt4418, local15.anInt4413, local15.anInt4416, local15.anInt4415, local15.anInt4421, local19, local23, local27);
    }
}
