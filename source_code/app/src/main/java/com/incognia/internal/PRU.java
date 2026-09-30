package com.incognia.internal;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class PRU implements LocationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fmh f9421b;

    public PRU(fmh fmhVar) {
        this.f9421b = fmhVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.f9421b.invoke(location);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i4, Bundle bundle) {
    }
}
