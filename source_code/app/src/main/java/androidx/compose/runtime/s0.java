package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s0 extends S.ae {
    public Object charlie;

    public s0(long j5, Object obj) {
        super(j5);
        this.charlie = obj;
    }

    @Override // S.ae
    public final void alpha(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.charlie = ((s0) aeVar).charlie;
    }

    @Override // S.ae
    public final S.ae bravo(long j5) {
        return new s0(S.n.kilo().golf(), this.charlie);
    }
}
