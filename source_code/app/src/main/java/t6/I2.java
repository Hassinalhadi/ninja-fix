package t6;

import android.view.inputmethod.HandwritingGesture;

/* loaded from: classes2.dex */
public abstract class I2 {
    public static final Z.c alpha(long j5, long j6) {
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        return new Z.c(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i4), Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat(i5));
    }

    public static int bravo(HandwritingGesture handwritingGesture, n.Y y10) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        y10.invoke(new I0.a(fallbackText, 1));
        return 5;
    }

    public static void charlie(long j5, D0.g gVar, boolean z2, n.Y y10) {
        int i4;
        if (z2) {
            int i5 = D0.am.charlie;
            int i10 = (int) (j5 >> 32);
            int i11 = (int) (j5 & 4294967295L);
            int i12 = 10;
            if (i10 > 0) {
                i4 = Character.codePointBefore(gVar, i10);
            } else {
                i4 = 10;
            }
            if (i11 < gVar.purple.length()) {
                i12 = Character.codePointAt(gVar, i11);
            }
            if (L2.kilo(i4) && (L2.juliet(i12) || L2.hotel(i12))) {
                do {
                    i10 -= Character.charCount(i4);
                    if (i10 == 0) {
                        break;
                    } else {
                        i4 = Character.codePointBefore(gVar, i10);
                    }
                } while (L2.kilo(i4));
                j5 = D0.ae.bravo(i10, i11);
            } else if (L2.kilo(i12) && (L2.juliet(i4) || L2.hotel(i4))) {
                do {
                    i11 += Character.charCount(i12);
                    if (i11 == gVar.purple.length()) {
                        break;
                    } else {
                        i12 = Character.codePointAt(gVar, i11);
                    }
                } while (L2.kilo(i12));
                j5 = D0.ae.bravo(i10, i11);
            }
        }
        int i13 = (int) (4294967295L & j5);
        y10.invoke(new w.n(new I0.g[]{new I0.z(i13, i13), new I0.e(D0.am.delta(j5), 0)}));
    }
}
