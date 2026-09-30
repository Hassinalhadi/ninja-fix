package com.google.gson.internal;

/* loaded from: classes2.dex */
public abstract class g {
    public static final int alpha;

    static {
        int i4;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i4 = Integer.parseInt(split[0]);
            if (i4 == 1 && split.length > 1) {
                i4 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i4 = -1;
        }
        if (i4 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i5 = 0; i5 < property.length(); i5++) {
                    char charAt = property.charAt(i5);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i4 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i4 = -1;
            }
        }
        if (i4 == -1) {
            i4 = 6;
        }
        alpha = i4;
    }
}
