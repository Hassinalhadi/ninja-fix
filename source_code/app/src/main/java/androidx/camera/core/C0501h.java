package androidx.camera.core;

import android.view.Surface;

/* renamed from: androidx.camera.core.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0501h {
    public final int alpha;
    public final Surface bravo;

    public C0501h(int i4, Surface surface) {
        this.alpha = i4;
        if (surface != null) {
            this.bravo = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0501h) {
                C0501h c0501h = (C0501h) obj;
                if (this.alpha == c0501h.alpha && this.bravo.equals(c0501h.bravo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.bravo.hashCode() ^ ((this.alpha ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.alpha + ", surface=" + this.bravo + "}";
    }
}
