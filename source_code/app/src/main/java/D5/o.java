package D5;

/* loaded from: classes3.dex */
public final class o extends ab {
    public final r alpha;

    public o(r rVar) {
        aa aaVar = aa.alpha;
        this.alpha = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ab) {
                ab abVar = (ab) obj;
                if (this.alpha.equals(((o) abVar).alpha)) {
                    Object obj2 = aa.alpha;
                    ((o) abVar).getClass();
                    if (obj2.equals(obj2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ aa.alpha.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.alpha + ", productIdOrigin=" + aa.alpha + "}";
    }
}
