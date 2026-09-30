package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class am extends D {
    public long[] alpha;
    public int bravo;

    @Override // Nf.D
    public final Object alpha() {
        long[] copyOf = Arrays.copyOf(this.alpha, this.bravo);
        Intrinsics.delta(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Nf.D
    public final void bravo(int i4) {
        long[] jArr = this.alpha;
        if (jArr.length < i4) {
            int length = jArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    @Override // Nf.D
    public final int delta() {
        return this.bravo;
    }
}
