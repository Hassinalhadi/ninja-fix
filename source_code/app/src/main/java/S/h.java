package S;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* loaded from: classes3.dex */
public final class h extends u {
    public final c bravo;

    public h(c cVar) {
        this.bravo = cVar;
    }

    @Override // S.u
    public final void bravo() {
        c cVar = this.bravo;
        cVar.charlie();
        throw new SnapshotApplyConflictException(cVar);
    }
}
