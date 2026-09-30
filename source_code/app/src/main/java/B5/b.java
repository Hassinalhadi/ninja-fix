package B5;

/* loaded from: classes3.dex */
public final class b {
    public final Integer alpha;

    public b(Integer num) {
        this.alpha = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Integer num = this.alpha;
        if (num == null) {
            if (bVar.alpha == null) {
                return true;
            }
            return false;
        }
        return num.equals(bVar.alpha);
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
        return "ProductData{productId=" + this.alpha + "}";
    }
}
