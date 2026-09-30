package R7;

/* loaded from: classes2.dex */
public final class D {
    public F alpha;
    public String bravo;
    public String charlie;
    public long delta;
    public byte echo;

    public final E alpha() {
        F f5;
        String str;
        String str2;
        if (this.echo == 1 && (f5 = this.alpha) != null && (str = this.bravo) != null && (str2 = this.charlie) != null) {
            return new E(f5, str, str2, this.delta);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.alpha == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.bravo == null) {
            sb2.append(" parameterKey");
        }
        if (this.charlie == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.echo) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
