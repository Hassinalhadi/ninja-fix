package R7;

/* loaded from: classes2.dex */
public final class ap extends k0 {
    public final long alpha;
    public final String bravo;
    public final aq charlie;
    public final B delta;
    public final C echo;
    public final G foxtrot;

    public ap(long j5, String str, aq aqVar, B b2, C c3, G g2) {
        this.alpha = j5;
        this.bravo = str;
        this.charlie = aqVar;
        this.delta = b2;
        this.echo = c3;
        this.foxtrot = g2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, R7.ao] */
    public final ao alpha() {
        ?? obj = new Object();
        obj.alpha = this.alpha;
        obj.bravo = this.bravo;
        obj.charlie = this.charlie;
        obj.delta = this.delta;
        obj.echo = this.echo;
        obj.foxtrot = this.foxtrot;
        obj.golf = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof k0) {
                ap apVar = (ap) ((k0) obj);
                if (this.alpha == apVar.alpha) {
                    if (this.bravo.equals(apVar.bravo) && this.charlie.equals(apVar.charlie) && this.delta.equals(apVar.delta)) {
                        C c3 = apVar.echo;
                        C c4 = this.echo;
                        if (c4 == null) {
                            if (c3 != null) {
                                return false;
                            }
                        } else if (!c4.equals(c3)) {
                            return false;
                        }
                        G g2 = apVar.foxtrot;
                        G g5 = this.foxtrot;
                        if (g5 == null) {
                            if (g2 == null) {
                                return true;
                            }
                            return false;
                        }
                        if (g5.equals(g2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j5 = this.alpha;
        int hashCode2 = (((((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta.hashCode()) * 1000003;
        int i4 = 0;
        C c3 = this.echo;
        if (c3 == null) {
            hashCode = 0;
        } else {
            hashCode = c3.hashCode();
        }
        int i5 = (hashCode2 ^ hashCode) * 1000003;
        G g2 = this.foxtrot;
        if (g2 != null) {
            i4 = g2.hashCode();
        }
        return i5 ^ i4;
    }

    public final String toString() {
        return "Event{timestamp=" + this.alpha + ", type=" + this.bravo + ", app=" + this.charlie + ", device=" + this.delta + ", log=" + this.echo + ", rollouts=" + this.foxtrot + "}";
    }
}
