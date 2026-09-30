package H6;

import F8.q;
import V5.x;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d implements com.google.android.gms.common.api.b {
    public final int alpha;

    public d(q qVar) {
        this.alpha = qVar.alpha;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && x.lima(Integer.valueOf(this.alpha), Integer.valueOf(((d) obj).alpha)) && x.lima(1, 1) && x.lima(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (x.lima(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), 1, null, Boolean.TRUE});
    }
}
