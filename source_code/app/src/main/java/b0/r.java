package b0;

/* loaded from: classes3.dex */
public final class r {
    public final double alpha;
    public final double bravo;
    public final double charlie;
    public final double delta;
    public final double echo;
    public final double foxtrot;
    public final double golf;

    public /* synthetic */ r(double d4, double d9, double d10, double d11, double d12) {
        this(d4, d9, d10, d11, d12, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Double.compare(this.alpha, rVar.alpha) == 0 && Double.compare(this.bravo, rVar.bravo) == 0 && Double.compare(this.charlie, rVar.charlie) == 0 && Double.compare(this.delta, rVar.delta) == 0 && Double.compare(this.echo, rVar.echo) == 0 && Double.compare(this.foxtrot, rVar.foxtrot) == 0 && Double.compare(this.golf, rVar.golf) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.alpha);
        long doubleToLongBits2 = Double.doubleToLongBits(this.bravo);
        int i4 = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        long doubleToLongBits3 = Double.doubleToLongBits(this.charlie);
        int i5 = (i4 + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31;
        long doubleToLongBits4 = Double.doubleToLongBits(this.delta);
        int i10 = (i5 + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31;
        long doubleToLongBits5 = Double.doubleToLongBits(this.echo);
        int i11 = (i10 + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31;
        long doubleToLongBits6 = Double.doubleToLongBits(this.foxtrot);
        int i12 = (i11 + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31;
        long doubleToLongBits7 = Double.doubleToLongBits(this.golf);
        return i12 + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.alpha + ", a=" + this.bravo + ", b=" + this.charlie + ", c=" + this.delta + ", d=" + this.echo + ", e=" + this.foxtrot + ", f=" + this.golf + ')';
    }

    public r(double d4, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.alpha = d4;
        this.bravo = d9;
        this.charlie = d10;
        this.delta = d11;
        this.echo = d12;
        this.foxtrot = d13;
        this.golf = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d4)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d4 == -2.0d || d4 == -3.0d) {
            return;
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d9 == 0.0d || d4 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d9 == 0.0d || d4 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d9 < 0.0d || d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
