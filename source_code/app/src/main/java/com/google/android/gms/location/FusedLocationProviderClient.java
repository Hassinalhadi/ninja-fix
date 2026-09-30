package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface FusedLocationProviderClient extends com.google.android.gms.common.api.k {

    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @Deprecated
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    Task flushLocations();

    @Override // com.google.android.gms.common.api.k
    /* synthetic */ T5.b getApiKey();

    Task getCurrentLocation(int i4, G6.a aVar);

    Task getCurrentLocation(CurrentLocationRequest currentLocationRequest, G6.a aVar);

    Task getLastLocation();

    Task getLastLocation(LastLocationRequest lastLocationRequest);

    Task getLocationAvailability();

    @Deprecated
    Task removeDeviceOrientationUpdates(b bVar);

    Task removeLocationUpdates(PendingIntent pendingIntent);

    Task removeLocationUpdates(LocationCallback locationCallback);

    Task removeLocationUpdates(f fVar);

    @Deprecated
    Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, b bVar, Looper looper);

    @Deprecated
    Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, Executor executor, b bVar);

    Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent);

    Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    Task requestLocationUpdates(LocationRequest locationRequest, f fVar, Looper looper);

    Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback);

    Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, f fVar);

    Task setMockLocation(Location location);

    Task setMockMode(boolean z2);
}
