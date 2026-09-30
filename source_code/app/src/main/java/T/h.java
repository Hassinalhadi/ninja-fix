package T;

/* loaded from: classes3.dex */
public final class h implements f {
    public final float alpha;

    public h(float f5) {
        this.alpha = f5;
    }

    @Override // T.f
    public final long alpha(long j5, long j6, Q0.n nVar) {
        long j7 = ((((int) (j6 >> 32)) - ((int) (j5 >> 32))) << 32) | ((((int) (j6 & 4294967295L)) - ((int) (j5 & 4294967295L))) & 4294967295L);
        float f5 = 1;
        float f10 = (this.alpha + f5) * (((int) (j7 >> 32)) / 2.0f);
        float f11 = (f5 - 1.0f) * (((int) (j7 & 4294967295L)) / 2.0f);
        return (Math.round(f11) & 4294967295L) | (Math.round(f10) << 32);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (Float.compare(this.alpha, ((h) obj).alpha) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.alpha) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.alpha + ", verticalBias=-1.0)";
    }
}
