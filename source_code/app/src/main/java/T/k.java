package T;

import ao.ad;

/* loaded from: classes3.dex */
public final class k implements f {
    public final float alpha;
    public final float bravo;

    public k(float f5, float f10) {
        this.alpha = f5;
        this.bravo = f10;
    }

    @Override // T.f
    public final long alpha(long j5, long j6, Q0.n nVar) {
        float f5 = (((int) (j6 >> 32)) - ((int) (j5 >> 32))) / 2.0f;
        float f10 = (((int) (j6 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f;
        Q0.n nVar2 = Q0.n.alpha;
        float f11 = this.alpha;
        if (nVar != nVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f5;
        float f14 = (f12 + this.bravo) * f10;
        return (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Float.compare(this.alpha, kVar.alpha) == 0 && Float.compare(this.bravo, kVar.bravo) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.bravo) + (Float.floatToIntBits(this.alpha) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.alpha);
        sb2.append(", verticalBias=");
        return ad.azure(sb2, this.bravo, ')');
    }
}
