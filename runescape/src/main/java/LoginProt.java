import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public final class LoginProt {

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___53 = new LoginProt(14, 0);
    @OriginalMember(owner = "client!s", name = "y", descriptor = "Lclient!hja;")
    public static final LoginProt INIT_JS5REMOTE_CONNECTION = new LoginProt(15, 4);
    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___55 = new LoginProt(16, -2);
    @OriginalMember(owner = "client!s", name = "z", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___56 = new LoginProt(17, 0);
    @OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___57 = new LoginProt(19, -2);
    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___58 = new LoginProt(22, -2);
    @OriginalMember(owner = "client!s", name = "v", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___59 = new LoginProt(23, 4);
    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___60 = new LoginProt(24, -1);
    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___61 = new LoginProt(26, 0);
    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___62 = new LoginProt(27, 0);
    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___63 = new LoginProt(28, -2);
    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___64 = new LoginProt(29, -2);
    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!hja;")
    public static final LoginProt A_LOGIN_PROT___65 = new LoginProt(30, -2);
    @OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
    public final int opcode;

    @OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(II)V")
    public LoginProt(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        this.opcode = arg0;
    }

    @OriginalMember(owner = "client!hja", name = "toString", descriptor = "()Ljava/lang/String;")
    @Override
    public String toString() {
        throw new IllegalStateException();
    }
}