package f9;

import F.C0121j0;
import av.q;
import e9.C1642b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: f9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1699b {
    public static final int[] alpha = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset bravo = StandardCharsets.ISO_8859_1;

    public static boolean alpha(int i4, C1642b c1642b, int i5) {
        int i10 = c1642b.charlie;
        Fe.c cVar = c1642b.bravo[q.mike(i5)];
        int i11 = 0;
        for (C0121j0 c0121j0 : (C0121j0[]) cVar.red) {
            i11 += c0121j0.bravo;
        }
        if (i10 - (i11 * cVar.purple) < (i4 + 7) / 8) {
            return false;
        }
        return true;
    }
}
