import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class CutsceneAction_Sub11 extends CutsceneAction {

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public final int anInt4254;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public final int anInt4253;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public final int anInt4252;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
    public final int anInt4250;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public final int anInt4251;

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!ge;)V")
    public CutsceneAction_Sub11(@OriginalArg(0) Packet arg0) {
        super(arg0);
        this.anInt4254 = arg0.g2();
        this.anInt4253 = arg0.g2();
        this.anInt4252 = arg0.g2();
        this.anInt4250 = arg0.g2();
        this.anInt4251 = arg0.g2();
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V")
    @Override
    public void execute() {
        Camera.moveTo(this.anInt4254, this.anInt4253, this.anInt4252, 100, 100, false);
        Camera.forceAngle(this.anInt4250, this.anInt4251, 0);
        CutsceneManager.aBoolean480 = true;
    }
}
