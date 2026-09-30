package G;

import bx.AbstractC0764b;
import bx.C;
import bx.D;

/* loaded from: classes3.dex */
public final class a {
    public float alpha;
    public float bravo;

    public C alpha(float f5) {
        double bravo = bravo(f5);
        double d4 = D.alpha;
        double d9 = d4 - 1.0d;
        return new C(f5, (float) (Math.exp((d4 / d9) * bravo) * this.alpha * this.bravo), (long) (Math.exp(bravo / d9) * 1000.0d));
    }

    public double bravo(float f5) {
        float[] fArr = AbstractC0764b.alpha;
        return Math.log((Math.abs(f5) * 0.35f) / (this.alpha * this.bravo));
    }
}
