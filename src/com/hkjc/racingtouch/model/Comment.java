package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.utils.HKJCHelper;

public class Comment {
    private String lang;
    private String longTextC;
    private String longTextE;
    private String shortTextC;
    private String shortTextE;
    private String text;
    private String textC;
    private String textE;
    private String type;

    public String getShortTextE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.shortTextE);
    }

    public void setShortTextE(String str) {
        this.shortTextE = str;
    }

    public String getLongTextE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.longTextE);
    }

    public void setLongTextE(String str) {
        this.longTextE = str;
    }

    public String getShortTextC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.shortTextC);
    }

    public void setShortTextC(String str) {
        this.shortTextC = str;
    }

    public String getLongTextC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.longTextC);
    }

    public void setLongTextC(String str) {
        this.longTextC = str;
    }

    public String getLang() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.lang);
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public String getType() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.type);
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getTextC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.textC);
    }

    public void setTextC(String str) {
        this.textC = str;
    }

    public String getTextE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.textE);
    }

    public void setTextE(String str) {
        this.textE = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }
}
