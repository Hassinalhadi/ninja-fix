package Vb;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final Pair alpha;
    public final Pair bravo;

    public a(Pair pair, Pair pair2) {
        this.alpha = pair;
        this.bravo = pair2;
    }

    public static a alpha(a aVar, Pair pair, Pair pair2, int i4) {
        if ((i4 & 1) != 0) {
            pair = aVar.alpha;
        }
        if ((i4 & 2) != 0) {
            pair2 = aVar.bravo;
        }
        return new a(pair, pair2);
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
        int hashCode;
        int i4 = 0;
        Pair pair = this.alpha;
        if (pair == null) {
            hashCode = 0;
        } else {
            hashCode = pair.hashCode();
        }
        int i5 = hashCode * 31;
        Pair pair2 = this.bravo;
        if (pair2 != null) {
            i4 = pair2.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        return "AttachmentState(building=" + this.alpha + ", landMark=" + this.bravo + ")";
    }
}
