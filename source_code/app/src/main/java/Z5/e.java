package Z5;

import G6.h;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import m6.AbstractBinderC2100a;
import m6.AbstractC2101b;
import s6.AbstractC2833z7;

/* loaded from: classes2.dex */
public final class e extends AbstractBinderC2100a implements c {
    public final /* synthetic */ int hotel;
    public final /* synthetic */ h india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i4, h hVar) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 0);
        this.hotel = i4;
        this.india = hVar;
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean ivory(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return false;
                    }
                    AbstractC2101b.bravo(parcel);
                    throw new UnsupportedOperationException();
                }
                AbstractC2101b.bravo(parcel);
                throw new UnsupportedOperationException();
            }
            Status status = (Status) AbstractC2101b.alpha(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) AbstractC2101b.alpha(parcel, ModuleInstallResponse.CREATOR);
            AbstractC2101b.bravo(parcel);
            victor(status, moduleInstallResponse);
            return true;
        }
        Status status2 = (Status) AbstractC2101b.alpha(parcel, Status.CREATOR);
        ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) AbstractC2101b.alpha(parcel, ModuleAvailabilityResponse.CREATOR);
        AbstractC2101b.bravo(parcel);
        xray(status2, moduleAvailabilityResponse);
        return true;
    }

    @Override // Z5.c
    public void victor(Status status, ModuleInstallResponse moduleInstallResponse) {
        switch (this.hotel) {
            case 1:
                AbstractC2833z7.delta(status, moduleInstallResponse, this.india);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // Z5.c
    public void xray(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        switch (this.hotel) {
            case 0:
                AbstractC2833z7.delta(status, moduleAvailabilityResponse, this.india);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
