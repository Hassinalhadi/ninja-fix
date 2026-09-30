package aw;

import android.view.Surface;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class r {
    public final Object alpha;

    public r(Surface surface) {
        this.alpha = new q(surface);
    }

    public void alpha(Surface surface) {
        if (echo() != surface) {
            if (!foxtrot()) {
                throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
            }
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
        throw new IllegalStateException("Surface is already added!");
    }

    public void bravo() {
        ((q) this.alpha).foxtrot = true;
    }

    public Object charlie() {
        return null;
    }

    public String delta() {
        return ((q) this.alpha).echo;
    }

    public Surface echo() {
        List list = ((q) this.alpha).alpha;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        return Objects.equals(this.alpha, ((r) obj).alpha);
    }

    public boolean foxtrot() {
        return ((q) this.alpha).foxtrot;
    }

    public void golf(long j5) {
        ((q) this.alpha).golf = j5;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public void hotel(int i4) {
    }

    public void india(String str) {
        ((q) this.alpha).echo = str;
    }

    public void juliet(long j5) {
    }

    public r(Object obj) {
        this.alpha = obj;
    }
}
