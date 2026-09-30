package z;

import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;

/* loaded from: classes3.dex */
public final class ac {
    public final C2093f alpha;
    public final C2093f bravo;
    public final C2093f charlie;

    public ac() {
        C2093f bravo = AbstractC2094g.bravo(4);
        C2093f bravo2 = AbstractC2094g.bravo(4);
        C2093f bravo3 = AbstractC2094g.bravo(0);
        this.alpha = bravo;
        this.bravo = bravo2;
        this.charlie = bravo3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ac) {
                ac acVar = (ac) obj;
                if (!Intrinsics.areEqual(this.alpha, acVar.alpha) || !Intrinsics.areEqual(this.bravo, acVar.bravo) || !Intrinsics.areEqual(this.charlie, acVar.charlie)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.alpha + ", medium=" + this.bravo + ", large=" + this.charlie + ')';
    }
}
