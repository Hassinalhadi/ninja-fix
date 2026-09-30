package R7;

import java.util.List;

/* loaded from: classes2.dex */
public final class ai {
    public String alpha;
    public String bravo;
    public String charlie;
    public long delta;
    public Long echo;
    public boolean foxtrot;
    public ak golf;
    public J hotel;
    public I india;
    public an juliet;
    public List kilo;
    public int lima;
    public byte mike;

    public final aj alpha() {
        String str;
        String str2;
        ak akVar;
        if (this.mike == 7 && (str = this.alpha) != null && (str2 = this.bravo) != null && (akVar = this.golf) != null) {
            return new aj(str, str2, this.charlie, this.delta, this.echo, this.foxtrot, akVar, this.hotel, this.india, this.juliet, this.kilo, this.lima);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.alpha == null) {
            sb2.append(" generator");
        }
        if (this.bravo == null) {
            sb2.append(" identifier");
        }
        if ((this.mike & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.mike & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.golf == null) {
            sb2.append(" app");
        }
        if ((this.mike & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
