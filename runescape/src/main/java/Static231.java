import com.jagex.Class84;
import com.jagex.SignLink;
import com.jagex.core.io.Files;
import com.jagex.core.stringtools.general.StringTools;
import com.jagex.core.util.SystemTimer;
import com.jagex.game.Animator;
import com.jagex.game.LocalisedText;
import com.jagex.js5.js5;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public final class Static231 {

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int anInt3734;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!hd;")
    public static final Class157 aClass157_1 = new Class157(0, 3, Static702.aClass397_20);

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!hd;")
    public static final Class157 aClass157_2 = new Class157(1, 3, Static702.aClass397_20);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!hd;")
    public static final Class157 aClass157_3 = new Class157(2, 4, Static702.aClass397_16);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!hd;")
    public static final Class157 aClass157_4 = new Class157(3, 1, Static702.aClass397_20);

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!hd;")
    public static final Class157 aClass157_5 = new Class157(4, 2, Static702.aClass397_20);

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!hd;")
    public static final Class157 aClass157_6 = new Class157(5, 3, Static702.aClass397_20);

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!hd;")
    public static final Class157 aClass157_7 = new Class157(6, 4, Static702.aClass397_20);

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static final int anInt3733 = Static434.method5853(16);

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!ss;")
    public static final Class345 aClass345_41 = new Class345(34, 4);

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___102 = new ServerProt(34, 6);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method3375() {
        if (Static163.activeToolkit == null) {
            return;
        }
        if (InterfaceManager.aBoolean210) {
            Static164.method2606();
        }
        Static514.aClass213_2.method5010();
        Static563.method7461();
        Static244.method3512();
        Static329.method1649();
        Static638.method8393();
        Static65.method1472();
        Static81.method1589();
        Static352.method5180();
        Static203.method3068();
        Static143.method3572();
        Static668.method8700(false);
        for (@Pc(34) int local34 = 0; local34 < 2048; local34++) {
            @Pc(39) PlayerEntity local39 = PlayerList.highResolutionPlayers[local34];
            if (local39 != null) {
                for (@Pc(43) int local43 = 0; local43 < local39.aModelArray3.length; local43++) {
                    local39.aModelArray3[local43] = null;
                }
            }
        }
        for (@Pc(65) int local65 = 0; local65 < Static416.anInt6378; local65++) {
            @Pc(71) Class8_Sub2_Sub1_Sub2_Sub2 local71 = Static592.aClass2_Sub45Array1[local65].aClass8_Sub2_Sub1_Sub2_Sub2_2;
            if (local71 != null) {
                for (@Pc(75) int local75 = 0; local75 < local71.aModelArray3.length; local75++) {
                    local71.aModelArray3[local75] = null;
                }
            }
        }
        Static59.aMatrix_5 = null;
        Static460.aMatrix_10 = null;
        Static163.activeToolkit.free();
        Static163.activeToolkit = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lclient!hd;")
    public static Class157 method3377(@OriginalArg(0) int arg0) {
        if (arg0 == 0) {
            return aClass157_1;
        } else if (arg0 == 1) {
            return aClass157_2;
        } else if (arg0 == 2) {
            return aClass157_3;
        } else if (arg0 == 3) {
            return aClass157_4;
        } else if (arg0 == 4) {
            return aClass157_5;
        } else if (arg0 == 5) {
            return aClass157_6;
        } else if (arg0 == 6) {
            return aClass157_7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static int method3379(@OriginalArg(1) String arg0) {
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZZLjava/lang/String;)V")
    public static void method3381(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
        try {
            label721:
            {
                if (!arg2.equalsIgnoreCase("commands") && !arg2.equalsIgnoreCase("help")) {
                    if (arg2.equalsIgnoreCase("cls")) {
                        Static213.anInt3471 = 0;
                        Static512.anInt7664 = 0;
                        return;
                    }
                    if (arg2.equalsIgnoreCase("displayfps")) {
                        Static105.displayFps = !Static105.displayFps;
                        if (!Static105.displayFps) {
                            Static79.method1579("FPS off");
                            return;
                        }
                        Static79.method1579("FPS on");
                        return;
                    }
                    if (arg2.equals("renderer")) {
                        @Pc(103) Class84 local103 = Static163.activeToolkit.method7981();
                        Static79.method1579("Vendor: " + local103.anInt2329);
                        Static79.method1579("Name: " + local103.aString22);
                        Static79.method1579("Version: " + local103.anInt2331);
                        Static79.method1579("Device: " + local103.aString21);
                        Static79.method1579("Driver Version: " + local103.aLong91);
                        return;
                    }
                    if (!arg2.equals("heap")) {
                        if (arg2.equalsIgnoreCase("getcamerapos")) {
                            Static79.method1579("Pos: " + Static556.self.aByte144 + "," + ((Static170.anInt2864 >> 9) + Static691.areaBaseX >> 6) + "," + ((Static110.anInt2186 >> 9) + Static116.areaBaseY >> 6) + "," + ((Static170.anInt2864 >> 9) + Static691.areaBaseX & 0x3F) + "," + ((Static110.anInt2186 >> 9) + Static116.areaBaseY & 0x3F) + " Height: " + (Static102.method2025(Static556.self.aByte144, -29754, Static110.anInt2186, Static170.anInt2864) - Static359.anInt5801));
                            Static79.method1579("Look: " + Static556.self.aByte144 + "," + (Static441.anInt6689 + Static691.areaBaseX >> 6) + "," + (Static116.areaBaseY + Static12.anInt5741 >> 6) + "," + (Static691.areaBaseX + Static441.anInt6689 & 0x3F) + "," + (Static116.areaBaseY + Static12.anInt5741 & 0x3F) + " Height: " + (Static102.method2025(Static556.self.aByte144, -29754, Static12.anInt5741, Static441.anInt6689) - Static55.anInt1125));
                            return;
                        }
                        break label721;
                    }
                    Static79.method1579("Heap: " + Static369.anInt4265 + "MB");
                    return;
                }
                Static79.method1579("commands - This command");
                Static79.method1579("cls - Clear console");
                Static79.method1579("displayfps - Toggle FPS and other information");
                Static79.method1579("renderer - Print graphics renderer information");
                Static79.method1579("heap - Print java memory information");
                Static79.method1579("getcamerapos - Print location and direction of camera for use in bug reports");
                return;
            }
        } catch (@Pc(323) Exception local323) {
            Static79.method1579(LocalisedText.DEBUG_CONSOLE_ERROR.localise(Static51.language));
            return;
        }
        if (Static446.aClass355_5 != Static2.aClass355_1 || Static608.anInt9290 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("printfps")) {
                    Static79.method1579("FPS: " + Static652.currentFps);
                    return;
                }
                if (arg2.equalsIgnoreCase("occlude")) {
                    Static18.aBoolean20 = !Static18.aBoolean20;
                    if (!Static18.aBoolean20) {
                        Static79.method1579("Occlsion now off!");
                        return;
                    }
                    Static79.method1579("Occlsion now on!");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpson")) {
                    Static105.displayFps = true;
                    Static79.method1579("fps debug enabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    Static105.displayFps = false;
                    Static79.method1579("fps debug disabled");
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        Static79.method1579("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static292.aClass2_Sub43_2.anInt7610 + "Mb");
                        return;
                    } catch (@Pc(474) Throwable local474) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    Static422.A_ENTITY_LIST___9.clear();
                    Static79.method1579("Text coords cleared");
                    return;
                }
                @Pc(521) int local521;
                @Pc(501) int local501;
                @Pc(511) Runtime local511;
                if (arg2.equalsIgnoreCase("gc")) {
                    Static664.cacheRemoveSoftReferences();
                    for (local501 = 0; local501 < 10; local501++) {
                        System.gc();
                    }
                    local511 = Runtime.getRuntime();
                    local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
                    Static79.method1579("mem=" + local521 + "k");
                    return;
                }
                @Pc(582) int local582;
                if (arg2.equalsIgnoreCase("compact")) {
                    Static664.cacheRemoveSoftReferences();
                    for (local501 = 0; local501 < 10; local501++) {
                        System.gc();
                    }
                    local511 = Runtime.getRuntime();
                    local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
                    Static79.method1579("Memory before cleanup=" + local521 + "k");
                    Static358.method9191();
                    Static664.cacheRemoveSoftReferences();
                    for (local582 = 0; local582 < 10; local582++) {
                        System.gc();
                    }
                    local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
                    Static79.method1579("Memory after cleanup=" + local521 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    Static79.method1579(Static501.method6714() ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    Static79.method1579("Dropped client connection");
                    if (MainLogicManager.step == 11) {
                        ConnectionManager.disconnect();
                    } else if (MainLogicManager.step == 12) {
                        ConnectionManager.GAME.errored = true;
                        return;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                    client.gameConnection.rotateMethods();
                    Static79.method1579("Rotated connection methods");
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    client.js5WorkerThread.close();
                    Static79.method1579("Dropped client com.jagex.js5.js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    client.js5WorkerThread.closeServer();
                    Static79.method1579("Dropped server com.jagex.js5.js5 net queue");
                    return;
                }
                @Pc(725) int local725;
                if (arg2.equalsIgnoreCase("breakcon")) {
                    SignLink.instance.timeout();
                    @Pc(723) ServerConnection[] local723 = Static405.A_SERVER_CONNECTION_ARRAY_1;
                    for (local725 = 0; local725 < local723.length; local725++) {
                        @Pc(730) ServerConnection connection = local723[local725];
                        if (connection.connection != null) {
                            connection.connection.breakConnection();
                        }
                    }
                    client.js5WorkerThread.stop();
                    Static79.method1579("Breaking new connections for 5 seconds");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    Static449.mapBuild();
                    Static244.method3512();
                    Static79.method1579("Rebuilding map");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuildprofile")) {
                    Static690.aLong318 = SystemTimer.safetime();
                    Static28.aBoolean43 = true;
                    Static449.mapBuild();
                    Static244.method3512();
                    Static79.method1579("Rebuilding map (with profiling)");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    Static409.method5657(1, -1, false, -1);
                    if (Static36.method978(3) != 1) {
                        Static79.method1579("wm1 failed");
                        return;
                    }
                    Static79.method1579("wm1 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    Static409.method5657(2, -1, false, -1);
                    if (Static36.method978(3) != 2) {
                        Static79.method1579("wm2 failed");
                        return;
                    }
                    Static79.method1579("wm2 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    Static409.method5657(3, 1024, false, 768);
                    if (Static36.method978(3) != 3) {
                        Static79.method1579("wm3 failed");
                        return;
                    }
                    Static79.method1579("wm3 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    Static32.method880(0, false);
                    if (Static400.instance.aClass57_Sub29_1.method7915() == 0) {
                        Static79.method1579("Entered tk0");
                        Static400.instance.method5104(0, Static400.instance.aClass57_Sub29_2);
                        Static666.method8693(1);
                        Static503.aBoolean578 = false;
                        return;
                    }
                    Static79.method1579("Failed to enter tk0");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    Static32.method880(1, false);
                    if (Static400.instance.aClass57_Sub29_1.method7915() == 1) {
                        Static79.method1579("Entered tk1");
                        Static400.instance.method5104(1, Static400.instance.aClass57_Sub29_2);
                        Static666.method8693(1);
                        Static503.aBoolean578 = false;
                        return;
                    }
                    Static79.method1579("Failed to enter tk1");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    Static32.method880(2, false);
                    if (Static400.instance.aClass57_Sub29_1.method7915() == 2) {
                        Static79.method1579("Entered tk2");
                        Static400.instance.method5104(2, Static400.instance.aClass57_Sub29_2);
                        Static666.method8693(1);
                        Static503.aBoolean578 = false;
                        return;
                    }
                    Static79.method1579("Failed to enter tk2");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    Static32.method880(3, false);
                    if (Static400.instance.aClass57_Sub29_1.method7915() != 3) {
                        Static79.method1579("Failed to enter tk3");
                        return;
                    }
                    Static79.method1579("Entered tk3");
                    Static400.instance.method5104(3, Static400.instance.aClass57_Sub29_2);
                    Static666.method8693(1);
                    Static503.aBoolean578 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    Static32.method880(5, false);
                    if (Static400.instance.aClass57_Sub29_1.method7915() == 5) {
                        Static79.method1579("Entered tk5");
                        Static400.instance.method5104(5, Static400.instance.aClass57_Sub29_2);
                        Static666.method8693(1);
                        Static503.aBoolean578 = false;
                        return;
                    }
                    Static79.method1579("Failed to enter tk5");
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        Static79.method1579("Invalid buildarea value");
                        return;
                    }
                    local501 = StringTools.parseDecimal(arg2.substring(6));
                    if (local501 >= 0 && local501 <= Static461.method6268(Static369.anInt4265)) {
                        Static400.instance.method5104(local501, Static400.instance.aClass57_Sub5_1);
                        Static666.method8693(1);
                        Static503.aBoolean578 = false;
                        Static79.method1579("maxbuildarea=" + Static400.instance.aClass57_Sub5_1.method2172());
                        return;
                    }
                    Static79.method1579("Invalid buildarea value");
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        Static79.method1579("Invalid rect_debug value");
                        return;
                    }
                    InterfaceManager.rectDebug = StringTools.parseDecimal(arg2.substring(10).trim());
                    Static79.method1579("rect_debug=" + InterfaceManager.rectDebug);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    InterfaceManager.testOpacity = true;
                    Static79.method1579("qa_op_test=" + InterfaceManager.testOpacity);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    InterfaceManager.clipComponents = !InterfaceManager.clipComponents;
                    Static79.method1579("clipcomponents=" + InterfaceManager.clipComponents);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    @Pc(1264) boolean local1264 = Static163.activeToolkit.method8014();
                    if (Static249.method3537(!local1264)) {
                        if (local1264) {
                            Static79.method1579("Bloom disabled");
                            return;
                        }
                        Static79.method1579("Bloom enabled");
                        return;
                    }
                    Static79.method1579("Failed to enable bloom");
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!Animator.forceTweening) {
                        Animator.forceTweening = true;
                        Static79.method1579("Forced tweening ENABLED!");
                        return;
                    }
                    Animator.forceTweening = false;
                    Static79.method1579("Forced tweening disabled.");
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (Static209.aBoolean269) {
                        Static79.method1579("Shift-click disabled.");
                        Static209.aBoolean269 = false;
                        return;
                    }
                    Static79.method1579("Shift-click ENABLED!");
                    Static209.aBoolean269 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    Static79.method1579("x:" + (Static556.self.anInt10690 >> 9) + " z:" + (Static556.self.anInt10694 >> 9));
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    Static79.method1579("Height: " + Static246.activeGround[Static556.self.aByte144].getHeight(Static556.self.anInt10694 >> 9, Static556.self.anInt10690 >> 9));
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    js5.SPRITES.discardPacked();
                    js5.SPRITES.discardUnpacked();
                    Static720.aMSITypeList_4.cacheReset();
                    Static577.aClass246_4.method5586();
                    Static244.method3512();
                    Static79.method1579("Minimap reset");
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (Static163.activeToolkit.method7979()) {
                        local501 = Integer.parseInt(arg2.substring(3));
                        if (local501 < 1) {
                            local501 = 1;
                        } else if (local501 > 4) {
                            local501 = 4;
                        }
                        Static455.anInt6915 = local501;
                        Static449.mapBuild();
                        Static79.method1579("Render cores now: " + Static455.anInt6915);
                        return;
                    }
                    Static79.method1579("Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    Static79.method1579("I(s): " + Component.sprites.remaining() + "/" + Component.sprites.capacity());
                    Static79.method1579("I(m): " + Component.models.remaining() + "/" + Component.models.capacity());
                    Static79.method1579("O(s): " + Static419.objTypeList.spriteCache.remaining() + "/" + Static419.objTypeList.spriteCache.capacity());
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    Static354.showProfiling = !Static354.showProfiling;
                    Static163.activeToolkit.method8018(Static354.showProfiling);
                    Static126.method2228();
                    Static79.method1579("showprofiling=" + Static354.showProfiling);
                    return;
                }
                @Pc(1621) String[] local1621;
                if (arg2.startsWith("performancetest")) {
                    local501 = -1;
                    local725 = 1000;
                    if (arg2.length() > 15) {
                        local1621 = Static189.method2861(arg2, ' ');
                        try {
                            if (local1621.length > 1) {
                                local725 = Integer.parseInt(local1621[1]);
                            }
                        } catch (@Pc(1634) Throwable local1634) {
                        }
                        try {
                            if (local1621.length > 2) {
                                local501 = Integer.parseInt(local1621[2]);
                            }
                        } catch (@Pc(1645) Throwable local1645) {
                        }
                    }
                    if (local501 != -1) {
                        Static79.method1579("Performance: " + Static363.method6235(local725, local501));
                        return;
                    }
                    Static79.method1579("Java toolkit: " + Static363.method6235(local725, 0));
                    Static79.method1579("SSE toolkit:  " + Static363.method6235(local725, 2));
                    Static79.method1579("D3D toolkit:  " + Static363.method6235(local725, 3));
                    Static79.method1579("GL toolkit:   " + Static363.method6235(local725, 1));
                    Static79.method1579("GLX toolkit:  " + Static363.method6235(local725, 5));
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    Static353.aBoolean734 = !Static353.aBoolean734;
                    Static79.method1579("nonpcs=" + Static353.aBoolean734);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    Static152.method9273();
                    Static79.method1579("auto world selected");
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    local501 = Integer.parseInt(arg2.substring(12));
                    Static430.method5817(local501, Static615.method8260(local501).aString90);
                    Static79.method1579("switched");
                    return;
                }
                if (arg2.equals("getworld")) {
                    Static79.method1579("w: " + client.gameConnection.id);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    @Pc(1833) ServerConnection local1833 = Static668.method8701();
                    @Pc(1839) ClientMessage local1839 = Static293.method4335(Static243.aClass345_52, local1833.cipher);
                    local1839.buffer.p1(0);
                    local521 = local1839.buffer.pos;
                    local582 = arg2.indexOf(" ", 4);
                    local1839.buffer.pjstr(arg2.substring(3, local582));
                    Static523.method3446(local1839.buffer, arg2.substring(local582));
                    local1839.buffer.psize1(local1839.buffer.pos - local521);
                    local1833.send(local1839);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    Static266.method6777();
                    Static79.method1579("perm varcs saved");
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (local501 = 0; local501 < Static511.anIntArray614.length; local501++) {
                        if (Static118.aBooleanArray4[local501]) {
                            Static511.anIntArray614[local501] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                Static511.anIntArray614[local501] *= -1;
                            }
                        }
                    }
                    Static266.method6777();
                    Static79.method1579("perm varcs scrambled");
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    Static113.aBoolean198 = true;
                    Static244.method3512();
                    Static79.method1579("colmap is shown");
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    Static113.aBoolean198 = false;
                    Static244.method3512();
                    Static79.method1579("colmap is hidden");
                    return;
                }
                if (arg2.equals("resetcache")) {
                    Static352.method5180();
                    Static79.method1579("Caches reset");
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    Static79.method1579(Static65.method1470() + "ms");
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    local501 = Integer.parseInt(arg2.substring(17));
                    Static79.method1579("varpbit=" + Static34.aClass304_1.getVarbitValue(local501));
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    local501 = Integer.parseInt(arg2.substring(14));
                    Static79.method1579("varp=" + Static34.aClass304_1.getVarValueInt(local501));
                    return;
                }
                @Pc(2083) String[] local2083;
                if (arg2.startsWith("directlogin")) {
                    local2083 = Static189.method2861(arg2.substring(12), ' ');
                    if (local2083.length >= 2) {
                        local725 = local2083.length > 2 ? Integer.parseInt(local2083[2]) : 0;
                        Static57.method1232(local725, local2083[1], local2083[0]);
                        return;
                    }
                }
                if (arg2.startsWith("snlogin ")) {
                    local2083 = Static189.method2861(arg2.substring(8), ' ');
                    local725 = Integer.parseInt(local2083[0]);
                    local521 = local2083.length == 2 ? Integer.parseInt(local2083[1]) : 0;
                    Static151.method9291(local725, local521);
                    return;
                }
                if (arg2.startsWith("csprofileclear")) {
                    Static472.method6428();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    Static472.method6418();
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    Static472.method6418();
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    local501 = Integer.parseInt(arg2.substring(8));
                    Static163.activeToolkit.method7989(local501);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    Static79.method1579("Active streams: " + Static336.aClass2_Sub6_Sub3_1.method5881());
                    return;
                }
                if (arg2.equals("autosetup")) {
                    Static519.method6831();
                    Static79.method1579("Complete. com.jagex.graphics.Toolkit now: " + Static400.instance.aClass57_Sub29_1.method7915());
                    return;
                }
                if (arg2.equals("errormessage")) {
                    Static79.method1579(client.aClient1.method1648());
                    return;
                }
                if (arg2.equals("heapdump")) {
                    if (SignLink.osNameLower.startsWith("win")) {
                        Static21.method8048(new File("C:\\Temp\\heap.dump"));
                    } else {
                        Static21.method8048(new File("/tmp/heap.dump"));
                    }
                    Static79.method1579("Done");
                    return;
                }
                if (arg2.equals("os")) {
                    Static79.method1579("Name: " + SignLink.osNameLower);
                    Static79.method1579("Arch: " + SignLink.osArchRaw);
                    Static79.method1579("Ver: " + SignLink.osVersionRaw);
                    return;
                }
                if (arg2.startsWith("w2debug")) {
                    local501 = Integer.parseInt(arg2.substring(8, 9));
                    Static699.anInt10539 = local501;
                    Static449.mapBuild();
                    Static79.method1579("Toggled!");
                    return;
                }
                if (arg2.startsWith("ortho ")) {
                    local501 = arg2.indexOf(32);
                    if (local501 < 0) {
                        Static79.method1579("Syntax: ortho <n>");
                        return;
                    }
                    local725 = StringTools.parseDecimal(arg2.substring(local501 + 1));
                    Static400.instance.method5104(local725, Static400.instance.aClass57_Sub3_1);
                    Static666.method8693(1);
                    Static503.aBoolean578 = false;
                    Static498.method6646();
                    if (local725 != Static400.instance.aClass57_Sub3_1.method2120()) {
                        Static79.method1579("Failed to change ortho mode");
                        return;
                    }
                    Static79.method1579("Successfully changed ortho mode");
                    return;
                }
                if (arg2.startsWith("orthozoom ")) {
                    if (Static400.instance.aClass57_Sub3_1.method2120() == 0) {
                        Static79.method1579("enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    local501 = StringTools.parseDecimal(arg2.substring(arg2.indexOf(32) + 1));
                    Static582.anInt8630 = local501;
                    Static79.method1579("orthozoom=" + Static582.anInt8630);
                    return;
                }
                if (arg2.startsWith("orthotilesize ")) {
                    local501 = StringTools.parseDecimal(arg2.substring(arg2.indexOf(32) + 1));
                    Static288.anInt4620 = local501;
                    Static32.anInt777 = local501;
                    Static79.method1579("ortho tile size=" + local501);
                    Static498.method6646();
                    return;
                }
                if (arg2.equals("orthocamlock")) {
                    Static129.aBoolean203 = !Static129.aBoolean203;
                    Static79.method1579("ortho camera lock is " + (Static129.aBoolean203 ? "on" : "off"));
                    return;
                }
                if (arg2.startsWith("skydetail ")) {
                    local501 = StringTools.parseDecimal(arg2.substring(arg2.indexOf(32) + 1));
                    Static400.instance.method5104(local501, Static400.instance.aClass57_Sub2_1);
                    Static79.method1579("skydetail is " + (Static400.instance.aClass57_Sub2_1.method1989() == 0 ? "low" : "high"));
                    return;
                }
                @Pc(2592) File local2592;
                if (arg2.startsWith("setoutput ")) {
                    local2592 = new File(arg2.substring(10));
                    if (local2592.exists()) {
                        local2592 = new File(arg2.substring(10) + "." + SystemTimer.safetime() + ".log");
                        if (local2592.exists()) {
                            Static79.method1579("file already exists!");
                            return;
                        }
                    }
                    if (Static134.aFileOutputStream2 != null) {
                        Static134.aFileOutputStream2.close();
                        Static134.aFileOutputStream2 = null;
                    }
                    try {
                        Static134.aFileOutputStream2 = new FileOutputStream(local2592);
                        return;
                    } catch (@Pc(2641) FileNotFoundException local2641) {
                        Static79.method1579("Could not create " + local2592.getName());
                        return;
                    } catch (@Pc(2655) SecurityException local2655) {
                        Static79.method1579("Cannot write to " + local2592.getName());
                        return;
                    }
                }
                if (arg2.equals("closeoutput")) {
                    if (Static134.aFileOutputStream2 != null) {
                        Static134.aFileOutputStream2.close();
                    }
                    Static134.aFileOutputStream2 = null;
                    return;
                }
                if (arg2.startsWith("runscript ")) {
                    local2592 = new File(arg2.substring(10));
                    if (!local2592.exists()) {
                        Static79.method1579("No such file");
                        return;
                    }
                    @Pc(2712) byte[] local2712 = Files.read(local2592);
                    if (local2712 == null) {
                        Static79.method1579("Failed to read file");
                        return;
                    }
                    local1621 = Static189.method2861(Static366.method5261(Static620.method8323(local2712), ""), '\n');
                    Static363.method6234(local1621);
                }
                if (arg2.startsWith("zoom ")) {
                    @Pc(2748) short local2748 = (short) StringTools.parseDecimal(arg2.substring(5));
                    if (local2748 > 0) {
                        Static502.aShort97 = local2748;
                    }
                    return;
                }
                if (arg2.startsWith("cs2debug")) {
                    if (arg2.length() > 9 && arg2.charAt(8) == ' ') {
                        Static472.aString76 = arg2.substring(9);
                        Static472.aBoolean538 = true;
                        Static79.method1579("cs2debug: (" + Static472.aString76 + ")");
                        return;
                    }
                    Static472.aString76 = null;
                    Static472.aBoolean538 = !Static472.aBoolean538;
                    Static79.method1579("cs2debug:" + Static472.aBoolean538);
                    return;
                }
                if (MainLogicManager.step == 11) {
                    @Pc(2836) ClientMessage local2836 = Static293.method4335(Static459.aClass345_87, ConnectionManager.GAME.cipher);
                    local2836.buffer.p1(arg2.length() + 3);
                    local2836.buffer.p1(arg0 ? 1 : 0);
                    local2836.buffer.p1(arg1 ? 1 : 0);
                    local2836.buffer.pjstr(arg2);
                    ConnectionManager.GAME.send(local2836);
                }
                if (arg2.startsWith("fps ") && Static2.aClass355_1 != Static446.aClass355_5) {
                    Static724.method9453(StringTools.parseDecimal(arg2.substring(4)));
                    return;
                }
            } catch (@Pc(2894) Exception local2894) {
                Static79.method1579(LocalisedText.DEBUG_CONSOLE_ERROR.localise(Static51.language));
                return;
            }
        }
        if (MainLogicManager.step != 11) {
            Static79.method1579(LocalisedText.DEBUG_CONSOLE_UNKNOWNCOMMAND.localise(Static51.language) + arg2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static void method3382(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
        if (arg1 == null) {
            return;
        }
        if (Static436.anInt3849 >= 100) {
            Static67.method6098(LocalisedText.IGNORELISTFULL.localise(Static51.language));
            return;
        }
        @Pc(27) String local27 = Static390.method5492(arg1);
        if (local27 == null) {
            return;
        }
        @Pc(76) String local76;
        for (@Pc(33) int local33 = 0; local33 < Static436.anInt3849; local33++) {
            @Pc(40) String local40 = Static390.method5492(Static632.aStringArray44[local33]);
            if (local40 != null && local40.equals(local27)) {
                Static67.method6098(arg1 + LocalisedText.IGNORELISTDUPE.localise(Static51.language));
                return;
            }
            if (Static10.aStringArray1[local33] != null) {
                local76 = Static390.method5492(Static10.aStringArray1[local33]);
                if (local76 != null && local76.equals(local27)) {
                    Static67.method6098(arg1 + LocalisedText.IGNORELISTDUPE.localise(Static51.language));
                    return;
                }
            }
        }
        for (@Pc(106) int local106 = 0; local106 < Static327.anInt5392; local106++) {
            local76 = Static390.method5492(Static330.aStringArray25[local106]);
            if (local76 != null && local76.equals(local27)) {
                Static67.method6098(LocalisedText.REMOVEFRIEND1.localise(Static51.language) + arg1 + LocalisedText.REMOVEFRIEND2.localise(Static51.language));
                return;
            }
            if (Static572.aStringArray42[local106] != null) {
                @Pc(154) String local154 = Static390.method5492(Static572.aStringArray42[local106]);
                if (local154 != null && local154.equals(local27)) {
                    Static67.method6098(LocalisedText.REMOVEFRIEND1.localise(Static51.language) + arg1 + LocalisedText.REMOVEFRIEND2.localise(Static51.language));
                    return;
                }
            }
        }
        if (Static390.method5492(Static556.self.accountName).equals(local27)) {
            Static67.method6098(LocalisedText.IGNORECANTADDSELF.localise(Static51.language));
            return;
        }
        @Pc(216) ServerConnection local216 = Static668.method8701();
        @Pc(222) ClientMessage local222 = Static293.method4335(Static113.aClass345_22, local216.cipher);
        local222.buffer.p1(method3379(arg1) + 1);
        local222.buffer.pjstr(arg1);
        local222.buffer.p1(arg0 ? 1 : 0);
        local216.send(local222);
    }
}
