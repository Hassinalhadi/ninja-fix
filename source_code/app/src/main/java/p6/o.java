package p6;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import g.C1718a;
import m6.AbstractBinderC2100a;

/* loaded from: classes2.dex */
public final class o extends AbstractBinderC2100a implements com.google.android.gms.location.r {
    public static final /* synthetic */ int india = 0;
    public final n hotel;

    public o(n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 2);
        this.hotel = nVar;
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean lavender(Parcel parcel, int i4) {
        n nVar = this.hotel;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return false;
                }
                zzf();
                return true;
            }
            LocationAvailability locationAvailability = (LocationAvailability) e.alpha(parcel, LocationAvailability.CREATOR);
            e.charlie(parcel);
            nVar.zza().bravo(new C1718a(17, locationAvailability));
            return true;
        }
        LocationResult locationResult = (LocationResult) e.alpha(parcel, LocationResult.CREATOR);
        e.charlie(parcel);
        nVar.zza().bravo(new com.google.android.material.internal.s(24, locationResult));
        return true;
    }

    public final void zzf() {
        this.hotel.zza().bravo(new com.google.android.material.internal.s(25, this));
    }
}
