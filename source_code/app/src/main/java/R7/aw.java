package R7;

/* loaded from: classes2.dex */
public final class aw {
    public long alpha;
    public String bravo;
    public String charlie;
    public long delta;
    public int echo;
    public byte foxtrot;

    public final ax alpha() {
        String str;
        if (this.foxtrot == 7 && (str = this.bravo) != null) {
            return new ax(this.alpha, str, this.charlie, this.delta, this.echo);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.foxtrot & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.bravo == null) {
            sb2.append(" symbol");
        }
        if ((this.foxtrot & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.foxtrot & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
