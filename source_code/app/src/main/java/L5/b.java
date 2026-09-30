package L5;

/* loaded from: classes3.dex */
public final class b {
    public final long alpha;
    public final E5.i bravo;
    public final E5.h charlie;

    public b(long j5, E5.i iVar, E5.h hVar) {
        this.alpha = j5;
        this.bravo = iVar;
        this.charlie = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.alpha == bVar.alpha && this.bravo.equals(bVar.bravo) && this.charlie.equals(bVar.charlie)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return ((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.alpha + ", transportContext=" + this.bravo + ", event=" + this.charlie + "}";
    }
}
