package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class N0 extends AbstractC1452k {
    public final /* synthetic */ int echo;
    public final /* synthetic */ Object foxtrot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N0(Object obj, Q q4, int i4) {
        super(q4);
        this.echo = i4;
        this.foxtrot = obj;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1452k
    public final void bravo() {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        switch (this.echo) {
            case 0:
                bz.m0 m0Var = (bz.m0) this.foxtrot;
                O0 o02 = (O0) m0Var.silver;
                o02.W();
                G g2 = (G) o02.alpha;
                g2.f7511g.getClass();
                m0Var.echo(SystemClock.elapsedRealtime(), false, false);
                C1464q c1464q = g2.f7514j;
                G.charlie(c1464q);
                g2.f7511g.getClass();
                c1464q.Z(SystemClock.elapsedRealtime());
                return;
            case 1:
                S0 s02 = (S0) this.foxtrot;
                s02.a0();
                ar arVar = ((G) s02.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.f7636g.alpha("Starting upload from DelayedRunnable");
                s02.purple.navy();
                return;
            default:
                Z0 z02 = (Z0) this.foxtrot;
                z02.u().W();
                String str = (String) z02.f7546j.pollFirst();
                if (str != null) {
                    z02.pink().getClass();
                    z02.B = SystemClock.elapsedRealtime();
                    z02.crimson().f7636g.bravo(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = z02.e.alpha;
                    if (Build.VERSION.SDK_INT >= 34) {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                    } else {
                        context.sendBroadcast(intent);
                    }
                }
                z02.amber();
                return;
        }
    }
}
