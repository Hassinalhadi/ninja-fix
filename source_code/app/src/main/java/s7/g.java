package s7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class g implements Comparable {
    public final byte[] alpha;

    public g(byte[] bArr) {
        this.alpha = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        byte[] bArr = this.alpha;
        int length = bArr.length;
        byte[] bArr2 = gVar.alpha;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b2 = bArr[i4];
            byte b4 = gVar.alpha[i4];
            if (b2 != b4) {
                return b2 - b4;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return Arrays.equals(this.alpha, ((g) obj).alpha);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.alpha);
    }

    public final String toString() {
        return com.bumptech.glide.c.bravo(this.alpha);
    }
}
