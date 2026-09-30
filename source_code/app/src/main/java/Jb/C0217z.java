package Jb;

import kotlin.jvm.internal.Intrinsics;
import m3.C2097a;

/* renamed from: Jb.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0217z {
    public final C2097a alpha;

    public C0217z(C2097a diagnostics) {
        Intrinsics.echo(diagnostics, "diagnostics");
        this.alpha = diagnostics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0217z) && Intrinsics.areEqual(this.alpha, ((C0217z) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "UiState(diagnostics=" + this.alpha + ")";
    }
}
