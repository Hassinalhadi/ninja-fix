package c;

import a0.C0366t;
import ao.ad;
import kotlin.p;

/* loaded from: classes3.dex */
public final class c {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;
    public final long echo;

    public c(long j5, long j6, long j7, long j10, long j11) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
        this.echo = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (C0366t.charlie(this.alpha, cVar.alpha) && C0366t.charlie(this.bravo, cVar.bravo) && C0366t.charlie(this.charlie, cVar.charlie) && C0366t.charlie(this.delta, cVar.delta) && C0366t.charlie(this.echo, cVar.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return p.alpha(this.echo) + ad.whiskey(ad.whiskey(ad.whiskey(p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie), 31, this.delta);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        ad.bronze(this.alpha, ", textColor=", sb2);
        ad.bronze(this.bravo, ", iconColor=", sb2);
        ad.bronze(this.charlie, ", disabledTextColor=", sb2);
        ad.bronze(this.delta, ", disabledIconColor=", sb2);
        sb2.append((Object) C0366t.india(this.echo));
        sb2.append(')');
        return sb2.toString();
    }
}
