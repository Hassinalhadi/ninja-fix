package S;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class r {
    public static final Object alpha = new Object();

    public static final void alpha(int i4, int i5) {
        if (i4 >= 0 && i4 < i5) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i4 + ") is out of bound of [0, " + i5 + ')');
    }

    public static final boolean bravo(z zVar, int i4, L.c cVar, boolean z2) {
        boolean z10;
        synchronized (alpha) {
            try {
                int i5 = zVar.delta;
                if (i5 == i4) {
                    zVar.charlie = cVar;
                    z10 = true;
                    if (z2) {
                        zVar.echo++;
                    }
                    zVar.delta = i5 + 1;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public static final z charlie(SnapshotStateList snapshotStateList) {
        z zVar = snapshotStateList.alpha;
        Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (z) n.uniform(zVar, snapshotStateList);
    }

    public static final int delta(SnapshotStateList snapshotStateList) {
        z zVar = snapshotStateList.alpha;
        Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((z) n.india(zVar)).echo;
    }

    public static final boolean echo(SnapshotStateList snapshotStateList, Function1 function1) {
        int i4;
        L.c cVar;
        Object invoke;
        g kilo;
        boolean bravo;
        do {
            synchronized (alpha) {
                z zVar = snapshotStateList.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i4 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            L.g india = cVar.india();
            invoke = function1.invoke(india);
            L.c delta = india.delta();
            if (Intrinsics.areEqual(delta, cVar)) {
                break;
            }
            z zVar3 = snapshotStateList.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = bravo((z) n.xray(zVar3, snapshotStateList, kilo), i4, delta, true);
            }
            n.oscar(kilo, snapshotStateList);
        } while (!bravo);
        return ((Boolean) invoke).booleanValue();
    }
}
