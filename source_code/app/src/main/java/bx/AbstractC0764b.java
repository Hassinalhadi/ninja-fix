package bx;

import s6.J4;

/* renamed from: bx.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0764b {
    public static final float[] alpha;

    static {
        float f5;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr = new float[101];
        alpha = fArr;
        float[] fArr2 = new float[101];
        float f18 = 0.0f;
        int i4 = 0;
        float f19 = 0.0f;
        while (true) {
            float f20 = 1.0f;
            if (i4 < 100) {
                float f21 = i4 / 100;
                float f22 = 1.0f;
                while (true) {
                    f5 = ((f22 - f18) / 2.0f) + f18;
                    f10 = f20 - f5;
                    f11 = f5 * 3.0f * f10;
                    f12 = f5 * f5 * f5;
                    float f23 = (((f5 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
                    f13 = f20;
                    if (Math.abs(f23 - f21) < 1.0E-5d) {
                        break;
                    }
                    if (f23 > f21) {
                        f22 = f5;
                    } else {
                        f18 = f5;
                    }
                    f20 = f13;
                }
                float f24 = 0.5f;
                fArr[i4] = (((f10 * 0.5f) + f5) * f11) + f12;
                float f25 = f13;
                while (true) {
                    f14 = ((f25 - f19) / 2.0f) + f19;
                    f15 = f13 - f14;
                    f16 = f14 * 3.0f * f15;
                    f17 = f14 * f14 * f14;
                    float f26 = (((f15 * f24) + f14) * f16) + f17;
                    float f27 = f25;
                    if (Math.abs(f26 - f21) >= 1.0E-5d) {
                        if (f26 > f21) {
                            f25 = f14;
                        } else {
                            f19 = f14;
                            f25 = f27;
                        }
                        f24 = 0.5f;
                    }
                }
                fArr2[i4] = (((f14 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
                i4++;
            } else {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public static C0763a alpha(float f5) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        float charlie = J4.charlie(f5, 0.0f, 1.0f);
        float f12 = 100;
        int i4 = (int) (f12 * charlie);
        if (i4 < 100) {
            float f13 = i4 / f12;
            int i5 = i4 + 1;
            float f14 = i5 / f12;
            float[] fArr = alpha;
            float f15 = fArr[i4];
            float f16 = (fArr[i5] - f15) / (f14 - f13);
            float lima = Q0.c.lima(charlie, f13, f16, f15);
            f10 = f16;
            f11 = lima;
        }
        return new C0763a(f11, f10);
    }
}
