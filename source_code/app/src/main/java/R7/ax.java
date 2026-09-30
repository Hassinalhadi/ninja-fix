package R7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class ax extends a0 {
    public final long alpha;
    public final String bravo;
    public final String charlie;
    public final long delta;
    public final int echo;

    public ax(long j5, String str, String str2, long j6, int i4) {
        this.alpha = j5;
        this.bravo = str;
        this.charlie = str2;
        this.delta = j6;
        this.echo = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.alpha == ((ax) a0Var).alpha) {
                ax axVar = (ax) a0Var;
                if (this.bravo.equals(axVar.bravo)) {
                    String str = axVar.charlie;
                    String str2 = this.charlie;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.delta == axVar.delta && this.echo == axVar.echo) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j5 = this.alpha;
        int hashCode2 = (((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003;
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode2 ^ hashCode) * 1000003;
        long j6 = this.delta;
        return ((i4 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.echo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.alpha);
        sb2.append(", symbol=");
        sb2.append(this.bravo);
        sb2.append(", file=");
        sb2.append(this.charlie);
        sb2.append(", offset=");
        sb2.append(this.delta);
        sb2.append(", importance=");
        return P0.cyan(sb2, this.echo, "}");
    }
}
