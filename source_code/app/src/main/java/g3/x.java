package g3;

import s6.M4;

/* loaded from: classes3.dex */
public final class x extends M4 {
    public final v bravo;

    public x(v vVar) {
        this.bravo = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && this.bravo == ((x) obj).bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode();
    }

    public final String toString() {
        return "Invalid(reason=" + this.bravo + ")";
    }
}
