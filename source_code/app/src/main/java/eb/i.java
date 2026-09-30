package eb;

import a0.C0366t;
import androidx.appcompat.widget.P0;
import ao.ad;
import av.q;
import kotlin.p;

/* loaded from: classes2.dex */
public final class i {
    public final long alpha;
    public final long bravo;
    public final long charlie;

    public i(long j5, long j6, long j7) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (C0366t.charlie(this.alpha, iVar.alpha) && C0366t.charlie(this.bravo, iVar.bravo) && C0366t.charlie(this.charlie, iVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return p.alpha(this.charlie) + ad.whiskey(p.alpha(this.alpha) * 31, 31, this.bravo);
    }

    public final String toString() {
        String india = C0366t.india(this.alpha);
        String india2 = C0366t.india(this.bravo);
        return P0.gold(q.india("TasksRingColors(completed=", india, ", remaining=", india2, ", current="), C0366t.india(this.charlie), ")");
    }
}
