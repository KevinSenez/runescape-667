import com.jagex.game.runetek6.config.objtype.ObjTypeList;
import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "[I")
    public static int[] anIntArray886;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!hda;ILclient!ha;)V")
    public static void method9415(@OriginalArg(0) Component arg0, @OriginalArg(2) Toolkit arg1) {
        @Pc(38) boolean local38 = ObjTypeList.instance.getCachedSprite(arg0.objWearCol ? PlayerEntity.self.playerModel : null, arg1, arg0.objNumMode, arg0.invObject, arg0.outline, arg0.invCount, arg0.shadow | 0xFF000000) == null;
        if (local38) {
            Static133.A_DEQUE___13.addLast(new Node_Sub36(arg0.invObject, arg0.invCount, arg0.outline, arg0.shadow | 0xFF000000, arg0.objNumMode, arg0.objWearCol));
            InterfaceManager.redraw(arg0);
        }
    }

}
