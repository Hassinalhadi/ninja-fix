package N2;

import Lb.am;
import java.util.List;
import pe.AbstractC2327c;
import q0.InterfaceC2402u;
import q0.ap;
import q0.aq;
import q0.ar;

/* loaded from: classes3.dex */
public final class c implements ap {
    public static final c bravo = new c(0);
    public static final c charlie = new c(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ c(int i4) {
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
                return arVar.papa(Q0.a.juliet(j5), Q0.a.india(j5), kotlin.collections.t.alpha, new am(8));
            default:
                return arVar.papa(Q0.a.juliet(j5), Q0.a.india(j5), kotlin.collections.t.alpha, new am(10));
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
