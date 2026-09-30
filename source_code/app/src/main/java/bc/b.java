package bc;

import android.util.Rational;
import android.util.Size;
import s6.T7;

/* loaded from: classes3.dex */
public abstract class b {
    public static final Rational alpha = new Rational(4, 3);
    public static final Rational bravo = new Rational(3, 4);
    public static final Rational charlie = new Rational(16, 9);
    public static final Rational delta = new Rational(9, 16);

    public static boolean alpha(Rational rational, Size size) {
        Size size2 = bi.b.bravo;
        if (rational != null) {
            if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                if (size.getHeight() * size.getWidth() >= bi.b.alpha(size2)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                    int i4 = width % 16;
                    if (i4 == 0 && height % 16 == 0) {
                        if (bravo(Math.max(0, height - 16), width, rational) || bravo(Math.max(0, width - 16), height, rational2)) {
                            return true;
                        }
                    } else {
                        if (i4 == 0) {
                            return bravo(height, width, rational);
                        }
                        if (height % 16 == 0) {
                            return bravo(width, height, rational2);
                        }
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean bravo(int i4, int i5, Rational rational) {
        boolean z2;
        if (i5 % 16 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.charlie(z2);
        double numerator = (rational.getNumerator() * i4) / rational.getDenominator();
        if (numerator > Math.max(0, i5 - 16) && numerator < i5 + 16) {
            return true;
        }
        return false;
    }
}
