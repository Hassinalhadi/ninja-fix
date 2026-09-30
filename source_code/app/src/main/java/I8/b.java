package I8;

import A0.z;

/* loaded from: classes2.dex */
public final class b {
    public String alpha;
    public String bravo;
    public String charlie;
    public String delta;
    public long echo;
    public byte foxtrot;

    public final c alpha() {
        if (this.foxtrot == 1 && this.alpha != null && this.bravo != null && this.charlie != null && this.delta != null) {
            return new c(this.alpha, this.echo, this.bravo, this.charlie, this.delta);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.alpha == null) {
            sb2.append(" rolloutId");
        }
        if (this.bravo == null) {
            sb2.append(" variantId");
        }
        if (this.charlie == null) {
            sb2.append(" parameterKey");
        }
        if (this.delta == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.foxtrot) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(z.kilo(sb2, "Missing required properties:"));
    }
}
