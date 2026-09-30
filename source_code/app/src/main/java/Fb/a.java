package Fb;

import a0.C0366t;
import androidx.appcompat.widget.P0;
import ao.ad;
import av.q;

/* loaded from: classes2.dex */
public final class a {
    public final long alpha;
    public final long bravo;
    public final long charlie;

    public a(long j5, long j6, long j7) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (C0366t.charlie(this.alpha, aVar.alpha) && C0366t.charlie(this.bravo, aVar.bravo) && C0366t.charlie(this.charlie, aVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.charlie) + ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo);
    }

    public final String toString() {
        String india = C0366t.india(this.alpha);
        String india2 = C0366t.india(this.bravo);
        return P0.gold(q.india("CategoryColors(bg=", india, ", border=", india2, ", text="), C0366t.india(this.charlie), ")");
    }
}
