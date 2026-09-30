package com.google.android.gms.common.internal;

import V5.x;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class zzaj extends Exception {
    public final ConnectionResult zza;

    public zzaj(ConnectionResult connectionResult) {
        boolean z2;
        if (connectionResult.purple != 0 && connectionResult.red != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.alpha("ResolvableConnectionException can only be created with a connection result containing a resolution.", z2);
        this.zza = connectionResult;
    }
}
