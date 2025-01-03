package com.jagex.core.constants;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class MiniMenuAction {

    /* misc */
    public static final int FACE_SQUARE = 11;

    public static final int WALK = 58;

    public static final int CANCEL = 1012;

    public static final int TGT_GROUND = 21;

    /* loc */
    public static final int OPLOC1 = 19;

    public static final int OPLOC2 = 13;

    public static final int OPLOC3 = 46;

    public static final int OPLOC4 = 8;

    public static final int OPLOC5 = 1010;

    public static final int OPLOC6 = 1008;

    public static final int TGT_LOC = 60;

    /* npc */
    public static final int OPNPC1 = 49;

    public static final int OPNPC2 = 59;

    public static final int OPNPC3 = 47;

    public static final int OPNPC4 = 57;

    public static final int OPNPC5 = 3;

    public static final int OPNPC6 = 1011;

    public static final int TGT_NPC = 23;

    /* obj */
    public static final int OPOBJ1 = 25;

    public static final int OPOBJ2 = 5;

    public static final int OPOBJ3 = 50;

    public static final int OPOBJ4 = 6;

    public static final int OPOBJ5 = 45;

    public static final int OPOBJ6 = 1007;

    public static final int TGT_OBJ = 17;

    /* player */
    public static final int OPPLAYER1 = 2;

    public static final int OPPLAYER2 = 22;

    public static final int OPPLAYER3 = 52;

    public static final int OPPLAYER4 = 30;

    public static final int OPPLAYER5 = 53;

    public static final int OPPLAYER6 = 9;

    public static final int OPPLAYER7 = 51;

    public static final int OPPLAYER8 = 15;

    public static final int OPPLAYER9 = 48;

    public static final int OPPLAYER10 = 16;

    public static final int TGT_SELF = 4;

    public static final int TGT_PLAYER = 44;

    @OriginalMember(owner = "client!fp", name = "S", descriptor = "[S")
    public static final short[] PLAYER_OPS = new short[]{
        OPPLAYER1,
        OPPLAYER2,
        OPPLAYER3,
        OPPLAYER4,
        OPPLAYER5,
        OPPLAYER6,
        OPPLAYER7,
        OPPLAYER8,
    };

    /* map element */
    public static final int OP_MAPELEMENT1 = 1003;

    public static final int OP_MAPELEMENT2 = 1001;

    public static final int OP_MAPELEMENT3 = 1006;

    public static final int OP_MAPELEMENT4 = 1009;

    public static final int OP_MAPELEMENT5 = 1004;

    /* button */
    public static final int IF_BUTTONX1 = 20;

    public static final int IF_BUTTONX2 = 1002;

    public static final int IF_BUTTONT = 18;

    public static final int TGT_BUTTON = 12;

    public static final int PAUSE_BUTTON = 10;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Z")
    public static boolean isButtonOp(@OriginalArg(0) int action) {
        return action == IF_BUTTONX1
            || action == IF_BUTTONT
            || action == IF_BUTTONX2
            || action == TGT_BUTTON
            || action == PAUSE_BUTTON;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
    public static boolean isLocOp(@OriginalArg(0) int arg0) {
        return arg0 == OPLOC1
            || arg0 == OPLOC2
            || arg0 == OPLOC3
            || arg0 == OPLOC4
            || arg0 == OPLOC5
            || arg0 == OPLOC6
            || arg0 == TGT_LOC;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)Z")
    public static boolean isNpcOp(@OriginalArg(0) int arg0) {
        return arg0 == OPNPC1
            || arg0 == OPNPC2
            || arg0 == OPNPC3
            || arg0 == OPNPC4
            || arg0 == OPNPC5
            || arg0 == OPNPC6
            || arg0 == TGT_NPC;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(ZI)Z")
    public static boolean isObjOp(@OriginalArg(1) int action) {
        return action == OPOBJ1
            || action == OPOBJ2
            || action == OPOBJ3
            || action == OPOBJ4
            || action == OPOBJ5
            || action == OPOBJ6
            || action == TGT_OBJ;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Z")
    public static boolean isPlayerOp(@OriginalArg(0) int action) {
        return action == OPPLAYER1
            || action == OPPLAYER2
            || action == OPPLAYER3
            || action == OPPLAYER4
            || action == OPPLAYER5
            || action == OPPLAYER6
            || action == OPPLAYER7
            || action == OPPLAYER8
            || action == OPPLAYER9
            || action == OPPLAYER10
            || action == TGT_PLAYER;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Z")
    public static boolean isTarget(@OriginalArg(1) int action) {
        return action == TGT_GROUND
            || action == TGT_LOC
            || action == TGT_NPC
            || action == TGT_OBJ
            || action == TGT_PLAYER
            || action == TGT_SELF
            || action == IF_BUTTONT;
    }

    private MiniMenuAction() {
        /* empty */
    }
}
