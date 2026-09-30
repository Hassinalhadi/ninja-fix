package Pf;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class h {
    public static final char[] alpha = new char[117];
    public static final byte[] bravo = new byte[126];

    static {
        int i4 = 0;
        for (int i5 = 0; i5 < 32; i5++) {
        }
        alpha(Constants.INAPP_POSITION_BOTTOM, 8);
        alpha(Constants.INAPP_POSITION_TOP, 9);
        alpha('n', 10);
        alpha('f', 12);
        alpha(Constants.INAPP_POSITION_RIGHT, 13);
        alpha('/', 47);
        alpha('\"', 34);
        alpha('\\', 92);
        while (true) {
            byte[] bArr = bravo;
            if (i4 < 33) {
                bArr[i4] = Byte.MAX_VALUE;
                i4++;
            } else {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
        }
    }

    public static void alpha(char c3, int i4) {
        if (c3 != 'u') {
            alpha[c3] = (char) i4;
        }
    }
}
