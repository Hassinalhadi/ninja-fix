package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 extends S.ae {
    public float charlie;

    public m0(float f5, long j5) {
        super(j5);
        this.charlie = f5;
    }

    @Override // S.ae
    public final void alpha(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.charlie = ((m0) aeVar).charlie;
    }

    @Override // S.ae
    public final S.ae bravo(long j5) {
        return new m0(this.charlie, j5);
    }
}
