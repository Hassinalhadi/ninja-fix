package n;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2901T;
import t0.C2917h0;
import t0.E0;

/* loaded from: classes3.dex */
public final class M implements Xd.m {
    public final /* synthetic */ a0.au alpha;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ I0.aa red;
    public final /* synthetic */ I0.t silver;

    public M(a0.au auVar, ax axVar, I0.aa aaVar, I0.t tVar) {
        this.alpha = auVar;
        this.purple = axVar;
        this.red = aaVar;
        this.silver = tVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        Object obj4;
        T.s sVar = (T.s) obj;
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        c0585q.purple(-84507373);
        boolean booleanValue = ((Boolean) c0585q.kilo(AbstractC2901T.whiskey)).booleanValue();
        boolean hotel = c0585q.hotel(booleanValue);
        Object jade = c0585q.jade();
        Object obj5 = C0580l.alpha;
        if (hotel || jade == obj5) {
            jade = new w.k(booleanValue);
            c0585q.f(jade);
        }
        w.k kVar = (w.k) jade;
        a0.au auVar = this.alpha;
        if (auVar.alpha == 16) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (((Boolean) ((t0) ((C2917h0) ((E0) c0585q.kilo(AbstractC2901T.tango))).alpha).getValue()).booleanValue()) {
            ax axVar = this.purple;
            if (axVar.bravo()) {
                I0.aa aaVar = this.red;
                long j5 = aaVar.bravo;
                if (D0.am.charlie(j5) && z2) {
                    c0585q.purple(-707487962);
                    D0.am amVar = new D0.am(j5);
                    boolean india = c0585q.india(kVar);
                    Object jade2 = c0585q.jade();
                    if (india || jade2 == obj5) {
                        jade2 = new L(kVar, null);
                        c0585q.f(jade2);
                    }
                    C0564b.golf(aaVar.alpha, amVar, (Xd.l) jade2, c0585q);
                    boolean india2 = c0585q.india(kVar) | c0585q.india(this.silver) | c0585q.golf(aaVar) | c0585q.india(axVar) | c0585q.golf(auVar);
                    Object jade3 = c0585q.jade();
                    if (india2 || jade3 == obj5) {
                        Object dVar = new Ec.d(kVar, this.silver, aaVar, axVar, auVar, 4);
                        c0585q.f(dVar);
                        jade3 = dVar;
                    }
                    obj4 = androidx.compose.ui.draw.a.charlie(sVar, (Function1) jade3);
                    c0585q.quebec(false);
                    c0585q.quebec(false);
                    return obj4;
                }
            }
        }
        c0585q.purple(-705473241);
        c0585q.quebec(false);
        obj4 = T.p.alpha;
        c0585q.quebec(false);
        return obj4;
    }
}
