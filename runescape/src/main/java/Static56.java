import com.jagex.graphics.TextureSource;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "Lclient!d;")
    public static TextureSource anTextureSource_3;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "J")
    public static long aLong38 = -1L;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
    public static void method1220() {
        if (Static135.anInt8223 != 0) {
            Static524.aServerConnection_3.close();
            Static707.method9227();
            Static564.method7465();
        }
    }
}
