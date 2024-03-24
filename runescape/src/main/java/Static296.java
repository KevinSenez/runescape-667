import com.jagex.ChangeLocationRequest;
import com.jagex.game.PlayerModel;
import com.jagex.game.runetek6.config.loctype.LocTypeCustomisation;
import com.jagex.game.runetek6.config.loctype.LocTypeList;
import com.jagex.game.runetek6.config.npctype.NPCTypeList;
import com.jagex.game.runetek6.config.objtype.ObjTypeList;
import com.jagex.game.runetek6.config.spotanimationtype.SpotAnimationTypeList;
import com.jagex.js5.js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!sb;")
    public static js5 aJs5_61;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!om;")
    public static final Class280 aClass280_5 = new Class280(2);

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int anInt4792 = 0;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!gp;BIIII)V")
    public static void method4361(@OriginalArg(0) LocTypeCustomisation arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
        @Pc(15) ChangeLocationRequest local15 = null;
        for (@Pc(20) ChangeLocationRequest local20 = (ChangeLocationRequest) Static227.aDeque_18.first(); local20 != null; local20 = (ChangeLocationRequest) Static227.aDeque_18.next()) {
            if (local20.anInt4010 == arg1 && local20.anInt4016 == arg3 && local20.anInt4006 == arg4 && arg2 == local20.layer) {
                local15 = local20;
                break;
            }
        }
        if (local15 == null) {
            local15 = new ChangeLocationRequest();
            local15.anInt4010 = arg1;
            local15.anInt4016 = arg3;
            local15.anInt4006 = arg4;
            local15.layer = arg2;
            Static227.aDeque_18.addLast(local15);
        }
        local15.aBoolean309 = false;
        local15.customisation = arg0;
        local15.aBoolean310 = true;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static void updateFeatureMask() {
        @Pc(5) int featureMask = 0;
        if (ClientOptions.instance.lightDetail.getValue() == 1) {
            featureMask |= 0x1;
            featureMask |= 0x10;
            featureMask |= 0x20;
            featureMask |= 0x2;
            featureMask |= 0x4;
        }
        if (ClientOptions.instance.textures.getValue() == 0) {
            featureMask |= 0x40;
        }
        Component.setFeatureMask(featureMask);
        LocTypeList.instance.setFeatureMask(featureMask);
        ObjTypeList.instance.setFeatureMask(featureMask);
        NPCTypeList.instance.setFeatureMask(featureMask);
        SpotAnimationTypeList.instance.setFeatureMask(featureMask);
        PlayerEntity.setFeatureMask(featureMask);
        ShadowList.setFeatureMask(featureMask);
        PlayerModel.setFeatureMask(featureMask);
        ClientInventory.setFeatureMask(featureMask);
        MainLogicManager.mapBuild();
    }
}
