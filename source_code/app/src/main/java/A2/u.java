package A2;

/* loaded from: classes3.dex */
public final class u extends x {
    public final j alpha = j.bravo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            return this.alpha.equals(((u) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() + (u.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.alpha + '}';
    }
}
