import com.jagex.IndexedImage;
import com.jagex.core.io.Packet;
import com.jagex.core.stringtools.general.Base37;
import com.jagex.graphics.Ground;
import com.jagex.graphics.Shadow;
import com.jagex.graphics.Toolkit;
import com.jagex.js5.js5;
import com.jagex.math.Trig1;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "[I")
    public static int[] anIntArray387 = new int[1];

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!ha;IIIBI)V")
    public static void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) Toolkit arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
        if ((Static26.aSprite_5 == null || Static63.aSprite_8 == null || Static261.aSprite_18 == null) && js5.SPRITES.fileready(Static337.anInt5561) && js5.SPRITES.fileready(Static176.anInt7532) && js5.SPRITES.fileready(Static282.anInt4419)) {
            @Pc(46) IndexedImage local46 = IndexedImage.loadFirst(js5.SPRITES, Static176.anInt7532, 0);
            Static63.aSprite_8 = arg1.createSprite(local46, true);
            local46.flipVertically();
            Static542.aSprite_33 = arg1.createSprite(local46, true);
            Static26.aSprite_5 = arg1.createSprite(IndexedImage.loadFirst(js5.SPRITES, Static337.anInt5561, 0), true);
            @Pc(71) IndexedImage local71 = IndexedImage.loadFirst(js5.SPRITES, Static282.anInt4419, 0);
            Static261.aSprite_18 = arg1.createSprite(local71, true);
            local71.flipVertically();
            Static561.aSprite_34 = arg1.createSprite(local71, true);
        }
        if (Static26.aSprite_5 == null || Static63.aSprite_8 == null || Static261.aSprite_18 == null) {
            return;
        }
        @Pc(103) int local103 = (arg3 - Static261.aSprite_18.getWidth() * 2) / Static26.aSprite_5.getWidth();
        for (@Pc(105) int local105 = 0; local105 < local103; local105++) {
            Static26.aSprite_5.render(Static261.aSprite_18.getWidth() + arg2 + Static26.aSprite_5.getWidth() * local105, -Static26.aSprite_5.getHeight() + arg4 + arg0);
        }
        @Pc(145) int local145 = (arg4 - Static261.aSprite_18.getHeight() - 20) / Static63.aSprite_8.getHeight();
        for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
            Static63.aSprite_8.render(arg2, arg0 + Static63.aSprite_8.getHeight() * local147 + 20);
            Static542.aSprite_33.render(arg3 + arg2 - Static542.aSprite_33.getWidth(), arg0 - -20 + Static63.aSprite_8.getHeight() * local147);
        }
        Static261.aSprite_18.render(arg2, arg0 + arg4 - Static261.aSprite_18.getHeight());
        Static561.aSprite_34.render(arg3 + arg2 - Static261.aSprite_18.getWidth(), arg4 + (arg0 - Static261.aSprite_18.getHeight()));
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(IIIIIIII)V")
    public static void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
        @Pc(7) int local7 = arg2 - 334;
        if (local7 < 0) {
            local7 = 0;
        } else if (local7 > 100) {
            local7 = 100;
        }
        @Pc(33) int local33 = local7 * (Static502.aShort97 - Static228.aShort45) / 100 + Static228.aShort45;
        Static582.orthoAngle = Static582.anInt8630 * local33 >> 8;
        @Pc(45) int local45 = local33 * arg1 >> 8;
        @Pc(52) int local52 = 16384 - arg0 & 0x3FFF;
        @Pc(65) int local65 = 16384 - arg4 & 0x3FFF;
        @Pc(67) int local67 = 0;
        @Pc(69) int local69 = 0;
        @Pc(71) int local71 = local45;
        if (local52 != 0) {
            local69 = Trig1.SIN[local52] * -local45 >> 14;
            local71 = local45 * Trig1.COS[local52] >> 14;
        }
        if (local65 != 0) {
            local67 = local71 * Trig1.SIN[local65] >> 14;
            local71 = Trig1.COS[local65] * local71 >> 14;
        }
        Camera.pitch = arg0;
        Camera.positionZ = arg5 - local71;
        Camera.positionX = arg3 - local67;
        Camera.positionY = arg6 - local69;
        Camera.roll = 0;
        Camera.yaw = arg4;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
    public static void method4615() {
        Static470.anInt7113 = -1;
        Static524.aServerConnection_3 = ConnectionManager.LOBBY;
        Static299.anInt4825 = 1;
        @Pc(16) String local16 = null;
        if (client.ssKey != null) {
            @Pc(23) Packet local23 = new Packet(client.ssKey);
            local16 = Base37.decode(local23.g8());
            Static430.aLong209 = local23.g8();
        }
        if (local16 == null) {
            Static342.method4464(35);
        } else {
            Static238.method3471(false, local16, true, "");
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!r;III[Z)V")
    public static void method4618(@OriginalArg(0) Shadow arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
        if (Static246.ground == Static693.underwaterGround) {
            return;
        }
        @Pc(10) int local10 = Static706.floor[arg1].averageHeight(arg3, arg2);
        for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
            if (arg4 == null || arg4[local12]) {
                @Pc(25) Ground local25 = Static706.floor[local12];
                if (local25 != null) {
                    local25.wa(arg0, arg2, local10 - local25.averageHeight(arg3, arg2), arg3, 0, false);
                }
            }
        }
    }
}
