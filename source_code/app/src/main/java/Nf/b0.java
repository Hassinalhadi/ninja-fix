package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 extends D {
    public short[] alpha;
    public int bravo;

    @Override // Nf.D
    public final Object alpha() {
        short[] copyOf = Arrays.copyOf(this.alpha, this.bravo);
        Intrinsics.delta(copyOf, "copyOf(...)");
        return new kotlin.t(copyOf);
    }

    @Override // Nf.D
    public final void bravo(int i4) {
        short[] sArr = this.alpha;
        if (sArr.length < i4) {
            int length = sArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    @Override // Nf.D
    public final int delta() {
        return this.bravo;
    }
}
