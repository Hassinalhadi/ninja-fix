package com.airbnb.lottie.parser.moshi;

/* loaded from: classes3.dex */
final class JsonScope {
    static final int CLOSED = 8;
    static final int DANGLING_NAME = 4;
    static final int EMPTY_ARRAY = 1;
    static final int EMPTY_DOCUMENT = 6;
    static final int EMPTY_OBJECT = 3;
    static final int NONEMPTY_ARRAY = 2;
    static final int NONEMPTY_DOCUMENT = 7;
    static final int NONEMPTY_OBJECT = 5;

    private JsonScope() {
    }

    public static String getPath(int i4, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder("$");
        for (int i5 = 0; i5 < i4; i5++) {
            int i10 = iArr[i5];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    sb2.append('.');
                    String str = strArr[i5];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i5]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }
}
