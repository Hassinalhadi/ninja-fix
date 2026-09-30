package J2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public final String alpha;
    public final Long bravo;

    public d(String str, Long l10) {
        this.alpha = str;
        this.bravo = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Intrinsics.areEqual(this.alpha, dVar.alpha) && Intrinsics.areEqual(this.bravo, dVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        Long l10 = this.bravo;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Preference(key=" + this.alpha + ", value=" + this.bravo + ')';
    }
}
