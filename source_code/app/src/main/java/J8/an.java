package J8;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class an {
    public final aw alpha;
    public final C0187b bravo;

    public an(aw awVar, C0187b c0187b) {
        this.alpha = awVar;
        this.bravo = c0187b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof an) {
                an anVar = (an) obj;
                anVar.getClass();
                if (!Intrinsics.areEqual(this.alpha, anVar.alpha) || !Intrinsics.areEqual(this.bravo, anVar.bravo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + ((this.alpha.hashCode() + (n.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.SESSION_START + ", sessionData=" + this.alpha + ", applicationInfo=" + this.bravo + ')';
    }
}
