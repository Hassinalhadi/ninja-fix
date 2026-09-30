package B8;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e {
    public final Object alpha;

    public e() {
        this.alpha = null;
    }

    public final Object alpha() {
        Object obj = this.alpha;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean bravo() {
        if (this.alpha != null) {
            return true;
        }
        return false;
    }

    public e(Object obj) {
        if (obj != null) {
            this.alpha = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
