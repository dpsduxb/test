package com.hkjc.racingtouch.manager;

import java.util.Locale;

public class LanguageManager {
    public static final Locale HONG_KONG = new Locale("zh", "HK");
    private static final int LANGUAGE_CHINESE = 1997;
    private static final int LANGUAGE_ENGLISH = 1897;

    public enum IBULanguage {
        ENGLISH(LanguageManager.LANGUAGE_ENGLISH),
        CHINESE(LanguageManager.LANGUAGE_CHINESE);
        
        private int languageId;

        private IBULanguage(int i) {
            this.languageId = i;
        }

        public int getLanguageId() {
            return this.languageId;
        }
    }


    public static boolean isChinese() {
        return false;
    }
}
