package R7;

/* loaded from: classes2.dex */
public final class aa {
    public String alpha;
    public String bravo;
    public int charlie;
    public String delta;
    public String echo;
    public String foxtrot;
    public String golf;
    public String hotel;
    public String india;
    public aj juliet;
    public ag kilo;
    public ad lima;
    public byte mike;

    public final ab alpha() {
        if (this.mike == 1 && this.alpha != null && this.bravo != null && this.delta != null && this.hotel != null && this.india != null) {
            return new ab(this.alpha, this.bravo, this.charlie, this.delta, this.echo, this.foxtrot, this.golf, this.hotel, this.india, this.juliet, this.kilo, this.lima);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.alpha == null) {
            sb2.append(" sdkVersion");
        }
        if (this.bravo == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.mike) == 0) {
            sb2.append(" platform");
        }
        if (this.delta == null) {
            sb2.append(" installationUuid");
        }
        if (this.hotel == null) {
            sb2.append(" buildVersion");
        }
        if (this.india == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
