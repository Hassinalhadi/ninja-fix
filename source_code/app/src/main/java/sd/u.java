package sd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u {
    public static final u delta = new u("HTTP", 2, 0);
    public static final u echo = new u("HTTP", 1, 1);
    public static final u foxtrot = new u("HTTP", 1, 0);
    public static final u golf = new u("SPDY", 3, 0);
    public static final u hotel = new u("QUIC", 1, 0);
    public final String alpha;
    public final int bravo;
    public final int charlie;

    public u(String str, int i4, int i5) {
        this.alpha = str;
        this.bravo = i4;
        this.charlie = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (!Intrinsics.areEqual(this.alpha, uVar.alpha) || this.bravo != uVar.bravo || this.charlie != uVar.charlie) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.alpha.hashCode() * 31) + this.bravo) * 31) + this.charlie;
    }

    public final String toString() {
        return this.alpha + '/' + this.bravo + '.' + this.charlie;
    }
}
