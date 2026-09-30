package Q0;

import ao.ad;

/* loaded from: classes3.dex */
public final class o implements R0.a {
    public final float alpha;

    public o(float f5) {
        this.alpha = f5;
    }

    @Override // R0.a
    public final float alpha(float f5) {
        return f5 / this.alpha;
    }

    @Override // R0.a
    public final float bravo(float f5) {
        return f5 * this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && Float.compare(this.alpha, ((o) obj).alpha) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.alpha);
    }

    public final String toString() {
        return ad.azure(new StringBuilder("LinearFontScaleConverter(fontScale="), this.alpha, ')');
    }
}
