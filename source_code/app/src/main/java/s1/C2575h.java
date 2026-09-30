package s1;

import android.os.Build;
import android.view.DisplayCutout;
import j1.C1929c;
import java.util.Objects;

/* renamed from: s1.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2575h {
    public final DisplayCutout alpha;

    public C2575h(DisplayCutout displayCutout) {
        this.alpha = displayCutout;
    }

    public final C1929c alpha() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C1929c.charlie(bc.d.echo(this.alpha));
        }
        return C1929c.echo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2575h.class == obj.getClass()) {
            return Objects.equals(this.alpha, ((C2575h) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.alpha.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.alpha + "}";
    }
}
