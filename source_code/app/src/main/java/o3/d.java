package o3;

import android.location.GnssStatus;
import android.location.GnssStatus$Callback;
import kotlin.jvm.internal.Intrinsics;
import xf.q;
import xf.r;

/* loaded from: classes3.dex */
public final class d extends GnssStatus$Callback {
    public final /* synthetic */ r alpha;

    public d(r rVar) {
        this.alpha = rVar;
    }

    public final void onSatelliteStatusChanged(GnssStatus status) {
        int satelliteCount;
        boolean usedInFix;
        Intrinsics.echo(status, "status");
        satelliteCount = status.getSatelliteCount();
        int i4 = 0;
        int i5 = 0;
        for (int i10 = 0; i10 < satelliteCount; i10++) {
            i5++;
            usedInFix = status.usedInFix(i10);
            if (usedInFix) {
                i4++;
            }
        }
        ((q) this.alpha).mike(new a(i4, i5, System.currentTimeMillis()));
    }
}
