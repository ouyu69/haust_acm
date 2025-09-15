package com.haust_acm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateUtils {
    private static final Object LOCK = new Object();
    private static Map<String, ThreadLocal<SimpleDateFormat>> sdfMap = new HashMap<>();

    private static SimpleDateFormat getSdf(String patten) {
        ThreadLocal<SimpleDateFormat> tl = sdfMap.get(patten);
        if (tl == null) {
            synchronized (LOCK) {
                tl = sdfMap.get(patten);
                if (tl == null) {
                    tl = new ThreadLocal<SimpleDateFormat>() {
                        @Override
                        protected SimpleDateFormat initialValue() {
                            return new SimpleDateFormat(patten);
                        }
                    };
                    sdfMap.put(patten, tl);
                }
            }
        }
        return tl.get();
    }

    public static String format(Date date, String patten) {
        return getSdf(patten).format(date);
    }

    public static Date parse(String date, String patten) {
        try {
            return getSdf(patten).parse(date);
        } catch (Exception e) {
            return null;
        }
    }
}
