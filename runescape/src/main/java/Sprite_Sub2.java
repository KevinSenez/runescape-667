import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Sprite_Sub2 extends Sprite {

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!gb;")
    public Class93_Sub2_Sub1 aClass93_Sub2_Sub1_2;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int anInt6027 = 0;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int anInt6031 = 0;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int anInt6037 = 0;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Z")
    public boolean aBoolean456 = false;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public int anInt6040 = 0;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public int anInt6041 = 0;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!qha;")
    public final Toolkit_Sub3 aClass19_Sub3_28;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!gb;")
    public final Class93_Sub2_Sub1 aClass93_Sub2_Sub1_3;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!qha;IIZ)V")
    public Sprite_Sub2(@OriginalArg(0) Toolkit_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
        this.aClass19_Sub3_28 = arg0;
        this.aClass93_Sub2_Sub1_3 = Static709.method9251(arg2, arg1, arg3 ? 6408 : 6407, arg0);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!qha;IIII)V")
    public Sprite_Sub2(@OriginalArg(0) Toolkit_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        this.aClass19_Sub3_28 = arg0;
        this.aClass93_Sub2_Sub1_3 = Static295.method4353(arg1, arg4, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!qha;II[III)V")
    public Sprite_Sub2(@OriginalArg(0) Toolkit_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        this.aClass19_Sub3_28 = arg0;
        this.aClass93_Sub2_Sub1_3 = Static88.method1706(arg0, arg1, arg5, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    @Override
    public void method8196() {
        OpenGL.glPixelTransferf(OpenGL.GL_RED_SCALE, 0.5F);
        OpenGL.glPixelTransferf(OpenGL.GL_RED_BIAS, 0.499F);
        OpenGL.glPixelTransferf(OpenGL.GL_GREEN_SCALE, 0.5F);
        OpenGL.glPixelTransferf(OpenGL.GL_GREEN_BIAS, 0.499F);
        OpenGL.glPixelTransferf(OpenGL.GL_BLUE_SCALE, 0.5F);
        OpenGL.glPixelTransferf(OpenGL.GL_BLUE_BIAS, 0.499F);
        this.aClass93_Sub2_Sub1_2 = Static295.method4353(0, this.aClass93_Sub2_Sub1_3.anInt3257, this.aClass93_Sub2_Sub1_3.anInt3259, 0, this.aClass19_Sub3_28);
        this.anInt6031 = 3;
        OpenGL.glPixelTransferf(OpenGL.GL_RED_SCALE, 1.0F);
        OpenGL.glPixelTransferf(OpenGL.GL_RED_BIAS, 0.0F);
        OpenGL.glPixelTransferf(OpenGL.GL_GREEN_SCALE, 1.0F);
        OpenGL.glPixelTransferf(OpenGL.GL_GREEN_BIAS, 0.0F);
        OpenGL.glPixelTransferf(OpenGL.GL_BLUE_SCALE, 1.0F);
        OpenGL.glPixelTransferf(OpenGL.GL_BLUE_BIAS, 0.0F);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)V")
    @Override
    protected void method8190(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int op, @OriginalArg(5) int colour, @OriginalArg(6) int mode) {
        this.aClass93_Sub2_Sub1_3.method9438(true);
        this.aClass19_Sub3_28.method7018();
        this.aClass19_Sub3_28.method7017(mode);
        OpenGL.glColor4ub((byte) (colour >> 16), (byte) (colour >> 8), (byte) colour, (byte) (colour >> 24));
        if (this.aBoolean456) {
            @Pc(52) float local52 = (float) width / (float) this.scaleWidth();
            @Pc(59) float local59 = (float) height / (float) this.scaleHeight();
            @Pc(68) float local68 = (float) x + local52 * (float) this.anInt6041;
            @Pc(77) float local77 = local59 * (float) this.anInt6027 + (float) y;
            @Pc(86) float local86 = (float) this.aClass93_Sub2_Sub1_3.anInt3259 * local52 + local68;
            @Pc(95) float local95 = (float) this.aClass93_Sub2_Sub1_3.anInt3257 * local59 + local77;
            if (this.aClass93_Sub2_Sub1_2 == null) {
                this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_3);
                this.aClass19_Sub3_28.method6991(op);
                OpenGL.glBegin(OpenGL.GL_QUADS);
                OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2f(local68, local77);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(local68, local95);
                OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
                OpenGL.glVertex2f(local86, local95);
                OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2f(local86, local77);
                OpenGL.glEnd();
            } else {
                this.method5425(op);
                this.aClass93_Sub2_Sub1_2.method9438(true);
                OpenGL.glBegin(OpenGL.GL_QUADS);
                OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2f(local68, local77);
                OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(local68, local95);
                OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
                OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
                OpenGL.glVertex2f(local86, local95);
                OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2f(local86, local77);
                OpenGL.glEnd();
                this.method5422();
            }
        } else if (this.aClass93_Sub2_Sub1_2 == null) {
            this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_3);
            this.aClass19_Sub3_28.method6991(op);
            OpenGL.glBegin(OpenGL.GL_QUADS);
            OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
            OpenGL.glVertex2i(x, y);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(x, y + height);
            OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
            OpenGL.glVertex2i(width + x, height + y);
            OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
            OpenGL.glVertex2i(width + x, y);
            OpenGL.glEnd();
        } else {
            this.method5425(op);
            this.aClass93_Sub2_Sub1_2.method9438(true);
            OpenGL.glBegin(OpenGL.GL_QUADS);
            OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
            OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
            OpenGL.glVertex2i(x, y);
            OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(x, y + height);
            OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
            OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
            OpenGL.glVertex2i(x + width, y + height);
            OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
            OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
            OpenGL.glVertex2i(width + x, y);
            OpenGL.glEnd();
            this.method5422();
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()I")
    @Override
    public int scaleWidth() {
        return this.aClass93_Sub2_Sub1_3.anInt3259 + this.anInt6041 + this.anInt6037;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
    @Override
    public int getWidth() {
        return this.aClass93_Sub2_Sub1_3.anInt3259;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
    @Override
    protected void method8194(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) ClippingMask arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
        @Pc(7) Class93_Sub2_Sub1 local7 = ((ClippingMask_Sub3) arg6).aClass93_Sub2_Sub1_5;
        @Pc(14) float local14;
        @Pc(18) float local18;
        @Pc(25) float local25;
        @Pc(32) float local32;
        if (this.aBoolean456) {
            local14 = (float) this.scaleWidth();
            local18 = (float) this.scaleHeight();
            local25 = (arg2 - arg0) / local14;
            local32 = (arg3 - arg1) / local14;
            @Pc(39) float local39 = (arg4 - arg0) / local18;
            @Pc(46) float local46 = (arg5 - arg1) / local18;
            @Pc(52) float local52 = local39 * (float) this.anInt6027;
            @Pc(58) float local58 = (float) this.anInt6027 * local46;
            @Pc(64) float local64 = (float) this.anInt6041 * local25;
            @Pc(70) float local70 = local32 * (float) this.anInt6041;
            @Pc(77) float local77 = -local25 * (float) this.anInt6037;
            @Pc(84) float local84 = (float) this.anInt6037 * -local32;
            @Pc(91) float local91 = (float) this.anInt6040 * -local39;
            arg3 = arg3 + local84 + local58;
            arg0 = local52 + local64 + arg0;
            @Pc(110) float local110 = -local46 * (float) this.anInt6040;
            arg2 = local52 + local77 + arg2;
            arg4 = local91 + arg4 + local64;
            arg1 = local70 + arg1 + local58;
            arg5 = local110 + local70 + arg5;
        }
        local14 = arg4 + arg2 - arg0;
        local18 = arg5 + arg3 - arg1;
        this.aClass93_Sub2_Sub1_3.method9438(true);
        this.aClass19_Sub3_28.method7018();
        this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_3);
        this.aClass19_Sub3_28.method6991(1);
        this.aClass19_Sub3_28.method7014(1);
        this.aClass19_Sub3_28.method7001(local7);
        this.aClass19_Sub3_28.method7031(8448, 7681);
        this.aClass19_Sub3_28.method7021(34168, 768, 0);
        this.aClass19_Sub3_28.method7017(1);
        local25 = local7.aFloat67 / (float) local7.anInt3259;
        local32 = local7.aFloat68 / (float) local7.anInt3257;
        OpenGL.glBegin(OpenGL.GL_QUADS);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE0, 0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, local25 * (arg0 - (float) arg7), local7.aFloat68 - (arg1 - (float) arg8) * local32);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE0, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, ((float) -arg7 + arg4) * local25, local7.aFloat68 - local32 * ((float) -arg8 + arg5));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE0, this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, ((float) -arg7 + local14) * local25, local7.aFloat68 - ((float) -arg8 + local18) * local32);
        OpenGL.glVertex2f(local14, local18);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE0, this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, local25 * ((float) -arg7 + arg2), local7.aFloat68 - (arg3 - (float) arg8) * local32);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.aClass19_Sub3_28.method7021(5890, 768, 0);
        this.aClass19_Sub3_28.method6991(0);
        this.aClass19_Sub3_28.method7001((Class93) null);
        this.aClass19_Sub3_28.method7014(0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!aa;II)V")
    @Override
    public void method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ClippingMask arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        @Pc(6) ClippingMask_Sub3 local6 = (ClippingMask_Sub3) arg2;
        @Pc(9) Class93_Sub2_Sub1 local9 = local6.aClass93_Sub2_Sub1_5;
        this.aClass93_Sub2_Sub1_3.method9438(false);
        this.aClass19_Sub3_28.method7018();
        this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_3);
        this.aClass19_Sub3_28.method6991(1);
        this.aClass19_Sub3_28.method7014(1);
        this.aClass19_Sub3_28.method7001(local9);
        this.aClass19_Sub3_28.method7031(8448, 7681);
        this.aClass19_Sub3_28.method7021(34168, 768, 0);
        this.aClass19_Sub3_28.method7017(1);
        @Pc(62) int local62 = arg0 + this.anInt6041;
        @Pc(67) int local67 = arg1 + this.anInt6027;
        @Pc(73) int local73 = this.aClass93_Sub2_Sub1_3.anInt3259 + local62;
        @Pc(79) int local79 = this.aClass93_Sub2_Sub1_3.anInt3257 + local67;
        @Pc(86) float local86 = local9.aFloat67 / (float) local9.anInt3259;
        @Pc(93) float local93 = local9.aFloat68 / (float) local9.anInt3257;
        @Pc(100) float local100 = local86 * (float) (local62 - arg3);
        @Pc(108) float local108 = local86 * (float) (local73 - arg3);
        @Pc(118) float local118 = local9.aFloat68 - (float) (local67 - arg4) * local93;
        @Pc(128) float local128 = local9.aFloat68 - local93 * (float) (local79 - arg4);
        OpenGL.glBegin(OpenGL.GL_QUADS);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE0, 0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, local100, local118);
        OpenGL.glVertex2i(local62, local67);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE0, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, local100, local128);
        OpenGL.glVertex2i(local62, this.aClass93_Sub2_Sub1_3.anInt3257 + local67);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE0, this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, local108, local128);
        OpenGL.glVertex2i(this.aClass93_Sub2_Sub1_3.anInt3259 + local62, local67 - -this.aClass93_Sub2_Sub1_3.anInt3257);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE0, this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, local108, local118);
        OpenGL.glVertex2i(this.aClass93_Sub2_Sub1_3.anInt3259 + local62, local67);
        OpenGL.glEnd();
        this.aClass19_Sub3_28.method7021(5890, 768, 0);
        this.aClass19_Sub3_28.method6991(0);
        this.aClass19_Sub3_28.method7001((Class93) null);
        this.aClass19_Sub3_28.method7014(0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([I)V")
    @Override
    public void getOffsets(@OriginalArg(0) int[] arg0) {
        arg0[2] = this.anInt6037;
        arg0[3] = this.anInt6040;
        arg0[1] = this.anInt6027;
        arg0[0] = this.anInt6041;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(IIII)V")
    @Override
    public void method8184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        this.anInt6027 = arg1;
        this.anInt6041 = arg0;
        this.anInt6037 = arg2;
        this.anInt6040 = arg3;
        this.aBoolean456 = this.anInt6041 != 0 || this.anInt6027 != 0 || this.anInt6037 != 0 || this.anInt6040 != 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()I")
    @Override
    public int scaleHeight() {
        return this.anInt6040 + this.aClass93_Sub2_Sub1_3.anInt3257 + this.anInt6027;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V")
    @Override
    public void render(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int op) {
        this.aClass93_Sub2_Sub1_3.method9438(false);
        this.aClass19_Sub3_28.method7018();
        this.aClass19_Sub3_28.method7017(op);
        OpenGL.glColor4ub((byte) (height >> 16), (byte) (height >> 8), (byte) height, (byte) (height >> 24));
        @Pc(37) int local37 = x + this.anInt6041;
        @Pc(42) int local42 = y + this.anInt6027;
        if (this.aClass93_Sub2_Sub1_2 == null) {
            this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_3);
            this.aClass19_Sub3_28.method6991(width);
            OpenGL.glBegin(OpenGL.GL_QUADS);
            OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
            OpenGL.glVertex2i(local37, local42);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(local37, local42 + this.aClass93_Sub2_Sub1_3.anInt3257);
            OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
            OpenGL.glVertex2i(this.aClass93_Sub2_Sub1_3.anInt3259 + local37, this.aClass93_Sub2_Sub1_3.anInt3257 + local42);
            OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
            OpenGL.glVertex2i(local37 + this.aClass93_Sub2_Sub1_3.anInt3259, local42);
            OpenGL.glEnd();
            return;
        }
        this.method5425(width);
        this.aClass93_Sub2_Sub1_2.method9438(false);
        OpenGL.glBegin(OpenGL.GL_QUADS);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glVertex2i(local37, local42);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(local37, local42 + this.aClass93_Sub2_Sub1_3.anInt3257);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
        OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
        OpenGL.glVertex2i(this.aClass93_Sub2_Sub1_3.anInt3259 + local37, this.aClass93_Sub2_Sub1_3.anInt3257 + local42);
        OpenGL.glMultiTexCoord2f(OpenGL.GL_TEXTURE1, this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glVertex2i(this.aClass93_Sub2_Sub1_3.anInt3259 + local37, local42);
        OpenGL.glEnd();
        this.method5422();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(FFFFFFIIII)V")
    @Override
    protected void render(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float width, @OriginalArg(3) float height, @OriginalArg(4) float op, @OriginalArg(5) float colour, @OriginalArg(6) int mode, @OriginalArg(7) int arg7) {
        @Pc(6) float local6;
        @Pc(10) float local10;
        if (this.aBoolean456) {
            local6 = (float) this.scaleWidth();
            local10 = (float) this.scaleHeight();
            @Pc(16) float local16 = (width - x) / local6;
            @Pc(22) float local22 = (height - y) / local6;
            @Pc(29) float local29 = (op - x) / local10;
            @Pc(36) float local36 = (colour - y) / local10;
            @Pc(42) float local42 = (float) this.anInt6027 * local29;
            @Pc(48) float local48 = (float) this.anInt6027 * local36;
            @Pc(54) float local54 = (float) this.anInt6041 * local16;
            @Pc(60) float local60 = local22 * (float) this.anInt6041;
            @Pc(67) float local67 = (float) this.anInt6037 * -local16;
            @Pc(74) float local74 = (float) this.anInt6037 * -local22;
            @Pc(81) float local81 = -local29 * (float) this.anInt6040;
            y = y + local60 + local48;
            op = local81 + local54 + op;
            height = local48 + height + local74;
            x = local54 + x + local42;
            width = local67 + width + local42;
            @Pc(118) float local118 = -local36 * (float) this.anInt6040;
            colour = local118 + local60 + colour;
        }
        local6 = op + width - x;
        local10 = colour + height - y;
        this.aClass93_Sub2_Sub1_3.method9438(true);
        this.aClass19_Sub3_28.method7018();
        this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_3);
        this.aClass19_Sub3_28.method7017(1);
        this.aClass19_Sub3_28.method6991(mode);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(OpenGL.GL_QUADS);
        OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glVertex2f(x, y);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(op, colour);
        OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
        OpenGL.glVertex2f(local6, local10);
        OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
        OpenGL.glVertex2f(width, height);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public void method5422() {
        this.aClass19_Sub3_28.method7014(1);
        this.aClass19_Sub3_28.method7001((Class93) null);
        this.aClass19_Sub3_28.method7031(8448, 8448);
        this.aClass19_Sub3_28.method7021(34168, 768, 1);
        this.aClass19_Sub3_28.method7029(0, 5890);
        this.aClass19_Sub3_28.method7014(0);
        this.aClass19_Sub3_28.method7021(34168, 768, 1);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIIIIII)V")
    @Override
    public void method8189(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int op, @OriginalArg(5) int colour, @OriginalArg(6) int mode) {
        @Pc(9) int local9 = width + x;
        this.aClass93_Sub2_Sub1_3.method9438(false);
        @Pc(18) int local18 = height + y;
        this.aClass19_Sub3_28.method7018();
        this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_3);
        this.aClass19_Sub3_28.method7017(mode);
        this.aClass19_Sub3_28.method6991(op);
        OpenGL.glColor4ub((byte) (colour >> 16), (byte) (colour >> 8), (byte) colour, (byte) (colour >> 24));
        if (this.aClass93_Sub2_Sub1_3.aBoolean261 && !this.aBoolean456) {
            @Pc(74) float local74 = this.aClass93_Sub2_Sub1_3.aFloat68 * (float) height / (float) this.aClass93_Sub2_Sub1_3.anInt3257;
            @Pc(86) float local86 = this.aClass93_Sub2_Sub1_3.aFloat67 * (float) width / (float) this.aClass93_Sub2_Sub1_3.anInt3259;
            OpenGL.glBegin(OpenGL.GL_QUADS);
            OpenGL.glTexCoord2f(0.0F, local74);
            OpenGL.glVertex2i(x, y);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(x, local18);
            OpenGL.glTexCoord2f(local86, 0.0F);
            OpenGL.glVertex2i(local9, local18);
            OpenGL.glTexCoord2f(local86, local74);
            OpenGL.glVertex2i(local9, y);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.anInt6041, (float) this.anInt6027, 0.0F);
        @Pc(126) int local126 = this.scaleWidth();
        @Pc(129) int local129 = this.scaleHeight();
        @Pc(135) int local135 = this.aClass93_Sub2_Sub1_3.anInt3257 + y;
        OpenGL.glBegin(OpenGL.GL_QUADS);
        @Pc(139) int local139 = y;
        @Pc(150) int local150;
        while (local135 <= local18) {
            local150 = x + this.aClass93_Sub2_Sub1_3.anInt3259;
            @Pc(152) int local152 = x;
            while (local150 <= local9) {
                OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2i(local152, local139);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(local152, local135);
                OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, 0.0F);
                OpenGL.glVertex2i(local150, local135);
                OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2i(local150, local139);
                local152 += local126;
                local150 += local126;
            }
            if (local152 < local9) {
                @Pc(223) float local223 = (float) (local9 - local152) * this.aClass93_Sub2_Sub1_3.aFloat67 / (float) this.aClass93_Sub2_Sub1_3.anInt3259;
                OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2i(local152, local139);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(local152, local135);
                OpenGL.glTexCoord2f(local223, 0.0F);
                OpenGL.glVertex2i(local9, local135);
                OpenGL.glTexCoord2f(local223, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2i(local9, local139);
            }
            local135 += local129;
            local139 += local129;
        }
        if (local18 > local139) {
            @Pc(296) float local296 = this.aClass93_Sub2_Sub1_3.aFloat68 * (float) (this.aClass93_Sub2_Sub1_3.anInt3257 + local139 - local18) / (float) this.aClass93_Sub2_Sub1_3.anInt3257;
            @Pc(302) int local302 = x + this.aClass93_Sub2_Sub1_3.anInt3259;
            local150 = x;
            while (local302 <= local9) {
                OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2i(local150, local139);
                OpenGL.glTexCoord2f(0.0F, local296);
                OpenGL.glVertex2i(local150, local18);
                OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, local296);
                OpenGL.glVertex2i(local302, local18);
                OpenGL.glTexCoord2f(this.aClass93_Sub2_Sub1_3.aFloat67, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2i(local302, local139);
                local150 += local126;
                local302 += local126;
            }
            if (local9 > local150) {
                @Pc(371) float local371 = this.aClass93_Sub2_Sub1_3.aFloat67 * (float) (local9 - local150) / (float) this.aClass93_Sub2_Sub1_3.anInt3259;
                OpenGL.glTexCoord2f(0.0F, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2i(local150, local139);
                OpenGL.glTexCoord2f(0.0F, local296);
                OpenGL.glVertex2i(local150, local18);
                OpenGL.glTexCoord2f(local371, local296);
                OpenGL.glVertex2i(local9, local18);
                OpenGL.glTexCoord2f(local371, this.aClass93_Sub2_Sub1_3.aFloat68);
                OpenGL.glVertex2i(local9, local139);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()I")
    @Override
    public int getHeight() {
        return this.aClass93_Sub2_Sub1_3.anInt3257;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V")
    @Override
    public void render(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int op, @OriginalArg(5) int colour) {
        if (!this.aClass19_Sub3_28.aBoolean604) {
            this.aClass93_Sub2_Sub1_3.method2943(height, x, y, colour, op, width);
            return;
        }
        @Pc(17) int[] local17 = this.aClass19_Sub3_28.na(op, colour, width, height);
        if (local17 == null) {
            return;
        }
        for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
            local17[local21] |= 0xFF000000;
        }
        this.method5423(x, y, width, height, local17, width);
        return;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII[III)V")
    public void method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
        this.aClass93_Sub2_Sub1_3.method2942(arg4, arg0, arg3, arg2, arg1, arg5);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
    public void method5425(@OriginalArg(1) int arg0) {
        this.aClass19_Sub3_28.method7014(1);
        this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_3);
        this.aClass19_Sub3_28.method7031(7681, this.aClass19_Sub3_28.method6977(arg0));
        this.aClass19_Sub3_28.method7021(34167, 768, 1);
        this.aClass19_Sub3_28.method7029(0, 34168);
        this.aClass19_Sub3_28.method7014(0);
        this.aClass19_Sub3_28.method7001(this.aClass93_Sub2_Sub1_2);
        this.aClass19_Sub3_28.method7031(7681, 34479);
        this.aClass19_Sub3_28.method7021(34166, 768, 1);
        if (this.anInt6031 == 0) {
            this.aClass19_Sub3_28.method6979(0.5F, 1.0F, 0.0F, 0.5F);
        } else if (this.anInt6031 == 1) {
            this.aClass19_Sub3_28.method6979(0.5F, 0.5F, 0.0F, 1.0F);
        } else if (this.anInt6031 == 2) {
            this.aClass19_Sub3_28.method6979(1.0F, 0.5F, 0.0F, 0.5F);
        } else if (this.anInt6031 == 3) {
            this.aClass19_Sub3_28.method6979(128.5F, 128.5F, 0.0F, 128.5F);
            return;
        }
    }
}
