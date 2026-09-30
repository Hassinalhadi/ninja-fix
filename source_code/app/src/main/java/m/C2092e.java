package m;

import g.AbstractC1719b;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2092e implements InterfaceC2089b {
    public final float alpha;

    public C2092e(float f5) {
        this.alpha = f5;
        if (f5 >= 0.0f && f5 <= 100.0f) {
            return;
        }
        AbstractC1719b.alpha("The percent should be in the range of [0, 100]");
    }

    @Override // m.InterfaceC2089b
    public final float alpha(long j5, Q0.d dVar) {
        return (this.alpha / 100.0f) * Z.e.charlie(j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2092e) && Float.compare(this.alpha, ((C2092e) obj).alpha) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.alpha);
    }

    public final String toString() {
        return "CornerSize(size = " + this.alpha + "%)";
    }
}
