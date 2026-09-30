package p6;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsResult;
import m6.AbstractBinderC2100a;
import s6.AbstractC2833z7;

/* loaded from: classes2.dex */
public final class j extends AbstractBinderC2100a {
    public final /* synthetic */ int hotel;
    public final /* synthetic */ G6.h india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i4, G6.h hVar) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 2);
        this.hotel = i4;
        switch (i4) {
            case 1:
                this.india = hVar;
                super("com.google.android.gms.location.internal.IGeofencerCallbacks", 2);
                return;
            case 2:
                this.india = hVar;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 2);
                return;
            case 3:
                this.india = hVar;
                super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback", 2);
                return;
            default:
                this.india = hVar;
                return;
        }
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean lavender(Parcel parcel, int i4) {
        switch (this.hotel) {
            case 0:
                if (i4 == 1) {
                    LocationSettingsResult locationSettingsResult = (LocationSettingsResult) e.alpha(parcel, LocationSettingsResult.CREATOR);
                    e.charlie(parcel);
                    AbstractC2833z7.charlie(locationSettingsResult.alpha, new Object(), this.india);
                    return true;
                }
                return false;
            case 1:
                G6.h hVar = this.india;
                int i5 = 13;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return false;
                        }
                        int readInt = parcel.readInt();
                        e.charlie(parcel);
                        if (readInt == 0 || (readInt >= 1000 && readInt < 1006)) {
                            i5 = readInt;
                        }
                        AbstractC2833z7.charlie(new Status(i5, null, null, null), null, hVar);
                        return true;
                    }
                    int readInt2 = parcel.readInt();
                    parcel.createStringArray();
                    e.charlie(parcel);
                    if (readInt2 == 0 || (readInt2 >= 1000 && readInt2 < 1006)) {
                        i5 = readInt2;
                    }
                    AbstractC2833z7.charlie(new Status(i5, null, null, null), null, hVar);
                    return true;
                }
                int readInt3 = parcel.readInt();
                parcel.createStringArray();
                e.charlie(parcel);
                if (readInt3 == 0 || (readInt3 >= 1000 && readInt3 < 1006)) {
                    i5 = readInt3;
                }
                AbstractC2833z7.charlie(new Status(i5, null, null, null), null, hVar);
                return true;
            case 2:
                if (i4 == 1) {
                    Status status = (Status) e.alpha(parcel, Status.CREATOR);
                    Location location = (Location) e.alpha(parcel, Location.CREATOR);
                    e.charlie(parcel);
                    AbstractC2833z7.charlie(status, location, this.india);
                    return true;
                }
                return false;
            default:
                if (i4 == 1) {
                    Status status2 = (Status) e.alpha(parcel, Status.CREATOR);
                    LocationAvailability locationAvailability = (LocationAvailability) e.alpha(parcel, LocationAvailability.CREATOR);
                    e.charlie(parcel);
                    AbstractC2833z7.charlie(status2, locationAvailability, this.india);
                    return true;
                }
                return false;
        }
    }
}
