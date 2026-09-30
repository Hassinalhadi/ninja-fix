package R7;

import java.util.List;

/* loaded from: classes2.dex */
public final class ac {
    public int alpha;
    public String bravo;
    public int charlie;
    public int delta;
    public long echo;
    public long foxtrot;
    public long golf;
    public String hotel;
    public List india;
    public byte juliet;

    public final ad alpha() {
        String str;
        if (this.juliet == 63 && (str = this.bravo) != null) {
            return new ad(this.alpha, str, this.charlie, this.delta, this.echo, this.foxtrot, this.golf, this.hotel, this.india);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.juliet & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.bravo == null) {
            sb2.append(" processName");
        }
        if ((this.juliet & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.juliet & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.juliet & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.juliet & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.juliet & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
    }
}
