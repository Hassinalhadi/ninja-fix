package j1;

import android.graphics.Insets;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1929c {
    public static final C1929c echo = new C1929c(0, 0, 0, 0);
    public final int alpha;
    public final int bravo;
    public final int charlie;
    public final int delta;

    public C1929c(int i4, int i5, int i10, int i11) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = i10;
        this.delta = i11;
    }

    public static C1929c alpha(C1929c c1929c, C1929c c1929c2) {
        return bravo(Math.max(c1929c.alpha, c1929c2.alpha), Math.max(c1929c.bravo, c1929c2.bravo), Math.max(c1929c.charlie, c1929c2.charlie), Math.max(c1929c.delta, c1929c2.delta));
    }

    public static C1929c bravo(int i4, int i5, int i10, int i11) {
        if (i4 == 0 && i5 == 0 && i10 == 0 && i11 == 0) {
            return echo;
        }
        return new C1929c(i4, i5, i10, i11);
    }

    public static C1929c charlie(Insets insets) {
        int i4;
        int i5;
        int i10;
        int i11;
        i4 = insets.left;
        i5 = insets.top;
        i10 = insets.right;
        i11 = insets.bottom;
        return bravo(i4, i5, i10, i11);
    }

    public final Insets delta() {
        return I2.b.juliet(this.alpha, this.bravo, this.charlie, this.delta);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1929c.class != obj.getClass()) {
            return false;
        }
        C1929c c1929c = (C1929c) obj;
        if (this.delta == c1929c.delta && this.alpha == c1929c.alpha && this.charlie == c1929c.charlie && this.bravo == c1929c.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.alpha * 31) + this.bravo) * 31) + this.charlie) * 31) + this.delta;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.alpha);
        sb2.append(", top=");
        sb2.append(this.bravo);
        sb2.append(", right=");
        sb2.append(this.charlie);
        sb2.append(", bottom=");
        return Q0.c.quebec(sb2, this.delta, '}');
    }
}
