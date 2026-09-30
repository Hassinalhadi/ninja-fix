package pe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2318aa {
    public final Ne.b alpha;
    public final List bravo;

    public C2318aa(Ne.b classId, List typeParametersCount) {
        Intrinsics.echo(classId, "classId");
        Intrinsics.echo(typeParametersCount, "typeParametersCount");
        this.alpha = classId;
        this.bravo = typeParametersCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2318aa)) {
            return false;
        }
        C2318aa c2318aa = (C2318aa) obj;
        if (Intrinsics.areEqual(this.alpha, c2318aa.alpha) && Intrinsics.areEqual(this.bravo, c2318aa.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.alpha + ", typeParametersCount=" + this.bravo + ')';
    }
}
