package R7;

/* loaded from: classes2.dex */
public final class H {
    public int alpha;
    public String bravo;
    public String charlie;
    public boolean delta;
    public byte echo;

    public final I alpha() {
        String str;
        String str2;
        if (this.echo == 3 && (str = this.bravo) != null && (str2 = this.charlie) != null) {
            return new I(this.alpha, str, str2, this.delta);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.echo & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.bravo == null) {
            sb2.append(" version");
        }
        if (this.charlie == null) {
            sb2.append(" buildVersion");
        }
        if ((this.echo & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
