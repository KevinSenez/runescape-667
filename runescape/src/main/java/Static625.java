import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int anInt9472 = 0;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "[I")
    public static final int[] anIntArray737 = new int[3];

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)I")
    public static int method8337() {
        @Pc(10) byte local10;
        if (ClientOptions.maxmemory < 96) {
            local10 = 1;
            Static468.method7643();
        } else {
            @Pc(17) int local17 = Static65.method1470();
            if (local17 <= 100) {
                Static395.method9162();
                local10 = 4;
            } else if (local17 <= 500) {
                local10 = 3;
                Static133.method2316();
            } else if (local17 > 1000) {
                Static468.method7643();
                local10 = 1;
            } else {
                Static75.method6239();
                local10 = 2;
            }
        }
        if (ClientOptions.instance.toolkit.value() != 0) {
            ClientOptions.instance.update(0, ClientOptions.instance.aToolkitOption_2);
            Static32.method880(0, false);
        }
        ClientOptions.save(1);
        return local10;
    }
}
