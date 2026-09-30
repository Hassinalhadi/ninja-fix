package R7;

/* loaded from: classes2.dex */
public final class ay {
    public String alpha;
    public int bravo;
    public int charlie;
    public boolean delta;
    public byte echo;

    public final az alpha() {
        String str;
        if (this.echo == 7 && (str = this.alpha) != null) {
            return new az(str, this.bravo, this.charlie, this.delta);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.alpha == null) {
            sb2.append(" processName");
        }
        if ((this.echo & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.echo & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.echo & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
