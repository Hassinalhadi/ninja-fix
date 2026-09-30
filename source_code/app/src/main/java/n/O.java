package n;

import kotlin.jvm.internal.Intrinsics;
import t6.I2;

/* loaded from: classes3.dex */
public abstract class O {
    public static void alpha(I0.aa aaVar, J j5, D0.ak akVar, q0.z zVar, I0.ag agVar, boolean z2, I0.t tVar) {
        long alpha;
        Z.c cVar;
        if (z2) {
            int originalToTransformed = tVar.originalToTransformed(D0.am.echo(aaVar.bravo));
            String str = P.alpha;
            if (originalToTransformed < akVar.alpha.alpha.purple.length()) {
                cVar = akVar.bravo(originalToTransformed);
            } else if (originalToTransformed != 0) {
                cVar = akVar.bravo(originalToTransformed - 1);
            } else {
                alpha = P.alpha(j5.bravo, j5.golf, j5.hotel, P.alpha, 1);
                cVar = new Z.c(0.0f, 0.0f, 1.0f, (int) (new Q0.m(alpha).alpha & 4294967295L));
            }
            float f5 = cVar.alpha;
            long floatToRawIntBits = Float.floatToRawIntBits(f5);
            float f10 = cVar.bravo;
            long gray = zVar.gray((floatToRawIntBits << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (gray >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (gray & 4294967295L));
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f11 = cVar.charlie - f5;
            float f12 = cVar.delta - f10;
            Z.c alpha2 = I2.alpha(floatToRawIntBits2, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
            if (Intrinsics.areEqual((I0.ag) agVar.alpha.bravo.get(), agVar)) {
                agVar.bravo.alpha(alpha2);
            }
        }
    }
}
