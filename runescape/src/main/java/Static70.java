import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import rs2.client.event.mouse.MouseMonitor;
import rs2.client.event.mouse.SimpleMouseMonitor;

import java.awt.Component;
import java.lang.reflect.Constructor;

public final class Static70 {

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int anInt1569;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class aClass4;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
    public static final int[] anIntArray147 = new int[50];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!fb;")
    public static MouseMonitor method1513(@OriginalArg(0) Component arg0) {
        try {
            @Pc(34) Constructor local34 = Class.forName("rs2.client.event.mouse.CompleteMouseMonitor").getDeclaredConstructor(aClass4 == null ? (aClass4 = Class.forName("java.awt.Component")) : aClass4, Boolean.TYPE);
            return (MouseMonitor) local34.newInstance(arg0, Boolean.valueOf(true));
        } catch (@Pc(52) Throwable local52) {
            return new SimpleMouseMonitor(arg0, true);
        }
    }
}
