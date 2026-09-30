package A6;

import V5.x;
import android.os.Bundle;
import android.os.SystemClock;
import ao.d;
import bv.aw;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.C1464q;
import com.google.android.gms.measurement.internal.C1474v0;
import com.google.android.gms.measurement.internal.C1480y0;
import com.google.android.gms.measurement.internal.E;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.RunnableC1449i0;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.zzqb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import r6.u;

/* loaded from: classes2.dex */
public final class a extends c {
    public final G alpha;
    public final C1459n0 bravo;

    public a(G g2) {
        x.hotel(g2);
        this.alpha = g2;
        C1459n0 c1459n0 = g2.f7513i;
        G.echo(c1459n0);
        this.bravo = c1459n0;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final String alpha() {
        return (String) this.bravo.yellow.get();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final String bravo() {
        C1480y0 c1480y0 = ((G) this.bravo.alpha).f7512h;
        G.echo(c1480y0);
        C1474v0 c1474v0 = c1480y0.red;
        if (c1474v0 != null) {
            return c1474v0.bravo;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final List charlie(String str, String str2) {
        C1459n0 c1459n0 = this.bravo;
        G g2 = (G) c1459n0.alpha;
        E e = g2.f7508c;
        G.foxtrot(e);
        boolean i02 = e.i0();
        ar arVar = g2.f7507b;
        if (i02) {
            G.foxtrot(arVar);
            arVar.white.alpha("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (u.mike()) {
            G.foxtrot(arVar);
            arVar.white.alpha("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        E e4 = g2.f7508c;
        G.foxtrot(e4);
        e4.b0(atomicReference, 5000L, "get conditional user properties", new d(c1459n0, atomicReference, str, str2, 4));
        List list = (List) atomicReference.get();
        if (list == null) {
            G.foxtrot(arVar);
            arVar.white.bravo(null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
        return d1.j0(list);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map, bv.aw] */
    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final Map delta(String str, String str2, boolean z2) {
        C1459n0 c1459n0 = this.bravo;
        G g2 = (G) c1459n0.alpha;
        E e = g2.f7508c;
        G.foxtrot(e);
        boolean i02 = e.i0();
        ar arVar = g2.f7507b;
        if (i02) {
            G.foxtrot(arVar);
            arVar.white.alpha("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (u.mike()) {
            G.foxtrot(arVar);
            arVar.white.alpha("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        E e4 = g2.f7508c;
        G.foxtrot(e4);
        e4.b0(atomicReference, 5000L, "get user properties", new RunnableC1449i0(c1459n0, atomicReference, str, str2, z2, 1));
        List<zzqb> list = (List) atomicReference.get();
        if (list == null) {
            G.foxtrot(arVar);
            arVar.white.bravo(Boolean.valueOf(z2), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ?? awVar = new aw(list.size());
        for (zzqb zzqbVar : list) {
            Object o5 = zzqbVar.o();
            if (o5 != null) {
                awVar.put(zzqbVar.purple, o5);
            }
        }
        return awVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void echo(Bundle bundle) {
        C1459n0 c1459n0 = this.bravo;
        ((G) c1459n0.alpha).f7511g.getClass();
        c1459n0.l0(bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void foxtrot(String str, String str2, Bundle bundle) {
        C1459n0 c1459n0 = this.bravo;
        ((G) c1459n0.alpha).f7511g.getClass();
        c1459n0.g0(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void golf(String str) {
        G g2 = this.alpha;
        C1464q c1464q = g2.f7514j;
        G.charlie(c1464q);
        g2.f7511g.getClass();
        c1464q.X(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void hotel(String str, String str2, Bundle bundle) {
        C1459n0 c1459n0 = this.alpha.f7513i;
        G.echo(c1459n0);
        c1459n0.c0(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final void india(String str) {
        G g2 = this.alpha;
        C1464q c1464q = g2.f7514j;
        G.charlie(c1464q);
        g2.f7511g.getClass();
        c1464q.Y(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final int juliet(String str) {
        C1459n0 c1459n0 = this.bravo;
        c1459n0.getClass();
        x.echo(str);
        ((G) c1459n0.alpha).getClass();
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final String kilo() {
        C1480y0 c1480y0 = ((G) this.bravo.alpha).f7512h;
        G.echo(c1480y0);
        C1474v0 c1474v0 = c1480y0.red;
        if (c1474v0 != null) {
            return c1474v0.alpha;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final String lima() {
        return (String) this.bravo.yellow.get();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1461o0
    public final long zzb() {
        d1 d1Var = this.alpha.e;
        G.delta(d1Var);
        return d1Var.h1();
    }
}
