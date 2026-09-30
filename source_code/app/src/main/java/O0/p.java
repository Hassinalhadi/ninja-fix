package O0;

import ao.ad;

/* loaded from: classes3.dex */
public final class p {
    public static final p charlie = new p(1.0f, 0.0f);
    public final float alpha;
    public final float bravo;

    public p(float f5, float f10) {
        this.alpha = f5;
        this.bravo = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.alpha == pVar.alpha && this.bravo == pVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.bravo) + (Float.floatToIntBits(this.alpha) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.alpha);
        sb2.append(", skewX=");
        return ad.azure(sb2, this.bravo, ')');
    }
}
