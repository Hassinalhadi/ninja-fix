package com.google.android.gms.measurement.internal;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class L0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ O0 red;

    public /* synthetic */ L0(O0 o02, long j5, int i4) {
        this.alpha = i4;
        this.purple = j5;
        this.red = o02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r1.f7649m.charlie() != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.alpha) {
            case 0:
                O0 o02 = this.red;
                o02.W();
                o02.a0();
                G g2 = (G) o02.alpha;
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                long j5 = this.purple;
                arVar.f7636g.bravo(Long.valueOf(j5), "Activity resumed, time");
                ab abVar = ac.f7578T;
                C1440e c1440e = g2.yellow;
                boolean j02 = c1440e.j0(null, abVar);
                bz.m0 m0Var = o02.white;
                if (j02) {
                    if (c1440e.k0() || o02.silver) {
                        ((O0) m0Var.silver).W();
                        ((N0) m0Var.red).alpha();
                        m0Var.alpha = j5;
                        m0Var.purple = j5;
                    }
                } else {
                    if (!c1440e.k0()) {
                        ax axVar = g2.f7506a;
                        G.delta(axVar);
                        break;
                    }
                    ((O0) m0Var.silver).W();
                    ((N0) m0Var.red).alpha();
                    m0Var.alpha = j5;
                    m0Var.purple = j5;
                }
                J2.l lVar = o02.yellow;
                O0 o03 = (O0) lVar.purple;
                o03.W();
                M0 m02 = (M0) lVar.alpha;
                if (m02 != null) {
                    o03.red.removeCallbacks(m02);
                }
                G g5 = (G) o03.alpha;
                ax axVar2 = g5.f7506a;
                G.delta(axVar2);
                axVar2.f7649m.bravo(false);
                o03.W();
                o03.silver = false;
                if (g5.yellow.j0(null, ac.f7577S)) {
                    C1459n0 c1459n0 = g5.f7513i;
                    G.echo(c1459n0);
                    if (c1459n0.f7678g) {
                        ar arVar2 = g5.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.f7636g.alpha("Retrying trigger URI registration in foreground");
                        G.echo(c1459n0);
                        c1459n0.k0();
                    }
                }
                androidx.core.widget.f fVar = o02.teal;
                O0 o04 = (O0) fVar.purple;
                o04.W();
                G g10 = (G) o04.alpha;
                if (g10.alpha()) {
                    g10.f7511g.getClass();
                    fVar.coral(System.currentTimeMillis());
                    return;
                }
                return;
            default:
                O0 o05 = this.red;
                o05.W();
                o05.a0();
                G g11 = (G) o05.alpha;
                ar arVar3 = g11.f7507b;
                G.foxtrot(arVar3);
                long j6 = this.purple;
                arVar3.f7636g.bravo(Long.valueOf(j6), "Activity paused, time");
                J2.l lVar2 = o05.yellow;
                O0 o06 = (O0) lVar2.purple;
                ((G) o06.alpha).f7511g.getClass();
                M0 m03 = new M0(lVar2, System.currentTimeMillis(), j6);
                lVar2.alpha = m03;
                o06.red.postDelayed(m03, Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);
                if (g11.yellow.k0()) {
                    ((N0) o05.white.red).alpha();
                    return;
                }
                return;
        }
    }
}
