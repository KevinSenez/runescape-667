import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Rectangle;

public final class Static585 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBII)V")
    public static void method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
        for (@Pc(1) int local1 = 0; local1 < InterfaceManager.rectangleCount; local1++) {
            @Pc(6) Rectangle local6 = InterfaceManager.rectangles[local1];
            if (arg1 < local6.x + local6.width && arg1 + arg0 > local6.x && local6.height + local6.y > arg3 && local6.y < arg2 + arg3) {
                InterfaceManager.dirtyRectangles[local1] = true;
            }
        }
        Static682.method8927(arg3, arg3 + arg2, arg1, arg1 + arg0);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)[Lclient!lga;")
    public static ServerProt[] method7677() {
        return new ServerProt[]{Static699.A_SERVER_PROT___252, Static273.A_SERVER_PROT___113, Static356.A_SERVER_PROT___149, Static155.A_SERVER_PROT___60, Static370.A_SERVER_PROT___152, ServerProt.A_SERVER_PROT___49, Static269.A_SERVER_PROT___111, Static384.A_SERVER_PROT___156, Static489.A_SERVER_PROT___185, Static303.A_SERVER_PROT___126, Static193.A_SERVER_PROT___74, Static137.A_SERVER_PROT___56, Static451.aServerProt_171, Static671.A_SERVER_PROT___246, ServerProt.VARBIT_SMALL, ServerProt.A_SERVER_PROT___19, Static504.A_SERVER_PROT___188, Static481.A_SERVER_PROT___178, Static655.A_SERVER_PROT___237, Static287.A_SERVER_PROT___119, Static441.A_SERVER_PROT___168, Static641.A_SERVER_PROT___234, Static161.A_SERVER_PROT___62, Static207.A_SERVER_PROT___127, Static137.A_SERVER_PROT___57, Static590.A_SERVER_PROT___217, Static31.A_SERVER_PROT___14, Static314.A_SERVER_PROT___132, Static84.A_SERVER_PROT___36, Static670.A_SERVER_PROT___245, Static353.A_SERVER_PROT___233, Static606.A_SERVER_PROT___221, Static286.A_SERVER_PROT___117, ServerProt.A_SERVER_PROT___45, Static231.A_SERVER_PROT___102, Static207.A_SERVER_PROT___128, Static331.A_SERVER_PROT___138, ServerProt.A_SERVER_PROT___43, Static232.A_SERVER_PROT___103, ServerProt.VARP_LARGE, Static616.A_SERVER_PROT___223, Static166.A_SERVER_PROT___63, Static444.A_SERVER_PROT___169, Static651.A_SERVER_PROT___235, Static452.A_SERVER_PROT___173, Static464.A_SERVER_PROT___176, Static157.A_SERVER_PROT___61, Static347.A_SERVER_PROT___146, Static18.A_SERVER_PROT___7, Static479.A_SERVER_PROT___177, Static383.A_SERVER_PROT___155, ServerProt.A_SERVER_PROT___147, Static25.A_SERVER_PROT___11, Static390.A_SERVER_PROT___158, Static51.A_SERVER_PROT___30, Static215.A_SERVER_PROT___86, Static309.A_SERVER_PROT___130, Static225.A_SERVER_PROT___90, Static416.A_SERVER_PROT___165, Static432.A_SERVER_PROT___10, ServerProt.A_SERVER_PROT___52, Static557.A_SERVER_PROT___205, Static722.A_SERVER_PROT___260, Static679.A_SERVER_PROT___247, Static14.A_SERVER_PROT___5, ServerProt.SOUND_AREA, Static297.A_SERVER_PROT___125, Static608.A_SERVER_PROT___222, Static619.A_SERVER_PROT___34, Static91.A_SERVER_PROT___236, Static36.A_SERVER_PROT___15, Static334.A_SERVER_PROT___140, Static250.A_SERVER_PROT___105, Static586.A_SERVER_PROT___215, ServerProt.A_SERVER_PROT___16, ServerProt.A_SERVER_PROT___53, Static85.A_SERVER_PROT___257, Static468.A_SERVER_PROT___212, Static526.A_SERVER_PROT___194, Static229.A_SERVER_PROT___101, Static526.A_SERVER_PROT___195, Static618.A_SERVER_PROT___227, Static587.A_SERVER_PROT___216, Static211.A_SERVER_PROT___143, ServerProt.VARBIT_LARGE, Static320.A_SERVER_PROT___135, Static283.A_SERVER_PROT___115, Static446.A_SERVER_PROT___170, Static688.A_SERVER_PROT___250, Static632.A_SERVER_PROT___229, Static133.A_SERVER_PROT___55, ServerProt.A_SERVER_PROT___54, Static344.A_SERVER_PROT___144, Static636.A_SERVER_PROT___230, Static629.A_SERVER_PROT___228, Static286.A_SERVER_PROT___118, Static41.A_SERVER_PROT___20, Static87.A_SERVER_PROT___37, Static9.A_SERVER_PROT___3, Static570.A_SERVER_PROT___208, Static565.A_SERVER_PROT___76, ServerProt.VARP_SMALL, Static408.A_SERVER_PROT___162, Static491.A_SERVER_PROT___254, Static542.A_SERVER_PROT___199, Static706.A_SERVER_PROT___255, Static19.A_SERVER_PROT___8, Static707.A_SERVER_PROT___256, Static605.A_SERVER_PROT___220, Static266.A_SERVER_PROT___192, Static459.A_SERVER_PROT___175, Static617.A_SERVER_PROT___224, Static312.A_SERVER_PROT___131, Static208.A_SERVER_PROT___83, Static533.A_SERVER_PROT___196, Static233.A_SERVER_PROT___104, Static550.A_SERVER_PROT___200, Static660.A_SERVER_PROT___239, Static331.A_SERVER_PROT___139, Static598.A_SERVER_PROT___219, Static663.A_SERVER_PROT___241, Static389.aServerProt_157, Static721.A_SERVER_PROT___259, Static428.A_SERVER_PROT___167, Static346.A_SERVER_PROT___145, Static72.A_SERVER_PROT___35, Static404.A_SERVER_PROT___161, Static563.A_SERVER_PROT___207, Static291.A_SERVER_PROT___123, Static663.A_SERVER_PROT___240, Static410.A_SERVER_PROT___163, Static224.A_SERVER_PROT___89, ServerProt.A_SERVER_PROT___18, Static718.A_SERVER_PROT___258, Static305.A_SERVER_PROT___129, Static411.A_SERVER_PROT___164, Static201.A_SERVER_PROT___206, ServerProt.A_SERVER_PROT___47, Static266.A_SERVER_PROT___191, Static692.A_SERVER_PROT___251, Static454.A_SERVER_PROT___174, Static618.A_SERVER_PROT___226, Static491.A_SERVER_PROT___253, Static272.A_SERVER_PROT___112, Static214.A_SERVER_PROT___85};
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z")
    public static boolean method7682(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
        if (arg0 == null || arg2 == null) {
            return false;
        } else if (arg0.startsWith("#") || arg2.startsWith("#")) {
            return arg0.equals(arg2);
        } else {
            return arg3.equals(arg1);
        }
    }
}
