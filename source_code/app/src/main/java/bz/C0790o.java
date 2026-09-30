package bz;

/* renamed from: bz.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0790o extends r {
    public float alpha;
    public float bravo;

    public C0790o(float f5, float f10) {
        this.alpha = f5;
        this.bravo = f10;
    }

    @Override // bz.r
    public final float alpha(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return 0.0f;
            }
            return this.bravo;
        }
        return this.alpha;
    }

    @Override // bz.r
    public final int bravo() {
        return 2;
    }

    @Override // bz.r
    public final r charlie() {
        return new C0790o(0.0f, 0.0f);
    }

    @Override // bz.r
    public final void delta() {
        this.alpha = 0.0f;
        this.bravo = 0.0f;
    }

    @Override // bz.r
    public final void echo(float f5, int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            this.bravo = f5;
            return;
        }
        this.alpha = f5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0790o) {
            C0790o c0790o = (C0790o) obj;
            if (c0790o.alpha == this.alpha && c0790o.bravo == this.bravo) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.bravo) + (Float.floatToIntBits(this.alpha) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.alpha + ", v2 = " + this.bravo;
    }
}
