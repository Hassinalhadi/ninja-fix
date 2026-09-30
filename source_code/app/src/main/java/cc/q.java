package cc;

import a0.C0366t;
import androidx.appcompat.widget.P0;
import ao.ad;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class q {
    public final long alpha;
    public final String bravo;
    public final long charlie;
    public final int delta;
    public final long echo;
    public final float foxtrot;

    public q(long j5, String text, long j6, int i4, long j7, float f5) {
        Intrinsics.echo(text, "text");
        this.alpha = j5;
        this.bravo = text;
        this.charlie = j6;
        this.delta = i4;
        this.echo = j7;
        this.foxtrot = f5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (!C0366t.charlie(this.alpha, qVar.alpha) || !Intrinsics.areEqual(this.bravo, qVar.bravo) || !C0366t.charlie(this.charlie, qVar.charlie) || this.delta != qVar.delta || !C0366t.charlie(this.echo, qVar.echo) || !Q0.g.alpha(this.foxtrot, qVar.foxtrot)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return Float.floatToIntBits(this.foxtrot) + ad.whiskey((ad.whiskey(AbstractC2327c.sierra(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie) + this.delta) * 31, 31, this.echo);
    }

    public final String toString() {
        String india = C0366t.india(this.alpha);
        String india2 = C0366t.india(this.charlie);
        String india3 = C0366t.india(this.echo);
        String bravo = Q0.g.bravo(this.foxtrot);
        StringBuilder victor = Q0.c.victor("VoteBadgeUi(background=", india, ", text=");
        Q0.c.azure(victor, this.bravo, ", textColor=", india2, ", iconRes=");
        victor.append(this.delta);
        victor.append(", iconTint=");
        victor.append(india3);
        victor.append(", width=");
        return P0.gold(victor, bravo, ")");
    }
}
