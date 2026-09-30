package D5;

/* loaded from: classes3.dex */
public final class r extends ae {
    public final q alpha;

    public r(q qVar) {
        this.alpha = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ae) {
            return this.alpha.equals(((r) ((ae) obj)).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.alpha + "}";
    }
}
