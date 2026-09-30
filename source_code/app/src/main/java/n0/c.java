package n0;

import kotlin.NoWhenBranchMatchedException;
import p0.AbstractC2264a;
import s6.F6;

/* loaded from: classes3.dex */
public final class c {
    public final boolean alpha;
    public final EnumC2152b bravo;
    public final int charlie;
    public final C2151a[] delta;
    public int echo;
    public final float[] foxtrot;
    public final float[] golf;
    public final float[] hotel;

    public /* synthetic */ c() {
        this(false, EnumC2152b.alpha);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n0.a, java.lang.Object] */
    public final void alpha(float f5, long j5) {
        int i4 = (this.echo + 1) % 20;
        this.echo = i4;
        C2151a[] c2151aArr = this.delta;
        C2151a c2151a = c2151aArr[i4];
        if (c2151a == 0) {
            ?? obj = new Object();
            obj.alpha = j5;
            obj.bravo = f5;
            c2151aArr[i4] = obj;
            return;
        }
        c2151a.alpha = j5;
        c2151a.bravo = f5;
    }

    public final float bravo(float f5) {
        EnumC2152b enumC2152b;
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z2;
        int i4;
        float f11;
        float f12;
        int i5;
        float f13 = f5;
        float f14 = 0.0f;
        if (f13 <= 0.0f) {
            AbstractC2264a.bravo("maximumVelocity should be a positive value. You specified=" + f13);
        }
        int i10 = this.echo;
        C2151a[] c2151aArr = this.delta;
        C2151a c2151a = c2151aArr[i10];
        if (c2151a == null) {
            f10 = 0.0f;
        } else {
            int i11 = 0;
            C2151a c2151a2 = c2151a;
            while (true) {
                C2151a c2151a3 = c2151aArr[i10];
                boolean z10 = this.alpha;
                enumC2152b = this.bravo;
                fArr = this.foxtrot;
                fArr2 = this.golf;
                if (c2151a3 == null) {
                    f10 = f14;
                    z2 = z10;
                    i4 = 1;
                    break;
                }
                long j5 = c2151a.alpha;
                f10 = f14;
                int i12 = i10;
                long j6 = c2151a3.alpha;
                float f15 = (float) (j5 - j6);
                z2 = z10;
                i4 = 1;
                float abs = (float) Math.abs(j6 - c2151a2.alpha);
                if (enumC2152b != EnumC2152b.alpha && !z2) {
                    c2151a2 = c2151a;
                } else {
                    c2151a2 = c2151a3;
                }
                if (f15 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i11] = c2151a3.bravo;
                fArr2[i11] = -f15;
                if (i12 == 0) {
                    i5 = 20;
                } else {
                    i5 = i12;
                }
                i10 = i5 - 1;
                i11++;
                if (i11 >= 20) {
                    break;
                }
                f14 = f10;
            }
            if (i11 >= this.charlie) {
                int ordinal = enumC2152b.ordinal();
                if (ordinal != 0) {
                    if (ordinal == i4) {
                        int i13 = i11 - i4;
                        float f16 = fArr2[i13];
                        int i14 = i13;
                        float f17 = f10;
                        while (i14 > 0) {
                            int i15 = i14 - 1;
                            float f18 = fArr2[i15];
                            if (f16 != f18) {
                                if (z2) {
                                    f12 = -fArr[i15];
                                } else {
                                    f12 = fArr[i14] - fArr[i15];
                                }
                                float f19 = f12 / (f16 - f18);
                                f17 += Math.abs(f19) * (f19 - (Math.signum(f17) * ((float) Math.sqrt(Math.abs(f17) * 2))));
                                if (i14 == i13) {
                                    f17 *= 0.5f;
                                }
                            }
                            i14--;
                            f16 = f18;
                        }
                        f11 = Math.signum(f17) * ((float) Math.sqrt(Math.abs(f17) * 2));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    try {
                        float[] fArr3 = this.hotel;
                        F6.charlie(fArr2, fArr, i11, fArr3);
                        f11 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f11 = f10;
                    }
                }
                f14 = f11 * 1000;
            } else {
                f14 = f10;
            }
        }
        if (f14 == f10 || Float.isNaN(f14)) {
            return f10;
        }
        if (f14 > f10) {
            if (f14 <= f13) {
                f13 = f14;
            }
        } else {
            f13 = -f13;
            if (f14 >= f13) {
                return f14;
            }
        }
        return f13;
    }

    public c(boolean z2, EnumC2152b enumC2152b) {
        int i4;
        this.alpha = z2;
        this.bravo = enumC2152b;
        if (z2 && enumC2152b.equals(EnumC2152b.alpha)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int ordinal = enumC2152b.ordinal();
        if (ordinal == 0) {
            i4 = 3;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i4 = 2;
        }
        this.charlie = i4;
        this.delta = new C2151a[20];
        this.foxtrot = new float[20];
        this.golf = new float[20];
        this.hotel = new float[3];
    }

    public c(int i4) {
        this(true, EnumC2152b.purple);
    }
}
