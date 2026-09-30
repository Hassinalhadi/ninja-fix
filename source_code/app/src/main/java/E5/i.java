package E5;

import android.util.Base64;
import id.C1915c;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i {
    public final String alpha;
    public final byte[] bravo;
    public final B5.d charlie;

    public i(String str, byte[] bArr, B5.d dVar) {
        this.alpha = str;
        this.bravo = bArr;
        this.charlie = dVar;
    }

    public static C1915c alpha() {
        C1915c c1915c = new C1915c(11, false);
        c1915c.silver = B5.d.alpha;
        return c1915c;
    }

    public final i bravo(B5.d dVar) {
        C1915c alpha = alpha();
        alpha.zulu(this.alpha);
        if (dVar != null) {
            alpha.silver = dVar;
            alpha.red = this.bravo;
            return alpha.hotel();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.alpha.equals(iVar.alpha) && Arrays.equals(this.bravo, iVar.bravo) && this.charlie.equals(iVar.charlie)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bravo)) * 1000003) ^ this.charlie.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.bravo;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.alpha + ", " + this.charlie + ", " + encodeToString + ")";
    }
}
