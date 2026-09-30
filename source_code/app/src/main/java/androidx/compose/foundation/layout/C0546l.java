package androidx.compose.foundation.layout;

import java.util.List;
import pe.AbstractC2327c;
import q0.InterfaceC2402u;

/* renamed from: androidx.compose.foundation.layout.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0546l implements q0.ap {
    public static final C0546l bravo = new C0546l(0);
    public static final C0546l charlie = new C0546l(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C0546l(int i4) {
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
        int i4;
        switch (this.alpha) {
            case 0:
                return arVar.papa(Q0.a.juliet(j5), Q0.a.india(j5), kotlin.collections.t.alpha, new a5.c(4));
            default:
                int i5 = 0;
                if (Q0.a.foxtrot(j5)) {
                    i4 = Q0.a.hotel(j5);
                } else {
                    i4 = 0;
                }
                if (Q0.a.echo(j5)) {
                    i5 = Q0.a.golf(j5);
                }
                return arVar.papa(i4, i5, kotlin.collections.t.alpha, new a5.c(8));
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
