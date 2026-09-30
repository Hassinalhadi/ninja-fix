package tc;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3109n extends AbstractC3112q {
    public final String alpha;

    public C3109n(String message) {
        Intrinsics.echo(message, "message");
        this.alpha = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3109n) && Intrinsics.areEqual(this.alpha, ((C3109n) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("Error(message="), this.alpha, ")");
    }
}
