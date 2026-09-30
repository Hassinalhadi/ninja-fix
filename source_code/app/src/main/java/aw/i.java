package aw;

import android.os.Build;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class i {
    public final r alpha;

    public i(int i4, Surface surface) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            this.alpha = new p(i4, surface);
            return;
        }
        if (i5 >= 28) {
            this.alpha = new o(i4, surface);
            return;
        }
        if (i5 >= 26) {
            this.alpha = new m(i4, surface);
        } else if (i5 >= 24) {
            this.alpha = new k(i4, surface);
        } else {
            this.alpha = new r(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return this.alpha.equals(((i) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public i(k kVar) {
        this.alpha = kVar;
    }
}
