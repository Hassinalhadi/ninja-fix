package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.measurement.internal.C1467s;
import com.google.android.gms.measurement.internal.C1471u;
import com.google.android.gms.measurement.internal.C1473v;
import p6.C2283d;

/* loaded from: classes2.dex */
public class LocationServices {

    @Deprecated
    public static final com.google.android.gms.common.api.e API = C2283d.india;

    @Deprecated
    public static final c FusedLocationApi = new C1467s(13);

    @Deprecated
    public static final e GeofencingApi = new C1471u(14);

    @Deprecated
    public static final i SettingsApi = new C1473v(14);

    private LocationServices() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.g, com.google.android.gms.location.FusedLocationProviderClient] */
    public static FusedLocationProviderClient getFusedLocationProviderClient(Activity activity) {
        return new com.google.android.gms.common.api.g(activity, activity, C2283d.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.g, com.google.android.gms.location.d] */
    public static d getFusedOrientationProviderClient(Activity activity) {
        return new com.google.android.gms.common.api.g(activity, activity, C2283d.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.g, com.google.android.gms.location.GeofencingClient] */
    public static GeofencingClient getGeofencingClient(Activity activity) {
        return new com.google.android.gms.common.api.g(activity, activity, C2283d.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.g, com.google.android.gms.location.j] */
    public static j getSettingsClient(Activity activity) {
        return new com.google.android.gms.common.api.g(activity, activity, C2283d.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.g, com.google.android.gms.location.FusedLocationProviderClient] */
    public static FusedLocationProviderClient getFusedLocationProviderClient(Context context) {
        return new com.google.android.gms.common.api.g(context, null, C2283d.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.g, com.google.android.gms.location.d] */
    public static d getFusedOrientationProviderClient(Context context) {
        return new com.google.android.gms.common.api.g(context, null, C2283d.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.g, com.google.android.gms.location.GeofencingClient] */
    public static GeofencingClient getGeofencingClient(Context context) {
        return new com.google.android.gms.common.api.g(context, null, C2283d.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.g, com.google.android.gms.location.j] */
    public static j getSettingsClient(Context context) {
        return new com.google.android.gms.common.api.g(context, null, C2283d.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
    }
}
