package com.incognia.internal;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

/* loaded from: classes2.dex */
public final class N8B {

    /* renamed from: b, reason: collision with root package name */
    public final FusedLocationProviderClient f9186b;

    public N8B(Context context) {
        this.f9186b = LocationServices.getFusedLocationProviderClient(context);
    }
}
