package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v0 {
    public final String alpha;
    public final Object bravo;

    public v0(String str, Object obj) {
        this.alpha = str;
        this.bravo = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (Intrinsics.areEqual(this.alpha, v0Var.alpha) && Intrinsics.areEqual(this.bravo, v0Var.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        Object obj = this.bravo;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ValueElement(name=" + this.alpha + ", value=" + this.bravo + ')';
    }
}
