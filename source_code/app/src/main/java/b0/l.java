package b0;

import a0.ao;
import s6.AbstractC2797v7;

/* loaded from: classes3.dex */
public final class l extends AbstractC0713c {
    public static final float[] delta;
    public static final float[] echo;
    public static final float[] foxtrot;
    public static final float[] golf;

    static {
        float[] golf2 = j.golf(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.charlie(C0711a.bravo.alpha, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        delta = golf2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        echo = fArr;
        foxtrot = j.foxtrot(golf2);
        golf = j.foxtrot(fArr);
    }

    @Override // b0.AbstractC0713c
    public final float alpha(int i4) {
        if (i4 == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // b0.AbstractC0713c
    public final float bravo(int i4) {
        if (i4 == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // b0.AbstractC0713c
    public final long delta(float f5, float f10, float f11) {
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        float f12 = 0.5f;
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 <= 0.5f) {
            f12 = f11;
        }
        float[] fArr = golf;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f5);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f5);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f5);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = foxtrot;
        float f19 = (fArr2[6] * f18) + (fArr2[3] * f17) + (fArr2[0] * f16);
        float f20 = (fArr2[7] * f18) + (fArr2[4] * f17) + (fArr2[1] * f16);
        return (Float.floatToRawIntBits(f20) & 4294967295L) | (Float.floatToRawIntBits(f19) << 32);
    }

    @Override // b0.AbstractC0713c
    public final float echo(float f5, float f10, float f11) {
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        float f12 = 0.5f;
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 <= 0.5f) {
            f12 = f11;
        }
        float[] fArr = golf;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f5);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f5);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f5);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = foxtrot;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    @Override // b0.AbstractC0713c
    public final long foxtrot(float f5, float f10, float f11, float f12, AbstractC0713c abstractC0713c) {
        float[] fArr = delta;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f5);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f5);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f5);
        float delta2 = AbstractC2797v7.delta(f13);
        float delta3 = AbstractC2797v7.delta(f14);
        float delta4 = AbstractC2797v7.delta(f15);
        float[] fArr2 = echo;
        return ao.bravo((fArr2[6] * delta4) + (fArr2[3] * delta3) + (fArr2[0] * delta2), (fArr2[7] * delta4) + (fArr2[4] * delta3) + (fArr2[1] * delta2), (fArr2[8] * delta4) + (fArr2[5] * delta3) + (fArr2[2] * delta2), f12, abstractC0713c);
    }
}
