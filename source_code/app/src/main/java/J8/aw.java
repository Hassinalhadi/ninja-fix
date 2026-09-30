package J8;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class aw {
    public final String alpha;
    public final String bravo;
    public final int charlie;
    public final long delta;
    public final k echo;
    public final String foxtrot;
    public final String golf;

    public aw(String sessionId, String firstSessionId, int i4, long j5, k kVar, String str, String firebaseAuthenticationToken) {
        Intrinsics.echo(sessionId, "sessionId");
        Intrinsics.echo(firstSessionId, "firstSessionId");
        Intrinsics.echo(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.alpha = sessionId;
        this.bravo = firstSessionId;
        this.charlie = i4;
        this.delta = j5;
        this.echo = kVar;
        this.foxtrot = str;
        this.golf = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        if (Intrinsics.areEqual(this.alpha, awVar.alpha) && Intrinsics.areEqual(this.bravo, awVar.bravo) && this.charlie == awVar.charlie && this.delta == awVar.delta && Intrinsics.areEqual(this.echo, awVar.echo) && Intrinsics.areEqual(this.foxtrot, awVar.foxtrot) && Intrinsics.areEqual(this.golf, awVar.golf)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int sierra = (AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo) + this.charlie) * 31;
        long j5 = this.delta;
        return this.golf.hashCode() + AbstractC2327c.sierra((this.echo.hashCode() + ((sierra + ((int) (j5 ^ (j5 >>> 32)))) * 31)) * 31, 31, this.foxtrot);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.alpha);
        sb2.append(", firstSessionId=");
        sb2.append(this.bravo);
        sb2.append(", sessionIndex=");
        sb2.append(this.charlie);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.delta);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.echo);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.foxtrot);
        sb2.append(", firebaseAuthenticationToken=");
        return P0.fuchsia(sb2, this.golf, ')');
    }
}
