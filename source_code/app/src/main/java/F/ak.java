package F;

import a0.C0366t;

/* loaded from: classes3.dex */
public final class ak {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;

    public ak(long j5, long j6, long j7, long j10) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
    }

    public final ak alpha(long j5, long j6, long j7, long j10) {
        long j11;
        long j12;
        long j13;
        if (j5 == 16) {
            j5 = this.alpha;
        }
        long j14 = j5;
        if (j6 != 16) {
            j11 = j6;
        } else {
            j11 = this.bravo;
        }
        if (j7 != 16) {
            j12 = j7;
        } else {
            j12 = this.charlie;
        }
        if (j10 != 16) {
            j13 = j10;
        } else {
            j13 = this.delta;
        }
        return new ak(j14, j11, j12, j13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        if (C0366t.charlie(this.alpha, akVar.alpha) && C0366t.charlie(this.bravo, akVar.bravo) && C0366t.charlie(this.charlie, akVar.charlie) && C0366t.charlie(this.delta, akVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.delta) + ao.ad.whiskey(ao.ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie);
    }
}
