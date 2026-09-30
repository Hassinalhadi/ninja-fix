package n;

import java.util.ArrayList;
import java.util.List;
import pe.AbstractC2327c;
import q0.InterfaceC2402u;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2129d implements q0.ap {
    public static final C2129d bravo = new C2129d(0);
    public static final C2129d charlie = new C2129d(1);
    public static final kd.l delta = new kd.l(13);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C2129d(int i4) {
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
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        switch (this.alpha) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((q0.ao) list.get(i4)).victor(j5));
                }
                return arVar.papa(Q0.a.hotel(j5), Q0.a.golf(j5), kotlin.collections.t.alpha, new kotlin.io.k(1, arrayList));
            default:
                return arVar.papa(Q0.a.hotel(j5), Q0.a.golf(j5), kotlin.collections.t.alpha, delta);
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
