package com.clevertap.android.sdk;

import android.location.Location;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
abstract class BaseLocationManager {
    public abstract Location _getLocation();

    public abstract Future<?> _setLocation(Location location);
}
