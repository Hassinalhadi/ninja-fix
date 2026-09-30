package t0;

/* loaded from: classes3.dex */
public abstract class an {
    public static final C2932p alpha = C2932p.f13847c;

    public static final float alpha(float[] fArr, int i4, float[] fArr2, int i5) {
        int i10 = i4 * 4;
        return (fArr[i10 + 3] * fArr2[12 + i5]) + (fArr[i10 + 2] * fArr2[8 + i5]) + (fArr[i10 + 1] * fArr2[4 + i5]) + (fArr[i10] * fArr2[i5]);
    }

    public static final void bravo(float[] fArr, float[] fArr2) {
        float alpha2 = alpha(fArr2, 0, fArr, 0);
        float alpha3 = alpha(fArr2, 0, fArr, 1);
        float alpha4 = alpha(fArr2, 0, fArr, 2);
        float alpha5 = alpha(fArr2, 0, fArr, 3);
        float alpha6 = alpha(fArr2, 1, fArr, 0);
        float alpha7 = alpha(fArr2, 1, fArr, 1);
        float alpha8 = alpha(fArr2, 1, fArr, 2);
        float alpha9 = alpha(fArr2, 1, fArr, 3);
        float alpha10 = alpha(fArr2, 2, fArr, 0);
        float alpha11 = alpha(fArr2, 2, fArr, 1);
        float alpha12 = alpha(fArr2, 2, fArr, 2);
        float alpha13 = alpha(fArr2, 2, fArr, 3);
        float alpha14 = alpha(fArr2, 3, fArr, 0);
        float alpha15 = alpha(fArr2, 3, fArr, 1);
        float alpha16 = alpha(fArr2, 3, fArr, 2);
        float alpha17 = alpha(fArr2, 3, fArr, 3);
        fArr[0] = alpha2;
        fArr[1] = alpha3;
        fArr[2] = alpha4;
        fArr[3] = alpha5;
        fArr[4] = alpha6;
        fArr[5] = alpha7;
        fArr[6] = alpha8;
        fArr[7] = alpha9;
        fArr[8] = alpha10;
        fArr[9] = alpha11;
        fArr[10] = alpha12;
        fArr[11] = alpha13;
        fArr[12] = alpha14;
        fArr[13] = alpha15;
        fArr[14] = alpha16;
        fArr[15] = alpha17;
    }
}
