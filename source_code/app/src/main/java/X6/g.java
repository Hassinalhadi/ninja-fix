package X6;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import j1.C1931e;
import s6.C5;

/* loaded from: classes2.dex */
public final class g implements TypeEvaluator {
    public final /* synthetic */ int alpha;
    public Object bravo;

    public g(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                return;
            default:
                this.bravo = new FloatEvaluator();
                return;
        }
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f5, Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                float floatValue = ((FloatEvaluator) this.bravo).evaluate(f5, (Number) obj, (Number) obj2).floatValue();
                if (floatValue < 0.1f) {
                    floatValue = 0.0f;
                }
                return Float.valueOf(floatValue);
            default:
                C1931e[] c1931eArr = (C1931e[]) obj;
                C1931e[] c1931eArr2 = (C1931e[]) obj2;
                if (C5.alpha(c1931eArr, c1931eArr2)) {
                    if (!C5.alpha((C1931e[]) this.bravo, c1931eArr)) {
                        this.bravo = C5.echo(c1931eArr);
                    }
                    for (int i4 = 0; i4 < c1931eArr.length; i4++) {
                        C1931e c1931e = ((C1931e[]) this.bravo)[i4];
                        C1931e c1931e2 = c1931eArr[i4];
                        C1931e c1931e3 = c1931eArr2[i4];
                        c1931e.getClass();
                        c1931e.alpha = c1931e2.alpha;
                        int i5 = 0;
                        while (true) {
                            float[] fArr = c1931e2.bravo;
                            if (i5 < fArr.length) {
                                c1931e.bravo[i5] = (c1931e3.bravo[i5] * f5) + ((1.0f - f5) * fArr[i5]);
                                i5++;
                            }
                        }
                    }
                    return (C1931e[]) this.bravo;
                }
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
