package p6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class y extends V5.f {
    @Override // V5.e, com.google.android.gms.common.api.c
    public final int hotel() {
        return 11717000;
    }

    @Override // V5.e
    public final /* synthetic */ IInterface oscar(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof ab) {
            return (ab) queryLocalInterface;
        }
        return new ab(iBinder);
    }

    @Override // V5.e
    public final Feature[] quebec() {
        return com.google.android.gms.location.n.hotel;
    }

    @Override // V5.e
    public final Bundle romeo() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "activity_recognition");
        return bundle;
    }

    @Override // V5.e
    public final String uniform() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // V5.e
    public final String victor() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // V5.e
    public final boolean yankee() {
        return true;
    }
}
