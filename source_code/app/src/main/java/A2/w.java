package A2;

/* loaded from: classes3.dex */
public final class w extends x {
    public final j alpha = j.bravo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            return this.alpha.equals(((w) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() + (w.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.alpha + '}';
    }
}
