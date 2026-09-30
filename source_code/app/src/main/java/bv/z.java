package bv;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z extends l {
    public z(int i4) {
        int[] iArr;
        if (i4 == 0) {
            iArr = p.alpha;
        } else {
            iArr = new int[i4];
        }
        this.alpha = iArr;
    }

    public final void charlie(int i4) {
        delta(this.bravo + 1);
        int[] iArr = this.alpha;
        int i5 = this.bravo;
        iArr[i5] = i4;
        this.bravo = i5 + 1;
    }

    public final void delta(int i4) {
        int[] iArr = this.alpha;
        if (iArr.length < i4) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i4, (iArr.length * 3) / 2));
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.alpha = copyOf;
        }
    }

    public final void echo(int i4) {
        int i5;
        if (i4 >= 0 && i4 < (i5 = this.bravo)) {
            int[] iArr = this.alpha;
            int i10 = iArr[i4];
            if (i4 != i5 - 1) {
                ArraysKt.zulu(i4, i4 + 1, iArr, iArr, i5);
            }
            this.bravo--;
            return;
        }
        bw.a.delta("Index must be between 0 and size");
        throw null;
    }

    public final void foxtrot(int i4, int i5) {
        if (i4 >= 0 && i4 < this.bravo) {
            int[] iArr = this.alpha;
            int i10 = iArr[i4];
            iArr[i4] = i5;
            return;
        }
        bw.a.delta("Index must be between 0 and size");
        throw null;
    }

    public /* synthetic */ z() {
        this(16);
    }
}
