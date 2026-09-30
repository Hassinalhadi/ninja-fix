package D8;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class a {
    public final String alpha;
    public final String bravo;

    public a(String str, String str2) {
        this.alpha = str;
        if (str2 != null) {
            this.bravo = str2;
            return;
        }
        throw new NullPointerException("Null version");
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
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.alpha);
        sb2.append(", version=");
        return P0.gold(sb2, this.bravo, "}");
    }
}
