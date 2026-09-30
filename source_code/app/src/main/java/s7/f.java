package s7;

import java.util.Arrays;
import z7.G;
import z7.ao;

/* loaded from: classes2.dex */
public final class f {
    public final Object alpha;
    public final byte[] bravo;
    public final ao charlie;
    public final G delta;

    public f(Object obj, byte[] bArr, ao aoVar, G g2) {
        this.alpha = obj;
        this.bravo = Arrays.copyOf(bArr, bArr.length);
        this.charlie = aoVar;
        this.delta = g2;
    }

    public final byte[] alpha() {
        byte[] bArr = this.bravo;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
