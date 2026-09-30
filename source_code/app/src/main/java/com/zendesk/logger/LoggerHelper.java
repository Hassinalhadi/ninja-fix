package com.zendesk.logger;

import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class LoggerHelper {
    private static final String DEFAULT_LOG_TAG = "Zendesk";
    private static final int MAXIMUM_ANDROID_LOG_TAG_LENGTH = 23;

    private LoggerHelper() {
    }

    public static String getAndroidTag(String str) {
        if (StringUtils.isEmpty(str)) {
            return DEFAULT_LOG_TAG;
        }
        if (str.length() > 23) {
            return str.substring(0, 23);
        }
        return str;
    }

    public static char getLevelFromPriority(int i4) {
        if (i4 == 2) {
            return 'V';
        }
        if (i4 == 3) {
            return 'D';
        }
        if (i4 == 5) {
            return 'W';
        }
        if (i4 != 6) {
            return i4 != 7 ? 'I' : 'A';
        }
        return 'E';
    }

    public static List<String> splitLogMessage(String str, int i4) {
        int min;
        ArrayList arrayList = new ArrayList();
        if (i4 < 1) {
            if (!StringUtils.hasLength(str)) {
                arrayList.add("");
                return arrayList;
            }
            arrayList.add(str);
            return arrayList;
        }
        if (!StringUtils.hasLength(str)) {
            arrayList.add("");
            return arrayList;
        }
        if (str.length() < i4) {
            arrayList.add(str);
            return arrayList;
        }
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            int indexOf = str.indexOf(StringUtils.LINE_SEPARATOR, i5);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i5 + i4);
                arrayList.add(str.substring(i5, min));
                if (min >= indexOf) {
                    break;
                }
                i5 = min;
            }
            i5 = min + 1;
        }
        return arrayList;
    }
}
