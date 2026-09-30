package Nf;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Nf.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0256n extends D {
    public char[] alpha;
    public int bravo;

    @Override // Nf.D
    public final Object alpha() {
        char[] copyOf = Arrays.copyOf(this.alpha, this.bravo);
        Intrinsics.delta(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Nf.D
    public final void bravo(int i4) {
        char[] cArr = this.alpha;
        if (cArr.length < i4) {
            int length = cArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i4);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    @Override // Nf.D
    public final int delta() {
        return this.bravo;
    }
}
