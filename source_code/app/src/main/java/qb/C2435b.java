package qb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2435b {
    public final String alpha;

    public C2435b(String title) {
        Intrinsics.echo(title, "title");
        this.alpha = title;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2435b) {
                if (!Intrinsics.areEqual(this.alpha, ((C2435b) obj).alpha) || !Intrinsics.areEqual("You’ll get delivery requests in a few minutes. Please\nstay available", "You’ll get delivery requests in a few minutes. Please\nstay available")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) - 1885865997;
    }

    public final String toString() {
        return P0.gold(new StringBuilder("AwaitingOrdersCardData(title="), this.alpha, ", message=You’ll get delivery requests in a few minutes. Please\nstay available)");
    }
}
