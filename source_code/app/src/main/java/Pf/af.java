package Pf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class af {
    public static final String[] alpha;
    public static final byte[] bravo;

    static {
        String[] strArr = new String[93];
        for (int i4 = 0; i4 < 32; i4++) {
            strArr[i4] = "\\u" + bravo(i4 >> 12) + bravo(i4 >> 8) + bravo(i4 >> 4) + bravo(i4);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        alpha = strArr;
        byte[] bArr = new byte[93];
        for (int i5 = 0; i5 < 32; i5++) {
            bArr[i5] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        bravo = bArr;
    }

    public static final void alpha(StringBuilder sb2, String value) {
        Intrinsics.echo(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = value.charAt(i5);
            String[] strArr = alpha;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) value, i4, i5);
                sb2.append(strArr[charAt]);
                i4 = i5 + 1;
            }
        }
        if (i4 != 0) {
            sb2.append((CharSequence) value, i4, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    public static final char bravo(int i4) {
        int i5;
        int i10 = i4 & 15;
        if (i10 < 10) {
            i5 = i10 + 48;
        } else {
            i5 = i10 + 87;
        }
        return (char) i5;
    }
}
