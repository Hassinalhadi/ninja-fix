package t6;

import androidx.compose.foundation.BorderModifierNodeElement;

/* loaded from: classes2.dex */
public abstract class R3 {
    public static final T.s charlie(T.s sVar, float f5, long j5, a0.as asVar) {
        return sVar.then(new BorderModifierNodeElement(f5, new a0.au(j5), asVar));
    }

    public static final long echo(float f5, long j5) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j5 >> 32)) - f5);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j5 & 4294967295L)) - f5);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public void delta() {
        synchronized (this) {
        }
    }
}
