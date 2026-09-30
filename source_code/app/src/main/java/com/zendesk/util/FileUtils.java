package com.zendesk.util;

import java.util.Locale;

/* loaded from: classes2.dex */
public class FileUtils {
    private static final String BINARY_PREFIXES = "KMGTPE";
    private static final int BINARY_UNIT = 1024;
    private static final String SI_PREFIXES = "kMGTPE";
    private static final int SI_UNIT = 1000;

    private FileUtils() {
    }

    public static String getFileExtension(String str) {
        int lastIndexOf;
        if (!StringUtils.hasLength(str) || (lastIndexOf = str.lastIndexOf(".")) == -1) {
            return "";
        }
        return str.substring(lastIndexOf + 1).toLowerCase(Locale.US).trim();
    }

    public static String humanReadableFileSize(Long l10) {
        return humanReadableFileSize(l10, true);
    }

    public static String humanReadableFileSize(Long l10, boolean z2) {
        if (l10 == null || l10.longValue() < 0) {
            return "";
        }
        int i4 = z2 ? 1000 : 1024;
        if (l10.longValue() < i4) {
            return l10 + " B";
        }
        double d4 = i4;
        int log = (int) (Math.log(l10.longValue()) / Math.log(d4));
        StringBuilder sb2 = new StringBuilder();
        sb2.append((z2 ? SI_PREFIXES : BINARY_PREFIXES).charAt(log - 1));
        sb2.append(z2 ? "" : "i");
        return String.format(Locale.US, "%.1f %sB", Double.valueOf(l10.longValue() / Math.pow(d4, log)), sb2.toString());
    }
}
