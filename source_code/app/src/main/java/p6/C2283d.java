package p6;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.WorkSource;
import bd.ExecutorC0748a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.measurement.internal.C1467s;
import com.google.android.gms.measurement.internal.C1469t;
import com.google.android.gms.measurement.internal.C1471u;
import com.google.android.gms.measurement.internal.C1473v;
import com.google.android.gms.measurement.internal.C1475w;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.gms.tasks.Task;
import g.C1718a;
import java.util.concurrent.Executor;
import s6.AbstractC2824y7;
import s6.V4;

/* renamed from: p6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2283d extends com.google.android.gms.common.api.g implements FusedLocationProviderClient {
    public static final com.google.android.gms.common.api.e india = new com.google.android.gms.common.api.e("LocationServices.API", new D6.b(6), new Object());
    public static final Object juliet = new Object();
    public static Object kilo;

    public final G6.q echo(LocationRequest locationRequest, K1.f fVar) {
        C3.d dVar = new C3.d(this, fVar, C1477x.red);
        com.google.android.material.internal.ab abVar = new com.google.android.material.internal.ab(7, dVar, locationRequest);
        T5.l hotel = J2.c.hotel();
        hotel.alpha = abVar;
        hotel.bravo = dVar;
        hotel.charlie = fVar;
        hotel.echo = 2436;
        return bravo(hotel.alpha());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task flushLocations() {
        T5.o bravo = T5.o.bravo();
        bravo.delta = com.google.android.gms.measurement.internal.r.purple;
        bravo.charlie = 2422;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getCurrentLocation(int i4, G6.a aVar) {
        com.google.android.gms.location.n.alpha(i4);
        CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(10000L, 0, i4, Long.MAX_VALUE, false, 0, new WorkSource(null), null);
        if (aVar != null) {
            V5.x.alpha("cancellationToken may not be already canceled", !((G6.l) aVar).alpha.india());
        }
        T5.o bravo = T5.o.bravo();
        bravo.delta = new com.google.android.play.core.integrity.k(6, currentLocationRequest, aVar);
        bravo.charlie = 2415;
        G6.q delta = delta(0, bravo.alpha());
        if (aVar == null) {
            return delta;
        }
        G6.h hVar = new G6.h(aVar);
        G6.p pVar = new G6.p(hVar);
        delta.getClass();
        delta.mike(G6.i.alpha, pVar);
        return hVar.alpha;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLastLocation() {
        T5.o bravo = T5.o.bravo();
        bravo.delta = C1475w.purple;
        bravo.charlie = 2414;
        return delta(0, bravo.alpha());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLocationAvailability() {
        T5.o bravo = T5.o.bravo();
        bravo.delta = C1471u.purple;
        bravo.charlie = 2416;
        return delta(0, bravo.alpha());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeDeviceOrientationUpdates(com.google.android.gms.location.b bVar) {
        AbstractC2824y7.delta(null, com.google.android.gms.location.b.class.getSimpleName());
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(PendingIntent pendingIntent) {
        T5.o bravo = T5.o.bravo();
        bravo.delta = new C2281b(2, pendingIntent);
        bravo.charlie = 2418;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, com.google.android.gms.location.b bVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            V5.x.india(looper, "invalid null looper");
        }
        AbstractC2824y7.bravo(looper, null, com.google.android.gms.location.b.class.getSimpleName());
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        T5.o bravo = T5.o.bravo();
        bravo.delta = new gd.a(5, pendingIntent, locationRequest);
        bravo.charlie = 2417;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task setMockLocation(Location location) {
        boolean z2;
        if (location != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.bravo(z2);
        T5.o bravo = T5.o.bravo();
        bravo.delta = new com.google.android.material.internal.s(23, location);
        bravo.charlie = 2421;
        return delta(1, bravo.alpha());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task setMockMode(boolean z2) {
        synchronized (juliet) {
            try {
                if (z2) {
                    if (kilo == null) {
                        Object obj = new Object();
                        kilo = obj;
                        T5.l hotel = J2.c.hotel();
                        hotel.alpha = C1467s.purple;
                        hotel.bravo = C1469t.red;
                        hotel.charlie = AbstractC2824y7.bravo(Looper.getMainLooper(), obj, "Object");
                        hotel.echo = 2420;
                        return bravo(hotel.alpha());
                    }
                } else {
                    Object obj2 = kilo;
                    if (obj2 != null) {
                        kilo = null;
                        return charlie(AbstractC2824y7.delta(obj2, "Object"), 2420).mike(ExecutorC0748a.silver, C1469t.purple);
                    }
                }
                return V4.echo(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, Executor executor, com.google.android.gms.location.b bVar) {
        AbstractC2824y7.charlie(null, com.google.android.gms.location.b.class.getSimpleName(), executor);
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getLastLocation(LastLocationRequest lastLocationRequest) {
        T5.o bravo = T5.o.bravo();
        bravo.delta = new C1718a(15, lastLocationRequest);
        bravo.charlie = 2414;
        bravo.echo = new Feature[]{com.google.android.gms.location.n.charlie};
        return delta(0, bravo.alpha());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(LocationCallback locationCallback) {
        return charlie(AbstractC2824y7.delta(locationCallback, "LocationCallback"), 2418).mike(ExecutorC0748a.red, C1473v.purple);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            V5.x.india(looper, "invalid null looper");
        }
        return echo(locationRequest, AbstractC2824y7.bravo(looper, locationCallback, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task removeLocationUpdates(com.google.android.gms.location.f fVar) {
        AbstractC2824y7.delta(null, com.google.android.gms.location.f.class.getSimpleName());
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, com.google.android.gms.location.f fVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            V5.x.india(looper, "invalid null looper");
        }
        AbstractC2824y7.bravo(looper, null, com.google.android.gms.location.f.class.getSimpleName());
        throw null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return echo(locationRequest, AbstractC2824y7.charlie(locationCallback, "LocationCallback", executor));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task getCurrentLocation(CurrentLocationRequest currentLocationRequest, G6.a aVar) {
        if (aVar != null) {
            V5.x.alpha("cancellationToken may not be already canceled", !((G6.l) aVar).alpha.india());
        }
        T5.o bravo = T5.o.bravo();
        bravo.delta = new com.google.android.play.core.integrity.k(6, currentLocationRequest, aVar);
        bravo.charlie = 2415;
        G6.q delta = delta(0, bravo.alpha());
        if (aVar == null) {
            return delta;
        }
        G6.h hVar = new G6.h(aVar);
        G6.p pVar = new G6.p(hVar);
        delta.getClass();
        delta.mike(G6.i.alpha, pVar);
        return hVar.alpha;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, com.google.android.gms.location.f fVar) {
        AbstractC2824y7.charlie(null, com.google.android.gms.location.f.class.getSimpleName(), executor);
        throw null;
    }
}
