package bz;

/* loaded from: classes3.dex */
public final class ac implements ab {
    public final float alpha;
    public final H bravo;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, bz.H] */
    public ac(float f5, float f10, float f11) {
        this.alpha = f11;
        ?? obj = new Object();
        obj.alpha = 1.0f;
        obj.bravo = Math.sqrt(50.0d);
        obj.charlie = 1.0f;
        if (f5 < 0.0f) {
            as.alpha("Damping ratio must be non-negative");
        }
        obj.charlie = f5;
        double d4 = obj.bravo;
        if (((float) (d4 * d4)) <= 0.0f) {
            as.alpha("Spring stiffness constant must be positive.");
        }
        obj.bravo = Math.sqrt(f10);
        this.bravo = obj;
    }

    @Override // bz.InterfaceC0787l
    public final i0 alpha(g0 g0Var) {
        return new J2.n(this);
    }

    @Override // bz.ab
    public final long bravo(float f5, float f10, float f11) {
        double sqrt;
        double d4;
        double d9;
        int i4;
        long j5;
        double d10;
        H h4 = this.bravo;
        double d11 = h4.bravo;
        float f12 = (float) (d11 * d11);
        float f13 = h4.charlie;
        float f14 = this.alpha;
        float f15 = (f5 - f10) / f14;
        float f16 = f11 / f14;
        if (f13 == 0.0f) {
            j5 = 9223372036854L;
        } else {
            double d12 = f12;
            double d13 = f13;
            double d14 = f16;
            double d15 = f15;
            double d16 = 1.0f;
            double sqrt2 = d13 * 2.0d * Math.sqrt(d12);
            double d17 = (sqrt2 * sqrt2) - (d12 * 4.0d);
            if (d17 < 0.0d) {
                sqrt = 0.0d;
            } else {
                sqrt = Math.sqrt(d17);
            }
            if (d17 < 0.0d) {
                d4 = Math.sqrt(Math.abs(d17));
            } else {
                d4 = 0.0d;
            }
            double d18 = -sqrt2;
            double d19 = (d18 + sqrt) * 0.5d;
            double d20 = d4 * 0.5d;
            double d21 = (d18 - sqrt) * 0.5d;
            if (d15 == 0.0d && d14 == 0.0d) {
                j5 = 0;
            } else {
                if (d15 < 0.0d) {
                    d14 = -d14;
                }
                double abs = Math.abs(d15);
                double d22 = Double.MAX_VALUE;
                if (d13 > 1.0d) {
                    double d23 = (d19 * abs) - d14;
                    double d24 = d19 - d21;
                    double d25 = d23 / d24;
                    double d26 = abs - d25;
                    d9 = Math.log(Math.abs(d16 / d26)) / d19;
                    double log = Math.log(Math.abs(d16 / d25)) / d21;
                    if ((Double.doubleToRawLongBits(d9) & Long.MAX_VALUE) < 9218868437227405312L) {
                        if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                            d9 = Math.max(d9, log);
                        }
                    } else {
                        d9 = log;
                    }
                    double d27 = d26 * d19;
                    double log2 = Math.log(d27 / ((-d25) * d21)) / (d21 - d19);
                    if (!Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d21) * d25) + (Math.exp(d19 * log2) * d26))) < d16) {
                                if (d25 > 0.0d && d26 < 0.0d) {
                                    d10 = 0.0d;
                                } else {
                                    d10 = d9;
                                }
                                d16 = -d16;
                                d9 = d10;
                            }
                        }
                        d9 = Math.log((-((d25 * d21) * d21)) / (d27 * d19)) / d24;
                    } else {
                        d16 = -d16;
                    }
                    double d28 = d25 * d21;
                    if (Math.abs((Math.exp(d21 * d9) * d28) + (Math.exp(d19 * d9) * d27)) >= 1.0E-4d) {
                        int i5 = 0;
                        while (d22 > 0.001d && i5 < 100) {
                            i5++;
                            double d29 = d19 * d9;
                            double d30 = d21 * d9;
                            double exp = d9 - ((((Math.exp(d30) * d25) + (Math.exp(d29) * d26)) + d16) / ((Math.exp(d30) * d28) + (Math.exp(d29) * d27)));
                            d22 = Math.abs(d9 - exp);
                            d9 = exp;
                        }
                    }
                } else if (d13 < 1.0d) {
                    double d31 = (d14 - (d19 * abs)) / d20;
                    d9 = Math.log(d16 / Math.sqrt((d31 * d31) + (abs * abs))) / d19;
                } else {
                    double d32 = d19 * abs;
                    double d33 = d14 - d32;
                    double log3 = Math.log(Math.abs(d16 / abs)) / d19;
                    double log4 = Math.log(Math.abs(d16 / d33));
                    double d34 = log4;
                    for (int i10 = 0; i10 < 6; i10++) {
                        d34 = log4 - Math.log(Math.abs(d34 / d19));
                    }
                    double d35 = d34 / d19;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) < 9218868437227405312L) {
                        if ((Double.doubleToRawLongBits(d35) & Long.MAX_VALUE) < 9218868437227405312L) {
                            log3 = Math.max(log3, d35);
                        }
                    } else {
                        log3 = d35;
                    }
                    double d36 = (-(d32 + d33)) / (d19 * d33);
                    double d37 = d19 * d36;
                    double exp2 = (Math.exp(d37) * d33 * d36) + (Math.exp(d37) * abs);
                    if (!Double.isNaN(d36) && d36 > 0.0d) {
                        if (d36 > 0.0d && (-exp2) < d16) {
                            if (d33 < 0.0d && abs > 0.0d) {
                                log3 = 0.0d;
                            }
                        } else {
                            log3 = (-(2.0d / d19)) - (abs / d33);
                            d9 = log3;
                            i4 = 0;
                            while (d22 > 0.001d && i4 < 100) {
                                i4++;
                                double d38 = d19 * d9;
                                double exp3 = d9 - (((Math.exp(d38) * ((d33 * d9) + abs)) + d16) / (Math.exp(d38) * (((1 + d38) * d33) + d32)));
                                d22 = Math.abs(d9 - exp3);
                                d9 = exp3;
                            }
                        }
                    }
                    d16 = -d16;
                    d9 = log3;
                    i4 = 0;
                    while (d22 > 0.001d) {
                        i4++;
                        double d382 = d19 * d9;
                        double exp32 = d9 - (((Math.exp(d382) * ((d33 * d9) + abs)) + d16) / (Math.exp(d382) * (((1 + d382) * d33) + d32)));
                        d22 = Math.abs(d9 - exp32);
                        d9 = exp32;
                    }
                }
                j5 = (long) (d9 * 1000.0d);
            }
        }
        return j5 * 1000000;
    }

    @Override // bz.ab
    public final float charlie(float f5, float f10, float f11, long j5) {
        H h4 = this.bravo;
        h4.alpha = f10;
        return Float.intBitsToFloat((int) (h4.alpha(f5, f11, j5 / 1000000) & 4294967295L));
    }

    @Override // bz.ab
    public final float delta(float f5, float f10, float f11) {
        return 0.0f;
    }

    @Override // bz.ab
    public final float echo(float f5, float f10, float f11, long j5) {
        H h4 = this.bravo;
        h4.alpha = f10;
        return Float.intBitsToFloat((int) (h4.alpha(f5, f11, j5 / 1000000) >> 32));
    }
}
