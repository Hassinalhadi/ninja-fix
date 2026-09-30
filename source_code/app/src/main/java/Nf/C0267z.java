package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Nf.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0267z extends D {
    public float[] alpha;
    public int bravo;

    @Override // Nf.D
    public final Object alpha() {
        float[] copyOf = Arrays.copyOf(this.alpha, this.bravo);
        Intrinsics.delta(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Nf.D
    public final void bravo(int i4) {
        float[] fArr = this.alpha;
        if (fArr.length < i4) {
            int length = fArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    @Override // Nf.D
    public final int delta() {
        return this.bravo;
    }
}
