package cb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cb.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0841f {
    public final List alpha;
    public final List bravo;

    public C0841f(List cabinetNumbers, List packages) {
        Intrinsics.echo(cabinetNumbers, "cabinetNumbers");
        Intrinsics.echo(packages, "packages");
        this.alpha = cabinetNumbers;
        this.bravo = packages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0841f)) {
            return false;
        }
        C0841f c0841f = (C0841f) obj;
        if (Intrinsics.areEqual(this.alpha, c0841f.alpha) && Intrinsics.areEqual(this.bravo, c0841f.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "HandshakeSection(cabinetNumbers=" + this.alpha + ", packages=" + this.bravo + ")";
    }
}
