package n;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.t0;
import d.C1551q;
import d.InterfaceC1532g0;
import f.InterfaceC1673j;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2901T;

/* loaded from: classes3.dex */
public final class b0 implements Xd.m {
    public final /* synthetic */ c0 alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ InterfaceC1673j red;

    public b0(c0 c0Var, boolean z2, InterfaceC1673j interfaceC1673j) {
        this.alpha = c0Var;
        this.purple = z2;
        this.red = interfaceC1673j;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        c0585q.purple(805428266);
        boolean z11 = true;
        if (c0585q.kilo(AbstractC2901T.november) == Q0.n.purple) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0 c0Var = this.alpha;
        androidx.compose.runtime.ax axVar = c0Var.foxtrot;
        if (((d.K) ((t0) axVar).getValue()) != d.K.alpha && z2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean golf = c0585q.golf(c0Var);
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (golf || jade == asVar) {
            jade = new Y(0, c0Var);
            c0585q.f(jade);
        }
        androidx.compose.runtime.ax black = C0564b.black((Function1) jade, c0585q);
        Object jade2 = c0585q.jade();
        if (jade2 == asVar) {
            C1551q c1551q = new C1551q(new Cb.i(black, 22));
            c0585q.f(c1551q);
            jade2 = c1551q;
        }
        InterfaceC1532g0 interfaceC1532g0 = (InterfaceC1532g0) jade2;
        boolean golf2 = c0585q.golf(interfaceC1532g0) | c0585q.golf(c0Var);
        Object jade3 = c0585q.jade();
        if (golf2 || jade3 == asVar) {
            jade3 = new a0(interfaceC1532g0, c0Var);
            c0585q.f(jade3);
        }
        a0 a0Var = (a0) jade3;
        d.K k6 = (d.K) ((t0) axVar).getValue();
        if (!this.purple || ((n0) c0Var.bravo).juliet() == 0.0f) {
            z11 = false;
        }
        T.s bravo = androidx.compose.foundation.gestures.a.bravo(a0Var, k6, z11, z10, this.red);
        c0585q.quebec(false);
        return bravo;
    }
}
