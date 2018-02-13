package com.hkjc.racingtouch.utils;

public class BooleanUtils {
    public static boolean valueOf(String str) {
        boolean z = true;
        if (str == null) {
            return false;
        }
        try {
            if (Integer.valueOf(str).intValue() != 1) {
                z = false;
            }
            return z;
        } catch (NumberFormatException e) {
            return Boolean.parseBoolean(str);
        }
    }

    public static boolean valueOf(int i) {
        return Integer.valueOf(i).intValue() == 1;
    }
}
