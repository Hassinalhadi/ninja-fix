package bz;

import java.util.Arrays;

/* renamed from: bz.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0794t {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;
    public final float golf;
    public float hotel;
    public float india;
    public final float[] juliet;
    public final float kilo;
    public final float lima;
    public final float mike;
    public final float november;
    public final float oscar;
    public final boolean papa;
    public final float quebec;
    public final float romeo;

    public C0794t(int i4, float f5, float f10, float f11, float f12, float f13, float f14) {
        boolean z2;
        float f15;
        boolean z10;
        boolean z11;
        float f16;
        float f17;
        int i5;
        float f18;
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
        this.echo = f13;
        this.foxtrot = f14;
        float f19 = f13 - f11;
        float f20 = f14 - f12;
        float f21 = 0.0f;
        int i10 = 1;
        if (i4 != 1 && (i4 == 4 ? f20 <= 0.0f : i4 != 5 || f20 >= 0.0f)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            f15 = -1.0f;
        } else {
            f15 = 1.0f;
        }
        this.mike = f15;
        float f22 = 1 / (f10 - f5);
        this.kilo = f22;
        this.juliet = new float[101];
        if (i4 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Math.abs(f19) >= 0.001f && Math.abs(f20) >= 0.001f) {
            this.november = f19 * f15;
            this.oscar = f20 * (-f15);
            if (z2) {
                f16 = f13;
            } else {
                f16 = f11;
            }
            this.quebec = f16;
            if (z2) {
                f17 = f12;
            } else {
                f17 = f14;
            }
            this.romeo = f17;
            float f23 = f13 - f11;
            float f24 = f12 - f14;
            float[] fArr = AbstractC0779d.india;
            float f25 = 90;
            float f26 = f24;
            float f27 = 0.0f;
            float f28 = 0.0f;
            int i11 = 1;
            while (true) {
                i5 = i10;
                float f29 = f26;
                double radians = (float) Math.toRadians((i11 * 90.0d) / 90);
                float sin = ((float) Math.sin(radians)) * f23;
                float cos = ((float) Math.cos(radians)) * f24;
                f18 = f21;
                f27 += (float) Math.hypot(sin - f28, cos - f29);
                fArr[i11] = f27;
                if (i11 == 90) {
                    break;
                }
                i11++;
                f28 = sin;
                f21 = f18;
                f26 = cos;
                i10 = i5;
            }
            this.golf = f27;
            int i12 = i5;
            while (true) {
                fArr[i12] = fArr[i12] / f27;
                if (i12 == 90) {
                    break;
                } else {
                    i12++;
                }
            }
            float[] fArr2 = this.juliet;
            int length = fArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                float f30 = i13 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr, 0, 91, f30);
                if (binarySearch >= 0) {
                    fArr2[i13] = binarySearch / f25;
                } else if (binarySearch == -1) {
                    fArr2[i13] = f18;
                } else {
                    int i14 = -binarySearch;
                    int i15 = i14 - 2;
                    float f31 = i15;
                    float f32 = fArr[i15];
                    fArr2[i13] = (((f30 - f32) / (fArr[i14 - 1] - f32)) + f31) / f25;
                }
            }
            this.lima = this.golf * this.kilo;
            z11 = z10;
        } else {
            float hypot = (float) Math.hypot(f20, f19);
            this.golf = hypot;
            this.lima = hypot * f22;
            this.quebec = f19 * f22;
            this.romeo = f20 * f22;
            this.november = Float.NaN;
            this.oscar = Float.NaN;
            z11 = true;
        }
        this.papa = z11;
    }

    public final float alpha() {
        float f5 = this.november * this.india;
        return f5 * this.mike * (this.lima / ((float) Math.hypot(f5, (-this.oscar) * this.hotel)));
    }

    public final float bravo() {
        float f5 = this.november * this.india;
        float f10 = (-this.oscar) * this.hotel;
        return f10 * this.mike * (this.lima / ((float) Math.hypot(f5, f10)));
    }

    public final void charlie(float f5) {
        float f10;
        if (this.mike == -1.0f) {
            f10 = this.bravo - f5;
        } else {
            f10 = f5 - this.alpha;
        }
        float f11 = f10 * this.kilo;
        float f12 = 0.0f;
        if (f11 > 0.0f) {
            f12 = 1.0f;
            if (f11 < 1.0f) {
                float f13 = f11 * 100;
                int i4 = (int) f13;
                float[] fArr = this.juliet;
                float f14 = fArr[i4];
                f12 = Q0.c.lima(fArr[i4 + 1], f14, f13 - i4, f14);
            }
        }
        double d4 = f12 * 1.5707964f;
        this.hotel = (float) Math.sin(d4);
        this.india = (float) Math.cos(d4);
    }
}
