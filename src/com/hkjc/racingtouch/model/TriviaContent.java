package com.hkjc.racingtouch.model;

public class TriviaContent {
    private String lang;
    private String txt;

    public String getLang() {
        return this.lang;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public String getTxt() {
        return this.txt;
    }

    public void setTxt(String str) {
        this.txt = str;
    }

    public boolean isChinese() {
        if (this.lang.isEmpty()) {
            return false;
        }
        return this.lang.equalsIgnoreCase("zh-hk");
    }
}
