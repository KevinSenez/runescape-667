import com.jagex.core.crypto.Whirlpool;
import com.jagex.core.io.Packet;
import com.jagex.js5.CachedResourceWorker;
import com.jagex.js5.FileSystem_Client;
import com.jagex.js5.Js5WorkerRequestMessage;
import com.jagex.js5.Js5WorkerThread;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.math.BigInteger;

@OriginalClass("client!nj")
public final class Js5MasterIndex {

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Lclient!ge;")
    public Packet aClass2_Sub21_10;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[Lclient!pm;")
    public Js5ResourceProvider[] aClass47_Sub1Array5;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Ljava/math/BigInteger;")
    public final BigInteger aBigInteger4;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!pla;")
    public final Js5WorkerThread workerThread;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!iba;")
    public final CachedResourceWorker aCachedResourceWorker_2;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Ljava/math/BigInteger;")
    public final BigInteger aBigInteger3;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lclient!rja;")
    public Js5WorkerRequestMessage aClass2_Sub2_Sub17_Sub1_1;

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!pla;Lclient!iba;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public Js5MasterIndex(@OriginalArg(0) Js5WorkerThread workerThread, @OriginalArg(1) CachedResourceWorker arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
        this.aBigInteger4 = arg3;
        this.workerThread = workerThread;
        this.aCachedResourceWorker_2 = arg1;
        this.aBigInteger3 = arg2;
        if (!this.workerThread.isUrgentFull()) {
            this.aClass2_Sub2_Sub17_Sub1_1 = this.workerThread.requestIndex(255, 255, true, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Z")
    public boolean method5800() {
        if (this.aClass2_Sub21_10 != null) {
            return true;
        }
        if (this.aClass2_Sub2_Sub17_Sub1_1 == null) {
            if (this.workerThread.isUrgentFull()) {
                return false;
            }
            this.aClass2_Sub2_Sub17_Sub1_1 = this.workerThread.requestIndex(255, 255, true, (byte) 0);
        }
        if (this.aClass2_Sub2_Sub17_Sub1_1.incomplete) {
            return false;
        }
        @Pc(49) Packet local49 = new Packet(this.aClass2_Sub2_Sub17_Sub1_1.getData());
        local49.pos = 5;
        @Pc(56) int local56 = local49.g1();
        local49.pos += local56 * 72;
        @Pc(72) byte[] local72 = new byte[local49.data.length - local49.pos];
        local49.gdata(0, local72.length, local72);
        @Pc(102) byte[] local102;
        if (this.aBigInteger3 == null || this.aBigInteger4 == null) {
            local102 = local72;
        } else {
            @Pc(92) BigInteger local92 = new BigInteger(local72);
            @Pc(99) BigInteger local99 = local92.modPow(this.aBigInteger3, this.aBigInteger4);
            local102 = local99.toByteArray();
        }
        if (local102.length != 65) {
            throw new RuntimeException();
        }
        @Pc(131) byte[] local131 = Whirlpool.digest(local49.data, local49.pos - local72.length - 5, 5);
        for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
            if (local131[local140] != local102[local140 + 1]) {
                throw new RuntimeException();
            }
        }
        this.aClass47_Sub1Array5 = new Js5ResourceProvider[local56];
        this.aClass2_Sub21_10 = local49;
        return true;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!af;ILclient!af;B)Lclient!pm;")
    public Js5ResourceProvider getProvider(@OriginalArg(0) FileSystem_Client arg0, @OriginalArg(1) int arg1, @OriginalArg(2) FileSystem_Client arg2) {
        return this.method5802(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLclient!af;ILclient!af;I)Lclient!pm;")
    public Js5ResourceProvider method5802(@OriginalArg(1) FileSystem_Client arg0, @OriginalArg(2) int arg1, @OriginalArg(3) FileSystem_Client arg2) {
        if (this.aClass2_Sub21_10 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || arg1 >= this.aClass47_Sub1Array5.length) {
            throw new RuntimeException();
        } else if (this.aClass47_Sub1Array5[arg1] == null) {
            this.aClass2_Sub21_10.pos = arg1 * 72 + 6;
            @Pc(52) int local52 = this.aClass2_Sub21_10.g4();
            @Pc(57) int local57 = this.aClass2_Sub21_10.g4();
            @Pc(60) byte[] local60 = new byte[64];
            this.aClass2_Sub21_10.gdata(0, 64, local60);
            @Pc(84) Js5ResourceProvider local84 = new Js5ResourceProvider(arg1, arg0, arg2, this.workerThread, this.aCachedResourceWorker_2, local52, local60, local57, true);
            this.aClass47_Sub1Array5[arg1] = local84;
            return local84;
        } else {
            return this.aClass47_Sub1Array5[arg1];
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public void method5804() {
        if (this.aClass47_Sub1Array5 == null) {
            return;
        }
        for (@Pc(12) int local12 = 0; local12 < this.aClass47_Sub1Array5.length; local12++) {
            if (this.aClass47_Sub1Array5[local12] != null) {
                this.aClass47_Sub1Array5[local12].processRequests();
            }
        }
        for (@Pc(41) int local41 = 0; local41 < this.aClass47_Sub1Array5.length; local41++) {
            if (this.aClass47_Sub1Array5[local41] != null) {
                this.aClass47_Sub1Array5[local41].processExtras();
            }
        }
    }
}