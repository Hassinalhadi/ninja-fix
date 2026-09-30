package bz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n0 {
    public final r alpha;
    public final InterfaceC0799y bravo;

    public n0(r rVar, InterfaceC0799y interfaceC0799y) {
        this.alpha = rVar;
        this.bravo = interfaceC0799y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (Intrinsics.areEqual(this.alpha, n0Var.alpha) && Intrinsics.areEqual(this.bravo, n0Var.bravo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.alpha + ", easing=" + this.bravo + ", arcMode=ArcMode(value=0))";
    }
}
