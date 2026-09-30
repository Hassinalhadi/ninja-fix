package p6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.identity.zzei;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
public final class ab extends AbstractC1394y {
    public ab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 3);
    }

    public final void magenta(zzei zzeiVar) {
        Parcel ivory = ivory();
        e.bravo(ivory, zzeiVar);
        lavender(ivory, 59);
    }

    public final void maroon(zzee zzeeVar, LocationRequest locationRequest, l lVar) {
        Parcel ivory = ivory();
        e.bravo(ivory, zzeeVar);
        e.bravo(ivory, locationRequest);
        ivory.writeStrongBinder(lVar);
        lavender(ivory, 88);
    }
}
