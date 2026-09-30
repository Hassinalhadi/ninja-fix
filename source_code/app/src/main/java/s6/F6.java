package s6;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;

/* loaded from: classes2.dex */
public abstract class F6 {
    public static final void alpha(bn.g gVar, m0.r rVar, long j5) {
        boolean alpha = m0.q.alpha(rVar);
        n0.c cVar = (n0.c) gVar.red;
        n0.c cVar2 = (n0.c) gVar.purple;
        if (alpha) {
            ArraysKt.coral(0, r4.length, null, cVar2.delta);
            cVar2.echo = 0;
            ArraysKt.coral(0, r4.length, null, cVar.delta);
            cVar.echo = 0;
            gVar.alpha = 0L;
        }
        boolean charlie = m0.q.charlie(rVar);
        long j6 = rVar.bravo;
        if (!charlie) {
            List list = rVar.kilo;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                m0.b bVar = (m0.b) list.get(i4);
                long j7 = bVar.alpha;
                long golf = Z.b.golf(bVar.charlie, j5);
                cVar2.alpha(Float.intBitsToFloat((int) (golf >> 32)), j7);
                cVar.alpha(Float.intBitsToFloat((int) (golf & 4294967295L)), j7);
            }
            long golf2 = Z.b.golf(rVar.lima, j5);
            cVar2.alpha(Float.intBitsToFloat((int) (golf2 >> 32)), j6);
            cVar.alpha(Float.intBitsToFloat((int) (golf2 & 4294967295L)), j6);
        }
        if (m0.q.charlie(rVar) && j6 - gVar.alpha > 40) {
            ArraysKt.coral(0, r1.length, null, cVar2.delta);
            cVar2.echo = 0;
            ArraysKt.coral(0, r3.length, null, cVar.delta);
            cVar.echo = 0;
            gVar.alpha = 0L;
        }
        gVar.alpha = j6;
    }

    public static final float bravo(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            f5 += fArr[i4] * fArr2[i4];
        }
        return f5;
    }

    public static final void charlie(float[] fArr, float[] fArr2, int i4, float[] fArr3) {
        float bravo;
        if (i4 == 0) {
            AbstractC2264a.alpha("At least one point must be provided");
        }
        int i5 = 2 >= i4 ? i4 - 1 : 2;
        int i10 = i5 + 1;
        float[][] fArr4 = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr4[i11] = new float[i4];
        }
        for (int i12 = 0; i12 < i4; i12++) {
            fArr4[0][i12] = 1.0f;
            for (int i13 = 1; i13 < i10; i13++) {
                fArr4[i13][i12] = fArr4[i13 - 1][i12] * fArr[i12];
            }
        }
        float[][] fArr5 = new float[i10];
        for (int i14 = 0; i14 < i10; i14++) {
            fArr5[i14] = new float[i4];
        }
        float[][] fArr6 = new float[i10];
        for (int i15 = 0; i15 < i10; i15++) {
            fArr6[i15] = new float[i10];
        }
        for (int i16 = 0; i16 < i10; i16++) {
            float[] destination = fArr5[i16];
            float[] fArr7 = fArr4[i16];
            Intrinsics.echo(fArr7, "<this>");
            Intrinsics.echo(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i4);
            for (int i17 = 0; i17 < i16; i17++) {
                float[] fArr8 = fArr5[i17];
                float bravo2 = bravo(destination, fArr8);
                for (int i18 = 0; i18 < i4; i18++) {
                    destination[i18] = destination[i18] - (fArr8[i18] * bravo2);
                }
            }
            float sqrt = (float) Math.sqrt(bravo(destination, destination));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f5 = 1.0f / sqrt;
            for (int i19 = 0; i19 < i4; i19++) {
                destination[i19] = destination[i19] * f5;
            }
            float[] fArr9 = fArr6[i16];
            for (int i20 = 0; i20 < i10; i20++) {
                if (i20 < i16) {
                    bravo = 0.0f;
                } else {
                    bravo = bravo(destination, fArr4[i20]);
                }
                fArr9[i20] = bravo;
            }
        }
        for (int i21 = i5; -1 < i21; i21--) {
            float bravo3 = bravo(fArr5[i21], fArr2);
            float[] fArr10 = fArr6[i21];
            int i22 = i21 + 1;
            if (i22 <= i5) {
                int i23 = i5;
                while (true) {
                    bravo3 -= fArr10[i23] * fArr3[i23];
                    if (i23 != i22) {
                        i23--;
                    }
                }
            }
            fArr3[i21] = bravo3 / fArr10[i21];
        }
    }
}
