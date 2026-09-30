package Q7;

/* loaded from: classes2.dex */
public final class b extends n {
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final long foxtrot;

    public b(String str, long j5, String str2, String str3, String str4) {
        if (str != null) {
            this.bravo = str;
            if (str2 != null) {
                this.charlie = str2;
                if (str3 != null) {
                    this.delta = str3;
                    if (str4 != null) {
                        this.echo = str4;
                        this.foxtrot = j5;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.bravo.equals(((b) nVar).bravo)) {
                b bVar = (b) nVar;
                if (this.charlie.equals(bVar.charlie) && this.delta.equals(bVar.delta) && this.echo.equals(bVar.echo) && this.foxtrot == bVar.foxtrot) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.bravo.hashCode() ^ 1000003) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta.hashCode()) * 1000003) ^ this.echo.hashCode()) * 1000003;
        long j5 = this.foxtrot;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.bravo);
        sb2.append(", parameterKey=");
        sb2.append(this.charlie);
        sb2.append(", parameterValue=");
        sb2.append(this.delta);
        sb2.append(", variantId=");
        sb2.append(this.echo);
        sb2.append(", templateVersion=");
        return Q0.c.mike(this.foxtrot, "}", sb2);
    }
}
