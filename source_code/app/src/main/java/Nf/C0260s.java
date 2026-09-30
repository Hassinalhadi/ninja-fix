package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Nf.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0260s extends D {
    public double[] alpha;
    public int bravo;

    @Override // Nf.D
    public final Object alpha() {
        double[] copyOf = Arrays.copyOf(this.alpha, this.bravo);
        Intrinsics.delta(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Nf.D
    public final void bravo(int i4) {
        double[] dArr = this.alpha;
        if (dArr.length < i4) {
            int length = dArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    @Override // Nf.D
    public final int delta() {
        return this.bravo;
    }
}
