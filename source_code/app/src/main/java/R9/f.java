package R9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {
    public final Long alpha;
    public final String bravo;

    public f(Long l10, String str) {
        this.alpha = l10;
        this.bravo = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.alpha, fVar.alpha) && Intrinsics.areEqual(this.bravo, fVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l10 = this.alpha;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.bravo.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "StaleHint(ageMs=" + this.alpha + ", reason=" + this.bravo + ")";
    }
}
