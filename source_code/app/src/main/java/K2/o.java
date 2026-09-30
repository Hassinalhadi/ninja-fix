package K2;

import A2.z;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes3.dex */
public final class o {
    public final L2.c alpha;
    public final B2.f bravo;
    public final J2.r charlie;

    static {
        z.golf("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, B2.f fVar, L2.c cVar) {
        this.bravo = fVar;
        this.alpha = cVar;
        this.charlie = workDatabase.uniform();
    }
}
