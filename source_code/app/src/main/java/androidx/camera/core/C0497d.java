package androidx.camera.core;

/* renamed from: androidx.camera.core.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0497d {
    public final int alpha;
    public final Throwable bravo;

    public C0497d(int i4, Throwable th) {
        this.alpha = i4;
        this.bravo = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0497d) {
            C0497d c0497d = (C0497d) obj;
            if (this.alpha == c0497d.alpha) {
                Throwable th = c0497d.bravo;
                Throwable th2 = this.bravo;
                if (th2 != null ? th2.equals(th) : th == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = (this.alpha ^ 1000003) * 1000003;
        Throwable th = this.bravo;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return i4 ^ hashCode;
    }

    public final String toString() {
        return "StateError{code=" + this.alpha + ", cause=" + this.bravo + "}";
    }
}
