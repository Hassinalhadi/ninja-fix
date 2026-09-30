package com.zendesk.util;

import com.clevertap.android.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class StringUtils {
    public static final String EMPTY_STRING = "";
    private static final String ISO_8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static Map<Character, String> JS_ESCAPE_LOOKUP_MAP;
    public static final String LINE_SEPARATOR;

    static {
        HashMap hashMap = new HashMap();
        JS_ESCAPE_LOOKUP_MAP = hashMap;
        hashMap.put('\'', "\\'");
        JS_ESCAPE_LOOKUP_MAP.put('\"', "\\\"");
        JS_ESCAPE_LOOKUP_MAP.put('\\', "\\\\");
        JS_ESCAPE_LOOKUP_MAP.put('/', "\\/");
        JS_ESCAPE_LOOKUP_MAP.put('\b', "\\b");
        JS_ESCAPE_LOOKUP_MAP.put('\n', "\\n");
        JS_ESCAPE_LOOKUP_MAP.put('\t', "\\t");
        JS_ESCAPE_LOOKUP_MAP.put('\f', "\\f");
        JS_ESCAPE_LOOKUP_MAP.put('\r', "\\r");
        LINE_SEPARATOR = System.getProperty("line.separator");
    }

    private StringUtils() {
    }

    public static String capitalize(String str) {
        if (hasLength(str)) {
            if (Character.isUpperCase(str.charAt(0))) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str.length());
            sb2.append(Character.toTitleCase(str.charAt(0)));
            sb2.append(str.substring(1));
            return sb2.toString();
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    public static String ensureEmpty(String str) {
        if (hasLength(str)) {
            return str;
        }
        return "";
    }

    public static String escapeEcmaScript(String str) {
        if (isEmpty(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (JS_ESCAPE_LOOKUP_MAP.containsKey(Character.valueOf(charAt))) {
                sb2.append(JS_ESCAPE_LOOKUP_MAP.get(Character.valueOf(charAt)));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    public static List<String> fromCsv(String str) {
        if (hasLength(str)) {
            String[] split = str.split(Constants.SEPARATOR_COMMA);
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (hasLength(str2)) {
                    arrayList.add(str2);
                }
            }
            return CollectionUtils.unmodifiableList(arrayList);
        }
        return CollectionUtils.unmodifiableList(new ArrayList(0));
    }

    public static boolean hasLength(String str) {
        if (str != null && str.trim().length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean hasLengthMany(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(String str) {
        return !hasLength(str);
    }

    public static boolean isNumeric(String str) {
        if (isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isDigit(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean startsWithIdeographic(String str) {
        if (!hasLength(str)) {
            return false;
        }
        return Character.isIdeographic(str.codePointAt(0));
    }

    public static String toCsvString(String... strArr) {
        return toCsvString((List<String>) (strArr == null ? null : Arrays.asList(strArr)));
    }

    public static String toCsvStringNumber(Number... numberArr) {
        return toCsvStringNumber((List<? extends Number>) (numberArr == null ? null : Arrays.asList(numberArr)));
    }

    public static String toDateInIsoFormat(Date date) {
        if (date != null) {
            return new SimpleDateFormat(ISO_8601_DATE_FORMAT).format(date);
        }
        return "";
    }

    public static String toCsvString(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (hasLength(list.get(i4))) {
                sb2.append(list.get(i4));
                if (i4 < list.size() - 1) {
                    sb2.append(Constants.SEPARATOR_COMMA);
                }
            }
        }
        return sb2.toString();
    }

    public static String toCsvStringNumber(List<? extends Number> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Number number : list) {
                if (number != null) {
                    arrayList.add(number.toString());
                }
            }
        } else {
            arrayList = null;
        }
        return toCsvString(arrayList);
    }

    public static String toCsvString(long... jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j5 : jArr) {
            arrayList.add(Long.valueOf(j5));
        }
        return toCsvStringNumber(arrayList);
    }
}
