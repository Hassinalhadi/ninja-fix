package T;

import ao.ad;

/* loaded from: classes3.dex */
public final class g implements e {
    public final float alpha;

    public g(float f5) {
        this.alpha = f5;
    }

    @Override // T.e
    public final int alpha(int i4, int i5, Q0.n nVar) {
        return Math.round((1 + this.alpha) * ((i5 - i4) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && Float.compare(this.alpha, ((g) obj).alpha) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.alpha);
    }

    public final String toString() {
        return ad.azure(new StringBuilder("Horizontal(bias="), this.alpha, ')');
    }
}
