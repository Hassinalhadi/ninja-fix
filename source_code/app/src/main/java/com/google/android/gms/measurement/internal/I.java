package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1314f0;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ zzr purple;
    public final /* synthetic */ O red;

    public /* synthetic */ I(O o5, zzr zzrVar, int i4) {
        this.alpha = i4;
        this.red = o5;
        this.purple = zzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                Z0 z02 = this.red.golf;
                z02.echo();
                z02.jade(this.purple);
                return;
            case 1:
                O o5 = this.red;
                o5.golf.echo();
                Z0 z03 = o5.golf;
                ao.ad.crimson(z03);
                zzr zzrVar = this.purple;
                V5.x.hotel(zzrVar);
                String str = zzrVar.alpha;
                V5.x.echo(str);
                int i4 = 0;
                if (z03.white().j0(null, ac.f7612r)) {
                    z03.pink().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int c02 = z03.white().c0(null, ac.f7585a);
                    z03.white();
                    long longValue = currentTimeMillis - ((Long) ac.echo.alpha(null)).longValue();
                    while (i4 < c02 && z03.beige(longValue, null)) {
                        i4++;
                    }
                } else {
                    z03.white();
                    long intValue = ((Integer) ac.lima.alpha(null)).intValue();
                    while (i4 < intValue && z03.beige(0L, str)) {
                        i4++;
                    }
                }
                if (z03.white().j0(null, ac.f7613s)) {
                    z03.u().W();
                    z03.amber();
                }
                if (z03.white().j0(null, ac.f7569J)) {
                    int echo = ao.ad.echo(zzrVar.f7721z);
                    W0 w02 = z03.f7540c;
                    w02.W();
                    if (((G) w02.alpha).yellow.j0(null, ac.f7568I) && echo == 2 && !W0.Z(str)) {
                        A a6 = w02.purple.alpha;
                        Z0.cyan(a6);
                        C1314f0 l02 = a6.l0(str);
                        if (l02 != null && l02.coral() && !l02.uniform().quebec().isEmpty()) {
                            z03.crimson().f7636g.bravo(str, "[sgtm] Going background, trigger client side upload. appId");
                            z03.pink().getClass();
                            z03.ochre(System.currentTimeMillis(), str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                O o10 = this.red;
                o10.golf.echo();
                Z0 z04 = o10.golf;
                ao.ad.crimson(z04);
                zzr zzrVar2 = this.purple;
                V5.x.echo(zzrVar2.alpha);
                z04.silver(zzrVar2);
                return;
        }
    }
}
