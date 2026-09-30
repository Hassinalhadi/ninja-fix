package bx;

/* loaded from: classes3.dex */
public final class C {
    public final float alpha;
    public final float bravo;
    public final long charlie;

    public C(float f5, float f10, long j5) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        if (Float.compare(this.alpha, c3.alpha) == 0 && Float.compare(this.bravo, c3.bravo) == 0 && this.charlie == c3.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int sierra = ao.ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31);
        long j5 = this.charlie;
        return sierra + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.alpha + ", distance=" + this.bravo + ", duration=" + this.charlie + ')';
    }
}
