package s6;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class I7 {
    public final aj alpha;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I7)) {
            return false;
        }
        return V5.x.lima(this.alpha, ((I7) obj).alpha);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha});
    }
}
