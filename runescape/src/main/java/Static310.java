import com.jagex.game.runetek6.config.seqtype.SeqReplayMode;
import com.jagex.game.runetek6.config.seqtype.SeqType;
import com.jagex.game.runetek6.config.seqtype.SeqTypeList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "[I")
    public static final int[] anIntArray379 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([II[I[ILclient!cg;)V")
    public static void method4505(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class8_Sub2_Sub1_Sub2 arg3) {
        for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
            @Pc(20) int local20 = arg1[local14];
            @Pc(24) int local24 = arg0[local14];
            @Pc(28) int local28 = arg2[local14];
            @Pc(30) int local30 = 0;
            while (local24 != 0 && arg3.aClass152_Sub2_Sub1Array3.length > local30) {
                if ((local24 & 0x1) != 0) {
                    if (local20 == -1) {
                        arg3.aClass152_Sub2_Sub1Array3[local30] = null;
                    } else {
                        @Pc(60) SeqType local60 = SeqTypeList.instance.list(local20);
                        @Pc(63) int replayMode = local60.replayMode;
                        @Pc(68) Animator_Sub2_Sub1 local68 = arg3.aClass152_Sub2_Sub1Array3[local30];
                        if (local68 != null && local68.isAnimating()) {
                            if (local20 == local68.getAnimationId()) {
                                if (replayMode == SeqReplayMode.STOP) {
                                    local68 = arg3.aClass152_Sub2_Sub1Array3[local30] = null;
                                } else if (replayMode == SeqReplayMode.RESET) {
                                    local68.resetImmediately();
                                    local68.anInt10508 = local28;
                                } else if (replayMode == SeqReplayMode.RESTART_LOOP) {
                                    local68.restartLoop();
                                }
                            } else if (local60.priority >= local68.getAnimation().priority) {
                                local68 = arg3.aClass152_Sub2_Sub1Array3[local30] = null;
                            }
                        }
                        if (local68 == null || !local68.isAnimating()) {
                            local68 = arg3.aClass152_Sub2_Sub1Array3[local30] = new Animator_Sub2_Sub1(arg3);
                            local68.update(true, local20);
                            local68.anInt10508 = local28;
                        }
                    }
                }
                local30++;
                local24 >>>= 0x1;
            }
        }
    }
}
