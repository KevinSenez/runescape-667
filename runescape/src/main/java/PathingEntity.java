import com.jagex.core.util.Arrays;
import com.jagex.core.util.TimeUtils;
import com.jagex.game.Animator;
import com.jagex.game.runetek6.config.bastype.BASType;
import com.jagex.game.runetek6.config.bastype.BASTypeList;
import com.jagex.game.runetek6.config.hitmarktype.HitmarkType;
import com.jagex.game.runetek6.config.hitmarktype.HitmarkTypeList;
import com.jagex.game.runetek6.config.seqtype.SeqReplayMode;
import com.jagex.game.runetek6.config.seqtype.SeqType;
import com.jagex.game.runetek6.config.seqtype.SeqTypeList;
import com.jagex.game.runetek6.config.spotanimationtype.SpotAnimationType;
import com.jagex.game.runetek6.config.spotanimationtype.SpotAnimationTypeList;
import com.jagex.graphics.Matrix;
import com.jagex.graphics.particles.ModelParticleEmitter;
import com.jagex.graphics.particles.ModelParticleEffector;
import com.jagex.graphics.Model;
import com.jagex.graphics.Toolkit;
import com.jagex.math.Trig1;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public abstract class PathingEntity extends PositionEntity {

    @OriginalMember(owner = "client!cg", name = "Ac", descriptor = "I")
    public int anInt10704;

    @OriginalMember(owner = "client!cg", name = "fc", descriptor = "I")
    protected int modelTranslateY;

    @OriginalMember(owner = "client!cg", name = "qb", descriptor = "I")
    public int anInt10726;

    @OriginalMember(owner = "client!cg", name = "Kb", descriptor = "[I")
    public int[] anIntArray872;

    @OriginalMember(owner = "client!cg", name = "zb", descriptor = "I")
    public int anInt10731;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public int anInt10737;

    @OriginalMember(owner = "client!cg", name = "yc", descriptor = "I")
    public int anInt10738;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public int id;

    @OriginalMember(owner = "client!cg", name = "Pb", descriptor = "Lclient!dj;")
    protected Class80 aClass80_3;

    @OriginalMember(owner = "client!cg", name = "Bb", descriptor = "I")
    protected int modelRotateZ;

    @OriginalMember(owner = "client!cg", name = "ic", descriptor = "I")
    protected int modelRotateX;

    @OriginalMember(owner = "client!cg", name = "Ob", descriptor = "B")
    public byte aByte147;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "I")
    public int anInt10750;

    @OriginalMember(owner = "client!cg", name = "vb", descriptor = "[I")
    public int[] anIntArray877;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public int anInt10753;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "B")
    public byte aByte148;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public int anInt10754;

    @OriginalMember(owner = "client!cg", name = "rc", descriptor = "I")
    public int anInt10755;

    @OriginalMember(owner = "client!cg", name = "jc", descriptor = "I")
    public int anInt10756;

    @OriginalMember(owner = "client!cg", name = "nb", descriptor = "I")
    public int anInt10758;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public int anInt10759;

    @OriginalMember(owner = "client!cg", name = "Gb", descriptor = "B")
    public byte aByte150;

    @OriginalMember(owner = "client!cg", name = "Jb", descriptor = "I")
    public int anInt10761;

    @OriginalMember(owner = "client!cg", name = "xc", descriptor = "Lclient!hv;")
    protected ParticleSystem aClass8_Sub5_8;

    @OriginalMember(owner = "client!cg", name = "zc", descriptor = "[I")
    public int[] anIntArray869;

    @OriginalMember(owner = "client!cg", name = "mb", descriptor = "[I")
    public final int[] anIntArray870;

    @OriginalMember(owner = "client!cg", name = "tb", descriptor = "I")
    protected int anInt10728;

    @OriginalMember(owner = "client!cg", name = "vc", descriptor = "I")
    public int anInt10719;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public int drawPriority;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public int anInt10735;

    @OriginalMember(owner = "client!cg", name = "ec", descriptor = "Z")
    public boolean aBoolean816;

    @OriginalMember(owner = "client!cg", name = "Xb", descriptor = "B")
    public byte aByte146;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public int boundSize;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
    public int anInt10743;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    protected int anInt10732;

    @OriginalMember(owner = "client!cg", name = "pb", descriptor = "[I")
    public final int[] anIntArray871;

    @OriginalMember(owner = "client!cg", name = "tc", descriptor = "Z")
    public boolean ready;

    @OriginalMember(owner = "client!cg", name = "Yb", descriptor = "[I")
    public final int[] anIntArray874;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public int anInt10722;

    @OriginalMember(owner = "client!cg", name = "Ub", descriptor = "[I")
    public final int[] anIntArray876;

    @OriginalMember(owner = "client!cg", name = "dc", descriptor = "[I")
    public final int[] anIntArray875;

    @OriginalMember(owner = "client!cg", name = "Vb", descriptor = "Z")
    public boolean aBoolean818;

    @OriginalMember(owner = "client!cg", name = "uc", descriptor = "[I")
    public final int[] anIntArray873;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    protected int anInt10748;

    @OriginalMember(owner = "client!cg", name = "Db", descriptor = "I")
    public int anInt10747;

    @OriginalMember(owner = "client!cg", name = "qc", descriptor = "Lclient!gu;")
    public final Animator animator;

    @OriginalMember(owner = "client!cg", name = "Ab", descriptor = "Lclient!gu;")
    public final Animator aAnimator_11;

    @OriginalMember(owner = "client!cg", name = "Zb", descriptor = "I")
    public int anInt10749;

    @OriginalMember(owner = "client!cg", name = "Wb", descriptor = "I")
    public int anInt10757;

    @OriginalMember(owner = "client!cg", name = "bc", descriptor = "I")
    public int anInt10752;

    @OriginalMember(owner = "client!cg", name = "yb", descriptor = "I")
    public int anInt10751;

    @OriginalMember(owner = "client!cg", name = "ac", descriptor = "B")
    public byte aByte149;

    @OriginalMember(owner = "client!cg", name = "sb", descriptor = "I")
    public int anInt10760;

    @OriginalMember(owner = "client!cg", name = "Cb", descriptor = "Lclient!ffa;")
    public final Class126 aClass126_7;

    @OriginalMember(owner = "client!cg", name = "Eb", descriptor = "Lclient!ffa;")
    public final Class126 aClass126_8;

    @OriginalMember(owner = "client!cg", name = "Mb", descriptor = "Lclient!ffa;")
    public final Class126 aClass126_9;

    @OriginalMember(owner = "client!cg", name = "xb", descriptor = "I")
    public int anInt10762;

    @OriginalMember(owner = "client!cg", name = "hc", descriptor = "I")
    public int anInt10763;

    @OriginalMember(owner = "client!cg", name = "ub", descriptor = "I")
    public int anInt10764;

    @OriginalMember(owner = "client!cg", name = "cc", descriptor = "I")
    public int anInt10765;

    @OriginalMember(owner = "client!cg", name = "Hb", descriptor = "Z")
    protected boolean aBoolean819;

    @OriginalMember(owner = "client!cg", name = "rb", descriptor = "Z")
    protected boolean aBoolean820;

    @OriginalMember(owner = "client!cg", name = "Lb", descriptor = "[I")
    public final int[] pathY;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "[I")
    public final int[] pathX;

    @OriginalMember(owner = "client!cg", name = "Nb", descriptor = "[Lclient!jq;")
    public final Class199[] aClass199Array3;

    @OriginalMember(owner = "client!cg", name = "gc", descriptor = "[B")
    public final byte[] aByteArray111;

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "[Lclient!ka;")
    public final Model[] aModelArray3;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "[Lclient!wb;")
    public final Animator_Sub2_Sub1[] aClass152_Sub2_Sub1Array3;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V")
    public PathingEntity(@OriginalArg(0) int arg0) {
        super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        this.anIntArray869 = null;
        this.anIntArray870 = new int[Static523.graphicsDefaults.maxhitmarks];
        this.anInt10728 = 0;
        this.anInt10719 = -1000;
        this.drawPriority = 0;
        this.anInt10735 = 0;
        this.aBoolean816 = true;
        this.aByte146 = 0;
        this.boundSize = 1;
        this.anInt10743 = -1;
        this.anInt10732 = 0;
        this.anIntArray871 = new int[Static523.graphicsDefaults.maxhitmarks];
        this.ready = false;
        this.anIntArray874 = new int[Static523.graphicsDefaults.maxhitmarks];
        this.anInt10722 = -1;
        this.anIntArray876 = new int[Static523.graphicsDefaults.maxhitmarks];
        this.anIntArray875 = new int[Static523.graphicsDefaults.maxhitmarks];
        this.aBoolean818 = false;
        this.anIntArray873 = new int[Static523.graphicsDefaults.maxhitmarks];
        this.anInt10748 = -32768;
        this.anInt10747 = -1000;
        this.animator = new Animator_Sub2(this, false);
        this.aAnimator_11 = new Animator_Sub2(this, false);
        this.anInt10749 = 0;
        this.anInt10757 = 256;
        this.anInt10752 = -1;
        this.anInt10751 = 0;
        this.aByte149 = 0;
        this.anInt10760 = -1;
        this.aClass126_7 = new Class126();
        this.aClass126_8 = new Class126();
        this.aClass126_9 = new Class126();
        this.anInt10762 = 0;
        this.anInt10763 = 0;
        this.anInt10764 = 0;
        this.anInt10765 = 0;
        this.aBoolean819 = false;
        this.aBoolean820 = false;
        this.pathY = new int[arg0];
        this.pathX = new int[arg0];
        this.aClass199Array3 = new Class199[4];
        this.aByteArray111 = new byte[arg0];
        this.aModelArray3 = new Model[5];
        for (@Pc(174) int local174 = 0; local174 < 4; local174++) {
            this.aClass199Array3[local174] = new Class199(this);
        }
        this.aClass152_Sub2_Sub1Array3 = new Animator_Sub2_Sub1[Static523.wearposDefaults.hidden.length];
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public PathingEntity() {
        this(10);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public final void method9296() {
        if (this.aClass80_3 != null && this.aClass80_3.aString20 != null) {
            this.aClass80_3.anInt2226--;
            if (this.aClass80_3.anInt2226 == 0) {
                this.aClass80_3.aString20 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!ha;Lclient!pda;III)V")
    protected final void method9297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Toolkit arg2, @OriginalArg(3) BASType arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        for (@Pc(13) int local13 = 0; local13 < this.aClass199Array3.length; local13++) {
            @Pc(16) byte local16 = 0;
            if (local13 == 0) {
                local16 = 2;
            } else if (local13 == 1) {
                local16 = 5;
            } else if (local13 == 2) {
                local16 = 1;
            } else if (local13 == 3) {
                local16 = 7;
            }
            @Pc(50) Class199 local50 = this.aClass199Array3[local13];
            if (local50.anInt4930 == -1 || local50.aAnimator_7.isDelayed()) {
                this.aModelArray3[local13 + 1] = null;
            } else {
                @Pc(76) SpotAnimationType local76 = SpotAnimationTypeList.instance.list(local50.anInt4930);
                @Pc(95) boolean local95 = local76.hillType == 3 && (arg5 != 0 || arg1 != 0);
                @Pc(97) int local97 = arg0;
                if (local95) {
                    local97 = arg0 | 0x7;
                } else {
                    if (local50.anInt4929 != 0) {
                        local97 = arg0 | 0x5;
                    }
                    if (local50.anInt4931 != 0) {
                        local97 |= 0x2;
                    }
                    if (local50.anInt4928 >= 0) {
                        local97 |= 0x7;
                    }
                }
                @Pc(146) Model local146 = this.aModelArray3[local13 + 1] = local76.model(local50.aAnimator_7, local16, local97, arg2);
                if (local146 != null) {
                    if (local50.anInt4928 >= 0 && arg3.wornTransformations != null && arg3.wornTransformations[local50.anInt4928] != null) {
                        @Pc(171) int local171 = 0;
                        @Pc(173) int local173 = 0;
                        @Pc(175) int local175 = 0;
                        if (arg3.wornTransformations != null && arg3.wornTransformations[local50.anInt4928] != null) {
                            local173 = arg3.wornTransformations[local50.anInt4928][1];
                            local175 = arg3.wornTransformations[local50.anInt4928][2];
                            local171 = arg3.wornTransformations[local50.anInt4928][0];
                        }
                        if (arg3.graphicOffsets != null && arg3.graphicOffsets[local50.anInt4928] != null) {
                            local173 += arg3.graphicOffsets[local50.anInt4928][1];
                            local175 += arg3.graphicOffsets[local50.anInt4928][2];
                            local171 += arg3.graphicOffsets[local50.anInt4928][0];
                        }
                        if (local175 != 0 || local171 != 0) {
                            @Pc(268) int local268 = arg4;
                            if (this.anIntArray877 != null && this.anIntArray877[local50.anInt4928] != -1) {
                                local268 = this.anIntArray877[local50.anInt4928];
                            }
                            @Pc(299) int local299 = local268 + local50.anInt4929 * 2048 - arg4 & 0x3FFF;
                            if (local299 != 0) {
                                local146.a(local299);
                            }
                            @Pc(310) int local310 = Trig1.SIN[local299];
                            @Pc(314) int local314 = Trig1.COS[local299];
                            @Pc(324) int local324 = local310 * local175 + local171 * local314 >> 14;
                            local175 = local175 * local314 - local171 * local310 >> 14;
                            local171 = local324;
                        }
                        local146.H(local171, local173, local175);
                    } else if (local50.anInt4929 != 0) {
                        local146.a(local50.anInt4929 * 2048);
                    }
                    if (local50.anInt4931 != 0) {
                        local146.H(0, -local50.anInt4931 << 2, 0);
                    }
                    if (local95) {
                        if (this.modelRotateX != 0) {
                            local146.FA(this.modelRotateX);
                        }
                        if (this.modelRotateZ != 0) {
                            local146.VA(this.modelRotateZ);
                        }
                        if (this.modelTranslateY != 0) {
                            local146.H(0, this.modelTranslateY, 0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "(I)V")
    @Override
    public final void method9294() {
        @Pc(12) int local12 = (this.boundSize - 1 << 8) + 240;
        super.aShort132 = (short) (super.z - local12 >> 9);
        super.aShort131 = (short) (super.x - local12 >> 9);
        super.aShort133 = (short) (super.z + local12 >> 9);
        super.aShort134 = (short) (super.x + local12 >> 9);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZ)V")
    public final void method9298(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
        @Pc(15) BASType local15 = this.method9317();
        if (arg1 || local15.yawAcceleration != 0 || this.anInt10757 != 0) {
            this.anInt10756 = arg0 & 0x3FFF;
            this.aClass126_7.method2675((byte) 83, this.anInt10756);
        }
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(B)I")
    public int method9299() {
        @Pc(17) BASType local17 = this.method9317();
        @Pc(31) int local31;
        if (local17.characterHeight != -1) {
            local31 = local17.characterHeight;
        } else if (this.anInt10748 == -32768) {
            local31 = 200;
        } else {
            local31 = -this.anInt10748;
        }
        @Pc(55) Class291 local55 = Static334.activeTiles[super.level][super.x >> Static52.anInt1066][super.z >> Static52.anInt1066];
        return local55 == null || local55.aGroundDecor_1 == null ? local31 : local31 + local55.aGroundDecor_1.aShort46;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)I")
    @Override
    public final int method9292(@OriginalArg(0) byte arg0) {
        return arg0 == -21 ? this.anInt10728 : 44;
    }

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "(I)I")
    @Override
    public final int method9286(@OriginalArg(0) int arg0) {
        if (arg0 == 2) {
            return this.anInt10748 == -32768 ? 0 : this.anInt10748;
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIBIIII)V")
    public final void method9301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
        @Pc(5) boolean local5 = true;
        @Pc(7) boolean local7 = true;
        for (@Pc(21) int local21 = 0; local21 < Static523.graphicsDefaults.maxhitmarks; local21++) {
            if (arg4 < this.anIntArray871[local21]) {
                local5 = false;
            } else {
                local7 = false;
            }
        }
        @Pc(48) int local48 = -1;
        @Pc(50) int local50 = -1;
        @Pc(52) int local52 = 0;
        if (arg6 >= 0) {
            @Pc(59) HitmarkType local59 = HitmarkTypeList.instance.list(arg6);
            local50 = local59.comparisonType;
            local52 = local59.duration;
        }
        @Pc(78) int local78;
        if (local7) {
            if (local50 == -1) {
                return;
            }
            local48 = 0;
            local78 = 0;
            if (local50 == 0) {
                local78 = this.anIntArray871[0];
            } else if (local50 == 1) {
                local78 = this.anIntArray870[0];
            }
            for (@Pc(98) int local98 = 1; local98 < Static523.graphicsDefaults.maxhitmarks; local98++) {
                if (local50 == 0) {
                    if (local78 > this.anIntArray871[local98]) {
                        local78 = this.anIntArray871[local98];
                        local48 = local98;
                    }
                } else if (local50 == 1 && local78 > this.anIntArray870[local98]) {
                    local78 = this.anIntArray870[local98];
                    local48 = local98;
                }
            }
            if (local50 == 1 && local78 >= arg3) {
                return;
            }
        } else {
            if (local5) {
                this.aByte146 = 0;
            }
            for (local78 = 0; local78 < Static523.graphicsDefaults.maxhitmarks; local78++) {
                @Pc(176) byte local176 = this.aByte146;
                this.aByte146 = (byte) ((this.aByte146 + 1) % Static523.graphicsDefaults.maxhitmarks);
                if (this.anIntArray871[local176] <= arg4) {
                    local48 = local176;
                    break;
                }
            }
        }
        if (local48 < 0) {
            return;
        }
        this.anIntArray873[local48] = arg6;
        this.anIntArray870[local48] = arg3;
        this.anIntArray876[local48] = arg5;
        this.anIntArray874[local48] = arg0;
        this.anIntArray871[local48] = local52 + arg4 + arg1;
        this.anIntArray875[local48] = arg2;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(B)I")
    public int getBoundSize() {
        return this.boundSize;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)I")
    public final int method9303() {
        @Pc(9) BASType local9 = this.method9317();
        @Pc(13) int local13 = this.aClass126_7.anInt2889;
        @Pc(30) boolean local30;
        if (local9.yawAcceleration == 0) {
            local30 = this.aClass126_7.method2676(this.anInt10756, this.anInt10757, -21712, this.anInt10757);
        } else {
            local30 = this.aClass126_7.method2676(this.anInt10756, local9.yawMaxSpeed, -21712, local9.yawAcceleration);
        }
        @Pc(55) int local55 = this.aClass126_7.anInt2889 - local13;
        if (local55 == 0) {
            this.anInt10749 = 0;
            this.aClass126_7.method2675((byte) 61, this.anInt10756);
        } else {
            this.anInt10749++;
        }
        if (local30) {
            if (local9.rollAcceleration != 0) {
                if (local55 > 0) {
                    this.aClass126_8.method2676(local9.rollTargetAngle, local9.rollMaxSpeed, -21712, local9.rollAcceleration);
                } else {
                    this.aClass126_8.method2676(-local9.rollTargetAngle, local9.rollMaxSpeed, -21712, local9.rollAcceleration);
                }
            }
            if (local9.pitchAcceleration != 0) {
                this.aClass126_9.method2676(local9.pitchTargetAngle, local9.pitchMaxSpeed, -21712, local9.pitchAcceleration);
            }
        } else {
            if (local9.rollAcceleration == 0) {
                this.aClass126_8.method2675((byte) 73, 0);
            } else {
                this.aClass126_8.method2676(0, local9.rollMaxSpeed, -21712, local9.rollAcceleration);
            }
            if (local9.pitchAcceleration == 0) {
                this.aClass126_9.method2675((byte) 122, 0);
            } else {
                this.aClass126_9.method2676(0, local9.pitchMaxSpeed, -21712, local9.pitchAcceleration);
            }
        }
        return local55;
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(B)I")
    public abstract int method9304(@OriginalArg(0) byte arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)V")
    public final void method9305(@OriginalArg(1) int arg0) {
        @Pc(15) BASType local15 = this.method9317();
        if (local15.yawAcceleration == 0 && this.anInt10757 == 0) {
            return;
        }
        this.aClass126_7.method2671();
        @Pc(37) int local37 = arg0 - this.aClass126_7.anInt2889 & 0x3FFF;
        if (local37 > 8192) {
            this.anInt10756 = local37 + this.aClass126_7.anInt2889 - 16384;
        } else {
            this.anInt10756 = local37 + this.aClass126_7.anInt2889;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ka;Z)V")
    protected final void method9306(@OriginalArg(0) Model arg0) {
        @Pc(15) int local15 = this.aClass126_8.anInt2889;
        @Pc(19) int local19 = this.aClass126_9.anInt2889;
        if (local15 == 0 && local19 == 0) {
            return;
        }
        @Pc(33) int local33 = arg0.fa() / 2;
        arg0.H(0, -local33, 0);
        arg0.VA(local15 & 0x3FFF);
        arg0.FA(local19 & 0x3FFF);
        arg0.H(0, local33, 0);
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)Z")
    @Override
    public final boolean method9282(@OriginalArg(0) int arg0) {
        if (arg0 != 0) {
            this.anInt10749 = -63;
        }
        return this.aBoolean819;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Z")
    public final boolean method9307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        if (this.anIntArray877 == null) {
            if (arg1 == -1) {
                return true;
            }
            this.anIntArray877 = new int[Static523.wearposDefaults.hidden.length];
            for (@Pc(24) int local24 = 0; local24 < Static523.wearposDefaults.hidden.length; local24++) {
                this.anIntArray877[local24] = -1;
            }
        }
        @Pc(43) BASType local43 = this.method9317();
        @Pc(45) int local45 = 256;
        if (local43.maxWornRotation != null && local43.maxWornRotation[arg0] > 0) {
            local45 = local43.maxWornRotation[arg0];
        }
        @Pc(82) int local82;
        @Pc(87) int local87;
        if (arg1 != -1) {
            if (this.anIntArray877[arg0] == -1) {
                this.anIntArray877[arg0] = this.aClass126_7.method2673(16383);
            }
            local82 = this.anIntArray877[arg0];
            local87 = arg1 - local82;
            if (local87 >= -local45 && local45 >= local87) {
                this.anIntArray877[arg0] = arg1;
                return true;
            }
            if ((local87 <= 0 || local87 > 8192) && local87 > -8192) {
                this.anIntArray877[arg0] = local82 - local45 & 0x3FFF;
            } else {
                this.anIntArray877[arg0] = local82 + local45 & 0x3FFF;
            }
            return false;
        } else if (this.anIntArray877[arg0] == -1) {
            return true;
        } else {
            local82 = this.aClass126_7.method2673(16383);
            local87 = this.anIntArray877[arg0];
            @Pc(92) int local92 = local82 - local87;
            if (-local45 > local92 || local45 < local92) {
                if ((local92 <= 0 || local92 > 8192) && local92 > -8192) {
                    this.anIntArray877[arg0] = local87 - local45 & 0x3FFF;
                } else {
                    this.anIntArray877[arg0] = local45 + local87 & 0x3FFF;
                }
                return false;
            }
            this.anIntArray877[arg0] = -1;
            for (@Pc(112) int local112 = 0; local112 < Static523.wearposDefaults.hidden.length; local112++) {
                if (this.anIntArray877[local112] != -1) {
                    return true;
                }
            }
            this.anIntArray877 = null;
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZIIII)V")
    public final void method9309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        @Pc(16) Class199 local16 = this.aClass199Array3[arg0];
        @Pc(19) int local19 = local16.anInt4930;
        if (arg5 != -1 && local19 != -1) {
            @Pc(38) SpotAnimationType local38;
            if (local19 == arg5) {
                local38 = SpotAnimationTypeList.instance.list(arg5);
                if (local38.loopSeq && local38.seq != -1) {
                    @Pc(54) SeqType local54 = SeqTypeList.instance.list(local38.seq);
                    @Pc(57) int replayMode = local54.replayMode;
                    if (replayMode == SeqReplayMode.STOP) {
                        return;
                    }
                    if (replayMode == SeqReplayMode.RESTART_LOOP) {
                        local16.aAnimator_7.restartLoop();
                        return;
                    }
                }
            } else {
                local38 = SpotAnimationTypeList.instance.list(arg5);
                @Pc(86) SpotAnimationType local86 = SpotAnimationTypeList.instance.list(local19);
                if (local38.seq != -1 && local86.seq != -1) {
                    @Pc(103) SeqType local103 = SeqTypeList.instance.list(local38.seq);
                    @Pc(109) SeqType local109 = SeqTypeList.instance.list(local86.seq);
                    if (local103.priority < local109.priority) {
                        return;
                    }
                }
            }
        }
        @Pc(118) byte local118 = 0;
        if (arg5 != -1 && !SpotAnimationTypeList.instance.list(arg5).loopSeq) {
            local118 = 2;
        }
        local16.anInt4929 = arg1;
        local16.anInt4928 = arg4;
        local16.anInt4930 = arg5;
        local16.anInt4931 = arg3 >> 16;
        if (arg5 != -1 && arg2) {
            local118 = 1;
        }
        local16.aAnimator_7.update(arg5 == -1 ? -1 : SpotAnimationTypeList.instance.list(arg5).seq, arg3 & 0xFFFF, local118, false);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public final void method9310(@OriginalArg(1) int arg0) {
        this.boundSize = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)Z")
    public abstract boolean method9311();

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;ZII)V")
    public final void method9313(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
        if (this.aClass80_3 == null) {
            this.aClass80_3 = new Class80();
        }
        this.aClass80_3.anInt2229 = arg2;
        this.aClass80_3.anInt2226 = this.aClass80_3.anInt2227 = arg0;
        this.aClass80_3.anInt2221 = arg3;
        this.aClass80_3.aString20 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V")
    protected final void method9314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        @Pc(11) int local11 = super.aShort134 + super.aShort131 >> 1;
        @Pc(20) int local20 = super.aShort133 + super.aShort132 >> 1;
        @Pc(24) int local24 = Trig1.SIN[arg0];
        @Pc(28) int local28 = Trig1.COS[arg0];
        @Pc(33) int local33 = -arg3 / 2;
        @Pc(38) int local38 = -arg4 / 2;
        @Pc(48) int local48 = local24 * local38 + local33 * local28 >> 14;
        @Pc(59) int local59 = local38 * local28 - local33 * local24 >> 14;
        @Pc(74) int local74 = Static323.method4626(local59 + super.z, super.level, local11, local20, local48 + super.x);
        @Pc(78) int local78 = arg3 / 2;
        @Pc(83) int local83 = -arg4 / 2;
        @Pc(93) int local93 = local28 * local78 + local83 * local24 >> 14;
        @Pc(104) int local104 = local28 * local83 - local24 * local78 >> 14;
        @Pc(119) int local119 = Static323.method4626(local104 + super.z, super.level, local11, local20, local93 + super.x);
        @Pc(124) int local124 = -arg3 / 2;
        @Pc(128) int local128 = arg4 / 2;
        @Pc(138) int local138 = local24 * local128 + local124 * local28 >> 14;
        @Pc(149) int local149 = local128 * local28 - local124 * local24 >> 14;
        @Pc(165) int local165 = Static323.method4626(local149 + super.z, super.level, local11, local20, super.x + local138);
        @Pc(169) int local169 = arg3 / 2;
        @Pc(173) int local173 = arg4 / 2;
        @Pc(183) int local183 = local24 * local173 + local28 * local169 >> 14;
        @Pc(194) int local194 = local173 * local28 - local169 * local24 >> 14;
        @Pc(210) int local210 = Static323.method4626(local194 + super.z, super.level, local11, local20, super.x + local183);
        @Pc(218) int local218 = local74 < local119 ? local74 : local119;
        @Pc(226) int local226 = local210 > local165 ? local165 : local210;
        @Pc(234) int local234 = local119 >= local210 ? local210 : local119;
        this.modelRotateX = (int) (Math.atan2(local218 - local226, arg4) * 2607.5945876176133D) & 0x3FFF;
        @Pc(257) int local257 = local165 > local74 ? local74 : local165;
        this.modelRotateZ = (int) (Math.atan2(local257 - local234, arg3) * 2607.5945876176133D) & 0x3FFF;
        if (arg5 >= -78) {
            return;
        }
        @Pc(288) int local288;
        if (this.modelRotateX != 0 && arg1 != 0) {
            local288 = 16384 - arg1;
            if (this.modelRotateX > 8192) {
                if (local288 > this.modelRotateX) {
                    this.modelRotateX = local288;
                }
            } else if (this.modelRotateX > arg1) {
                this.modelRotateX = arg1;
            }
        }
        this.modelTranslateY = local210 + local74;
        if (this.modelRotateZ != 0 && arg2 != 0) {
            local288 = 16384 - arg2;
            if (this.modelRotateZ > 8192) {
                if (local288 > this.modelRotateZ) {
                    this.modelRotateZ = local288;
                }
            } else if (arg2 < this.modelRotateZ) {
                this.modelRotateZ = arg2;
            }
        }
        if (this.modelTranslateY > local119 + local165) {
            this.modelTranslateY = local119 + local165;
        }
        this.modelTranslateY = (this.modelTranslateY >> 1) - super.anInt10691;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[IB)V")
    public final void method9315(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
        if (this.anIntArray872 == null && arg1 != null) {
            this.anIntArray872 = new int[Static523.wearposDefaults.hidden.length];
        } else if (arg1 == null) {
            this.anIntArray872 = null;
            return;
        }
        for (@Pc(35) int local35 = 0; local35 < this.anIntArray872.length; local35++) {
            this.anIntArray872[local35] = -1;
        }
        for (@Pc(53) int local53 = 0; local53 < arg1.length; local53++) {
            @Pc(58) int local58 = arg0[local53];
            for (@Pc(60) int local60 = 0; local60 < this.anIntArray872.length; local60++) {
                if ((local58 & 0x1) != 0) {
                    this.anIntArray872[local60] = arg1[local53];
                }
                local58 >>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public final void method9316() {
        this.anInt10764 = 0;
        this.anInt10762 = 0;
    }

    @OriginalMember(owner = "client!cg", name = "finalize", descriptor = "()V")
    @Override
    public final void finalize() {
        if (this.aClass8_Sub5_8 != null) {
            this.aClass8_Sub5_8.method3644();
        }
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "(B)Lclient!pda;")
    public final BASType method9317() {
        @Pc(13) int local13 = this.method9320(0);
        return local13 == -1 ? Static636.A_BAS_TYPE___1 : BASTypeList.instance.list(local13);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)Z")
    @Override
    public final boolean method9283() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)Lclient!dj;")
    public abstract Class80 method9318(@OriginalArg(0) int arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ha;BZ[Lclient!ka;Lclient!tt;)V")
    protected final void method9319(@OriginalArg(0) Toolkit arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Model[] arg2, @OriginalArg(4) Matrix arg3) {
        if (!arg1) {
            @Pc(15) int local15 = 0;
            @Pc(17) int local17 = 0;
            @Pc(19) int local19 = 0;
            @Pc(21) int local21 = 0;
            @Pc(23) int local23 = -1;
            @Pc(25) int local25 = -1;
            @Pc(29) ModelParticleEmitter[][] local29 = new ModelParticleEmitter[arg2.length][];
            @Pc(33) ModelParticleEffector[][] local33 = new ModelParticleEffector[arg2.length][];
            for (@Pc(35) int local35 = 0; local35 < arg2.length; local35++) {
                if (arg2[local35] != null) {
                    arg2[local35].method7476(arg3);
                    local29[local35] = arg2[local35].particleEmitters();
                    local33[local35] = arg2[local35].particleEffectors();
                    if (local29[local35] != null) {
                        local23 = local35;
                        local15 += local29[local35].length;
                        local17++;
                    }
                    if (local33[local35] != null) {
                        local25 = local35;
                        local21++;
                        local19 += local33[local35].length;
                    }
                }
            }
            if ((this.aClass8_Sub5_8 == null || this.aClass8_Sub5_8.aBoolean324) && (local17 > 0 || local21 > 0)) {
                this.aClass8_Sub5_8 = ParticleSystem.create(TimeUtils.clock, true);
            }
            if (this.aClass8_Sub5_8 != null) {
                @Pc(138) ModelParticleEmitter[] local138;
                @Pc(142) int local142;
                if (local17 == 1) {
                    local138 = local29[local23];
                } else {
                    local138 = new ModelParticleEmitter[local15];
                    @Pc(140) int local140 = 0;
                    for (local142 = 0; local142 < arg2.length; local142++) {
                        if (local29[local142] != null) {
                            Arrays.copy(local29[local142], 0, local138, local140, local29[local142].length);
                            local140 += local29[local142].length;
                        }
                    }
                }
                @Pc(191) ModelParticleEffector[] local191;
                if (local21 == 1) {
                    local191 = local33[local25];
                } else {
                    local191 = new ModelParticleEffector[local19];
                    local142 = 0;
                    for (@Pc(199) int local199 = 0; local199 < arg2.length; local199++) {
                        if (local33[local199] != null) {
                            Arrays.copy(local33[local199], 0, local191, local142, local33[local199].length);
                            local142 += local33[local199].length;
                        }
                    }
                }
                this.aClass8_Sub5_8.method3643(arg0, TimeUtils.clock, local138, local191);
                this.aBoolean820 = true;
            }
        } else if (this.aClass8_Sub5_8 != null) {
            this.aClass8_Sub5_8.method3649(TimeUtils.clock);
        }
        if (this.aClass8_Sub5_8 != null) {
            this.aClass8_Sub5_8.method3658(super.level, super.aShort131, super.aShort134, super.aShort132, super.aShort133);
        }
    }

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "(I)I")
    protected abstract int method9320(@OriginalArg(0) int arg0);
}