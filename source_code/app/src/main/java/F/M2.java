package F;

import a0.C0366t;

/* loaded from: classes3.dex */
public final class M2 {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;
    public final long echo;

    public M2(long j5, long j6, long j7, long j10, long j11) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
        this.echo = j11;
    }

    public final M2 alpha(long j5, long j6, long j7, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        if (j5 != 16) {
            j12 = j5;
        } else {
            j12 = this.alpha;
        }
        if (j6 != 16) {
            j13 = j6;
        } else {
            j13 = this.bravo;
        }
        if (j7 != 16) {
            j14 = j7;
        } else {
            j14 = this.charlie;
        }
        if (j10 != 16) {
            j15 = j10;
        } else {
            j15 = this.delta;
        }
        if (j11 != 16) {
            j16 = j11;
        } else {
            j16 = this.echo;
        }
        return new M2(j12, j13, j14, j15, j16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M2)) {
            return false;
        }
        M2 m22 = (M2) obj;
        if (C0366t.charlie(this.alpha, m22.alpha) && C0366t.charlie(this.bravo, m22.bravo) && C0366t.charlie(this.charlie, m22.charlie) && C0366t.charlie(this.delta, m22.delta) && C0366t.charlie(this.echo, m22.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.echo) + ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie), 31, this.delta);
    }
}
