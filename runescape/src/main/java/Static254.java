import org.openrs2.deob.annotation.OriginalMember;

public final class Static254 {

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int anInt4115;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)[Lclient!hja;")
    public static LoginProt[] method3604() {
        return new LoginProt[]{LoginProt.INIT_GAME_CONNECTION, LoginProt.INIT_JS5REMOTE_CONNECTION, LoginProt.GAMELOGIN, LoginProt.A_LOGIN_PROT___56, LoginProt.LOBBYLOGIN, LoginProt.A_LOGIN_PROT___58, LoginProt.A_LOGIN_PROT___59, LoginProt.A_LOGIN_PROT___60, LoginProt.GAMELOGIN_CONTINUE, LoginProt.A_LOGIN_PROT___62, LoginProt.A_LOGIN_PROT___63, LoginProt.INIT_SOCIAL_NETWORK_CONNECTION, LoginProt.SOCIAL_NETWORK_LOGIN};
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public static void method3606() {
        if (!Camera.angleChangingX) {
            Camera.angleUpdated = true;
            Camera.angleChangingX = true;
            Camera.angleAxisX += (24.0F - Camera.angleAxisX) / 2.0F;
        }
    }
}
