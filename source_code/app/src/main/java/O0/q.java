package O0;

import s6.AbstractC2636d7;

/* loaded from: classes3.dex */
public final class q {
    public static final q charlie = new q(AbstractC2636d7.charlie(0), AbstractC2636d7.charlie(0));
    public final long alpha;
    public final long bravo;

    public q(long j5, long j6) {
        this.alpha = j5;
        this.bravo = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (Q0.p.alpha(this.alpha, qVar.alpha) && Q0.p.alpha(this.bravo, qVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Q0.p.delta(this.bravo) + (Q0.p.delta(this.alpha) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) Q0.p.echo(this.alpha)) + ", restLine=" + ((Object) Q0.p.echo(this.bravo)) + ')';
    }
}
