import com.jagex.SignLink;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.Socket;

public final class Static76 {

    @OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
    public static int anInt1601 = 0;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
    public static int anInt1604 = 0;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BLclient!ca;)V")
    public static void method1552(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg0) {
        @Pc(19) Node_Sub51 local19 = (Node_Sub51) Static113.A_HASH_TABLE___12.get((long) arg0.anInt10740);
        if (local19 == null) {
            return;
        }
        if (local19.aClass2_Sub6_Sub2_4 != null) {
            Static336.aClass2_Sub6_Sub3_1.method5883(local19.aClass2_Sub6_Sub2_4);
            local19.aClass2_Sub6_Sub2_4 = null;
        }
        local19.unlink();
    }

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "(B)V")
    public static void method1555() {
        if (Static6.anInt95 == 0) {
            return;
        }
        try {
            if (++Static654.anInt9739 > 2000) {
                Static405.A_SERVER_CONNECTION___1.close();
                if (Static720.anInt10865 >= 2) {
                    Static6.anInt95 = 0;
                    Static580.anInt8621 = -5;
                    return;
                }
                Static660.aConnectionInfo_4.rotateMethods();
                Static6.anInt95 = 1;
                Static654.anInt9739 = 0;
                Static720.anInt10865++;
            }
            if (Static6.anInt95 == 1) {
                Static405.A_SERVER_CONNECTION___1.gameSocketRequest = Static660.aConnectionInfo_4.openSocket(SignLink.instance);
                Static6.anInt95 = 2;
            }
            if (Static6.anInt95 == 2) {
                if (Static405.A_SERVER_CONNECTION___1.gameSocketRequest.status == 2) {
                    throw new IOException();
                }
                if (Static405.A_SERVER_CONNECTION___1.gameSocketRequest.status != 1) {
                    return;
                }
                Static405.A_SERVER_CONNECTION___1.connection = Static99.method1975((Socket) Static405.A_SERVER_CONNECTION___1.gameSocketRequest.result);
                Static405.A_SERVER_CONNECTION___1.gameSocketRequest = null;
                Static405.A_SERVER_CONNECTION___1.flush();
                Static6.anInt95 = 4;
            }
            if (Static6.anInt95 == 4 && Static405.A_SERVER_CONNECTION___1.connection.hasAvailable(1)) {
                Static405.A_SERVER_CONNECTION___1.connection.read(Static405.A_SERVER_CONNECTION___1.buffer.data, 1, 0);
                @Pc(139) int local139 = Static405.A_SERVER_CONNECTION___1.buffer.data[0] & 0xFF;
                Static6.anInt95 = 0;
                Static580.anInt8621 = local139;
                Static405.A_SERVER_CONNECTION___1.close();
            }
        } catch (@Pc(148) IOException local148) {
            Static405.A_SERVER_CONNECTION___1.close();
            if (Static720.anInt10865 < 2) {
                Static660.aConnectionInfo_4.rotateMethods();
                Static720.anInt10865++;
                Static654.anInt9739 = 0;
                Static6.anInt95 = 1;
            } else {
                Static6.anInt95 = 0;
                Static580.anInt8621 = -4;
            }
        }
    }
}
