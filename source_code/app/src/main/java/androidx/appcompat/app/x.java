package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import g1.AbstractC1735d;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class x extends K3.b {
    public final /* synthetic */ int silver = 1;
    public final /* synthetic */ ab teal;
    public final Object white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ab abVar, J2.t tVar) {
        super(abVar);
        this.teal = abVar;
        this.white = tVar;
    }

    @Override // K3.b
    public final IntentFilter echo() {
        switch (this.silver) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, androidx.appcompat.app.al] */
    @Override // K3.b
    public final int golf() {
        Location location;
        boolean z2;
        long j5;
        Location location2;
        switch (this.silver) {
            case 0:
                if (t.alpha((PowerManager) this.white)) {
                    return 2;
                }
                return 1;
            default:
                J2.t tVar = (J2.t) this.white;
                am amVar = (am) tVar.red;
                if (amVar.bravo > System.currentTimeMillis()) {
                    z2 = amVar.alpha;
                } else {
                    Context context = (Context) tVar.alpha;
                    int bravo = AbstractC1735d.bravo(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) tVar.purple;
                    if (bravo == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (AbstractC1735d.bravo(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z2 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (al.delta == null) {
                            al.delta = new Object();
                        }
                        al alVar = al.delta;
                        alVar.alpha(currentTimeMillis - Constants.ONE_DAY_IN_MILLIS, location.getLatitude(), location.getLongitude());
                        alVar.alpha(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        if (alVar.charlie == 1) {
                            z2 = true;
                        }
                        long j6 = alVar.bravo;
                        long j7 = alVar.alpha;
                        alVar.alpha(Constants.ONE_DAY_IN_MILLIS + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j10 = alVar.bravo;
                        if (j6 != -1 && j7 != -1) {
                            if (currentTimeMillis <= j7) {
                                if (currentTimeMillis > j6) {
                                    j10 = j7;
                                } else {
                                    j10 = j6;
                                }
                            }
                            j5 = j10 + 60000;
                        } else {
                            j5 = currentTimeMillis + 43200000;
                        }
                        amVar.alpha = z2;
                        amVar.bravo = j5;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            z2 = true;
                        }
                    }
                }
                if (!z2) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // K3.b
    public final void quebec() {
        switch (this.silver) {
            case 0:
                this.teal.mike(true, true);
                return;
            default:
                this.teal.mike(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ab abVar, Context context) {
        super(abVar);
        this.teal = abVar;
        this.white = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
