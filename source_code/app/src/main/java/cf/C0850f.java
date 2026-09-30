package cf;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: cf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0850f {
    public final Ne.b alpha;
    public final C0848d bravo;

    public C0850f(Ne.b classId, C0848d c0848d) {
        Intrinsics.echo(classId, "classId");
        this.alpha = classId;
        this.bravo = c0848d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0850f) {
            if (Intrinsics.areEqual(this.alpha, ((C0850f) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
