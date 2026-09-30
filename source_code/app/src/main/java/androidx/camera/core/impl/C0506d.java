package androidx.camera.core.impl;

import androidx.appcompat.widget.P0;

/* renamed from: androidx.camera.core.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0506d {
    public final Object alpha;

    public C0506d(Object obj) {
        this.alpha = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0506d) {
            return this.alpha.equals(((C0506d) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() ^ 1000003;
    }

    public final String toString() {
        return P0.emerald(new StringBuilder("Identifier{value="), this.alpha, "}");
    }
}
