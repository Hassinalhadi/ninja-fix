package fe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: fe.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1711c extends AbstractC1709a {
    static {
        new AbstractC1709a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1711c) {
            char c3 = this.alpha;
            char c4 = this.purple;
            if (Intrinsics.golf(c3, c4) > 0) {
                C1711c c1711c = (C1711c) obj;
                if (Intrinsics.golf(c1711c.alpha, c1711c.purple) > 0) {
                    return true;
                }
            }
            C1711c c1711c2 = (C1711c) obj;
            if (c3 == c1711c2.alpha && c4 == c1711c2.purple) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        char c3 = this.alpha;
        char c4 = this.purple;
        if (Intrinsics.golf(c3, c4) > 0) {
            return -1;
        }
        return (c3 * 31) + c4;
    }

    public final String toString() {
        return this.alpha + ".." + this.purple;
    }
}
