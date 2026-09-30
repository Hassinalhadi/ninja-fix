package y;

import java.util.ArrayList;
import java.util.List;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class an implements q0.ap {
    public static final an alpha = new Object();

    @Override // q0.ap
    public final /* synthetic */ int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.mike(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.juliet(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2367C victor = ((q0.ao) list.get(i10)).victor(j5);
            i4 = Math.max(i4, victor.alpha);
            i5 = Math.max(i5, victor.purple);
            arrayList.add(victor);
        }
        return arVar.papa(i4, i5, kotlin.collections.t.alpha, new kotlin.io.k(2, arrayList));
    }

    @Override // q0.ap
    public final /* synthetic */ int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.golf(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.delta(this, interfaceC2402u, list, i4);
    }
}
