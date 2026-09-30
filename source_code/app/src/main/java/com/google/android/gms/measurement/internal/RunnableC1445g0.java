package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1445g0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ C1459n0 red;

    public /* synthetic */ RunnableC1445g0(C1459n0 c1459n0, long j5, int i4) {
        this.alpha = i4;
        this.purple = j5;
        this.red = c1459n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j5;
        switch (this.alpha) {
            case 0:
                G g2 = (G) this.red.alpha;
                ax axVar = g2.f7506a;
                G.delta(axVar);
                aw awVar = axVar.e;
                long j6 = this.purple;
                awVar.bravo(j6);
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7635f.bravo(Long.valueOf(j6), "Session timeout duration set");
                return;
            default:
                C1459n0 c1459n0 = this.red;
                c1459n0.W();
                c1459n0.X();
                G g5 = (G) c1459n0.alpha;
                ar arVar2 = g5.f7507b;
                G.foxtrot(arVar2);
                arVar2.f7635f.alpha("Resetting analytics data (FE)");
                O0 o02 = g5.f7509d;
                G.echo(o02);
                o02.W();
                bz.m0 m0Var = o02.white;
                ((N0) m0Var.red).alpha();
                G g10 = (G) ((O0) m0Var.silver).alpha;
                if (g10.yellow.j0(null, ac.f7579U)) {
                    g10.f7511g.getClass();
                    j5 = SystemClock.elapsedRealtime();
                    m0Var.alpha = j5;
                } else {
                    m0Var.alpha = 0L;
                    j5 = 0;
                }
                m0Var.purple = j5;
                g5.india().e0();
                boolean z2 = !g5.alpha();
                ax axVar2 = g5.f7506a;
                G.delta(axVar2);
                axVar2.yellow.bravo(this.purple);
                G g11 = (G) axVar2.alpha;
                ax axVar3 = g11.f7506a;
                G.delta(axVar3);
                if (!TextUtils.isEmpty(axVar3.f7652p.november())) {
                    axVar2.f7652p.oscar(null);
                }
                axVar2.f7646j.bravo(0L);
                axVar2.f7647k.bravo(0L);
                if (!g11.yellow.X()) {
                    axVar2.e0(z2);
                }
                axVar2.f7653q.oscar(null);
                axVar2.f7654r.bravo(0L);
                axVar2.f7655s.uniform(null);
                H0 mike = g5.mike();
                mike.W();
                mike.X();
                zzr k02 = mike.k0(false);
                mike.o0();
                ((G) mike.alpha).juliet().b0();
                mike.n0(new s6.E(12, mike, k02, false));
                G.echo(o02);
                o02.teal.blue();
                c1459n0.f7683l = z2;
                g5.mike().c0(new AtomicReference());
                return;
        }
    }
}
