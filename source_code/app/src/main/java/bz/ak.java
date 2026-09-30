package bz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ak {
    public final Float alpha;
    public InterfaceC0799y bravo;

    public ak(Float f5, InterfaceC0799y interfaceC0799y) {
        this.alpha = f5;
        this.bravo = interfaceC0799y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ak) {
            ak akVar = (ak) obj;
            if (Intrinsics.areEqual(akVar.alpha, this.alpha) && Intrinsics.areEqual(akVar.bravo, this.bravo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 961);
    }
}
