package g3;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1744e {
    public final u alpha;
    public final String bravo;

    public C1744e(u uVar, String message) {
        Intrinsics.echo(message, "message");
        this.alpha = uVar;
        this.bravo = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1744e)) {
            return false;
        }
        C1744e c1744e = (C1744e) obj;
        if (this.alpha == c1744e.alpha && Intrinsics.areEqual(this.bravo, c1744e.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(issue=" + this.alpha + ", message=" + this.bravo + ")";
    }
}
