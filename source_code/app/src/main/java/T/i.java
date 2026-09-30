package T;

import ao.ad;

/* loaded from: classes3.dex */
public final class i implements e {
    public final float alpha;

    public i(float f5) {
        this.alpha = f5;
    }

    @Override // T.e
    public final int alpha(int i4, int i5, Q0.n nVar) {
        float f5 = (i5 - i4) / 2.0f;
        Q0.n nVar2 = Q0.n.alpha;
        float f10 = this.alpha;
        if (nVar != nVar2) {
            f10 *= -1;
        }
        return Math.round((1 + f10) * f5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && Float.compare(this.alpha, ((i) obj).alpha) == 0) {
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
