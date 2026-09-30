package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1464q extends AbstractC1479y {
    public final bv.e purple;
    public final bv.e red;
    public long silver;

    /* JADX WARN: Type inference failed for: r2v1, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bv.e, bv.aw] */
    public C1464q(G g2) {
        super(g2);
        this.red = new bv.aw(0);
        this.purple = new bv.aw(0);
    }

    public final void X(long j5, String str) {
        G g2 = (G) this.alpha;
        if (str != null && str.length() != 0) {
            E e = g2.f7508c;
            G.foxtrot(e);
            e.g0(new RunnableC1432a(this, str, j5, 0));
        } else {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Ad unit id must be a non-empty string");
        }
    }

    public final void Y(long j5, String str) {
        G g2 = (G) this.alpha;
        if (str != null && str.length() != 0) {
            E e = g2.f7508c;
            G.foxtrot(e);
            e.g0(new RunnableC1432a(this, str, j5, 1));
        } else {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Ad unit id must be a non-empty string");
        }
    }

    public final void Z(long j5) {
        C1480y0 c1480y0 = ((G) this.alpha).f7512h;
        G.echo(c1480y0);
        C1474v0 d02 = c1480y0.d0(false);
        bv.e eVar = this.purple;
        Iterator it = ((bv.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            b0(str, j5 - ((Long) eVar.get(str)).longValue(), d02);
        }
        if (!eVar.isEmpty()) {
            a0(j5 - this.silver, d02);
        }
        c0(j5);
    }

    public final void a0(long j5, C1474v0 c1474v0) {
        G g2 = (G) this.alpha;
        if (c1474v0 == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7636g.alpha("Not logging ad exposure. No active activity");
        } else {
            if (j5 < 1000) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.f7636g.bravo(Long.valueOf(j5), "Not logging ad exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j5);
            d1.m0(c1474v0, bundle, true);
            C1459n0 c1459n0 = g2.f7513i;
            G.echo(c1459n0);
            c1459n0.h0("am", "_xa", bundle);
        }
    }

    public final void b0(String str, long j5, C1474v0 c1474v0) {
        G g2 = (G) this.alpha;
        if (c1474v0 == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7636g.alpha("Not logging ad unit exposure. No active activity");
        } else {
            if (j5 < 1000) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.f7636g.bravo(Long.valueOf(j5), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j5);
            d1.m0(c1474v0, bundle, true);
            C1459n0 c1459n0 = g2.f7513i;
            G.echo(c1459n0);
            c1459n0.h0("am", "_xu", bundle);
        }
    }

    public final void c0(long j5) {
        bv.e eVar = this.purple;
        Iterator it = ((bv.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j5));
        }
        if (!eVar.isEmpty()) {
            this.silver = j5;
        }
    }
}
