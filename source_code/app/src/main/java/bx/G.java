package bx;

import bz.C0778c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class G {
    public final C0778c alpha;
    public long bravo;

    public G(C0778c c0778c, long j5) {
        this.alpha = c0778c;
        this.bravo = j5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G) {
                G g2 = (G) obj;
                if (!Intrinsics.areEqual(this.alpha, g2.alpha) || !Q0.m.alpha(this.bravo, g2.bravo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        long j5 = this.bravo;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }

    public final String toString() {
        return "AnimData(anim=" + this.alpha + ", startSize=" + ((Object) Q0.m.bravo(this.bravo)) + ')';
    }
}
