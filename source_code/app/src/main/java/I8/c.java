package I8;

/* loaded from: classes2.dex */
public final class c extends e {
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final long foxtrot;

    public c(String str, long j5, String str2, String str3, String str4) {
        this.bravo = str;
        this.charlie = str2;
        this.delta = str3;
        this.echo = str4;
        this.foxtrot = j5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.bravo.equals(((c) eVar).bravo)) {
                c cVar = (c) eVar;
                if (this.charlie.equals(cVar.charlie) && this.delta.equals(cVar.delta) && this.echo.equals(cVar.echo) && this.foxtrot == cVar.foxtrot) {
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
        sb2.append(", variantId=");
        sb2.append(this.charlie);
        sb2.append(", parameterKey=");
        sb2.append(this.delta);
        sb2.append(", parameterValue=");
        sb2.append(this.echo);
        sb2.append(", templateVersion=");
        return Q0.c.mike(this.foxtrot, "}", sb2);
    }
}
