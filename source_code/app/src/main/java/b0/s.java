package b0;

import ao.ad;

/* loaded from: classes3.dex */
public final class s {
    public final float alpha;
    public final float bravo;

    public s(float f5, float f10) {
        this.alpha = f5;
        this.bravo = f10;
    }

    public final float[] alpha() {
        float f5 = this.alpha;
        float f10 = this.bravo;
        return new float[]{f5 / f10, 1.0f, ((1.0f - f5) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (Float.compare(this.alpha, sVar.alpha) == 0 && Float.compare(this.bravo, sVar.bravo) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.bravo) + (Float.floatToIntBits(this.alpha) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.alpha);
        sb2.append(", y=");
        return ad.azure(sb2, this.bravo, ')');
    }
}
