package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ao {
    public final Integer alpha;
    public final Object bravo;

    public ao(Integer num, Object obj) {
        this.alpha = num;
        this.bravo = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return Intrinsics.areEqual(this.alpha, aoVar.alpha) && Intrinsics.areEqual(this.bravo, aoVar.bravo);
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        Object obj = this.bravo;
        if (obj instanceof Enum) {
            i4 = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return i4 + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.alpha + ", right=" + this.bravo + ')';
    }
}
