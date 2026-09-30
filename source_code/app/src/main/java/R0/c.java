package R0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import r6.u;

/* loaded from: classes3.dex */
public final class c implements a {
    public final float[] alpha;
    public final float[] bravo;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.alpha = fArr;
            this.bravo = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero");
    }

    @Override // R0.a
    public final float alpha(float f5) {
        return u.alpha(f5, this.bravo, this.alpha);
    }

    @Override // R0.a
    public final float bravo(float f5) {
        return u.alpha(f5, this.alpha, this.bravo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Arrays.equals(this.alpha, cVar.alpha) && Arrays.equals(this.bravo, cVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.bravo) + (Arrays.hashCode(this.alpha) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.alpha);
        Intrinsics.delta(arrays, "toString(...)");
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.bravo);
        Intrinsics.delta(arrays2, "toString(...)");
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
