package bx;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ac {
    public final T.f alpha;
    public final Function1 bravo;
    public final bz.aa charlie;

    public ac(T.f fVar, Function1 function1, bz.aa aaVar) {
        this.alpha = fVar;
        this.bravo = function1;
        this.charlie = aaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ac) {
            ac acVar = (ac) obj;
            if (Intrinsics.areEqual(this.alpha, acVar.alpha) && Intrinsics.areEqual(this.bravo, acVar.bravo) && Intrinsics.areEqual(this.charlie, acVar.charlie)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31) + 1231;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.alpha + ", size=" + this.bravo + ", animationSpec=" + this.charlie + ", clip=true)";
    }
}
