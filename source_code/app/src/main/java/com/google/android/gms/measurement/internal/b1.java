package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class b1 implements X {
    public final com.google.android.gms.internal.measurement.as alpha;
    public final /* synthetic */ AppMeasurementDynamiteService bravo;

    public b1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.as asVar) {
        this.bravo = appMeasurementDynamiteService;
        this.alpha = asVar;
    }

    @Override // com.google.android.gms.measurement.internal.X
    public final void alpha(long j5, Bundle bundle, String str, String str2) {
        try {
            this.alpha.mike(j5, bundle, str, str2);
        } catch (RemoteException e) {
            G g2 = this.bravo.golf;
            if (g2 != null) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.bravo(e, "Event listener threw exception");
            }
        }
    }
}
