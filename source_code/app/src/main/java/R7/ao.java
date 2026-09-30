package R7;

/* loaded from: classes2.dex */
public final class ao {
    public long alpha;
    public String bravo;
    public aq charlie;
    public B delta;
    public C echo;
    public G foxtrot;
    public byte golf;

    public final ap alpha() {
        String str;
        aq aqVar;
        B b2;
        if (this.golf == 1 && (str = this.bravo) != null && (aqVar = this.charlie) != null && (b2 = this.delta) != null) {
            return new ap(this.alpha, str, aqVar, b2, this.echo, this.foxtrot);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.golf) == 0) {
            sb2.append(" timestamp");
        }
        if (this.bravo == null) {
            sb2.append(" type");
        }
        if (this.charlie == null) {
            sb2.append(" app");
        }
        if (this.delta == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
