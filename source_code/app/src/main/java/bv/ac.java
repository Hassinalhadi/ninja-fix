package bv;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ac extends r {
    public ac(int i4) {
        long[] jArr;
        if (i4 == 0) {
            jArr = t.alpha;
        } else {
            jArr = new long[i4];
        }
        this.alpha = jArr;
    }

    public final void alpha(long j5) {
        int i4 = this.bravo + 1;
        long[] jArr = this.alpha;
        if (jArr.length < i4) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i4, (jArr.length * 3) / 2));
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
        long[] jArr2 = this.alpha;
        int i5 = this.bravo;
        jArr2[i5] = j5;
        this.bravo = i5 + 1;
    }
}
