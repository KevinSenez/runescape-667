import com.jagex.IndexedImage;
import com.jagex.graphics.FontMetrics;
import com.jagex.js5.js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
    public static int anInt1576;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "Ljava/lang/Object;")
    public static Object anObject4;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
    public static int anInt1581 = 0;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static boolean method1524(@OriginalArg(1) String arg0) {
        if (arg0 == null) {
            return false;
        }
        for (@Pc(16) int local16 = 0; local16 < Static436.anInt3849; local16++) {
            if (arg0.equalsIgnoreCase(Static446.aStringArray35[local16])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(Static316.aStringArray41[local16])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)Z")
    public static boolean method1525() {
        @Pc(5) boolean local5 = true;
        if (Static414.aIndexedImage_2 == null) {
            if (js5.SPRITES.fileready(Static456.anInt6929)) {
                Static414.aIndexedImage_2 = IndexedImage.loadFirst(js5.SPRITES, Static456.anInt6929);
            } else {
                local5 = false;
            }
        }
        if (Static535.aIndexedImage_3 == null) {
            if (js5.SPRITES.fileready(Static362.anInt5828)) {
                Static535.aIndexedImage_3 = IndexedImage.loadFirst(js5.SPRITES, Static362.anInt5828);
            } else {
                local5 = false;
            }
        }
        if (Static74.aIndexedImage_1 == null) {
            if (js5.SPRITES.fileready(Static11.anInt136)) {
                Static74.aIndexedImage_1 = IndexedImage.loadFirst(js5.SPRITES, Static11.anInt136);
            } else {
                local5 = false;
            }
        }
        if (Static16.aFontMetrics_1 == null) {
            if (js5.FONTMETRICS.fileready(Static723.anInt10929)) {
                Static16.aFontMetrics_1 = FontMetrics.loadFile(Static723.anInt10929, js5.FONTMETRICS);
            } else {
                local5 = false;
            }
        }
        if (Static627.aIndexedImageArray1 == null) {
            if (js5.SPRITES.fileready(Static723.anInt10929)) {
                Static627.aIndexedImageArray1 = IndexedImage.load(js5.SPRITES, Static723.anInt10929);
            } else {
                local5 = false;
            }
        }
        return local5;
    }
}
