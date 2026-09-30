package Pc;

import a0.C0366t;
import androidx.appcompat.widget.P0;
import ao.ad;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;

/* loaded from: classes2.dex */
public final class f {
    public final String alpha;
    public final long bravo;
    public final long charlie;

    public f(long j5, long j6, String text) {
        Intrinsics.echo(text, "text");
        this.alpha = text;
        this.bravo = j5;
        this.charlie = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.alpha, fVar.alpha) && C0366t.charlie(this.bravo, fVar.bravo) && C0366t.charlie(this.charlie, fVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        int i4 = C0366t.lima;
        return p.alpha(this.charlie) + ad.whiskey(hashCode, 31, this.bravo);
    }

    public final String toString() {
        String india = C0366t.india(this.bravo);
        String india2 = C0366t.india(this.charlie);
        StringBuilder sb2 = new StringBuilder("TicketStatusStyle(text=");
        Q0.c.azure(sb2, this.alpha, ", textColor=", india, ", backgroundColor=");
        return P0.gold(sb2, india2, ")");
    }
}
