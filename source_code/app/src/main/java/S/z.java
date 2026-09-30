package S;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z extends ae {
    public L.c charlie;
    public int delta;
    public int echo;

    public z(long j5, L.c cVar) {
        super(j5);
        this.charlie = cVar;
    }

    @Override // S.ae
    public final void alpha(ae aeVar) {
        synchronized (r.alpha) {
            Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.charlie = ((z) aeVar).charlie;
            this.delta = ((z) aeVar).delta;
            this.echo = ((z) aeVar).echo;
        }
    }

    @Override // S.ae
    public final ae bravo(long j5) {
        return new z(j5, this.charlie);
    }
}
