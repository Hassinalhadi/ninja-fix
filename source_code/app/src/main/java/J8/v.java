package J8;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v {
    public final String alpha;

    public v(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v) && Intrinsics.areEqual(this.alpha, ((v) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.alpha;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("FirebaseSessionsData(sessionId="), this.alpha, ')');
    }
}
