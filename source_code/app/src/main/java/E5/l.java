package E5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l {
    public final B5.c alpha;
    public final byte[] bravo;

    public l(B5.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.alpha = cVar;
                this.bravo = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.alpha.equals(lVar.alpha)) {
            return false;
        }
        return Arrays.equals(this.bravo, lVar.bravo);
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bravo);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.alpha + ", bytes=[...]}";
    }
}
