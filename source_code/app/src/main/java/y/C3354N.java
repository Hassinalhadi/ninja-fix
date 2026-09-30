package y;

import a0.C0366t;

/* renamed from: y.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3354N {
    public final long alpha;
    public final long bravo;

    public C3354N(long j5, long j6) {
        this.alpha = j5;
        this.bravo = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3354N)) {
            return false;
        }
        C3354N c3354n = (C3354N) obj;
        if (C0366t.charlie(this.alpha, c3354n.alpha) && C0366t.charlie(this.bravo, c3354n.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.bravo) + (kotlin.p.alpha(this.alpha) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        ao.ad.bronze(this.alpha, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) C0366t.india(this.bravo));
        sb2.append(')');
        return sb2.toString();
    }
}
