package F;

import a0.C0366t;
import androidx.compose.runtime.C0585q;
import f.InterfaceC1673j;
import kotlin.jvm.internal.Intrinsics;
import s0.InterfaceC2554n;

/* loaded from: classes3.dex */
public final class M1 implements b.H {
    public final boolean alpha;
    public final float bravo;
    public final long charlie;

    public M1(float f5, long j5, boolean z2) {
        this.alpha = z2;
        this.bravo = f5;
        this.charlie = j5;
    }

    @Override // b.H
    public final InterfaceC2554n alpha(InterfaceC1673j interfaceC1673j) {
        Z z2 = new Z(1, this);
        return new C0089b0(interfaceC1673j, this.alpha, this.bravo, z2, 0);
    }

    @Override // b.D
    public final b.E bravo(InterfaceC1673j interfaceC1673j, C0585q c0585q) {
        c0585q.purple(1257603829);
        c0585q.quebec(false);
        return b.S.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M1) {
            M1 m1 = (M1) obj;
            if (this.alpha != m1.alpha || !Q0.g.alpha(this.bravo, m1.bravo) || !Intrinsics.areEqual(null, null)) {
                return false;
            }
            return C0366t.charlie(this.charlie, m1.charlie);
        }
        return false;
    }

    @Override // b.H
    public final int hashCode() {
        int i4;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int sierra = ao.ad.sierra(this.bravo, i4 * 31, 961);
        int i5 = C0366t.lima;
        return kotlin.p.alpha(this.charlie) + sierra;
    }
}
