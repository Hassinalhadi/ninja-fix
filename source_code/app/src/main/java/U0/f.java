package U0;

import java.util.ArrayList;
import java.util.List;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2402u;
import q0.ao;
import q0.ap;
import q0.aq;
import q0.ar;

/* loaded from: classes3.dex */
public final class f implements ap {
    public static final f bravo = new f(0);
    public static final f charlie = new f(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ f(int i4) {
        this.alpha = i4;
    }

    @Override // q0.ap
    public final /* synthetic */ int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int i5 = this.alpha;
        return AbstractC2327c.mike(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int i5 = this.alpha;
        return AbstractC2327c.juliet(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final aq delta(ar arVar, List list, long j5) {
        switch (this.alpha) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i4 = 0;
                int i5 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    AbstractC2367C victor = ((ao) list.get(i10)).victor(j5);
                    i4 = Math.max(i4, victor.alpha);
                    i5 = Math.max(i5, victor.purple);
                    arrayList.add(victor);
                }
                if (list.isEmpty()) {
                    i4 = Q0.a.juliet(j5);
                    i5 = Q0.a.india(j5);
                }
                return arVar.papa(i4, i5, kotlin.collections.t.alpha, new e(0, arrayList));
            default:
                int size2 = list.size();
                kotlin.collections.t tVar = kotlin.collections.t.alpha;
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        int i11 = 0;
                        int i12 = 0;
                        for (int i13 = 0; i13 < size3; i13++) {
                            AbstractC2367C victor2 = ((ao) list.get(i13)).victor(j5);
                            i11 = Math.max(i11, victor2.alpha);
                            i12 = Math.max(i12, victor2.purple);
                            arrayList2.add(victor2);
                        }
                        return arVar.papa(i11, i12, tVar, new e(1, arrayList2));
                    }
                    AbstractC2367C victor3 = ((ao) list.get(0)).victor(j5);
                    return arVar.papa(victor3.alpha, victor3.purple, tVar, new k(victor3, 0));
                }
                return arVar.papa(0, 0, tVar, c.white);
        }
    }

    @Override // q0.ap
    public final /* synthetic */ int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int i5 = this.alpha;
        return AbstractC2327c.golf(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int i5 = this.alpha;
        return AbstractC2327c.delta(this, interfaceC2402u, list, i4);
    }
}
