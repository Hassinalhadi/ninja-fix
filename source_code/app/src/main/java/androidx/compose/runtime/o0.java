package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o0 extends S.ae {
    public int charlie;

    public o0(long j5, int i4) {
        super(j5);
        this.charlie = i4;
    }

    @Override // S.ae
    public final void alpha(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.charlie = ((o0) aeVar).charlie;
    }

    @Override // S.ae
    public final S.ae bravo(long j5) {
        return new o0(j5, this.charlie);
    }
}
