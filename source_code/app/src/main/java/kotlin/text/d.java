package kotlin.text;

import A0.z;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d {
    public static final int[] alpha;
    public static final long[] bravo;

    static {
        int[] iArr = new int[Barcode.FORMAT_QR_CODE];
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            iArr[i5] = "0123456789abcdef".charAt(i5 & 15) | ("0123456789abcdef".charAt(i5 >> 4) << '\b');
        }
        alpha = iArr;
        int[] iArr2 = new int[Barcode.FORMAT_QR_CODE];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr2[i10] = "0123456789ABCDEF".charAt(i10 & 15) | ("0123456789ABCDEF".charAt(i10 >> 4) << '\b');
        }
        int[] iArr3 = new int[Barcode.FORMAT_QR_CODE];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr3[i11] = -1;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i12)] = i13;
            i12++;
            i13++;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        long[] jArr = new long[Barcode.FORMAT_QR_CODE];
        for (int i16 = 0; i16 < 256; i16++) {
            jArr[i16] = -1;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i17)] = i18;
            i17++;
            i18++;
        }
        int i19 = 0;
        while (i4 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i4)] = i19;
            i4++;
            i19++;
        }
        bravo = jArr;
    }

    public static final void alpha(int i4, int i5, String str) {
        int i10 = i5 - i4;
        if (i10 >= 1) {
            if (i10 > 16) {
                int i11 = (i10 + i4) - 16;
                while (i4 < i11) {
                    if (str.charAt(i4) == '0') {
                        i4++;
                    } else {
                        StringBuilder sierra = Q0.c.sierra(i4, "Expected the hexadecimal digit '0' at index ", ", but was '");
                        sierra.append(str.charAt(i4));
                        sierra.append("'.\nThe result won't fit the type being parsed.");
                        throw new NumberFormatException(sierra.toString());
                    }
                }
                return;
            }
            return;
        }
        String substring = str.substring(i4, i5);
        Intrinsics.delta(substring, "substring(...)");
        StringBuilder lima = z.lima("Expected at least 1 hexadecimal digits at index ", ", but was \"", substring, "\" of length ", i4);
        lima.append(i10);
        throw new NumberFormatException(lima.toString());
    }

    public static long bravo(int i4, int i5, String str) {
        g format = g.delta;
        Intrinsics.echo(format, "format");
        ab.charlie(i4, i5, str.length());
        if (format.charlie.alpha) {
            alpha(i4, i5, str);
            return charlie(i4, i5, str);
        }
        if (i5 - i4 > 0) {
            alpha(i4, i5, str);
            return charlie(i4, i5, str);
        }
        String substring = str.substring(i4, i5);
        Intrinsics.delta(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(substring));
    }

    public static final long charlie(int i4, int i5, String str) {
        long j5 = 0;
        while (i4 < i5) {
            long j6 = j5 << 4;
            char charAt = str.charAt(i4);
            if ((charAt >>> '\b') == 0) {
                long j7 = bravo[charAt];
                if (j7 >= 0) {
                    j5 = j6 | j7;
                    i4++;
                }
            }
            StringBuilder sierra = Q0.c.sierra(i4, "Expected a hexadecimal digit at index ", ", but was ");
            sierra.append(str.charAt(i4));
            throw new NumberFormatException(sierra.toString());
        }
        return j5;
    }
}
