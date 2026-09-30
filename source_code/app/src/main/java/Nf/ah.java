package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ah extends D {
    public int[] alpha;
    public int bravo;

    @Override // Nf.D
    public final Object alpha() {
        int[] copyOf = Arrays.copyOf(this.alpha, this.bravo);
        Intrinsics.delta(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Nf.D
    public final void bravo(int i4) {
        int[] iArr = this.alpha;
        if (iArr.length < i4) {
            int length = iArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    @Override // Nf.D
    public final int delta() {
        return this.bravo;
    }
}
