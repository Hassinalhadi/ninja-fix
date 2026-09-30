package bz;

import s6.AbstractC2797v7;

/* renamed from: bz.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0795u implements InterfaceC0799y {
    public final float alpha;
    public final float purple;
    public final float red;
    public final float silver;
    public final float teal;
    public final float white;

    public C0795u(float f5, float f10, float f11, float f12) {
        boolean z2;
        int i4;
        this.alpha = f5;
        this.purple = f10;
        this.red = f11;
        this.silver = f12;
        if (!Float.isNaN(f5) && !Float.isNaN(f10) && !Float.isNaN(f11) && !Float.isNaN(f12)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            as.alpha("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f5 + ", " + f10 + ", " + f11 + ", " + f12 + '.');
        }
        float[] fArr = new float[5];
        float f13 = (f10 - 0.0f) * 3.0f;
        float f14 = (f12 - f10) * 3.0f;
        float f15 = (1.0f - f12) * 3.0f;
        double d4 = f13;
        double d9 = f14;
        double d10 = f15;
        double d11 = d9 * 2.0d;
        double d12 = (d4 - d11) + d10;
        if (d12 == 0.0d) {
            if (d9 == d10) {
                i4 = 0;
            } else {
                i4 = a0.ao.cyan((float) ((d11 - d10) / (d11 - (d10 * 2.0d))), fArr, 0);
            }
        } else {
            double d13 = -Math.sqrt((d9 * d9) - (d10 * d4));
            double d14 = (-d4) + d9;
            int cyan = a0.ao.cyan((float) ((-(d13 + d14)) / d12), fArr, 0);
            int cyan2 = a0.ao.cyan((float) ((d13 - d14) / d12), fArr, cyan) + cyan;
            if (cyan2 > 1) {
                float f16 = fArr[0];
                float f17 = fArr[1];
                if (f16 > f17) {
                    fArr[0] = f17;
                    fArr[1] = f16;
                } else if (f16 == f17) {
                    i4 = cyan2 - 1;
                }
            }
            i4 = cyan2;
        }
        float f18 = (f14 - f13) * 2.0f;
        int cyan3 = a0.ao.cyan((-f18) / (((f15 - f14) * 2.0f) - f18), fArr, i4) + i4;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i5 = 0; i5 < cyan3; i5++) {
            float f19 = fArr[i5];
            float f20 = (((((((((f10 - f12) * 3.0f) + 1.0f) - 0.0f) * f19) + (((f12 - (f10 * 2.0f)) + 0.0f) * 3.0f)) * f19) + f13) * f19) + 0.0f;
            min = Math.min(min, f20);
            max = Math.max(max, f20);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.teal = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.white = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // bz.InterfaceC0799y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float bravo(float f5) {
        float f10;
        float f11;
        float f12;
        boolean isNaN;
        float f13;
        if (f5 <= 0.0f || f5 >= 1.0f) {
            return f5;
        }
        float max = Math.max(f5, 1.1920929E-7f);
        float f14 = this.alpha;
        float f15 = this.red;
        float f16 = f15 - max;
        double d4 = 0.0f - max;
        float f17 = 0.0f;
        double d9 = ((d4 - ((f14 - max) * 2.0d)) + f16) * 3.0d;
        double d10 = (r7 - r5) * 3.0d;
        double d11 = ((r7 - f16) * 3.0d) + (-r5) + (1.0f - max);
        float f18 = Float.NaN;
        if (Math.abs(d11 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d9 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d10 - 0.0d) >= 1.0E-7d) {
                    float f19 = (float) ((-d4) / d10);
                    if (f19 >= 0.0f) {
                        f17 = f19;
                    }
                    if (f17 > 1.0f) {
                        f10 = 1.0f;
                    } else {
                        f10 = f17;
                    }
                }
                isNaN = Float.isNaN(f18);
                float f20 = this.silver;
                float f21 = this.purple;
                if (isNaN) {
                    float f22 = ((((((f21 - f20) + 0.33333334f) * f18) + (f20 - (2.0f * f21))) * f18) + f21) * 3.0f * f18;
                    float f23 = this.teal;
                    if (f22 < f23) {
                        f22 = f23;
                    }
                    float f24 = this.white;
                    if (f22 > f24) {
                        return f24;
                    }
                    return f22;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f14 + ", " + f21 + ", " + f15 + ", " + f20 + ") has no solution at " + f5);
            }
            double sqrt = Math.sqrt((d10 * d10) - ((4.0d * d9) * d4));
            double d12 = d9 * 2.0d;
            float f25 = (float) ((sqrt - d10) / d12);
            if (f25 < 0.0f) {
                f13 = 0.0f;
            } else {
                f13 = f25;
            }
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            if (Math.abs(f13 - f25) > 1.05E-6f) {
                f13 = Float.NaN;
            }
            if (!Float.isNaN(f13)) {
                f18 = f13;
            } else {
                float f26 = (float) (((-d10) - sqrt) / d12);
                if (f26 >= 0.0f) {
                    f17 = f26;
                }
                if (f17 > 1.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = f17;
                }
            }
            isNaN = Float.isNaN(f18);
            float f202 = this.silver;
            float f212 = this.purple;
            if (isNaN) {
            }
        } else {
            double d13 = d9 / d11;
            double d14 = d10 / d11;
            double d15 = d4 / d11;
            double d16 = ((d14 * 3.0d) - (d13 * d13)) / 9.0d;
            double d17 = ((d15 * 27.0d) + ((((2.0d * d13) * d13) * d13) - ((9.0d * d13) * d14))) / 54.0d;
            double d18 = d16 * d16 * d16;
            double d19 = (d17 * d17) + d18;
            double d20 = d13 / 3.0d;
            if (d19 < 0.0d) {
                double sqrt2 = Math.sqrt(-d18);
                double d21 = (-d17) / sqrt2;
                if (d21 < -1.0d) {
                    d21 = -1.0d;
                }
                if (d21 > 1.0d) {
                    d21 = 1.0d;
                }
                double acos = Math.acos(d21);
                double delta = AbstractC2797v7.delta((float) sqrt2) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * delta) - d20);
                if (cos < 0.0f) {
                    f12 = 0.0f;
                } else {
                    f12 = cos;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (Math.abs(f12 - cos) > 1.05E-6f) {
                    f12 = Float.NaN;
                }
                if (Float.isNaN(f12)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * delta) - d20);
                    if (cos2 < 0.0f) {
                        f12 = 0.0f;
                    } else {
                        f12 = cos2;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (Math.abs(f12 - cos2) > 1.05E-6f) {
                        f12 = Float.NaN;
                    }
                    if (Float.isNaN(f12)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * delta) - d20);
                        if (cos3 >= 0.0f) {
                            f17 = cos3;
                        }
                        if (f17 > 1.0f) {
                            f10 = 1.0f;
                        } else {
                            f10 = f17;
                        }
                    }
                }
                f18 = f12;
                isNaN = Float.isNaN(f18);
                float f2022 = this.silver;
                float f2122 = this.purple;
                if (isNaN) {
                }
            } else if (d19 == 0.0d) {
                float f27 = -AbstractC2797v7.delta((float) d17);
                float f28 = (float) d20;
                float f29 = (f27 * 2.0f) - f28;
                if (f29 < 0.0f) {
                    f11 = 0.0f;
                } else {
                    f11 = f29;
                }
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (Math.abs(f11 - f29) > 1.05E-6f) {
                    f11 = Float.NaN;
                }
                if (!Float.isNaN(f11)) {
                    f18 = f11;
                } else {
                    float f30 = (-f27) - f28;
                    if (f30 >= 0.0f) {
                        f17 = f30;
                    }
                    if (f17 > 1.0f) {
                        f10 = 1.0f;
                    } else {
                        f10 = f17;
                    }
                }
                isNaN = Float.isNaN(f18);
                float f20222 = this.silver;
                float f21222 = this.purple;
                if (isNaN) {
                }
            } else {
                double sqrt3 = Math.sqrt(d19);
                float delta2 = (float) ((AbstractC2797v7.delta((float) ((-d17) + sqrt3)) - AbstractC2797v7.delta((float) (d17 + sqrt3))) - d20);
                if (delta2 >= 0.0f) {
                    f17 = delta2;
                }
                if (f17 > 1.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = f17;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0795u) {
            C0795u c0795u = (C0795u) obj;
            if (this.alpha == c0795u.alpha && this.purple == c0795u.purple && this.red == c0795u.red && this.silver == c0795u.silver) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.silver) + ao.ad.sierra(this.red, ao.ad.sierra(this.purple, Float.floatToIntBits(this.alpha) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.alpha);
        sb2.append(", b=");
        sb2.append(this.purple);
        sb2.append(", c=");
        sb2.append(this.red);
        sb2.append(", d=");
        return ao.ad.azure(sb2, this.silver, ')');
    }
}
