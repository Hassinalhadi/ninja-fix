package bz;

/* renamed from: bz.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0789n extends r {
    public float alpha;

    public C0789n(float f5) {
        this.alpha = f5;
    }

    @Override // bz.r
    public final float alpha(int i4) {
        if (i4 == 0) {
            return this.alpha;
        }
        return 0.0f;
    }

    @Override // bz.r
    public final int bravo() {
        return 1;
    }

    @Override // bz.r
    public final r charlie() {
        return new C0789n(0.0f);
    }

    @Override // bz.r
    public final void delta() {
        this.alpha = 0.0f;
    }

    @Override // bz.r
    public final void echo(float f5, int i4) {
        if (i4 == 0) {
            this.alpha = f5;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0789n) && ((C0789n) obj).alpha == this.alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.alpha);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.alpha;
    }
}
