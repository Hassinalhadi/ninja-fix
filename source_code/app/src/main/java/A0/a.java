package A0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final String alpha;
    public final kotlin.e bravo;

    public a(String str, kotlin.e eVar) {
        this.alpha = str;
        this.bravo = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.alpha, aVar.alpha) && Intrinsics.areEqual(this.bravo, aVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = 0;
        String str = this.alpha;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        kotlin.e eVar = this.bravo;
        if (eVar != null) {
            i5 = eVar.hashCode();
        }
        return i10 + i5;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.alpha + ", action=" + this.bravo + ')';
    }
}
