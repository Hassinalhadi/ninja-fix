package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class an extends V5.e {
    @Override // V5.e, com.google.android.gms.common.api.c
    public final int hotel() {
        return com.google.android.gms.common.e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // V5.e
    public final /* synthetic */ IInterface oscar(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof ae) {
            return (ae) queryLocalInterface;
        }
        return new ad(iBinder);
    }

    @Override // V5.e
    public final String uniform() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // V5.e
    public final String victor() {
        return "com.google.android.gms.measurement.START";
    }
}
