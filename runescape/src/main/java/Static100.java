import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)I")
    public static int method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        return Static62.waterColour == null ? 0 : Static62.waterColour[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method1988() {
        Static581.aClass2_Sub6_Sub1_3.method912();
        Static676.aJs5_121 = null;
        Static117.aClass2_Sub6_Sub1_2 = null;
        Static96.anInt10171 = 1;
    }
}
