package R7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class as extends X {
    public final long alpha;
    public final long bravo;
    public final String charlie;
    public final String delta;

    public as(long j5, long j6, String str, String str2) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = str;
        this.delta = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X) {
            X x4 = (X) obj;
            if (this.alpha == ((as) x4).alpha) {
                as asVar = (as) x4;
                if (this.bravo == asVar.bravo && this.charlie.equals(asVar.charlie)) {
                    String str = asVar.delta;
                    String str2 = this.delta;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j5 = this.alpha;
        long j6 = this.bravo;
        int hashCode2 = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.charlie.hashCode()) * 1000003;
        String str = this.delta;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.alpha);
        sb2.append(", size=");
        sb2.append(this.bravo);
        sb2.append(", name=");
        sb2.append(this.charlie);
        sb2.append(", uuid=");
        return P0.gold(sb2, this.delta, "}");
    }
}
