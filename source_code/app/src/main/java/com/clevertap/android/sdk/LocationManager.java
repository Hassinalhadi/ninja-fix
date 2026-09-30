package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.clevertap.android.sdk.events.BaseEventQueueManager;
import java.util.Iterator;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class LocationManager extends BaseLocationManager {
    private int lastLocationPingTime = 0;
    private int lastLocationPingTimeForGeofence = 0;
    private final BaseEventQueueManager mBaseEventQueueManager;
    private final CleverTapInstanceConfig mConfig;
    private final Context mContext;
    private final CoreMetaData mCoreMetaData;
    private final Logger mLogger;

    public LocationManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CoreMetaData coreMetaData, BaseEventQueueManager baseEventQueueManager) {
        this.mContext = context;
        this.mConfig = cleverTapInstanceConfig;
        this.mLogger = cleverTapInstanceConfig.getLogger();
        this.mCoreMetaData = coreMetaData;
        this.mBaseEventQueueManager = baseEventQueueManager;
    }

    @Override // com.clevertap.android.sdk.BaseLocationManager
    @SuppressLint({"MissingPermission"})
    public Location _getLocation() {
        try {
            android.location.LocationManager locationManager = (android.location.LocationManager) this.mContext.getSystemService("location");
            if (locationManager == null) {
                Logger.d("Location Manager is null.");
                return null;
            }
            Iterator<String> it = locationManager.getProviders(true).iterator();
            Location location = null;
            Location location2 = null;
            while (it.hasNext()) {
                try {
                    location2 = locationManager.getLastKnownLocation(it.next());
                } catch (SecurityException e) {
                    Logger.v("Location security exception", e);
                }
                if (location2 != null && (location == null || location2.getAccuracy() < location.getAccuracy())) {
                    location = location2;
                }
            }
            return location;
        } catch (Throwable th) {
            Logger.v("Couldn't get user's location", th);
            return null;
        }
    }

    @Override // com.clevertap.android.sdk.BaseLocationManager
    public Future<?> _setLocation(Location location) {
        if (location == null) {
            return null;
        }
        this.mCoreMetaData.setLocationFromUser(location);
        this.mLogger.verbose(this.mConfig.getAccountId(), "Location updated (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        if (!this.mCoreMetaData.isLocationForGeofence() && !CleverTapAPI.isAppForeground()) {
            return null;
        }
        int now = getNow();
        if (this.mCoreMetaData.isLocationForGeofence() && now > this.lastLocationPingTimeForGeofence + 10) {
            Future<?> queueEvent = this.mBaseEventQueueManager.queueEvent(this.mContext, new JSONObject(), 2);
            setLastLocationPingTimeForGeofence(now);
            this.mLogger.verbose(this.mConfig.getAccountId(), "Queuing location ping event for geofence location (" + location.getLatitude() + ", " + location.getLongitude() + ")");
            return queueEvent;
        }
        if (this.mCoreMetaData.isLocationForGeofence() || now <= this.lastLocationPingTime + 10) {
            return null;
        }
        Future<?> queueEvent2 = this.mBaseEventQueueManager.queueEvent(this.mContext, new JSONObject(), 2);
        setLastLocationPingTime(now);
        this.mLogger.verbose(this.mConfig.getAccountId(), "Queuing location ping event for location (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        return queueEvent2;
    }

    public int getLastLocationPingTime() {
        return this.lastLocationPingTime;
    }

    public int getLastLocationPingTimeForGeofence() {
        return this.lastLocationPingTimeForGeofence;
    }

    public int getNow() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public void setLastLocationPingTime(int i4) {
        this.lastLocationPingTime = i4;
    }

    public void setLastLocationPingTimeForGeofence(int i4) {
        this.lastLocationPingTimeForGeofence = i4;
    }
}
