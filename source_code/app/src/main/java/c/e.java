package c;

import Xd.l;
import Xd.m;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class e {
    public final SnapshotStateList alpha = new SnapshotStateList();

    public static void bravo(e eVar, l lVar, P.d dVar, Function0 function0, int i4) {
        if ((i4 & 8) != 0) {
            dVar = null;
        }
        eVar.getClass();
        eVar.alpha.add(new P.d(new d(lVar, dVar, function0), 424163756, true));
    }

    public final void alpha(c cVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1320309496);
        if (c0585q.golf(cVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.golf(this)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            SnapshotStateList snapshotStateList = this.alpha;
            int size = snapshotStateList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((m) snapshotStateList.get(i13)).invoke(cVar, c0585q, Integer.valueOf(i12 & 14));
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 23, this, cVar);
        }
    }
}
