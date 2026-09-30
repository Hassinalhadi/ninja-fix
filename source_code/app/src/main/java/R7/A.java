package R7;

/* loaded from: classes2.dex */
public final class A {
    public Double alpha;
    public int bravo;
    public boolean charlie;
    public int delta;
    public long echo;
    public long foxtrot;
    public byte golf;

    public final B alpha() {
        if (this.golf != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.golf & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.golf & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.golf & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.golf & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.golf & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
        }
        return new B(this.alpha, this.bravo, this.charlie, this.delta, this.echo, this.foxtrot);
    }
}
