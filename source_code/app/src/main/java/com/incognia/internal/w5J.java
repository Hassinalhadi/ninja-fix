package com.incognia.internal;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import h9.C1820A;
import h9.am;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class w5J implements LocationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tNn f11598b;

    public w5J(tNn tnn) {
        this.f11598b = tnn;
    }

    public static final void W(tNn tnn, String str) {
        Iterator it = tnn.f11372R.iterator();
        while (it.hasNext()) {
            ((toE) it.next()).b(str, true);
        }
    }

    public static final void b(tNn tnn, Location location) {
        BGx b2 = tnn.olU.b(new Pair(location, tnn.gmP.b(location)));
        Iterator it = tnn.f11372R.iterator();
        while (it.hasNext()) {
            ((toE) it.next()).b(b2);
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        tNn tnn = this.f11598b;
        njO.b(tnn, new am(18, tnn, location));
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        tNn tnn = this.f11598b;
        njO.b(tnn, new C1820A(tnn, str, 1));
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        tNn tnn = this.f11598b;
        njO.b(tnn, new C1820A(tnn, str, 0));
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i4, Bundle bundle) {
    }

    public static final void b(tNn tnn, String str) {
        Iterator it = tnn.f11372R.iterator();
        while (it.hasNext()) {
            ((toE) it.next()).b(str, false);
        }
    }
}
