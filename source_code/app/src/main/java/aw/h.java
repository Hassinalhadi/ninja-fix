package aw;

import android.os.Build;

/* loaded from: classes3.dex */
public final class h {
    public final f alpha;

    public h(f fVar) {
        this.alpha = fVar;
    }

    public static h alpha(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new h(new f(obj));
        }
        return new h(new f(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.alpha.equals(((h) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha.toString();
    }
}
