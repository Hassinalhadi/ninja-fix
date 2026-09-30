package q0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2370F extends s0.ah {
    public static final C2370F bravo = new s0.ah("Undefined intrinsics block and it is required");

    @Override // q0.ap
    public final aq delta(ar arVar, List list, long j5) {
        int size = list.size();
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i4 = 0;
                int i5 = 0;
                for (int i10 = 0; i10 < size2; i10++) {
                    AbstractC2367C victor = ((ao) list.get(i10)).victor(j5);
                    i4 = Math.max(victor.alpha, i4);
                    i5 = Math.max(victor.purple, i5);
                    arrayList.add(victor);
                }
                return arVar.papa(Q0.b.golf(i4, j5), Q0.b.foxtrot(i5, j5), tVar, new U0.e(3, arrayList));
            }
            AbstractC2367C victor2 = ((ao) list.get(0)).victor(j5);
            return arVar.papa(Q0.b.golf(victor2.alpha, j5), Q0.b.foxtrot(victor2.purple, j5), tVar, new U0.k(victor2, 5));
        }
        return arVar.papa(Q0.a.juliet(j5), Q0.a.india(j5), tVar, C2368D.red);
    }
}
