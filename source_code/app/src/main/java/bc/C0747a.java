package bc;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* renamed from: bc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0747a implements Comparator {
    public final RectF alpha;
    public final Rational purple;

    public C0747a(Rational rational, Rational rational2) {
        this.purple = rational2 == null ? new Rational(4, 3) : rational2;
        this.alpha = bravo(rational);
    }

    public static float alpha(RectF rectF, RectF rectF2) {
        float width;
        float height;
        if (rectF.width() < rectF2.width()) {
            width = rectF.width();
        } else {
            width = rectF2.width();
        }
        if (rectF.height() < rectF2.height()) {
            height = rectF.height();
        } else {
            height = rectF2.height();
        }
        return width * height;
    }

    public final RectF bravo(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = this.purple;
        if (floatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        if (rational.floatValue() > rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator());
        }
        return new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z2;
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        boolean z10 = false;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF bravo = bravo(rational);
        RectF bravo2 = bravo(rational2);
        RectF rectF = this.alpha;
        if (bravo.width() >= rectF.width() && bravo.height() >= rectF.height()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bravo2.width() >= rectF.width() && bravo2.height() >= rectF.height()) {
            z10 = true;
        }
        if (z2 && z10) {
            return (int) Math.signum((bravo.height() * bravo.width()) - (bravo2.height() * bravo2.width()));
        }
        if (z2) {
            return -1;
        }
        if (z10) {
            return 1;
        }
        return -((int) Math.signum(alpha(bravo, rectF) - alpha(bravo2, rectF)));
    }
}
