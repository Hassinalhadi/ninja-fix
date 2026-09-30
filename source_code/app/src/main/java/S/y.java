package S;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class y {
    public static final Object alpha = new Object();

    public static final boolean alpha(ag agVar, int i4, N.b bVar) {
        boolean z2;
        synchronized (alpha) {
            int i5 = agVar.delta;
            if (i5 == i4) {
                agVar.charlie = bVar;
                z2 = true;
                agVar.delta = i5 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static final int bravo(SnapshotStateSet snapshotStateSet) {
        ag agVar = snapshotStateSet.alpha;
        Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((ag) n.india(agVar)).delta;
    }

    public static final ag charlie(SnapshotStateSet snapshotStateSet) {
        ag agVar = snapshotStateSet.alpha;
        Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (ag) n.uniform(agVar, snapshotStateSet);
    }
}
