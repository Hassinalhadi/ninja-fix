package Dc;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends k {
    public final String alpha;

    public h(String message) {
        Intrinsics.echo(message, "message");
        this.alpha = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && Intrinsics.areEqual(this.alpha, ((h) obj).alpha)) {
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
