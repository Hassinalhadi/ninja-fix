package bz;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.C1480y0;
import com.google.android.gms.measurement.internal.N0;
import com.google.android.gms.measurement.internal.O0;
import com.google.android.gms.measurement.internal.d1;

/* loaded from: classes3.dex */
public final class m0 implements i0 {
    public long alpha;
    public long purple;
    public final Object red;
    public final Object silver;

    public m0(O0 o02) {
        this.silver = o02;
        this.red = new N0(this, (com.google.android.gms.measurement.internal.G) o02.alpha, 0);
        ((com.google.android.gms.measurement.internal.G) o02.alpha).f7511g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.alpha = elapsedRealtime;
        this.purple = elapsedRealtime;
    }

    @Override // bz.i0
    public boolean alpha() {
        return true;
    }

    @Override // bz.i0
    public long amber(r rVar, r rVar2, r rVar3) {
        return Long.MAX_VALUE;
    }

    public long bravo(long j5) {
        long j6 = this.purple;
        if (j5 + j6 <= 0) {
            return 0L;
        }
        long j7 = j5 + j6;
        long j10 = this.alpha;
        long j11 = j7 / j10;
        if (((at) this.silver) != at.alpha && j11 % 2 != 0) {
            return ((j11 + 1) * j10) - j7;
        }
        Long.signum(j11);
        return j7 - (j11 * j10);
    }

    public r charlie(long j5, r rVar, r rVar2, r rVar3) {
        long j6 = this.purple;
        long j7 = j5 + j6;
        long j10 = this.alpha;
        if (j7 > j10) {
            return ((k0) this.red).gray(j10 - j6, rVar, rVar3, rVar2);
        }
        return rVar2;
    }

    @Override // bz.i0
    public r delta(r rVar, r rVar2, r rVar3) {
        return gray(Long.MAX_VALUE, rVar, rVar2, rVar3);
    }

    public boolean echo(long j5, boolean z2, boolean z10) {
        O0 o02 = (O0) this.silver;
        o02.W();
        o02.X();
        com.google.android.gms.measurement.internal.G g2 = (com.google.android.gms.measurement.internal.G) o02.alpha;
        if (g2.alpha()) {
            com.google.android.gms.measurement.internal.ax axVar = g2.f7506a;
            com.google.android.gms.measurement.internal.G.delta(axVar);
            g2.f7511g.getClass();
            axVar.f7646j.bravo(System.currentTimeMillis());
        }
        long j6 = j5 - this.alpha;
        com.google.android.gms.measurement.internal.ar arVar = g2.f7507b;
        if (!z2 && j6 < 1000) {
            com.google.android.gms.measurement.internal.G.foxtrot(arVar);
            arVar.f7636g.bravo(Long.valueOf(j6), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j6 = j5 - this.purple;
            this.purple = j5;
        }
        com.google.android.gms.measurement.internal.G.foxtrot(arVar);
        arVar.f7636g.bravo(Long.valueOf(j6), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j6);
        boolean z11 = !g2.yellow.k0();
        C1480y0 c1480y0 = g2.f7512h;
        com.google.android.gms.measurement.internal.G.echo(c1480y0);
        d1.m0(c1480y0.d0(z11), bundle, true);
        if (!z10) {
            C1459n0 c1459n0 = g2.f7513i;
            com.google.android.gms.measurement.internal.G.echo(c1459n0);
            c1459n0.h0("auto", "_e", bundle);
        }
        this.alpha = j5;
        N0 n02 = (N0) this.red;
        n02.alpha();
        n02.charlie(((Long) com.google.android.gms.measurement.internal.ac.f7600i.alpha(null)).longValue());
        return true;
    }

    @Override // bz.i0
    public r foxtrot(long j5, r rVar, r rVar2, r rVar3) {
        return ((k0) this.red).foxtrot(bravo(j5), rVar, rVar2, charlie(j5, rVar, rVar3, rVar2));
    }

    @Override // bz.i0
    public r gray(long j5, r rVar, r rVar2, r rVar3) {
        return ((k0) this.red).gray(bravo(j5), rVar, rVar2, charlie(j5, rVar, rVar3, rVar2));
    }

    public m0(k0 k0Var, at atVar, long j5) {
        this.red = k0Var;
        this.silver = atVar;
        this.alpha = (k0Var.lavender() + k0Var.jade()) * 1000000;
        this.purple = j5 * 1000000;
    }
}
