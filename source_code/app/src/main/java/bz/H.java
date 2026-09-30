package bz;

/* loaded from: classes3.dex */
public final class H {
    public float alpha;
    public double bravo;
    public float charlie;

    public final long alpha(float f5, float f10, long j5) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f11 = f5 - this.alpha;
        double d4 = j5 / 1000.0d;
        float f12 = this.charlie;
        double d9 = f12 * f12;
        double d10 = this.bravo;
        double d11 = (-f12) * d10;
        if (f12 > 1.0f) {
            double sqrt = Math.sqrt(d9 - 1) * d10;
            double d12 = d11 + sqrt;
            double d13 = d11 - sqrt;
            double d14 = f11;
            double d15 = ((d13 * d14) - f10) / (d13 - d12);
            double d16 = d14 - d15;
            double d17 = d13 * d4;
            double d18 = d4 * d12;
            sin = (Math.exp(d18) * d15) + (Math.exp(d17) * d16);
            exp = Math.exp(d17) * d16 * d13;
            exp2 = Math.exp(d18) * d15 * d12;
        } else if (f12 == 1.0f) {
            double d19 = f11;
            double d20 = (d10 * d19) + f10;
            double d21 = (-d10) * d4;
            double d22 = (d4 * d20) + d19;
            sin = Math.exp(d21) * d22;
            exp = Math.exp(d21) * d22 * (-this.bravo);
            exp2 = Math.exp(d21) * d20;
        } else {
            double d23 = 1;
            double sqrt2 = Math.sqrt(d23 - d9) * d10;
            double d24 = f11;
            double d25 = (((-d11) * d24) + f10) * (d23 / sqrt2);
            double d26 = sqrt2 * d4;
            double d27 = d4 * d11;
            sin = ((Math.sin(d26) * d25) + (Math.cos(d26) * d24)) * Math.exp(d27);
            cos = (((Math.cos(d26) * sqrt2 * d25) + (Math.sin(d26) * (-sqrt2) * d24)) * Math.exp(d27)) + (d11 * sin);
            float f13 = (float) cos;
            return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.alpha)) << 32);
        }
        cos = exp2 + exp;
        float f132 = (float) cos;
        return (Float.floatToRawIntBits(f132) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.alpha)) << 32);
    }
}
