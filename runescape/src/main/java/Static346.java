import com.jagex.core.datastruct.key.IterableHashTable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

    @OriginalMember(owner = "client!kt", name = "T", descriptor = "Lclient!uc;")
    public static Environment aEnvironment_1;

    @OriginalMember(owner = "client!kt", name = "V", descriptor = "[F")
    public static final float[] aFloatArray40 = new float[2];

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "Lclient!av;")
    public static final IterableHashTable A_HASH_TABLE___29 = new IterableHashTable(16);

    @OriginalMember(owner = "client!kt", name = "R", descriptor = "[I")
    public static int[] anIntArray420 = new int[4];

    @OriginalMember(owner = "client!kt", name = "S", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___145 = new ServerProt(124, 1);

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
    public static void method5085() {
        Static78.anInt1622 = 0;
        Static86.anInt1798 = 0;
        Static572.anInt8896++;
        Static262.method3839();
        Static161.method2588();
        Static538.method7193();
        @Pc(23) boolean local23 = false;
        @Pc(33) int local33;
        for (@Pc(25) int local25 = 0; local25 < Static78.anInt1622; local25++) {
            local33 = Static118.anIntArray197[local25];
            @Pc(40) Node_Sub45 local40 = (Node_Sub45) Static18.A_HASH_TABLE___2.get(local33);
            @Pc(43) NPCEntity local43 = local40.aClass8_Sub2_Sub1_Sub2_Sub2_2;
            if (local43.anInt10751 != Static572.anInt8896) {
                if (MiniMenu.open && Static321.method4622(local33)) {
                    Static488.method6522();
                }
                if (local43.type.hasSounds()) {
                    Static58.method1259(local43);
                }
                local43.method9328(null);
                local40.unlink();
                local23 = true;
            }
        }
        if (local23) {
            Static416.anInt6378 = Static18.A_HASH_TABLE___2.size();
            Static18.A_HASH_TABLE___2.copyTo(Static592.aClass2_Sub45Array1);
        }
        if (ConnectionManager.GAME.buffer.pos != ConnectionManager.GAME.currentPacketSize) {
            throw new RuntimeException("gnp1 pos:" + ConnectionManager.GAME.buffer.pos + " psize:" + ConnectionManager.GAME.currentPacketSize);
        }
        for (local33 = 0; local33 < Static390.anInt6126; local33++) {
            if (Static18.A_HASH_TABLE___2.get(Static103.anIntArray187[local33]) == null) {
                throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static390.anInt6126);
            }
        }
        if (Static416.anInt6378 - Static390.anInt6126 != 0) {
            throw new RuntimeException("gnp3 mis:" + (Static416.anInt6378 - Static390.anInt6126));
        }
        for (@Pc(214) int local214 = 0; local214 < Static416.anInt6378; local214++) {
            if (Static592.aClass2_Sub45Array1[local214].aClass8_Sub2_Sub1_Sub2_Sub2_2.anInt10751 != Static572.anInt8896) {
                throw new RuntimeException("gnp4 uk:" + Static592.aClass2_Sub45Array1[local214].aClass8_Sub2_Sub1_Sub2_Sub2_2.id);
            }
        }
    }
}
