import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Component;

public final class Static681 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!lg;")
    public static Class224 aClass224_2;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[B)Z")
    public static boolean method8919(@OriginalArg(1) byte[] arg0) {
        @Pc(8) Packet local8 = new Packet(arg0);
        @Pc(12) int local12 = local8.g1();
        if (local12 != 2) {
            return false;
        }
        @Pc(30) boolean local30 = local8.g1() == 1;
        if (local30) {
            Static300.method4392(local8);
        }
        Static678.method8901(-1, local8);
        return true;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!rg;")
    public static Class319 method8921(@OriginalArg(1) Component arg0) {
        return new Class319_Sub1(arg0);
    }
}
