package bx;

/* renamed from: bx.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0763a {
    public final float alpha;
    public final float bravo;

    public C0763a(float f5, float f10) {
        this.alpha = f5;
        this.bravo = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0763a)) {
            return false;
        }
        C0763a c0763a = (C0763a) obj;
        if (Float.compare(this.alpha, c0763a.alpha) == 0 && Float.compare(this.bravo, c0763a.bravo) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.bravo) + (Float.floatToIntBits(this.alpha) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.alpha);
        sb2.append(", velocityCoefficient=");
        return ao.ad.azure(sb2, this.bravo, ')');
    }
}
