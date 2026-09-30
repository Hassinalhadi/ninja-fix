package t6;

/* renamed from: t6.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3057t {
    public static final /* synthetic */ int alpha = 0;

    public static final void alpha(int i4, String str) {
        if (str.charAt(i4) == '-') {
            return;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Expected '-' (hyphen) at index ", ", but was '");
        sierra.append(str.charAt(i4));
        sierra.append('\'');
        throw new IllegalArgumentException(sierra.toString().toString());
    }

    public static final void bravo(long j5, byte[] bArr, int i4, int i5, int i10) {
        int i11 = 7 - i5;
        int i12 = 8 - i10;
        if (i12 > i11) {
            return;
        }
        while (true) {
            int i13 = kotlin.text.d.alpha[(int) ((j5 >> (i11 << 3)) & 255)];
            int i14 = i4 + 1;
            bArr[i4] = (byte) (i13 >> 8);
            i4 += 2;
            bArr[i14] = (byte) i13;
            if (i11 != i12) {
                i11--;
            } else {
                return;
            }
        }
    }

    public static final long charlie(int i4, byte[] bArr) {
        return (bArr[i4 + 7] & 255) | ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
    }
}
