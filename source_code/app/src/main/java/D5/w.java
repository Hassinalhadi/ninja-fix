package D5;

/* loaded from: classes3.dex */
public final class w extends aj {
    public final ai alpha;
    public final ah bravo;

    public w(ai aiVar, ah ahVar) {
        this.alpha = aiVar;
        this.bravo = ahVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aj) {
            aj ajVar = (aj) obj;
            ai aiVar = this.alpha;
            if (aiVar != null ? aiVar.equals(((w) ajVar).alpha) : ((w) ajVar).alpha == null) {
                ah ahVar = this.bravo;
                if (ahVar != null ? ahVar.equals(((w) ajVar).bravo) : ((w) ajVar).bravo == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        ai aiVar = this.alpha;
        if (aiVar == null) {
            hashCode = 0;
        } else {
            hashCode = aiVar.hashCode();
        }
        int i5 = (hashCode ^ 1000003) * 1000003;
        ah ahVar = this.bravo;
        if (ahVar != null) {
            i4 = ahVar.hashCode();
        }
        return i4 ^ i5;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.alpha + ", mobileSubtype=" + this.bravo + "}";
    }
}
