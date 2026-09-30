package kotlin;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2698k6;

/* loaded from: classes2.dex */
public final class p implements Comparable {
    public final long alpha;

    public /* synthetic */ p(long j5) {
        this.alpha = j5;
    }

    public static int alpha(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.hotel(this.alpha ^ Long.MIN_VALUE, ((p) obj).alpha ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (this.alpha != ((p) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return alpha(this.alpha);
    }

    public final String toString() {
        return AbstractC2698k6.charlie(10, this.alpha);
    }
}
