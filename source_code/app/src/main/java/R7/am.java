package R7;

/* loaded from: classes2.dex */
public final class am {
    public int alpha;
    public String bravo;
    public int charlie;
    public long delta;
    public long echo;
    public boolean foxtrot;
    public int golf;
    public String hotel;
    public String india;
    public byte juliet;

    public final an alpha() {
        String str;
        String str2;
        String str3;
        if (this.juliet == 63 && (str = this.bravo) != null && (str2 = this.hotel) != null && (str3 = this.india) != null) {
            return new an(this.alpha, str, this.charlie, this.delta, this.echo, this.foxtrot, this.golf, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.juliet & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.bravo == null) {
            sb2.append(" model");
        }
        if ((this.juliet & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.juliet & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.juliet & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.juliet & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.juliet & 32) == 0) {
            sb2.append(" state");
        }
        if (this.hotel == null) {
            sb2.append(" manufacturer");
        }
        if (this.india == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
