package S;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ag extends ae {
    public N.b charlie;
    public int delta;

    public ag(long j5, N.b bVar) {
        super(j5);
        this.charlie = bVar;
    }

    @Override // S.ae
    public final void alpha(ae aeVar) {
        synchronized (y.alpha) {
            Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.charlie = ((ag) aeVar).charlie;
            this.delta = ((ag) aeVar).delta;
        }
    }

    @Override // S.ae
    public final ae bravo(long j5) {
        return new ag(j5, this.charlie);
    }
}
