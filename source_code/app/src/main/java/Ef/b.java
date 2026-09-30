package Ef;

import Af.r;
import Af.t;
import Cb.ad;
import Ec.af;
import Xd.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import vf.C3207k;
import vf.InterfaceC3206j;
import vf.j0;

/* loaded from: classes2.dex */
public final class b implements InterfaceC3206j, j0 {
    public final C3207k alpha;
    public final /* synthetic */ c purple;

    public b(c cVar, C3207k c3207k) {
        this.purple = cVar;
        this.alpha = c3207k;
    }

    @Override // vf.j0
    public final void alpha(r rVar, int i4) {
        this.alpha.alpha(rVar, i4);
    }

    @Override // vf.InterfaceC3206j
    public final boolean delta(Throwable th) {
        return this.alpha.delta(th);
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return this.alpha.teal;
    }

    @Override // vf.InterfaceC3206j
    public final void hotel(Object obj, m mVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.hotel;
        c cVar = this.purple;
        atomicReferenceFieldUpdater.set(cVar, null);
        ad adVar = new ad(3, cVar, this);
        C3207k c3207k = this.alpha;
        c3207k.azure((Unit) obj, c3207k.red, new Cb.d(21, adVar));
    }

    @Override // vf.InterfaceC3206j
    public final boolean isCancelled() {
        return this.alpha.isCancelled();
    }

    @Override // vf.InterfaceC3206j
    public final t kilo(Object obj, m mVar) {
        c cVar = this.purple;
        af afVar = new af(1, cVar, this);
        t blue = this.alpha.blue((Unit) obj, afVar);
        if (blue != null) {
            c.hotel.set(cVar, null);
        }
        return blue;
    }

    @Override // vf.InterfaceC3206j
    public final boolean lima() {
        return this.alpha.lima();
    }

    @Override // vf.InterfaceC3206j
    public final void oscar(Object obj) {
        this.alpha.oscar(obj);
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        this.alpha.resumeWith(obj);
    }
}
