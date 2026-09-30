package b0;

/* loaded from: classes3.dex */
public abstract class j {
    public static final s alpha = new s(0.31006f, 0.31616f);
    public static final s bravo = new s(0.34567f, 0.3585f);
    public static final s charlie = new s(0.32168f, 0.33767f);
    public static final s delta = new s(0.31271f, 0.32902f);
    public static final float[] echo = {0.964212f, 1.0f, 0.825188f};

    public static AbstractC0713c alpha(AbstractC0713c abstractC0713c) {
        s sVar = bravo;
        C0711a c0711a = C0711a.bravo;
        if (AbstractC0712b.alpha(abstractC0713c.bravo, AbstractC0712b.alpha)) {
            q qVar = (q) abstractC0713c;
            s sVar2 = qVar.delta;
            if (!delta(sVar2, sVar)) {
                float[] golf = golf(charlie(c0711a.alpha, sVar2.alpha(), sVar.alpha()), qVar.india);
                return new q(qVar.alpha, qVar.hotel, sVar, golf, qVar.kilo, qVar.november, qVar.echo, qVar.foxtrot, qVar.golf, -1);
            }
        }
        return abstractC0713c;
    }

    public static float bravo(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f5 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = (((((f11 * f14) + ((f10 * f13) + (f5 * f12))) - (f12 * f13)) - (f10 * f11)) - (f5 * f14)) * 0.5f;
        if (f15 < 0.0f) {
            return -f15;
        }
        return f15;
    }

    public static final float[] charlie(float[] fArr, float[] fArr2, float[] fArr3) {
        hotel(fArr, fArr2);
        hotel(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] foxtrot = foxtrot(fArr);
        float f5 = fArr4[0];
        float f10 = fArr[0] * f5;
        float f11 = fArr4[1];
        float f12 = fArr[1] * f11;
        float f13 = fArr4[2];
        return golf(foxtrot, new float[]{f10, f12, fArr[2] * f13, fArr[3] * f5, fArr[4] * f11, fArr[5] * f13, f5 * fArr[6], f11 * fArr[7], f13 * fArr[8]});
    }

    public static final boolean delta(s sVar, s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        if (Math.abs(sVar.alpha - sVar2.alpha) < 0.001f && Math.abs(sVar.bravo - sVar2.bravo) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final g echo(AbstractC0713c abstractC0713c, AbstractC0713c abstractC0713c2) {
        if (abstractC0713c == abstractC0713c2) {
            return new g(abstractC0713c, abstractC0713c, 1);
        }
        long j5 = AbstractC0712b.alpha;
        if (AbstractC0712b.alpha(abstractC0713c.bravo, j5) && AbstractC0712b.alpha(abstractC0713c2.bravo, j5)) {
            return new f((q) abstractC0713c, (q) abstractC0713c2);
        }
        return new g(abstractC0713c, abstractC0713c2, 0);
    }

    public static final float[] foxtrot(float[] fArr) {
        float f5 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f5 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f5) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f5)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f5)) / f21;
        fArr2[8] = ((f5 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    public static final float[] golf(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f5 = fArr[0] * fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        fArr3[0] = (f12 * f13) + (f10 * f11) + f5;
        float f14 = fArr[1];
        float f15 = fArr2[0];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = f17 * f13;
        fArr3[1] = f18 + (f11 * f16) + (f14 * f15);
        float f19 = fArr[2] * f15;
        float f20 = fArr[5];
        float f21 = (fArr2[1] * f20) + f19;
        float f22 = fArr[8];
        fArr3[2] = (f13 * f22) + f21;
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = (f10 * f25) + f24;
        float f27 = fArr2[5];
        fArr3[3] = (f12 * f27) + f26;
        float f28 = fArr[1];
        float f29 = fArr2[3];
        float f30 = f16 * f25;
        fArr3[4] = (f17 * f27) + f30 + (f28 * f29);
        float f31 = fArr[2];
        float f32 = f27 * f22;
        fArr3[5] = f32 + (f20 * fArr2[4]) + (f29 * f31);
        float f33 = f23 * fArr2[6];
        float f34 = fArr[3];
        float f35 = fArr2[7];
        float f36 = (f34 * f35) + f33;
        float f37 = fArr2[8];
        fArr3[6] = (f12 * f37) + f36;
        float f38 = fArr2[6];
        float f39 = f17 * f37;
        fArr3[7] = f39 + (fArr[4] * f35) + (f28 * f38);
        float f40 = f22 * f37;
        fArr3[8] = f40 + (fArr[5] * fArr2[7]) + (f31 * f38);
        return fArr3;
    }

    public static final float[] hotel(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f5 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f5);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f5);
        fArr2[2] = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f5);
        return fArr2;
    }
}
