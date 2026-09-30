package D0;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends m {
    public final String alpha;
    public final al bravo;

    public l(String str, al alVar) {
        this.alpha = str;
        this.bravo = alVar;
    }

    @Override // D0.m
    public final al alpha() {
        return this.bravo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!Intrinsics.areEqual(this.alpha, lVar.alpha)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bravo, lVar.bravo)) {
            return false;
        }
        lVar.getClass();
        if (Intrinsics.areEqual(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        al alVar = this.bravo;
        if (alVar != null) {
            i4 = alVar.hashCode();
        } else {
            i4 = 0;
        }
        return (hashCode + i4) * 31;
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("LinkAnnotation.Url(url="), this.alpha, ')');
    }
}
