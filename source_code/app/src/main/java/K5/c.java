package K5;

import java.util.Set;

/* loaded from: classes3.dex */
public final class c {
    public final long alpha;
    public final long bravo;
    public final Set charlie;

    public c(long j5, long j6, Set set) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.alpha == cVar.alpha && this.bravo == cVar.bravo && this.charlie.equals(cVar.charlie)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        int i4 = (((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.bravo;
        return ((i4 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.charlie.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.alpha + ", maxAllowedDelay=" + this.bravo + ", flags=" + this.charlie + "}";
    }
}
