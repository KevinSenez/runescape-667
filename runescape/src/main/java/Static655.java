import com.jagex.ServerProt;
import com.jagex.SignLink;
import com.jagex.SignedResource;
import com.jagex.core.util.TimeUtils;
import rs2.client.loading.LoadState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Frame;

public final class Static655 {

    @OriginalMember(owner = "client!un", name = "K", descriptor = "[Lclient!gca;")
    public static LoadState[] aLoadStateArray1;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___237 = new ServerProt(18, 4);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!vq;ILjava/awt/Frame;)V")
    public static void method8562(@OriginalArg(0) SignLink arg0, @OriginalArg(2) Frame arg1) {
        while (true) {
            @Pc(10) SignedResource local10 = arg0.exitFullscreen(arg1);
            while (local10.status == 0) {
                TimeUtils.sleep(10L);
            }
            if (local10.status == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            TimeUtils.sleep(100L);
        }
    }
}
