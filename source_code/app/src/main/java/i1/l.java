package i1;

/* loaded from: classes3.dex */
public final class l {
    public static final l kilo;
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;
    public final float[] golf;
    public final float hotel;
    public final float india;
    public final float juliet;

    static {
        float f5;
        float[] fArr = AbstractC1881b.charlie;
        float oscar = (float) ((AbstractC1881b.oscar() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC1881b.alpha;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f5 = 0.69f;
        } else {
            f5 = 0.655f;
        }
        float f18 = f5;
        float exp = (1.0f - (((float) Math.exp(((-oscar) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = exp;
        if (d4 > 1.0d) {
            exp = 1.0f;
        } else if (d4 < 0.0d) {
            exp = 0.0f;
        }
        float f19 = 1.0f / ((5.0f * oscar) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(oscar * 5.0d))) + (f20 * oscar);
        float oscar2 = AbstractC1881b.oscar() / fArr[1];
        double d9 = oscar2;
        float sqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr6[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr6[2];
        float[] fArr7 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        kilo = new l(oscar2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f18, 1.0f, new float[]{(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f5, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.foxtrot = f5;
        this.alpha = f10;
        this.bravo = f11;
        this.charlie = f12;
        this.delta = f13;
        this.echo = f14;
        this.golf = fArr;
        this.hotel = f15;
        this.india = f16;
        this.juliet = f17;
    }
}
