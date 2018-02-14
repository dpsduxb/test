package com.hkjc.racingtouch.constants;

public enum HorseRunningStyle {
    RS_0(0, new boolean[]{false, false, false, false}),
    RS_1(1, new boolean[]{true, false, false, false}),
    RS_12(2, new boolean[]{true, true, false, false}),
    RS_123(3, new boolean[]{true, true, true, false}),
    RS_1234(4, new boolean[]{true, true, true, true}),
    RS_2(5, new boolean[]{false, true, false, false}),
    RS_23(6, new boolean[]{false, true, true, false}),
    RS_234(7, new boolean[]{false, true, true, true}),
    RS_3(8, new boolean[]{false, false, true, false}),
    RS_34(9, new boolean[]{false, false, true, true}),
    RS_4(10, new boolean[]{false, false, false, true});
    
    private final boolean isShow1;
    private final boolean isShow2;
    private final boolean isShow3;
    private final boolean isShow4;
    private final int sortSequence;

    private HorseRunningStyle(int i, boolean[] zArr) {
        this.sortSequence = i;
        this.isShow1 = zArr[0];
        this.isShow2 = zArr[1];
        this.isShow3 = zArr[2];
        this.isShow4 = zArr[3];
    }

    public int getSortSequence() {
        return this.sortSequence;
    }

    public boolean isShow1() {
        return this.isShow1;
    }

    public boolean isShow2() {
        return this.isShow2;
    }

    public boolean isShow3() {
        return this.isShow3;
    }

    public boolean isShow4() {
        return this.isShow4;
    }

    public static HorseRunningStyle get(String str) {
        HorseRunningStyle horseRunningStyle = RS_0;
        try {
            return valueOf("RS_" + str);
        } catch (Exception e) {
            return horseRunningStyle;
        }
    }
}
