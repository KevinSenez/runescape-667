import com.jagex.ClientProt;
import com.jagex.core.io.Packet;
import com.jagex.core.stringtools.general.NameTools;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "([IB[I)V")
    public static void method7241(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
        if (arg0 == null || arg1 == null) {
            Packet.anIntArray13 = null;
            Packet.aByteArrayArrayArray2 = null;
            Packet.anIntArray311 = null;
            return;
        }
        Packet.anIntArray13 = arg0;
        Packet.anIntArray311 = new int[arg0.length];
        Packet.aByteArrayArrayArray2 = new byte[arg0.length][][];
        for (@Pc(39) int local39 = 0; local39 < Packet.anIntArray13.length; local39++) {
            Packet.aByteArrayArrayArray2[local39] = new byte[arg1[local39]][];
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static void method7242(@OriginalArg(1) String arg0) {
        if (arg0 == null) {
            return;
        }
        @Pc(11) String local11 = NameTools.format(arg0);
        if (local11 == null) {
            return;
        }
        for (@Pc(22) int local22 = 0; local22 < FriendsList.count; local22++) {
            @Pc(27) String local27 = FriendsList.names[local22];
            @Pc(31) String local31 = NameTools.format(local27);
            if (Static585.method7682(arg0, local31, local27, local11)) {
                FriendsList.count--;
                for (@Pc(44) int local44 = local22; local44 < FriendsList.count; local44++) {
                    FriendsList.names[local44] = FriendsList.names[local44 + 1];
                    FriendsList.formerNames[local44] = FriendsList.formerNames[local44 + 1];
                    FriendsList.worlds[local44] = FriendsList.worlds[local44 + 1];
                    FriendsList.worldNames[local44] = FriendsList.worldNames[local44 + 1];
                    FriendsList.ranks[local44] = FriendsList.ranks[local44 + 1];
                    FriendsList.sameGameFlags[local44] = FriendsList.sameGameFlags[local44 + 1];
                    FriendsList.referredFlags[local44] = FriendsList.referredFlags[local44 + 1];
                }
                FriendsList.lastTransmit = World.tick;
                @Pc(118) ServerConnection local118 = ConnectionManager.active();
                @Pc(124) ClientMessage local124 = ClientMessage.create(ClientProt.FRIENDLIST_DEL, local118.cipher);
                local124.bitPacket.p1(Static231.method3379(arg0));
                local124.bitPacket.pjstr(arg0);
                local118.send(local124);
                return;
            }
        }
    }
}
