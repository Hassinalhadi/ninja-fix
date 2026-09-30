package J8;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class am {
    public final String alpha;
    public final String bravo;
    public final int charlie;
    public final long delta;

    public am(String sessionId, String firstSessionId, int i4, long j5) {
        Intrinsics.echo(sessionId, "sessionId");
        Intrinsics.echo(firstSessionId, "firstSessionId");
        this.alpha = sessionId;
        this.bravo = firstSessionId;
        this.charlie = i4;
        this.delta = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        if (Intrinsics.areEqual(this.alpha, amVar.alpha) && Intrinsics.areEqual(this.bravo, amVar.bravo) && this.charlie == amVar.charlie && this.delta == amVar.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int sierra = (AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo) + this.charlie) * 31;
        long j5 = this.delta;
        return sierra + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.alpha + ", firstSessionId=" + this.bravo + ", sessionIndex=" + this.charlie + ", sessionStartTimestampUs=" + this.delta + ')';
    }
}
