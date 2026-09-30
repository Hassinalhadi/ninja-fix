package R7;

/* loaded from: classes2.dex */
public final class au extends Z {
    public final String alpha;
    public final String bravo;
    public final long charlie;

    public au(String str, long j5, String str2) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = j5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z) {
            Z z2 = (Z) obj;
            if (this.alpha.equals(((au) z2).alpha)) {
                au auVar = (au) z2;
                if (this.bravo.equals(auVar.bravo) && this.charlie == auVar.charlie) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003;
        long j5 = this.charlie;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.alpha);
        sb2.append(", code=");
        sb2.append(this.bravo);
        sb2.append(", address=");
        return Q0.c.mike(this.charlie, "}", sb2);
    }
}
