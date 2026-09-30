package I0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ah {
    public final D0.g alpha;
    public final t bravo;

    public ah(D0.g gVar, t tVar) {
        this.alpha = gVar;
        this.bravo = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        if (Intrinsics.areEqual(this.alpha, ahVar.alpha) && Intrinsics.areEqual(this.bravo, ahVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.alpha) + ", offsetMapping=" + this.bravo + ')';
    }
}
