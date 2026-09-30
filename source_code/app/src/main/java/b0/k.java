package b0;

import a0.ao;

/* loaded from: classes3.dex */
public final class k extends AbstractC0713c {
    public final /* synthetic */ int delta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, long j5, int i4, int i5) {
        super(i4, j5, str);
        this.delta = i5;
    }

    @Override // b0.AbstractC0713c
    public final float alpha(int i4) {
        switch (this.delta) {
            case 0:
                return i4 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // b0.AbstractC0713c
    public final float bravo(int i4) {
        switch (this.delta) {
            case 0:
                return i4 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // b0.AbstractC0713c
    public final long delta(float f5, float f10, float f11) {
        float f12;
        float f13;
        switch (this.delta) {
            case 0:
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                if (f5 > 100.0f) {
                    f5 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f14 = (f5 + 16.0f) / 116.0f;
                float f15 = (f10 * 0.002f) + f14;
                if (f15 > 0.20689656f) {
                    f12 = f15 * f15 * f15;
                } else {
                    f12 = (f15 - 0.13793103f) * 0.12841855f;
                }
                if (f14 > 0.20689656f) {
                    f13 = f14 * f14 * f14;
                } else {
                    f13 = (f14 - 0.13793103f) * 0.12841855f;
                }
                float[] fArr = j.echo;
                float f16 = f12 * fArr[0];
                float f17 = f13 * fArr[1];
                return (Float.floatToRawIntBits(f17) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
            default:
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                float f18 = 2.0f;
                if (f5 > 2.0f) {
                    f5 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 <= 2.0f) {
                    f18 = f10;
                }
                return (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L);
        }
    }

    @Override // b0.AbstractC0713c
    public final float echo(float f5, float f10, float f11) {
        float f12;
        switch (this.delta) {
            case 0:
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                if (f5 > 100.0f) {
                    f5 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f13 = ((f5 + 16.0f) / 116.0f) - (f11 * 0.005f);
                if (f13 > 0.20689656f) {
                    f12 = f13 * f13 * f13;
                } else {
                    f12 = 0.12841855f * (f13 - 0.13793103f);
                }
                return f12 * j.echo[2];
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    return 2.0f;
                }
                return f11;
        }
    }

    @Override // b0.AbstractC0713c
    public final long foxtrot(float f5, float f10, float f11, float f12, AbstractC0713c abstractC0713c) {
        float f13;
        float f14;
        float f15;
        switch (this.delta) {
            case 0:
                float[] fArr = j.echo;
                float f16 = f5 / fArr[0];
                float f17 = f10 / fArr[1];
                float f18 = f11 / fArr[2];
                if (f16 > 0.008856452f) {
                    f13 = (float) Math.cbrt(f16);
                } else {
                    f13 = (f16 * 7.787037f) + 0.13793103f;
                }
                if (f17 > 0.008856452f) {
                    f14 = (float) Math.cbrt(f17);
                } else {
                    f14 = (f17 * 7.787037f) + 0.13793103f;
                }
                if (f18 > 0.008856452f) {
                    f15 = (float) Math.cbrt(f18);
                } else {
                    f15 = (f18 * 7.787037f) + 0.13793103f;
                }
                float f19 = (116.0f * f14) - 16.0f;
                float f20 = (f13 - f14) * 500.0f;
                float f21 = (f14 - f15) * 200.0f;
                if (f19 < 0.0f) {
                    f19 = 0.0f;
                }
                if (f19 > 100.0f) {
                    f19 = 100.0f;
                }
                if (f20 < -128.0f) {
                    f20 = -128.0f;
                }
                float f22 = 128.0f;
                if (f20 > 128.0f) {
                    f20 = 128.0f;
                }
                if (f21 < -128.0f) {
                    f21 = -128.0f;
                }
                if (f21 <= 128.0f) {
                    f22 = f21;
                }
                return ao.bravo(f19, f20, f22, f12, abstractC0713c);
            default:
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                float f23 = 2.0f;
                if (f5 > 2.0f) {
                    f5 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 <= 2.0f) {
                    f23 = f11;
                }
                return ao.bravo(f5, f10, f23, f12, abstractC0713c);
        }
    }
}
