package D5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p extends ac {
    public final byte[] alpha;
    public final byte[] bravo;

    public p(byte[] bArr, byte[] bArr2) {
        this.alpha = bArr;
        this.bravo = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ac) {
            ac acVar = (ac) obj;
            boolean z2 = acVar instanceof p;
            if (z2) {
                bArr = ((p) acVar).alpha;
            } else {
                bArr = ((p) acVar).alpha;
            }
            if (Arrays.equals(this.alpha, bArr)) {
                if (z2) {
                    bArr2 = ((p) acVar).bravo;
                } else {
                    bArr2 = ((p) acVar).bravo;
                }
                if (Arrays.equals(this.bravo, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.alpha) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bravo);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.alpha) + ", encryptedBlob=" + Arrays.toString(this.bravo) + "}";
    }
}
