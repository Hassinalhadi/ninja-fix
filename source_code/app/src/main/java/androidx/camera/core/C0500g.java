package androidx.camera.core;

/* renamed from: androidx.camera.core.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0500g {
    public final bj.l alpha;

    public C0500g(bj.l lVar) {
        if (lVar != null) {
            this.alpha = lVar;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0500g) {
                C0500g c0500g = (C0500g) obj;
                c0500g.getClass();
                if (this.alpha.equals(c0500g.alpha)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.alpha + "}";
    }
}
