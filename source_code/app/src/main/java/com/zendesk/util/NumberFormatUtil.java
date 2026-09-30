package com.zendesk.util;

import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class NumberFormatUtil {
    private static long MILLION_PRECISION = 1000000;
    private static final NavigableMap<Long, NumberSuffix> SUFFIXES;

    /* loaded from: classes2.dex */
    public enum NumberSuffix {
        NONE(""),
        KILO("k"),
        MEGA("M"),
        GIGA("G"),
        TERA("T"),
        PETA("P"),
        EXA("E");

        private String suffix;

        NumberSuffix(String str) {
            this.suffix = str;
        }

        public String getSuffix() {
            return this.suffix;
        }
    }

    /* loaded from: classes2.dex */
    public interface SuffixFormatDelegate {
        String getSuffix(NumberSuffix numberSuffix);
    }

    static {
        TreeMap treeMap = new TreeMap();
        SUFFIXES = treeMap;
        treeMap.put(1000L, NumberSuffix.KILO);
        treeMap.put(1000000L, NumberSuffix.MEGA);
        treeMap.put(1000000000L, NumberSuffix.GIGA);
        treeMap.put(1000000000000L, NumberSuffix.TERA);
        treeMap.put(1000000000000000L, NumberSuffix.PETA);
        treeMap.put(1000000000000000000L, NumberSuffix.EXA);
    }

    private NumberFormatUtil() {
    }

    public static String format(long j5) {
        return processValue(j5, null);
    }

    private static String formatValue(String str, NumberSuffix numberSuffix, SuffixFormatDelegate suffixFormatDelegate) {
        String suffix = numberSuffix.getSuffix();
        if (suffixFormatDelegate != null) {
            suffix = suffixFormatDelegate.getSuffix(numberSuffix);
        }
        return String.format(Locale.US, "%1$s%2$s", str, suffix);
    }

    private static String processValue(long j5, SuffixFormatDelegate suffixFormatDelegate) {
        boolean z2;
        long longValue;
        double d4;
        if (j5 == Long.MIN_VALUE) {
            return processValue(-9223372036854775807L, suffixFormatDelegate);
        }
        if (j5 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j5 = -j5;
        }
        if (j5 < 1000) {
            return formatValue(stringValue(j5), NumberSuffix.NONE, suffixFormatDelegate);
        }
        Map.Entry<Long, NumberSuffix> floorEntry = SUFFIXES.floorEntry(Long.valueOf(j5));
        Long key = floorEntry.getKey();
        NumberSuffix value = floorEntry.getValue();
        if (key.longValue() <= MILLION_PRECISION) {
            longValue = (long) Math.ceil(j5 / (key.longValue() / 10.0d));
        } else {
            longValue = j5 / (key.longValue() / 10);
        }
        if (longValue < 100 && longValue / 10.0d != longValue / 10) {
            d4 = longValue / 10.0d;
        } else {
            d4 = longValue / 10;
        }
        if (z2) {
            d4 = -d4;
        }
        return formatValue(stringValue(d4), value, suffixFormatDelegate);
    }

    private static String stringValue(double d4) {
        if (d4 % 1.0d == 0.0d) {
            return String.format(Locale.US, "%1.0f", Double.valueOf(d4));
        }
        return String.format(Locale.US, "%.1f", Double.valueOf(d4));
    }

    public static String format(long j5, SuffixFormatDelegate suffixFormatDelegate) {
        return processValue(j5, suffixFormatDelegate);
    }
}
