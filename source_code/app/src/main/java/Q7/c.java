package Q7;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public final String alpha;
    public final long bravo;
    public final Map charlie;

    public c(String str, long j5, Map additionalCustomKeys) {
        Intrinsics.echo(additionalCustomKeys, "additionalCustomKeys");
        this.alpha = str;
        this.bravo = j5;
        this.charlie = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Intrinsics.areEqual(this.alpha, cVar.alpha) && this.bravo == cVar.bravo && Intrinsics.areEqual(this.charlie, cVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        long j5 = this.bravo;
        return this.charlie.hashCode() + ((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.alpha + ", timestamp=" + this.bravo + ", additionalCustomKeys=" + this.charlie + ')';
    }
}
