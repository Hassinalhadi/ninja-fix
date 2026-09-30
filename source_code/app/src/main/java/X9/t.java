package X9;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t extends u {
    public final String alpha;

    public t(String token) {
        Intrinsics.echo(token, "token");
        this.alpha = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && Intrinsics.areEqual(this.alpha, ((t) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("Success(token="), this.alpha, ")");
    }
}
