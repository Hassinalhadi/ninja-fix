package Dc;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends e {
    public final String alpha;

    public b(String message) {
        Intrinsics.echo(message, "message");
        this.alpha = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && Intrinsics.areEqual(this.alpha, ((b) obj).alpha)) {
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
