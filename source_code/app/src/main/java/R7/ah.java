package R7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ah extends S {
    public final String alpha;
    public final byte[] bravo;

    public ah(String str, byte[] bArr) {
        this.alpha = str;
        this.bravo = bArr;
    }

    public final boolean equals(Object obj) {
        ah ahVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof S) {
            S s3 = (S) obj;
            if (this.alpha.equals(((ah) s3).alpha)) {
                if (s3 instanceof ah) {
                    ahVar = (ah) s3;
                } else {
                    ahVar = (ah) s3;
                }
                if (Arrays.equals(this.bravo, ahVar.bravo)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bravo);
    }

    public final String toString() {
        return "File{filename=" + this.alpha + ", contents=" + Arrays.toString(this.bravo) + "}";
    }
}
