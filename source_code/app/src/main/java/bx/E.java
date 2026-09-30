package bx;

import bz.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class E {
    public final long alpha;
    public final f0 bravo;

    public E(long j5, f0 f0Var) {
        this.alpha = j5;
        this.bravo = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E) {
                E e = (E) obj;
                e.getClass();
                if (Float.compare(0.92f, 0.92f) != 0 || !a0.aw.alpha(this.alpha, e.alpha) || !Intrinsics.areEqual(this.bravo, e.bravo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(0.92f) * 31;
        int i4 = a0.aw.charlie;
        long j5 = this.alpha;
        return this.bravo.hashCode() + ((((int) (j5 ^ (j5 >>> 32))) + floatToIntBits) * 31);
    }

    public final String toString() {
        return "Scale(scale=0.92, transformOrigin=" + ((Object) a0.aw.delta(this.alpha)) + ", animationSpec=" + this.bravo + ')';
    }
}
