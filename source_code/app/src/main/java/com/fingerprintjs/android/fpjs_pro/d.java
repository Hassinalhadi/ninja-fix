package com.fingerprintjs.android.fpjs_pro;

/* loaded from: classes3.dex */
public final class d {
    public final double alpha;

    public d(double d4) {
        this.alpha = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && Double.compare(this.alpha, ((d) obj).alpha) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.alpha);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return "ConfidenceScore(score=" + this.alpha + ")";
    }
}
