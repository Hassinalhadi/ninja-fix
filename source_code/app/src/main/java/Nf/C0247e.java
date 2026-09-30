package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Nf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0247e extends D {
    public boolean[] alpha;
    public int bravo;

    @Override // Nf.D
    public final Object alpha() {
        boolean[] copyOf = Arrays.copyOf(this.alpha, this.bravo);
        Intrinsics.delta(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Nf.D
    public final void bravo(int i4) {
        boolean[] zArr = this.alpha;
        if (zArr.length < i4) {
            int length = zArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    @Override // Nf.D
    public final int delta() {
        return this.bravo;
    }
}
