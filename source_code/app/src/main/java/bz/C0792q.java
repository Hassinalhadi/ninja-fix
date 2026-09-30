package bz;

/* renamed from: bz.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0792q extends r {
    public float alpha;
    public float bravo;
    public float charlie;
    public float delta;

    public C0792q(float f5, float f10, float f11, float f12) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
    }

    @Override // bz.r
    public final float alpha(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return 0.0f;
                    }
                    return this.delta;
                }
                return this.charlie;
            }
            return this.bravo;
        }
        return this.alpha;
    }

    @Override // bz.r
    public final int bravo() {
        return 4;
    }

    @Override // bz.r
    public final r charlie() {
        return new C0792q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // bz.r
    public final void delta() {
        this.alpha = 0.0f;
        this.bravo = 0.0f;
        this.charlie = 0.0f;
        this.delta = 0.0f;
    }

    @Override // bz.r
    public final void echo(float f5, int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return;
                    }
                    this.delta = f5;
                    return;
                }
                this.charlie = f5;
                return;
            }
            this.bravo = f5;
            return;
        }
        this.alpha = f5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0792q) {
            C0792q c0792q = (C0792q) obj;
            if (c0792q.alpha == this.alpha && c0792q.bravo == this.bravo && c0792q.charlie == this.charlie && c0792q.delta == this.delta) {
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
        return "AnimationVector4D: v1 = " + this.alpha + ", v2 = " + this.bravo + ", v3 = " + this.charlie + ", v4 = " + this.delta;
    }
}
