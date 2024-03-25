import com.jagex.ParticleList;
import com.jagex.core.util.TimeUtils;
import com.jagex.game.Animator;
import com.jagex.game.runetek6.config.bastype.BASType;
import com.jagex.game.runetek6.config.spotanimationtype.SpotAnimationType;
import com.jagex.game.runetek6.config.spotanimationtype.SpotAnimationTypeList;
import com.jagex.graphics.BoundingCylinder;
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

@OriginalClass("client!b")
public final class ProjectileAnimation extends PositionEntity {

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "D")
    public double verticalSpeed;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "D")
    public double speedZ;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "D")
    public double verticalAcceleration;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public int rotateY;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "D")
    public double translateZ;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "D")
    public double translateY;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "D")
    public double horizontalSpeed;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public int rotateX;

    @OriginalMember(owner = "client!b", name = "Gb", descriptor = "D")
    public double speedX;

    @OriginalMember(owner = "client!b", name = "Ib", descriptor = "Lclient!hv;")
    public ParticleSystem particleSystem;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "D")
    public double translateX;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public int sphereRadius = 0;

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "Z")
    public boolean transparent = false;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public int minY = 0;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "Z")
    public boolean ticked = false;

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
    public final int y1;

    @OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
    public final int id;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public final int t1;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    public int wornSlot;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "Z")
    public boolean groundRelative;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public final int anInt711;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public final int t2;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
    public final int lb;

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "I")
    public final int sourceId;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public final int verticalAngle;

    @OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
    public final int displacement;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "Lclient!gu;")
    public final Animator animator;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
    public ProjectileAnimation(@OriginalArg(0) int id, @OriginalArg(1) int level, @OriginalArg(2) int virtualLevel, @OriginalArg(3) int x, @OriginalArg(4) int z, @OriginalArg(5) int y1, @OriginalArg(6) int t1, @OriginalArg(7) int t2, @OriginalArg(8) int verticalAngle, @OriginalArg(9) int displacement, @OriginalArg(10) int sourceId, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean groundRelative, @OriginalArg(14) int wornSlot) {
        super(level, virtualLevel, x, Static102.averageHeight(level, -29754, z, x) - y1, z, x >> 9, x >> 9, z >> 9, z >> 9, false, (byte) 0);
        this.y1 = y1;
        this.id = id;
        this.t1 = t1;
        this.wornSlot = wornSlot;
        this.groundRelative = groundRelative;
        this.anInt711 = arg11;
        this.ticked = false;
        this.t2 = t2;
        this.lb = arg12;
        this.sourceId = sourceId;
        this.verticalAngle = verticalAngle;
        this.displacement = displacement;

        @Pc(82) int animation = SpotAnimationTypeList.instance.list(this.id).seq;
        this.animator = new EntityAnimator(this, false);
        this.animator.update(true, animation);
    }

    @OriginalMember(owner = "client!b", name = "k", descriptor = "(I)I")
    @Override
    public int getMinY(@OriginalArg(0) int arg0) {
        if (arg0 != 2) {
            this.groundRelative = false;
        }
        return this.minY;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZIII)V")
    public void target(@OriginalArg(0) int y, @OriginalArg(2) int t, @OriginalArg(3) int z, @OriginalArg(4) int x) {
        if (!this.ticked) {
            @Pc(9) double deltaX = x - super.x;
            @Pc(16) double deltaZ = z - super.z;
            @Pc(25) double distance = Math.sqrt((deltaZ * deltaZ) + (deltaX * deltaX));

            this.translateZ = ((deltaZ * (double) this.displacement) / distance) + (double) super.z;
            this.translateX = ((deltaX * (double) this.displacement) / distance) + (double) super.x;

            if (this.groundRelative) {
                this.translateY = Static102.averageHeight(super.level, -29754, (int) this.translateZ, (int) this.translateX) - this.y1;
            } else {
                this.translateY = super.y;
            }
        }

        @Pc(9) double deltaT = (this.t2 + 1) - t;
        this.speedZ = ((double) z - this.translateZ) / deltaT;
        this.speedX = ((double) x - this.translateX) / deltaT;

        this.horizontalSpeed = Math.sqrt((this.speedX * this.speedX) + (this.speedZ * this.speedZ));

        if (this.verticalAngle == -1) {
            this.verticalSpeed = ((double) y - this.translateY) / deltaT;
        } else {
            if (!this.ticked) {
                this.verticalSpeed = -this.horizontalSpeed * Math.tan((double) this.verticalAngle * 0.02454369D);
            }

            this.verticalAcceleration = (((double) y - (deltaT * this.verticalSpeed) - this.translateY) * 2.0D) / (deltaT * deltaT);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
    @Override
    public BoundingCylinder getCylinder(@OriginalArg(0) Toolkit toolkit, @OriginalArg(1) int arg1) {
        if (arg1 >= -93) {
            this.translateX = 1.3103535335051488D;
        }
        return null;
    }

    @OriginalMember(owner = "client!b", name = "l", descriptor = "(I)V")
    @Override
    public void updateBounds() {
        super.x1 = super.x2 = (short) (int) (this.translateX / 512.0D);
        super.z1 = super.z2 = (short) (int) (this.translateZ / 512.0D);
    }

    @OriginalMember(owner = "client!b", name = "j", descriptor = "(I)V")
    @Override
    public void stopSharingLight(@OriginalArg(0) int arg0) {
        if (arg0 != 27811) {
            this.wornSlot = -9;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
    @Override
    public void shareLight(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Toolkit arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Entity arg6) {
        if (arg4 >= 101) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
    public Model model(@OriginalArg(0) int functionMask, @OriginalArg(1) Toolkit toolkit, @OriginalArg(2) int arg2) {
        @Pc(17) SpotAnimationType type = SpotAnimationTypeList.instance.list(this.id);
        return type.model(this.animator, (byte) 2, functionMask, toolkit);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public void method815() {
        if (this.particleSystem != null) {
            this.particleSystem.run();
        }
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)Z")
    @Override
    public boolean isTransparent(@OriginalArg(0) int arg0) {
        return arg0 == 0 ? this.transparent : true;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)V")
    public void method816() {
        if (this.ticked || this.sourceId == 0) {
            return;
        }

        @Pc(21) PathingEntity entity = null;
        if (CutsceneManager.state == 3) {
            entity = CutsceneManager.actors[this.sourceId - 1].entity();
        } else if (this.sourceId < 0) {
            @Pc(35) int index = -this.sourceId - 1;

            if (PlayerList.activePlayerSlot == index) {
                entity = PlayerEntity.self;
            } else {
                entity = PlayerList.highResolutionPlayers[index];
            }
        } else {
            @Pc(35) int index = this.sourceId - 1;
            @Pc(58) NPCEntityNode npc = (NPCEntityNode) NPCList.local.get(index);

            if (npc != null) {
                entity = npc.npc;
            }
        }

        if (entity == null) {
            return;
        }

        super.z = entity.z;
        super.x = entity.x;
        super.y = Static102.averageHeight(super.level, -29754, entity.z, entity.x) - this.y1;

        if (this.wornSlot >= 0) {
            @Pc(105) BASType basType = entity.getBASType();

            @Pc(107) int local107 = 0;
            @Pc(109) int local109 = 0;
            if (basType.wornTransformations != null && basType.wornTransformations[this.wornSlot] != null) {
                local109 = basType.wornTransformations[this.wornSlot][2];
                local107 = basType.wornTransformations[this.wornSlot][0];
            }
            if (basType.graphicOffsets != null && basType.graphicOffsets[this.wornSlot] != null) {
                local109 += basType.graphicOffsets[this.wornSlot][2];
                local107 += basType.graphicOffsets[this.wornSlot][0];
            }

            if (local107 != 0 || local109 != 0) {
                @Pc(185) int yaw = entity.yaw.getValue(16383);
                @Pc(187) int local187 = yaw;
                if (entity.wornRotation != null && entity.wornRotation[this.wornSlot] != -1) {
                    local187 = entity.wornRotation[this.wornSlot];
                }
                @Pc(213) int local213 = local187 - yaw & 0x3FFF;
                @Pc(217) int local217 = Trig1.SIN[local213];
                @Pc(221) int local221 = Trig1.COS[local213];
                @Pc(232) int local232 = local217 * local109 + local221 * local107 >> 14;
                local109 = local109 * local221 - local217 * local107 >> 14;
                super.z += local109;
                super.x += local232;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Z")
    @Override
    public boolean isStationary() {
        return false;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)I")
    @Override
    public int getSphereRadius(@OriginalArg(0) byte arg0) {
        return arg0 == -21 ? this.sphereRadius : 39;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!ha;Lclient!tt;Lclient!ka;)V")
    public void update(@OriginalArg(1) Toolkit toolkit, @OriginalArg(2) Matrix matrix, @OriginalArg(3) Model model) {
        model.apply(matrix);

        @Pc(9) ModelParticleEmitter[] emitters = model.particleEmitters();
        @Pc(12) ModelParticleEffector[] effectors = model.particleEffectors();

        if ((this.particleSystem == null || this.particleSystem.removed) && (emitters != null || effectors != null)) {
            this.particleSystem = ParticleSystem.create(TimeUtils.clock, true);
        }

        if (this.particleSystem != null) {
            this.particleSystem.update(toolkit, TimeUtils.clock, emitters, effectors);
            this.particleSystem.updateBounds(super.level, super.x1, super.x2, super.z1, super.z2);
        }
    }

    @OriginalMember(owner = "client!b", name = "i", descriptor = "(I)Z")
    @Override
    public boolean method9290(@OriginalArg(0) int arg0) {
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(Lclient!ha;I)V")
    @Override
    public void method9289(@OriginalArg(0) Toolkit toolkit, @OriginalArg(1) int arg1) {
        if (arg1 != -5) {
            Static29.aClass131_1 = null;
        }

        @Pc(18) Model model = this.model(0x0, toolkit, arg1 + 75);
        if (model == null) {
            return;
        }

        @Pc(25) Matrix matrix = toolkit.scratchMatrix();
        matrix.makeRotationX(this.rotateX);
        matrix.rotateAxisY(this.rotateY);
        matrix.translate((int) this.translateX, (int) this.translateY, (int) this.translateZ);

        this.minY = model.fa();
        this.sphereRadius = model.ma();
        this.update(toolkit, matrix, model);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
    @Override
    public PickableEntity render(@OriginalArg(1) Toolkit toolkit) {
        @Pc(19) Model model = this.model(0x800, toolkit, 46);
        if (model == null) {
            return null;
        }

        @Pc(27) Matrix matrix = toolkit.scratchMatrix();
        matrix.makeRotationX(this.rotateX);
        matrix.rotateAxisY(this.rotateY);
        matrix.translate((int) this.translateX, (int) this.translateY, (int) this.translateZ);

        this.update(toolkit, matrix, model);

        @Pc(57) PickableEntity local57 = Static642.method8441(false, 1);
        if (Static504.renderOrtho) {
            model.renderOrtho(matrix, local57.pickingCylinders[0], Static582.orthoAngle, 0);
        } else {
            model.render(matrix, local57.pickingCylinders[0], 0);
        }

        if (this.particleSystem != null) {
            @Pc(89) ParticleList particles = this.particleSystem.getList();

            if (Static504.renderOrtho) {
                toolkit.renderOrtho(particles, Static582.orthoAngle);
            } else {
                toolkit.render(particles);
            }
        }

        this.transparent = model.F();
        this.minY = model.fa();
        this.sphereRadius = model.ma();
        return local57;
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    @Override
    public void finalize() {
        if (this.particleSystem != null) {
            this.particleSystem.run();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZLclient!ha;)Z")
    @Override
    public boolean picked(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) boolean arg2, @OriginalArg(3) Toolkit toolkit) {
        if (arg2) {
            this.translateY = -0.10988590233715705D;
        }
        return false;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
    public void tick(@OriginalArg(1) int time) {
        this.ticked = true;
        this.translateX += (double) time * this.speedX;
        this.translateZ += (double) time * this.speedZ;

        if (this.groundRelative) {
            this.translateY = Static102.averageHeight(super.level, -29754, (int) this.translateZ, (int) this.translateX) - this.y1;
        } else if (this.verticalAngle == -1) {
            this.translateY += this.verticalSpeed * (double) time;
        } else {
            this.translateY += ((double) time * this.verticalSpeed) + (this.verticalAcceleration * 0.5D * (double) time * (double) time);
            this.verticalSpeed += (double) time * this.verticalAcceleration;
        }

        this.rotateY = (int) (Math.atan2(this.speedX, this.speedZ) * 2607.5945876176133D) + 8192 & 0x3FFF;
        this.rotateX = (int) (Math.atan2(this.verticalSpeed, this.horizontalSpeed) * 2607.5945876176133D) & 0x3FFF;

        if (this.animator.tick(1) && this.animator.isFinished()) {
            this.animator.resetImmediately();
        }
    }
}