package F;

import a0.C0366t;

/* loaded from: classes3.dex */
public final class H1 {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;

    public H1(long j5, long j6, long j7, long j10) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H1)) {
            return false;
        }
        H1 h1 = (H1) obj;
        if (C0366t.charlie(this.alpha, h1.alpha) && C0366t.charlie(this.bravo, h1.bravo) && C0366t.charlie(this.charlie, h1.charlie) && C0366t.charlie(this.delta, h1.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.delta) + ao.ad.whiskey(ao.ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie);
    }
}
