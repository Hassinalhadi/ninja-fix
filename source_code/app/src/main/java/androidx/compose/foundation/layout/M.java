package androidx.compose.foundation.layout;

import h.AbstractC1797a;

/* loaded from: classes3.dex */
public final class M implements L {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;

    public M(float f5, float f10, float f11, float f12) {
        boolean z2;
        boolean z10;
        boolean z11;
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
        if (f5 >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (f10 >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z2 & z10;
        if (f11 >= 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z12 & z11 & (f12 >= 0.0f))) {
            AbstractC1797a.alpha("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.foundation.layout.L
    public final float alpha() {
        return this.delta;
    }

    @Override // androidx.compose.foundation.layout.L
    public final float bravo(Q0.n nVar) {
        if (nVar == Q0.n.alpha) {
            return this.alpha;
        }
        return this.charlie;
    }

    @Override // androidx.compose.foundation.layout.L
    public final float charlie() {
        return this.bravo;
    }

    @Override // androidx.compose.foundation.layout.L
    public final float delta(Q0.n nVar) {
        if (nVar == Q0.n.alpha) {
            return this.charlie;
        }
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M) {
            M m4 = (M) obj;
            if (Q0.g.alpha(this.alpha, m4.alpha) && Q0.g.alpha(this.bravo, m4.bravo) && Q0.g.alpha(this.charlie, m4.charlie) && Q0.g.alpha(this.delta, m4.delta)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.delta) + ao.ad.sierra(this.charlie, ao.ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) Q0.g.bravo(this.alpha)) + ", top=" + ((Object) Q0.g.bravo(this.bravo)) + ", end=" + ((Object) Q0.g.bravo(this.charlie)) + ", bottom=" + ((Object) Q0.g.bravo(this.delta)) + ')';
    }
}
