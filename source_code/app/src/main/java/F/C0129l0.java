package F;

import a0.C0366t;

/* renamed from: F.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0129l0 {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;

    public C0129l0(long j5, long j6, long j7, long j10) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0129l0)) {
            return false;
        }
        C0129l0 c0129l0 = (C0129l0) obj;
        if (C0366t.charlie(this.alpha, c0129l0.alpha) && C0366t.charlie(this.bravo, c0129l0.bravo) && C0366t.charlie(this.charlie, c0129l0.charlie) && C0366t.charlie(this.delta, c0129l0.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.delta) + ao.ad.whiskey(ao.ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie);
    }
}
