package Jb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g0 {
    public final String alpha;
    public final int bravo;
    public final Function0 charlie;

    public g0(String str, int i4, Function0 function0) {
        this.alpha = str;
        this.bravo = i4;
        this.charlie = function0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (!Intrinsics.areEqual(this.alpha, g0Var.alpha) || this.bravo != g0Var.bravo || !Intrinsics.areEqual(this.charlie, g0Var.charlie)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + (((this.alpha.hashCode() * 31) + this.bravo) * 31);
    }

    public final String toString() {
        return "QuickAction(label=" + this.alpha + ", icon=" + this.bravo + ", onClick=" + this.charlie + ")";
    }
}
