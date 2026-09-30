package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k0 extends S.ae {
    public double charlie;

    public k0(long j5, double d4) {
        super(j5);
        this.charlie = d4;
    }

    @Override // S.ae
    public final void alpha(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.charlie = ((k0) aeVar).charlie;
    }

    @Override // S.ae
    public final S.ae bravo(long j5) {
        return new k0(j5, this.charlie);
    }
}
