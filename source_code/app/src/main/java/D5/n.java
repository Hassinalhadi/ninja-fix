package D5;

/* loaded from: classes3.dex */
public final class n extends z {
    public final l alpha;

    public n(l lVar) {
        this.alpha = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                Object obj2 = y.alpha;
                ((n) zVar).getClass();
                if (obj2.equals(obj2) && this.alpha.equals(((n) zVar).alpha)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((y.alpha.hashCode() ^ 1000003) * 1000003) ^ this.alpha.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + y.alpha + ", androidClientInfo=" + this.alpha + "}";
    }
}
