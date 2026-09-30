package R7;

/* loaded from: classes2.dex */
public final class az extends d0 {
    public final String alpha;
    public final int bravo;
    public final int charlie;
    public final boolean delta;

    public az(String str, int i4, int i5, boolean z2) {
        this.alpha = str;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.alpha.equals(((az) d0Var).alpha)) {
                az azVar = (az) d0Var;
                if (this.bravo == azVar.bravo && this.charlie == azVar.charlie && this.delta == azVar.delta) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo) * 1000003) ^ this.charlie) * 1000003;
        if (this.delta) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode ^ i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.alpha);
        sb2.append(", pid=");
        sb2.append(this.bravo);
        sb2.append(", importance=");
        sb2.append(this.charlie);
        sb2.append(", defaultProcess=");
        return Q0.c.romeo(sb2, this.delta, "}");
    }
}
