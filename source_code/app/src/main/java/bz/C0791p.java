package bz;

/* renamed from: bz.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0791p extends r {
    public float alpha;
    public float bravo;
    public float charlie;

    public C0791p(float f5, float f10, float f11) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
    }

    @Override // bz.r
    public final float alpha(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return 0.0f;
                }
                return this.charlie;
            }
            return this.bravo;
        }
        return this.alpha;
    }

    @Override // bz.r
    public final int bravo() {
        return 3;
    }

    @Override // bz.r
    public final r charlie() {
        return new C0791p(0.0f, 0.0f, 0.0f);
    }

    @Override // bz.r
    public final void delta() {
        this.alpha = 0.0f;
        this.bravo = 0.0f;
        this.charlie = 0.0f;
    }

    @Override // bz.r
    public final void echo(float f5, int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
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
        if (obj instanceof C0791p) {
            C0791p c0791p = (C0791p) obj;
            if (c0791p.alpha == this.alpha && c0791p.bravo == this.bravo && c0791p.charlie == this.charlie) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.charlie) + ao.ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.alpha + ", v2 = " + this.bravo + ", v3 = " + this.charlie;
    }
}
