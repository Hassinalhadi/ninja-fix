package Y2;

import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3001h2;

/* loaded from: classes3.dex */
public final class h {
    public static final h charlie;
    public final AbstractC3001h2 alpha;
    public final AbstractC3001h2 bravo;

    static {
        b bVar = b.alpha;
        charlie = new h(bVar, bVar);
    }

    public h(AbstractC3001h2 abstractC3001h2, AbstractC3001h2 abstractC3001h22) {
        this.alpha = abstractC3001h2;
        this.bravo = abstractC3001h22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (Intrinsics.areEqual(this.alpha, hVar.alpha) && Intrinsics.areEqual(this.bravo, hVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.alpha + ", height=" + this.bravo + ')';
    }
}
