package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.utils.HKJCHelper;

public class Element3D {
    private int seq;
    private String text;

    public int getSeq() {
        return this.seq;
    }

    public void setSeq(int i) {
        this.seq = i;
    }

    public String getText() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.text);
    }

    public void setText(String str) {
        this.text = str;
    }
}
