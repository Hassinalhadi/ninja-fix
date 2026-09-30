package X9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s extends u {
    public final r alpha;
    public final String bravo;

    public s(r rVar, String str) {
        this.alpha = rVar;
        this.bravo = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.alpha == sVar.alpha && Intrinsics.areEqual(this.bravo, sVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Error(reason=" + this.alpha + ", message=" + this.bravo + ")";
    }
}
