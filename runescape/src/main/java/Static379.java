import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int anInt5968;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "Lclient!pc;")
    public static final Class287 aClass287_12 = new Class287(2, -1);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V")
    public static void method5355(@OriginalArg(0) boolean arg0) {
        if (arg0) {
            Static334.activeTiles = Static420.aTileArrayArrayArray2;
            Static246.ground = Static693.underwaterGround;
        } else {
            Static334.activeTiles = Static478.aTileArrayArrayArray3;
            Static246.ground = Static706.floor;
        }
        Static299.anInt4824 = Static334.activeTiles.length;
    }
}
