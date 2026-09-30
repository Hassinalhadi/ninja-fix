package A2;

/* loaded from: classes3.dex */
public final class v extends x {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return v.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
