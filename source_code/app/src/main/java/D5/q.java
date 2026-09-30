package D5;

/* loaded from: classes3.dex */
public final class q extends ad {
    public final Integer alpha;

    public q(Integer num) {
        this.alpha = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        Integer num = this.alpha;
        q qVar = (q) ((ad) obj);
        if (num == null) {
            if (qVar.alpha == null) {
                return true;
            }
            return false;
        }
        return num.equals(qVar.alpha);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.alpha;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.alpha + "}";
    }
}
