package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class D0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ zzr purple;
    public final /* synthetic */ H0 red;

    public /* synthetic */ D0(H0 h02, zzr zzrVar, int i4) {
        this.alpha = i4;
        this.purple = zzrVar;
        this.red = h02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                H0 h02 = this.red;
                ae aeVar = h02.silver;
                G g2 = (G) h02.alpha;
                if (aeVar == null) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.white.alpha("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    zzr zzrVar = this.purple;
                    C1440e c1440e = g2.yellow;
                    ab abVar = ac.f7593e0;
                    if (c1440e.j0(null, abVar)) {
                        h02.d0(aeVar, null, zzrVar);
                    }
                    aeVar.yankee(zzrVar);
                    g2.juliet().c0();
                    g2.yellow.j0(null, abVar);
                    h02.d0(aeVar, null, zzrVar);
                    h02.m0();
                    return;
                } catch (RemoteException e) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.bravo(e, "Failed to send app launch to the service");
                    return;
                }
            default:
                H0 h03 = this.red;
                ae aeVar2 = h03.silver;
                G g5 = (G) h03.alpha;
                if (aeVar2 == null) {
                    ar arVar3 = g5.f7507b;
                    G.foxtrot(arVar3);
                    arVar3.white.alpha("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    aeVar2.uniform(this.purple);
                    h03.m0();
                    return;
                } catch (RemoteException e4) {
                    ar arVar4 = g5.f7507b;
                    G.foxtrot(arVar4);
                    arVar4.white.bravo(e4, "Failed to send measurementEnabled to the service");
                    return;
                }
        }
    }
}
