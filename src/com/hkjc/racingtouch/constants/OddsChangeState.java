package com.hkjc.racingtouch.constants;


public enum OddsChangeState {
    IGNORE(-1, -1, -1),
    DEFAULT(-1, 1,1),
    SCRATCHED(-1, -1,-1),
    HOT(1,1,1),
    DROP_20(20,20,20),
    DROP_50(50,50,50);
    
    private final int backgroundAttrId;
    private final int textBackgroundColorAttrId;
    private final int textBackgroundColorResId;

    private OddsChangeState(int i, int i2, int i3) {
        this.textBackgroundColorResId = i;
        this.textBackgroundColorAttrId = i2;
        this.backgroundAttrId = i3;
    }

    public int getTextBackgroundColorResId() {
        return this.textBackgroundColorResId;
    }

    public int getTextBackgroundColorAttrId() {
        return this.textBackgroundColorAttrId;
    }

    public int getBackgroundAttrId() {
        return this.backgroundAttrId;
    }

    public static OddsChangeState getByOddsDrop(boolean z, boolean z2, double d) {
        if (z) {
            return SCRATCHED;
        }
        if (z2) {
            return HOT;
        }
        if (d >= 50.0d) {
            return DROP_50;
        }
        if (d >= 20.0d) {
            return DROP_20;
        }
        return DEFAULT;
    }
}
