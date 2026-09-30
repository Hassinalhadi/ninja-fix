package j8;

/* renamed from: j8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1944a {
    public final String alpha;
    public final long bravo;
    public final long charlie;

    public C1944a(long j5, long j6, String str) {
        this.alpha = str;
        this.bravo = j5;
        this.charlie = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1944a) {
            C1944a c1944a = (C1944a) obj;
            if (this.alpha.equals(c1944a.alpha) && this.bravo == c1944a.bravo && this.charlie == c1944a.charlie) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.alpha.hashCode() ^ 1000003) * 1000003;
        long j5 = this.bravo;
        long j6 = this.charlie;
        return ((hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.alpha);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.bravo);
        sb2.append(", tokenCreationTimestamp=");
        return Q0.c.mike(this.charlie, "}", sb2);
    }
}
