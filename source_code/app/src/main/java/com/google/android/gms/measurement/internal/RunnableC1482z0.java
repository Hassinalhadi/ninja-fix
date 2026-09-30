package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1482z0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ H0 purple;

    public /* synthetic */ RunnableC1482z0(H0 h02, int i4) {
        this.alpha = i4;
        this.purple = h02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                H0 h02 = this.purple;
                ae aeVar = h02.silver;
                G g2 = (G) h02.alpha;
                if (aeVar == null) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.white.alpha("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    aeVar.crimson(h02.k0(false));
                    h02.m0();
                    return;
                } catch (RemoteException e) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.bravo(e, "Failed to send storage consent settings to the service");
                    return;
                }
            case 1:
                H0 h03 = this.purple;
                ae aeVar2 = h03.silver;
                G g5 = (G) h03.alpha;
                if (aeVar2 == null) {
                    ar arVar3 = g5.f7507b;
                    G.foxtrot(arVar3);
                    arVar3.white.alpha("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    aeVar2.quebec(h03.k0(false));
                    h03.m0();
                    return;
                } catch (RemoteException e4) {
                    ar arVar4 = g5.f7507b;
                    G.foxtrot(arVar4);
                    arVar4.white.bravo(e4, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                this.purple.a0();
                return;
        }
    }
}
