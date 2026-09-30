package b0;

import a0.ao;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends AbstractC0713c {
    public static final S7.a romeo = new S7.a(20);
    public final s delta;
    public final float echo;
    public final float foxtrot;
    public final r golf;
    public final float[] hotel;
    public final float[] india;
    public final float[] juliet;
    public final i kilo;
    public final p lima;
    public final m mike;
    public final i november;
    public final p oscar;
    public final m papa;
    public final boolean quebec;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final r rVar, int i4) {
        this(str, fArr, sVar, null, r4, r0, 0.0f, 1.0f, rVar, i4);
        i iVar;
        i iVar2;
        double d4 = rVar.alpha;
        boolean z2 = d4 == -3.0d;
        double d9 = rVar.golf;
        double d10 = rVar.foxtrot;
        if (z2) {
            final int i5 = 4;
            iVar = new i() { // from class: b0.o
                @Override // b0.i
                public final double delta(double d11) {
                    r rVar2 = rVar;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = d.alpha;
                            return d.alpha(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.alpha;
                            return d.charlie(rVar2, d11);
                        case 2:
                            if (d11 >= rVar2.echo) {
                                return Math.pow((rVar2.bravo * d11) + rVar2.charlie, rVar2.alpha);
                            }
                            return d11 * rVar2.delta;
                        case 3:
                            double d12 = rVar2.bravo;
                            if (d11 >= rVar2.echo) {
                                return Math.pow((d12 * d11) + rVar2.charlie, rVar2.alpha) + rVar2.foxtrot;
                            }
                            return rVar2.golf + (rVar2.delta * d11);
                        case 4:
                            float[] fArr4 = d.alpha;
                            return d.bravo(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.alpha;
                            return d.delta(rVar2, d11);
                        case 6:
                            double d13 = rVar2.echo;
                            double d14 = rVar2.delta;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / rVar2.alpha) - rVar2.charlie) / rVar2.bravo;
                            }
                            return d11 / d14;
                        default:
                            double d15 = rVar2.bravo;
                            double d16 = rVar2.echo;
                            double d17 = rVar2.delta;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - rVar2.foxtrot, 1.0d / rVar2.alpha) - rVar2.charlie) / d15;
                            }
                            return (d11 - rVar2.golf) / d17;
                    }
                }
            };
        } else if (d4 == -2.0d) {
            final int i10 = 5;
            iVar = new i() { // from class: b0.o
                @Override // b0.i
                public final double delta(double d11) {
                    r rVar2 = rVar;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = d.alpha;
                            return d.alpha(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.alpha;
                            return d.charlie(rVar2, d11);
                        case 2:
                            if (d11 >= rVar2.echo) {
                                return Math.pow((rVar2.bravo * d11) + rVar2.charlie, rVar2.alpha);
                            }
                            return d11 * rVar2.delta;
                        case 3:
                            double d12 = rVar2.bravo;
                            if (d11 >= rVar2.echo) {
                                return Math.pow((d12 * d11) + rVar2.charlie, rVar2.alpha) + rVar2.foxtrot;
                            }
                            return rVar2.golf + (rVar2.delta * d11);
                        case 4:
                            float[] fArr4 = d.alpha;
                            return d.bravo(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.alpha;
                            return d.delta(rVar2, d11);
                        case 6:
                            double d13 = rVar2.echo;
                            double d14 = rVar2.delta;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / rVar2.alpha) - rVar2.charlie) / rVar2.bravo;
                            }
                            return d11 / d14;
                        default:
                            double d15 = rVar2.bravo;
                            double d16 = rVar2.echo;
                            double d17 = rVar2.delta;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - rVar2.foxtrot, 1.0d / rVar2.alpha) - rVar2.charlie) / d15;
                            }
                            return (d11 - rVar2.golf) / d17;
                    }
                }
            };
        } else if (d10 == 0.0d && d9 == 0.0d) {
            final int i11 = 6;
            iVar = new i() { // from class: b0.o
                @Override // b0.i
                public final double delta(double d11) {
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = d.alpha;
                            return d.alpha(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.alpha;
                            return d.charlie(rVar2, d11);
                        case 2:
                            if (d11 >= rVar2.echo) {
                                return Math.pow((rVar2.bravo * d11) + rVar2.charlie, rVar2.alpha);
                            }
                            return d11 * rVar2.delta;
                        case 3:
                            double d12 = rVar2.bravo;
                            if (d11 >= rVar2.echo) {
                                return Math.pow((d12 * d11) + rVar2.charlie, rVar2.alpha) + rVar2.foxtrot;
                            }
                            return rVar2.golf + (rVar2.delta * d11);
                        case 4:
                            float[] fArr4 = d.alpha;
                            return d.bravo(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.alpha;
                            return d.delta(rVar2, d11);
                        case 6:
                            double d13 = rVar2.echo;
                            double d14 = rVar2.delta;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / rVar2.alpha) - rVar2.charlie) / rVar2.bravo;
                            }
                            return d11 / d14;
                        default:
                            double d15 = rVar2.bravo;
                            double d16 = rVar2.echo;
                            double d17 = rVar2.delta;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - rVar2.foxtrot, 1.0d / rVar2.alpha) - rVar2.charlie) / d15;
                            }
                            return (d11 - rVar2.golf) / d17;
                    }
                }
            };
        } else {
            final int i12 = 7;
            iVar = new i() { // from class: b0.o
                @Override // b0.i
                public final double delta(double d11) {
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.alpha;
                            return d.alpha(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.alpha;
                            return d.charlie(rVar2, d11);
                        case 2:
                            if (d11 >= rVar2.echo) {
                                return Math.pow((rVar2.bravo * d11) + rVar2.charlie, rVar2.alpha);
                            }
                            return d11 * rVar2.delta;
                        case 3:
                            double d12 = rVar2.bravo;
                            if (d11 >= rVar2.echo) {
                                return Math.pow((d12 * d11) + rVar2.charlie, rVar2.alpha) + rVar2.foxtrot;
                            }
                            return rVar2.golf + (rVar2.delta * d11);
                        case 4:
                            float[] fArr4 = d.alpha;
                            return d.bravo(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.alpha;
                            return d.delta(rVar2, d11);
                        case 6:
                            double d13 = rVar2.echo;
                            double d14 = rVar2.delta;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / rVar2.alpha) - rVar2.charlie) / rVar2.bravo;
                            }
                            return d11 / d14;
                        default:
                            double d15 = rVar2.bravo;
                            double d16 = rVar2.echo;
                            double d17 = rVar2.delta;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - rVar2.foxtrot, 1.0d / rVar2.alpha) - rVar2.charlie) / d15;
                            }
                            return (d11 - rVar2.golf) / d17;
                    }
                }
            };
        }
        if (d4 == -3.0d) {
            final int i13 = 0;
            iVar2 = new i() { // from class: b0.o
                @Override // b0.i
                public final double delta(double d11) {
                    r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = d.alpha;
                            return d.alpha(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.alpha;
                            return d.charlie(rVar2, d11);
                        case 2:
                            if (d11 >= rVar2.echo) {
                                return Math.pow((rVar2.bravo * d11) + rVar2.charlie, rVar2.alpha);
                            }
                            return d11 * rVar2.delta;
                        case 3:
                            double d12 = rVar2.bravo;
                            if (d11 >= rVar2.echo) {
                                return Math.pow((d12 * d11) + rVar2.charlie, rVar2.alpha) + rVar2.foxtrot;
                            }
                            return rVar2.golf + (rVar2.delta * d11);
                        case 4:
                            float[] fArr4 = d.alpha;
                            return d.bravo(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.alpha;
                            return d.delta(rVar2, d11);
                        case 6:
                            double d13 = rVar2.echo;
                            double d14 = rVar2.delta;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / rVar2.alpha) - rVar2.charlie) / rVar2.bravo;
                            }
                            return d11 / d14;
                        default:
                            double d15 = rVar2.bravo;
                            double d16 = rVar2.echo;
                            double d17 = rVar2.delta;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - rVar2.foxtrot, 1.0d / rVar2.alpha) - rVar2.charlie) / d15;
                            }
                            return (d11 - rVar2.golf) / d17;
                    }
                }
            };
        } else if (d4 == -2.0d) {
            final int i14 = 1;
            iVar2 = new i() { // from class: b0.o
                @Override // b0.i
                public final double delta(double d11) {
                    r rVar2 = rVar;
                    switch (i14) {
                        case 0:
                            float[] fArr2 = d.alpha;
                            return d.alpha(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.alpha;
                            return d.charlie(rVar2, d11);
                        case 2:
                            if (d11 >= rVar2.echo) {
                                return Math.pow((rVar2.bravo * d11) + rVar2.charlie, rVar2.alpha);
                            }
                            return d11 * rVar2.delta;
                        case 3:
                            double d12 = rVar2.bravo;
                            if (d11 >= rVar2.echo) {
                                return Math.pow((d12 * d11) + rVar2.charlie, rVar2.alpha) + rVar2.foxtrot;
                            }
                            return rVar2.golf + (rVar2.delta * d11);
                        case 4:
                            float[] fArr4 = d.alpha;
                            return d.bravo(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.alpha;
                            return d.delta(rVar2, d11);
                        case 6:
                            double d13 = rVar2.echo;
                            double d14 = rVar2.delta;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / rVar2.alpha) - rVar2.charlie) / rVar2.bravo;
                            }
                            return d11 / d14;
                        default:
                            double d15 = rVar2.bravo;
                            double d16 = rVar2.echo;
                            double d17 = rVar2.delta;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - rVar2.foxtrot, 1.0d / rVar2.alpha) - rVar2.charlie) / d15;
                            }
                            return (d11 - rVar2.golf) / d17;
                    }
                }
            };
        } else if (d10 == 0.0d && d9 == 0.0d) {
            final int i15 = 2;
            iVar2 = new i() { // from class: b0.o
                @Override // b0.i
                public final double delta(double d11) {
                    r rVar2 = rVar;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = d.alpha;
                            return d.alpha(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.alpha;
                            return d.charlie(rVar2, d11);
                        case 2:
                            if (d11 >= rVar2.echo) {
                                return Math.pow((rVar2.bravo * d11) + rVar2.charlie, rVar2.alpha);
                            }
                            return d11 * rVar2.delta;
                        case 3:
                            double d12 = rVar2.bravo;
                            if (d11 >= rVar2.echo) {
                                return Math.pow((d12 * d11) + rVar2.charlie, rVar2.alpha) + rVar2.foxtrot;
                            }
                            return rVar2.golf + (rVar2.delta * d11);
                        case 4:
                            float[] fArr4 = d.alpha;
                            return d.bravo(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.alpha;
                            return d.delta(rVar2, d11);
                        case 6:
                            double d13 = rVar2.echo;
                            double d14 = rVar2.delta;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / rVar2.alpha) - rVar2.charlie) / rVar2.bravo;
                            }
                            return d11 / d14;
                        default:
                            double d15 = rVar2.bravo;
                            double d16 = rVar2.echo;
                            double d17 = rVar2.delta;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - rVar2.foxtrot, 1.0d / rVar2.alpha) - rVar2.charlie) / d15;
                            }
                            return (d11 - rVar2.golf) / d17;
                    }
                }
            };
        } else {
            final int i16 = 3;
            iVar2 = new i() { // from class: b0.o
                @Override // b0.i
                public final double delta(double d11) {
                    r rVar2 = rVar;
                    switch (i16) {
                        case 0:
                            float[] fArr2 = d.alpha;
                            return d.alpha(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.alpha;
                            return d.charlie(rVar2, d11);
                        case 2:
                            if (d11 >= rVar2.echo) {
                                return Math.pow((rVar2.bravo * d11) + rVar2.charlie, rVar2.alpha);
                            }
                            return d11 * rVar2.delta;
                        case 3:
                            double d12 = rVar2.bravo;
                            if (d11 >= rVar2.echo) {
                                return Math.pow((d12 * d11) + rVar2.charlie, rVar2.alpha) + rVar2.foxtrot;
                            }
                            return rVar2.golf + (rVar2.delta * d11);
                        case 4:
                            float[] fArr4 = d.alpha;
                            return d.bravo(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.alpha;
                            return d.delta(rVar2, d11);
                        case 6:
                            double d13 = rVar2.echo;
                            double d14 = rVar2.delta;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / rVar2.alpha) - rVar2.charlie) / rVar2.bravo;
                            }
                            return d11 / d14;
                        default:
                            double d15 = rVar2.bravo;
                            double d16 = rVar2.echo;
                            double d17 = rVar2.delta;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - rVar2.foxtrot, 1.0d / rVar2.alpha) - rVar2.charlie) / d15;
                            }
                            return (d11 - rVar2.golf) / d17;
                    }
                }
            };
        }
    }

    @Override // b0.AbstractC0713c
    public final float alpha(int i4) {
        return this.foxtrot;
    }

    @Override // b0.AbstractC0713c
    public final float bravo(int i4) {
        return this.echo;
    }

    @Override // b0.AbstractC0713c
    public final boolean charlie() {
        return this.quebec;
    }

    @Override // b0.AbstractC0713c
    public final long delta(float f5, float f10, float f11) {
        double d4 = f5;
        m mVar = this.papa;
        float delta = (float) mVar.delta(d4);
        float delta2 = (float) mVar.delta(f10);
        float delta3 = (float) mVar.delta(f11);
        float[] fArr = this.india;
        if (fArr.length < 9) {
            return 0L;
        }
        float f12 = (fArr[6] * delta3) + (fArr[3] * delta2) + (fArr[0] * delta);
        float f13 = (fArr[7] * delta3) + (fArr[4] * delta2) + (fArr[1] * delta);
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // b0.AbstractC0713c
    public final float echo(float f5, float f10, float f11) {
        double d4 = f5;
        m mVar = this.papa;
        float delta = (float) mVar.delta(d4);
        float delta2 = (float) mVar.delta(f10);
        float delta3 = (float) mVar.delta(f11);
        float[] fArr = this.india;
        return (fArr[8] * delta3) + (fArr[5] * delta2) + (fArr[2] * delta);
    }

    @Override // b0.AbstractC0713c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.echo, this.echo) != 0 || Float.compare(qVar.foxtrot, this.foxtrot) != 0 || !Intrinsics.areEqual(this.delta, qVar.delta) || !Arrays.equals(this.hotel, qVar.hotel)) {
            return false;
        }
        r rVar = qVar.golf;
        r rVar2 = this.golf;
        if (rVar2 != null) {
            return Intrinsics.areEqual(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (!Intrinsics.areEqual(this.kilo, qVar.kilo)) {
            return false;
        }
        return Intrinsics.areEqual(this.november, qVar.november);
    }

    @Override // b0.AbstractC0713c
    public final long foxtrot(float f5, float f10, float f11, float f12, AbstractC0713c abstractC0713c) {
        float[] fArr = this.juliet;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f5);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f5);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f5);
        m mVar = this.mike;
        return ao.bravo((float) mVar.delta(f13), (float) mVar.delta(f14), (float) mVar.delta(f15), f12, abstractC0713c);
    }

    @Override // b0.AbstractC0713c
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.hotel) + ((this.delta.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f5 = this.echo;
        int i4 = 0;
        if (f5 == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f5);
        }
        int i5 = (hashCode + floatToIntBits) * 31;
        float f10 = this.foxtrot;
        if (f10 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f10);
        }
        int i10 = (i5 + floatToIntBits2) * 31;
        r rVar = this.golf;
        if (rVar != null) {
            i4 = rVar.hashCode();
        }
        int i11 = i10 + i4;
        if (rVar == null) {
            return this.november.hashCode() + ((this.kilo.hashCode() + (i11 * 31)) * 31);
        }
        return i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01de, code lost:
    
        if ((((r24 - r11) * r3) - ((r1 - r14) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f5, float f10, r rVar, int i4) {
        super(i4, AbstractC0712b.alpha, str);
        ?? r28;
        ?? r29;
        float f11;
        float f12;
        boolean z2;
        int i5 = 0;
        int i10 = 1;
        this.delta = sVar;
        this.echo = f5;
        this.foxtrot = f10;
        this.golf = rVar;
        this.kilo = iVar;
        this.lima = new p(this, i10);
        this.mike = new m(this, i5);
        this.november = iVar2;
        this.oscar = new p(this, i5);
        this.papa = new m(this, i10);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f5 < f10) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f13 = fArr[0];
                float f14 = fArr[1];
                float f15 = f13 + f14 + fArr[2];
                fArr3[0] = f13 / f15;
                fArr3[1] = f14 / f15;
                float f16 = fArr[3];
                float f17 = fArr[4];
                float f18 = f16 + f17 + fArr[5];
                fArr3[2] = f16 / f18;
                fArr3[3] = f17 / f18;
                float f19 = fArr[6];
                float f20 = fArr[7];
                float f21 = f19 + f20 + fArr[8];
                fArr3[4] = f19 / f21;
                fArr3[5] = f20 / f21;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.hotel = fArr3;
            if (fArr2 == null) {
                float f22 = fArr3[0];
                float f23 = fArr3[1];
                float f24 = fArr3[2];
                float f25 = fArr3[3];
                float f26 = fArr3[4];
                float f27 = fArr3[5];
                f11 = 1.0f;
                float f28 = 1;
                float f29 = (f28 - f22) / f23;
                float f30 = (f28 - f24) / f25;
                float f31 = (f28 - f26) / f27;
                r28 = 0;
                float f32 = sVar.alpha;
                r29 = 1;
                float f33 = sVar.bravo;
                float f34 = (f28 - f32) / f33;
                float f35 = f22 / f23;
                float f36 = (f24 / f25) - f35;
                float f37 = (f32 / f33) - f35;
                float f38 = f30 - f29;
                float f39 = (f26 / f27) - f35;
                float f40 = (((f34 - f29) * f36) - (f37 * f38)) / (((f31 - f29) * f36) - (f38 * f39));
                float f41 = (f37 - (f39 * f40)) / f36;
                float f42 = (1.0f - f41) - f40;
                float f43 = f42 / f23;
                float f44 = f41 / f25;
                float f45 = f40 / f27;
                this.india = new float[]{f43 * f22, f42, ((1.0f - f22) - f23) * f43, f44 * f24, f41, ((1.0f - f24) - f25) * f44, f45 * f26, f40, ((1.0f - f26) - f27) * f45};
            } else {
                r28 = 0;
                r29 = 1;
                f11 = 1.0f;
                if (fArr2.length == 9) {
                    this.india = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.juliet = j.foxtrot(this.india);
            float bravo = j.bravo(fArr3);
            float[] fArr4 = d.alpha;
            if (bravo / j.bravo(d.bravo) > 0.9f) {
                float[] fArr5 = d.alpha;
                float f46 = fArr3[r28];
                float f47 = fArr5[r28];
                float f48 = fArr3[r29];
                float f49 = fArr5[r29];
                float f50 = fArr3[2];
                float f51 = fArr5[2];
                float f52 = fArr3[3];
                float f53 = fArr5[3];
                float f54 = fArr3[4];
                float f55 = fArr5[4];
                float f56 = fArr3[5];
                float f57 = fArr5[5];
                f12 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[r28] = f46 - f47;
                fArr6[r29] = f48 - f49;
                fArr6[2] = f50 - f51;
                fArr6[3] = f52 - f53;
                fArr6[4] = f54 - f55;
                fArr6[5] = f56 - f57;
                float f58 = fArr6[r28];
                float f59 = fArr6[r29];
                if (((f49 - f57) * f58) - ((f47 - f55) * f59) >= 0.0f && ((f47 - f51) * f59) - ((f49 - f53) * f58) >= 0.0f) {
                    float f60 = fArr6[2];
                    float f61 = fArr6[3];
                    if (((f53 - f49) * f60) - ((f51 - f47) * f61) >= 0.0f && ((f51 - f55) * f61) - ((f53 - f57) * f60) >= 0.0f) {
                        float f62 = fArr6[4];
                        float f63 = fArr6[5];
                        if (((f57 - f53) * f62) - ((f55 - f51) * f63) >= 0.0f) {
                        }
                    }
                }
            } else {
                f12 = 0.0f;
            }
            int i11 = (f5 > f12 ? 1 : (f5 == f12 ? 0 : -1));
            if (i4 != 0) {
                float[] fArr7 = d.alpha;
                if (fArr3 != fArr7) {
                    for (int i12 = r28; i12 < 6; i12++) {
                        if (Float.compare(fArr3[i12], fArr7[i12]) != 0 && Math.abs(fArr3[i12] - fArr7[i12]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (j.delta(sVar, j.delta) && f5 == f12 && f10 == f11) {
                    float[] fArr8 = d.alpha;
                    q qVar = d.echo;
                    for (double d4 = 0.0d; d4 <= 1.0d; d4 += 0.00392156862745098d) {
                        if (Math.abs(iVar.delta(d4) - qVar.kilo.delta(d4)) <= 0.001d && Math.abs(iVar2.delta(d4) - qVar.november.delta(d4)) <= 0.001d) {
                        }
                    }
                }
                z2 = r28;
                this.quebec = z2;
                return;
            }
            z2 = r29;
            this.quebec = z2;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f5 + ", max=" + f10 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final double d4, float f5, float f10, int i4) {
        this(str, fArr, sVar, null, r11, r3, f5, f10, new r(d4, 1.0d, 0.0d, 0.0d, 0.0d), i4);
        i iVar;
        i iVar2 = romeo;
        if (d4 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i5 = 0;
            iVar = new i() { // from class: b0.n
                @Override // b0.i
                public final double delta(double d9) {
                    switch (i5) {
                        case 0:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, 1.0d / d4);
                        default:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, d4);
                    }
                }
            };
        }
        if (d4 != 1.0d) {
            final int i10 = 1;
            iVar2 = new i() { // from class: b0.n
                @Override // b0.i
                public final double delta(double d9) {
                    switch (i10) {
                        case 0:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, 1.0d / d4);
                        default:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, d4);
                    }
                }
            };
        }
    }
}
