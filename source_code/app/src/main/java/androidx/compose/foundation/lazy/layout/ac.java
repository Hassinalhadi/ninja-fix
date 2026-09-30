package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.t0;
import fe.C1715g;
import s6.J4;

/* loaded from: classes3.dex */
public final class ac implements D0 {
    public final int alpha;
    public final int purple;
    public final androidx.compose.runtime.ax red;
    public int silver;

    public ac(int i4, int i5, int i10) {
        this.alpha = i5;
        this.purple = i10;
        int i11 = (i4 / i5) * i5;
        this.red = C0564b.yankee(J4.hotel(Math.max(i11 - i10, 0), i11 + i5 + i10), androidx.compose.runtime.as.white);
        this.silver = i4;
    }

    public final void alpha(int i4) {
        if (i4 != this.silver) {
            this.silver = i4;
            int i5 = this.alpha;
            int i10 = (i4 / i5) * i5;
            int i11 = this.purple;
            ((t0) this.red).setValue(J4.hotel(Math.max(i10 - i11, 0), i10 + i5 + i11));
        }
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        return (C1715g) ((t0) this.red).getValue();
    }
}
