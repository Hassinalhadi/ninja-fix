package F;

import a0.C0366t;

/* renamed from: F.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0156s0 {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;
    public final long echo;
    public final long foxtrot;

    public C0156s0(long j5, long j6, long j7, long j10, long j11, long j12) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
        this.echo = j11;
        this.foxtrot = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0156s0)) {
            return false;
        }
        C0156s0 c0156s0 = (C0156s0) obj;
        if (C0366t.charlie(this.alpha, c0156s0.alpha) && C0366t.charlie(this.bravo, c0156s0.bravo) && C0366t.charlie(this.charlie, c0156s0.charlie) && C0366t.charlie(this.delta, c0156s0.delta) && C0366t.charlie(this.echo, c0156s0.echo) && C0366t.charlie(this.foxtrot, c0156s0.foxtrot)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.foxtrot) + ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie), 31, this.delta), 31, this.echo);
    }
}
