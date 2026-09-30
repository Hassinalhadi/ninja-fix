package j1;

import android.graphics.Color;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1928b {
    public static final ThreadLocal alpha = new ThreadLocal();

    public static int alpha(double d4, double d9, double d10) {
        double d11;
        double d12;
        double d13;
        int min;
        int min2;
        double d14 = (((-0.4986d) * d10) + (((-1.5372d) * d9) + (3.2406d * d4))) / 100.0d;
        double d15 = ((0.0415d * d10) + ((1.8758d * d9) + ((-0.9689d) * d4))) / 100.0d;
        double d16 = ((1.057d * d10) + (((-0.204d) * d9) + (0.0557d * d4))) / 100.0d;
        if (d14 > 0.0031308d) {
            d11 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d11 = d14 * 12.92d;
        }
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        int round = (int) Math.round(d11 * 255.0d);
        int i4 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d12 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d13 * 255.0d);
        if (round3 >= 0) {
            i4 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i4);
    }

    public static int bravo(int i4, int i5) {
        int alpha2 = Color.alpha(i5);
        int alpha3 = Color.alpha(i4);
        int i10 = 255 - (((255 - alpha3) * (255 - alpha2)) / 255);
        return Color.argb(i10, charlie(Color.red(i4), alpha3, Color.red(i5), alpha2, i10), charlie(Color.green(i4), alpha3, Color.green(i5), alpha2, i10), charlie(Color.blue(i4), alpha3, Color.blue(i5), alpha2, i10));
    }

    public static int charlie(int i4, int i5, int i10, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        return (((255 - i5) * (i10 * i11)) + ((i4 * 255) * i5)) / (i12 * 255);
    }

    public static int delta(int i4, int i5) {
        if (i5 >= 0 && i5 <= 255) {
            return (i4 & 16777215) | (i5 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
