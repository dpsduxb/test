package com.hkjc.racingtouch.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.hkjc.racingtouch.manager.LanguageManager;

public class HKJCHelper {
    public static final int DAY_HIGH_LIMIT = 5;
    public static final int DAY_LOW_LIMIT = 4;
    public static final int MONTH_HIGH_LIMIT = 3;
    public static final int MONTH_LOW_LIMIT = 2;
    public static final int YEAR_HIGH_LIMIT = 1;
    public static final int YEAR_LOW_LIMIT = 0;

    public static double parseDouble(String str) {
        double d = 0.0d;
        if (str != null) {
            try {
                if (!str.trim().equals("")) {
                    d = Double.parseDouble(str.trim());
                }
            } catch (Exception e) {
            }
        }
        return d;
    }

    public static int parseInt(CharSequence charSequence) {
        int i = 0;
        if (charSequence != null) {
            try {
                if (!charSequence.toString().trim().equals("")) {
                    i = Integer.parseInt(charSequence.toString().trim());
                }
            } catch (Exception e) {
            }
        }
        return i;
    }

    public static Boolean parseBool(String str) {
        if (str != null) {
            try {
                if (!str.trim().equals("")) {
                    return Boolean.valueOf(Boolean.parseBoolean(str.trim()));
                }
            } catch (Exception e) {
                return Boolean.valueOf(false);
            }
        }
        return Boolean.valueOf(false);
    }

    public static Boolean parseIntBool(String str) {
        if (str == null || !str.trim().equals("1")) {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public static int getDate(int i, Calendar calendar, long j) {
        Calendar calendar2 = (Calendar) calendar.clone();
        long j2 = 86400000 * j;
        long timeInMillis = calendar2.getTimeInMillis();
        switch (i) {
            case 0:
                calendar2.setTimeInMillis(timeInMillis - j2);
                return calendar2.get(1);
            case 1:
                calendar2.setTimeInMillis(j2 + timeInMillis);
                return calendar2.get(1);
            case 2:
                calendar2.setTimeInMillis(timeInMillis - j2);
                return calendar2.get(2) + 1;
            case 3:
                calendar2.setTimeInMillis(j2 + timeInMillis);
                return calendar2.get(2) + 1;
            case 4:
                calendar2.setTimeInMillis(timeInMillis - j2);
                return calendar2.get(5);
            case 5:
                calendar2.setTimeInMillis(j2 + timeInMillis);
                return calendar2.get(5);
            default:
                return -1;
        }
    }

    public static String getBackDays(String str, String str2) {
        return String.valueOf(getDays(str, str2));
    }

    public static long getDays(String str, String str2) {
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            date = new Date();
            date = simpleDateFormat.parse(str);
            Date parse = simpleDateFormat.parse(str2);
            instance.setTime(date);
            instance2.setTime(parse);
            return (instance2.getTimeInMillis() - instance.getTimeInMillis()) / 86400000;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public static String emptyIfEqualsFlag(String str, String str2) {
        return str2 == str ? "" : str2;
    }

    public static String getStringByLanguage(String str, String str2) {
        if (LanguageManager.isChinese()) {
            return emptyIfEqualsFlag(null, str);
        }
        return emptyIfEqualsFlag(null, str2);
    }
}
