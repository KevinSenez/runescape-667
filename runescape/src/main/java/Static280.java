import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "[[[B")
    public static byte[][][] tileFlags;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)Z")
    public static boolean method4087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        return (arg1 & 0x800) != 0;
    }
}
