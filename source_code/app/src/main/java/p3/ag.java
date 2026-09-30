package p3;

import android.location.Location;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class ag {
    public final Location alpha;
    public final String bravo;
    public final String charlie;
    public final long delta;
    public int echo;

    public ag(Location location, String topic, String payload, long j5) {
        Intrinsics.echo(location, "location");
        Intrinsics.echo(topic, "topic");
        Intrinsics.echo(payload, "payload");
        this.alpha = location;
        this.bravo = topic;
        this.charlie = payload;
        this.delta = j5;
        this.echo = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        if (Intrinsics.areEqual(this.alpha, agVar.alpha) && Intrinsics.areEqual(this.bravo, agVar.bravo) && Intrinsics.areEqual(this.charlie, agVar.charlie) && this.delta == agVar.delta && this.echo == agVar.echo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie);
        long j5 = this.delta;
        return ((sierra + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.echo;
    }

    public final String toString() {
        return "PendingLocation(location=" + this.alpha + ", topic=" + this.bravo + ", payload=" + this.charlie + ", timestamp=" + this.delta + ", retryCount=" + this.echo + ")";
    }
}
