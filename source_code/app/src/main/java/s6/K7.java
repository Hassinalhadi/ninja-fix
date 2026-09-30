package s6;

/* loaded from: classes2.dex */
public final class K7 {
    public final String alpha;
    public final int bravo;

    public K7(String str, int i4) {
        this.alpha = str;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof K7) {
                K7 k72 = (K7) obj;
                if (this.alpha.equals(k72.alpha) && this.bravo == k72.bravo) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(this.alpha);
        sb2.append(", enableFirelog=true, firelogEventType=");
        return androidx.appcompat.widget.P0.cyan(sb2, this.bravo, "}");
    }
}
