package bo;

import androidx.lifecycle.al;
import bf.C0761a;

/* loaded from: classes3.dex */
public final class a {
    public final al alpha;
    public final C0761a bravo;

    public a(al alVar, C0761a c0761a) {
        if (alVar != null) {
            this.alpha = alVar;
            if (c0761a != null) {
                this.bravo = c0761a;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.alpha.equals(aVar.alpha) && this.bravo.equals(aVar.bravo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.alpha + ", cameraId=" + this.bravo + "}";
    }
}
