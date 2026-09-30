package Tc;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends i {
    public final String alpha;

    public d(String message) {
        Intrinsics.echo(message, "message");
        this.alpha = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && Intrinsics.areEqual(this.alpha, ((d) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("Failed(message="), this.alpha, ")");
    }

    public /* synthetic */ d() {
        this("");
    }
}
