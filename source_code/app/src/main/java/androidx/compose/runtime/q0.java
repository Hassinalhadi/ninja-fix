package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q0 extends S.ae {
    public long charlie;

    public q0(long j5, long j6) {
        super(j5);
        this.charlie = j6;
    }

    @Override // S.ae
    public final void alpha(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.charlie = ((q0) aeVar).charlie;
    }

    @Override // S.ae
    public final S.ae bravo(long j5) {
        return new q0(j5, this.charlie);
    }
}
