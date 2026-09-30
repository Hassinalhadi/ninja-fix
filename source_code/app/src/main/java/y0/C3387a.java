package y0;

import g0.C1726f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3387a {
    public final C1726f alpha;
    public final int bravo;

    public C3387a(C1726f c1726f, int i4) {
        this.alpha = c1726f;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3387a)) {
            return false;
        }
        C3387a c3387a = (C3387a) obj;
        if (Intrinsics.areEqual(this.alpha, c3387a.alpha) && this.bravo == c3387a.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.alpha);
        sb2.append(", configFlags=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
