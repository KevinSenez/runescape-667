import com.jagex.core.stringtools.general.StringTools;
import com.jagex.core.util.SystemTimer;
import com.jagex.game.runetek6.config.vartype.bit.VarBitTypeListClient;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import rs2.client.event.keyboard.KeyLog;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public final class Static668 {

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "Lclient!lja;")
    public static ConnectionInfo aConnectionInfo_5;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "Lclient!pc;")
    public static final ZoneProt A_ZONE_PROT___16 = new ZoneProt(12, 7);

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
    public static void method8700(@OriginalArg(0) boolean arg0) {
        if (arg0 && WorldMap.area != null) {
            Static357.anInt6504 = WorldMap.area.id;
        } else {
            Static357.anInt6504 = -1;
        }
        WorldMap.aDeque_54 = null;
        WorldMap.component = null;
        WorldMap.area = null;
        WorldMap.loadingPercent = 0;
        WorldMap.method5070();
        WorldMap.elements.clear();
        Static359.aClass327_3 = null;
        Static484.aClass327_6 = null;
        WorldMap.staticElements = null;
        Static651.aClass327_8 = null;
        Static180.anInt3001 = -1;
        Static13.aSprite_4 = null;
        Static142.aClass327_1 = null;
        Static390.aClass327_5 = null;
        Static559.aClass327_7 = null;
        Static364.aClass327_4 = null;
        Static275.aClass327_2 = null;
        WorldMap.anInt3181 = -1;
        if (WorldMap.mapElementTypeList != null) {
            WorldMap.mapElementTypeList.cacheReset();
            WorldMap.mapElementTypeList.setCaches(128, 64);
        }
        if (WorldMap.msiTypeList != null) {
            WorldMap.msiTypeList.setCache(64, 64);
        }
        if (WorldMap.locTypeList != null) {
            WorldMap.locTypeList.setRecentUse(64);
        }
        VarBitTypeListClient.instance.cacheReset(64);
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
    public static void method8703() {
        if (Static460.anInt8472 < 102) {
            Static460.anInt8472 += 6;
        }
        @Pc(26) int local26;
        if (Static523.anInt3885 != -1 && Static305.aLong157 < SystemTimer.safetime()) {
            for (local26 = Static523.anInt3885; local26 < Static144.aStringArray7.length; local26++) {
                if (Static144.aStringArray7[local26].startsWith("pause")) {
                    @Pc(40) int local40 = 5;
                    try {
                        local40 = Integer.parseInt(Static144.aStringArray7[local26].substring(6));
                    } catch (@Pc(49) Exception local49) {
                    }
                    debugconsole.addline("Pausing for " + local40 + " seconds...");
                    Static523.anInt3885 = local26 + 1;
                    Static305.aLong157 = (long) (local40 * 1000) + SystemTimer.safetime();
                    return;
                }
                debugconsole.currententry = Static144.aStringArray7[local26];
                Static270.method3920(false);
            }
            Static523.anInt3885 = -1;
        }
        if (Static611.mouseWheelRotation != 0) {
            debugconsole.anInt3471 -= Static611.mouseWheelRotation * 5;
            if (debugconsole.anInt3471 >= debugconsole.lineCount) {
                debugconsole.anInt3471 = debugconsole.lineCount - 1;
            }
            Static611.mouseWheelRotation = 0;
            if (debugconsole.anInt3471 < 0) {
                debugconsole.anInt3471 = 0;
            }
        }
        for (local26 = 0; local26 < Static671.anInt10026; local26++) {
            @Pc(147) KeyLog local147 = Static194.AN_KEYBOARD_EVENT_ARRAY_1[local26];
            @Pc(151) int local151 = local147.getKeyCode();
            @Pc(155) char local155 = local147.getKeyChar();
            @Pc(159) int local159 = local147.getModifierFlags();
            if (local151 == 84) {
                Static270.method3920(false);
            }
            if (local151 == 80) {
                Static270.method3920(true);
            } else if (local151 == 66 && (local159 & 0x4) != 0) {
                if (Static175.aClipboard1 != null) {
                    @Pc(467) String local467 = "";
                    for (@Pc(472) int local472 = debugconsole.lines.length - 1; local472 >= 0; local472--) {
                        if (debugconsole.lines[local472] != null && debugconsole.lines[local472].length() > 0) {
                            local467 = local467 + debugconsole.lines[local472] + '\n';
                        }
                    }
                    Static175.aClipboard1.setContents(new StringSelection(local467), null);
                }
            } else if (local151 == 67 && (local159 & 0x4) != 0) {
                if (Static175.aClipboard1 != null) {
                    try {
                        @Pc(207) Transferable local207 = Static175.aClipboard1.getContents(null);
                        if (local207 != null) {
                            @Pc(214) String local214 = (String) local207.getTransferData(DataFlavor.stringFlavor);
                            if (local214 != null) {
                                @Pc(221) String[] local221 = StringTools.split(local214, '\n');
                                Static363.method6234(local221);
                            }
                        }
                    } catch (@Pc(226) Exception local226) {
                    }
                }
            } else if (local151 == 85 && debugconsole.currententryLength > 0) {
                debugconsole.currententry = debugconsole.currententry.substring(0, debugconsole.currententryLength - 1) + debugconsole.currententry.substring(debugconsole.currententryLength);
                debugconsole.currententryLength--;
            } else if (local151 == 101 && debugconsole.currententryLength < debugconsole.currententry.length()) {
                debugconsole.currententry = debugconsole.currententry.substring(0, debugconsole.currententryLength) + debugconsole.currententry.substring(debugconsole.currententryLength + 1);
            } else if (local151 == 96 && debugconsole.currententryLength > 0) {
                debugconsole.currententryLength--;
            } else if (local151 == 97 && debugconsole.currententryLength < debugconsole.currententry.length()) {
                debugconsole.currententryLength++;
            } else if (local151 == 102) {
                debugconsole.currententryLength = 0;
            } else if (local151 == 103) {
                debugconsole.currententryLength = debugconsole.currententry.length();
            } else if (local151 == 104 && debugconsole.lines.length > Static625.anInt9472) {
                Static625.anInt9472++;
                Static344.method5046();
                debugconsole.currententryLength = debugconsole.currententry.length();
            } else if (local151 == 105 && Static625.anInt9472 > 0) {
                Static625.anInt9472--;
                Static344.method5046();
                debugconsole.currententryLength = debugconsole.currententry.length();
            } else if (StringTools.isAlphanumeric(local155) || "\\/.:, _-+[]~@".indexOf(local155) != -1) {
                debugconsole.currententry = debugconsole.currententry.substring(0, debugconsole.currententryLength) + Static194.AN_KEYBOARD_EVENT_ARRAY_1[local26].getKeyChar() + debugconsole.currententry.substring(debugconsole.currententryLength);
                debugconsole.currententryLength++;
            }
        }
        Static216.anInt3530 = 0;
        Static671.anInt10026 = 0;
        InterfaceManager.redrawAll();
    }
}
