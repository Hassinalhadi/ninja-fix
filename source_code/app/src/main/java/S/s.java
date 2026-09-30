package S;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends ae {
    public K.d charlie;
    public int delta;

    public s(long j5, K.d dVar) {
        super(j5);
        this.charlie = dVar;
    }

    @Override // S.ae
    public final void alpha(ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        s sVar = (s) aeVar;
        synchronized (u.alpha) {
            this.charlie = sVar.charlie;
            this.delta = sVar.delta;
        }
    }

    @Override // S.ae
    public final ae bravo(long j5) {
        return new s(j5, this.charlie);
    }
}
