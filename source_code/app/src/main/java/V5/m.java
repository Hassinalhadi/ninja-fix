package V5;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m implements com.google.android.gms.common.api.b {
    public static final m purple = new m(null);
    public final String alpha;

    public /* synthetic */ m(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return x.lima(this.alpha, ((m) obj).alpha);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha});
    }
}
