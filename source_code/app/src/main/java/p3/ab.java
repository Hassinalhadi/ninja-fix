package p3;

import Yb.C0331t0;
import android.content.Context;
import android.location.GnssStatus$Callback;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.WorkSource;
import androidx.fragment.app.an;
import av.ao;
import bz.C0796v;
import com.app.feature.location.api.LocationFeature;
import com.app.feature.location.api.LocationState;
import com.app.feature.location.api.StompStateHolder;
import com.app.feature.location.api.UserInfoProvider;
import com.app.feature.location.store.LastSentLocationStore;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.gms.tasks.Task;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g.C1718a;
import g3.EnumC1747h;
import g3.InterfaceC1740a;
import ga.as;
import h5.C1809a;
import h9.aq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k3.C2003b;
import k3.C2004c;
import k3.C2005d;
import k3.C2006e;
import k3.InterfaceC2002a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import l3.AbstractC2056a;
import s6.J6;
import s6.M4;
import s6.N4;
import s6.O4;
import u3.InterfaceC3142e;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.N;
import yf.av;

/* loaded from: classes3.dex */
public final class ab implements LocationFeature {
    public static WeakReference crimson;
    public final C2272d alpha;
    public FusedLocationProviderClient amber;
    public LocationCallback azure;
    public LocationRequest beige;
    public final Handler black;
    public boolean blue;
    public final ai bronze;
    public final Lazy coral;
    public final Handler delta;
    public final B2.ad echo;
    public final N foxtrot;
    public long golf;
    public boolean hotel;
    public Function0 india;
    public final int juliet;
    public as kilo;
    public final B9.ab lima;
    public final androidx.compose.material3.internal.t mike;
    public final com.google.firebase.messaging.o november;
    public boolean oscar;
    public boolean papa;
    public long quebec;
    public long romeo;
    public boolean sierra;
    public boolean tango;
    public final g3.ag uniform;
    public final g3.ab victor;
    public final C2271c whiskey;
    public final g3.ac xray;
    public long yankee;
    public long zulu;
    public final Lazy bravo = LazyKt.lazy(new C2275g(this, 17));
    public final ao charlie = new ao(new C0331t0(1, this, ab.class, "configForSource", "configForSource(Lcom/app/feature/location/monitoring/LocationSendSource;)Lcom/app/core/location/ValidationConfig;", 0, 17), new P7.c(0, this, ab.class, "isSendValidationEnabled", "isSendValidationEnabled()Z", 0, 7), new C2275g(this, 5), new P7.c(0, this, ab.class, "isCompareWithLastSentEnabled", "isCompareWithLastSentEnabled()Z", 0, 8), new P7.c(0, this, ab.class, "getCompareMaxAgeVsLastSentMs", "getCompareMaxAgeVsLastSentMs()J", 0, 9), new P7.c(0, this, ab.class, "getCompareMaxDistanceFromLastSentM", "getCompareMaxDistanceFromLastSentM()F", 0, 10));

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.google.firebase.messaging.o] */
    /* JADX WARN: Type inference failed for: r0v12, types: [g3.ab, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, p3.c] */
    /* JADX WARN: Type inference failed for: r0v14, types: [g3.ac, java.lang.Object] */
    public ab(C2272d c2272d) {
        Long l10;
        int i4 = 19;
        int i5 = 0;
        this.alpha = c2272d;
        Handler handler = new Handler(Looper.getMainLooper());
        this.delta = handler;
        C2275g c2275g = new C2275g(this, 12);
        C2275g c2275g2 = new C2275g(this, 13);
        Cb.d dVar = new Cb.d(i4, this);
        StompStateHolder stompStateHolder = c2272d.foxtrot;
        InterfaceC3142e interfaceC3142e = c2272d.charlie;
        this.echo = new B2.ad(c2275g, stompStateHolder, interfaceC3142e, handler, c2275g2, dVar);
        LastSentLocationStore lastSentLocationStore = c2272d.mike;
        Location location = lastSentLocationStore.get();
        Location location2 = lastSentLocationStore.get();
        if (location2 != null) {
            l10 = Long.valueOf(location2.getTime());
        } else {
            l10 = null;
        }
        boolean z2 = false;
        this.foxtrot = AbstractC3428A.charlie(new LocationState(z2, location, l10, null, stompStateHolder.getState(), stompStateHolder.getGpsQuality(), null, 72, null));
        this.juliet = System.identityHashCode(this);
        C2275g c2275g3 = new C2275g(this, 14);
        Context context = c2272d.alpha;
        B9.ab abVar = new B9.ab(context, interfaceC3142e, c2275g3);
        this.lima = abVar;
        C2275g c2275g4 = new C2275g(this, 15);
        C2277i c2277i = new C2277i(this, i5);
        C2275g c2275g5 = new C2275g(this, 16);
        C1809a c1809a = new C1809a(25);
        kd.l lVar = new kd.l(28);
        kd.l lVar2 = new kd.l(29);
        C2275g c2275g6 = new C2275g(this, 18);
        C2275g c2275g7 = new C2275g(this, i4);
        this.mike = new androidx.compose.material3.internal.t(context, interfaceC3142e, c2272d.hotel, c2272d.india, c2272d.echo, abVar, c2275g4, c2277i, c2275g5, c1809a, lVar, lVar2, c2275g6, c2275g7, this);
        new C2275g(this, 20);
        int i10 = x.alpha;
        new C2275g(this, 0);
        new C2275g(this, 1);
        new C2275g(this, 2);
        new C2275g(this, 3);
        int i11 = x.alpha;
        ?? obj = new Object();
        obj.alpha = interfaceC3142e;
        this.november = obj;
        this.uniform = new g3.ag(c2272d.kilo);
        ?? obj2 = new Object();
        obj2.alpha = 0L;
        obj2.bravo = 0.0d;
        obj2.charlie = 0.0d;
        obj2.delta = 0L;
        obj2.echo = 0L;
        obj2.foxtrot = 0L;
        obj2.golf = false;
        obj2.hotel = 0L;
        obj2.india = 0L;
        this.victor = obj2;
        ?? obj3 = new Object();
        obj3.bravo = Double.NaN;
        obj3.charlie = Double.NaN;
        this.whiskey = obj3;
        this.xray = new Object();
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.black = handler2;
        this.bronze = new ai(handler2, interfaceC3142e, new P7.c(0, this, ab.class, "getStuckThresholdMs", "getStuckThresholdMs()J", 0, 11), new P7.c(0, this, ab.class, "getMaxStuckRecoveryAttempts", "getMaxStuckRecoveryAttempts()I", 0, 12), new C2275g(this, 4), new C2275g(this, 6), new C2275g(this, 7), new C2275g(this, 8), new C2275g(this, 9), stompStateHolder, new P7.c(0, this, ab.class, "tryGetLastLocationAndSendWhenStuck", "tryGetLastLocationAndSendWhenStuck()V", 0, 13), new P7.c(0, this, ab.class, "performRecovery", "performRecovery()V", 0, 14), new C2275g(this, 10));
        this.coral = LazyKt.lazy(new C2275g(this, 11));
    }

    public static final void alpha(final ab abVar, final Location location, final boolean z2) {
        String locationsTopic;
        String str;
        C2272d c2272d = abVar.alpha;
        if (c2272d.foxtrot.getState() != ah.purple || (locationsTopic = c2272d.echo.getLocationsTopic()) == null || StringsKt.gray(locationsTopic)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (AbstractC2056a.charlie(c2272d.alpha)) {
            str = "HIGH";
        } else {
            str = "DEGRADED";
        }
        final String str2 = str;
        long time = location.getTime();
        g3.ab state = abVar.victor;
        Intrinsics.echo(state, "state");
        long j5 = state.alpha;
        boolean z10 = false;
        if (j5 != 0 && time == j5) {
            if (currentTimeMillis - state.delta > 60000) {
                z10 = true;
            }
            z10 = !z10;
        }
        InterfaceC3142e interfaceC3142e = c2272d.charlie;
        if (z10) {
            interfaceC3142e.alpha("LocationFlow", "[SKIP_DUPLICATE] Skipped duplicate timestamp | time=" + location.getTime() + " | accuracyMode=" + str2);
            return;
        }
        if (g3.aa.alpha(location.getLatitude(), location.getLongitude(), currentTimeMillis, abVar.victor)) {
            interfaceC3142e.alpha("LocationFlow", "[SKIP_NEAR_DUPLICATE] Skipped near-duplicate | lat=" + location.getLatitude() + ", lng=" + location.getLongitude() + " | accuracyMode=" + str2);
            return;
        }
        if (abVar.echo().mike) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            long time2 = location.getTime();
            C2271c c2271c = abVar.whiskey;
            if (!c2271c.alpha) {
                c2271c.alpha(time2, latitude, longitude);
            } else {
                long j6 = time2 - c2271c.delta;
                if (j6 > 0 && j6 <= 120000) {
                    if (J6.charlie(latitude, longitude, c2271c.bravo, c2271c.charlie) / (j6 / 1000.0d) > 100.0f) {
                        int i4 = c2271c.echo;
                        if (i4 >= 3) {
                            c2271c.alpha(time2, latitude, longitude);
                        } else {
                            c2271c.echo = i4 + 1;
                            interfaceC3142e.alpha("LocationFlow", "[SKIP_IMPLAUSIBLE_JUMP] Rejected implausible jump | lat=" + location.getLatitude() + ", lng=" + location.getLongitude() + ", accuracy=" + location.getAccuracy() + "m | accuracyMode=" + str2);
                            return;
                        }
                    } else {
                        c2271c.alpha(time2, latitude, longitude);
                    }
                } else {
                    c2271c.alpha(time2, latitude, longitude);
                }
            }
        }
        final long j7 = abVar.yankee + 1;
        abVar.yankee = j7;
        double latitude2 = location.getLatitude();
        double longitude2 = location.getLongitude();
        float accuracy = location.getAccuracy();
        StringBuilder uniform = Q0.c.uniform("[LOCATION_SENDING] Sending location | seq=", j7, " | lat=");
        uniform.append(latitude2);
        uniform.append(", lng=");
        uniform.append(longitude2);
        uniform.append(", accuracy=");
        uniform.append(accuracy);
        uniform.append("m | accuracyMode=");
        uniform.append(str2);
        uniform.append(" | STOMP=CONNECTED");
        interfaceC3142e.alpha("LocationFlow", uniform.toString());
        abVar.echo.charlie(location, locationsTopic, c2272d.delta.toPayload(location), ae.purple, new Function0() { // from class: p3.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long currentTimeMillis2 = System.currentTimeMillis();
                ab abVar2 = ab.this;
                LastSentLocationStore lastSentLocationStore = abVar2.alpha.mike;
                Location location2 = location;
                lastSentLocationStore.save(location2);
                lastSentLocationStore.saveStreamSent(location2);
                double latitude3 = location2.getLatitude();
                double longitude3 = location2.getLongitude();
                long time3 = location2.getTime();
                g3.ab state2 = abVar2.victor;
                Intrinsics.echo(state2, "state");
                state2.alpha = time3;
                state2.bravo = latitude3;
                state2.charlie = longitude3;
                state2.delta = currentTimeMillis2;
                if (z2) {
                    state2.echo = currentTimeMillis2;
                }
                abVar2.foxtrot(Long.valueOf(currentTimeMillis2));
                abVar2.alpha.charlie.alpha("LocationFlow", "[SEND_SUCCESS] Location sent successfully | seq=" + j7 + " | lat=" + location2.getLatitude() + ", lng=" + location2.getLongitude() + ", accuracy=" + location2.getAccuracy() + "m | accuracyMode=" + str2);
                return Unit.INSTANCE;
            }
        }, new D0.n(abVar, j7, location, str2));
    }

    public static final M4 bravo(ab abVar, Location location, ae aeVar) {
        M4 xVar;
        String str;
        boolean z2;
        InterfaceC3142e interfaceC3142e;
        float f5;
        Location location2;
        long j5;
        double d4;
        ao aoVar = abVar.charlie;
        aoVar.getClass();
        Intrinsics.echo(location, "location");
        if (Math.abs(location.getLatitude()) <= Double.MAX_VALUE && Math.abs(location.getLongitude()) <= Double.MAX_VALUE) {
            if (!((Boolean) ((P7.c) aoVar.purple).invoke()).booleanValue()) {
                xVar = new g3.y(location);
            } else {
                M4 alpha = N4.alpha(location, (g3.af) ((C0331t0) aoVar.alpha).invoke(aeVar));
                if (!(alpha instanceof g3.x)) {
                    if (alpha instanceof g3.y) {
                        if (((Boolean) ((P7.c) aoVar.silver).invoke()).booleanValue()) {
                            LastSentLocationStore lastSentLocationStore = (LastSentLocationStore) ((C2275g) aoVar.red).invoke();
                            if (lastSentLocationStore != null) {
                                location2 = lastSentLocationStore.get();
                            } else {
                                location2 = null;
                            }
                            if (location2 != null) {
                                j5 = location2.getTime();
                            } else {
                                j5 = 0;
                            }
                            if (j5 > 0) {
                                double d9 = 0.0d;
                                if (location2 != null) {
                                    d4 = location2.getLatitude();
                                } else {
                                    d4 = 0.0d;
                                }
                                if (location2 != null) {
                                    d9 = location2.getLongitude();
                                }
                                long time = j5 - location.getTime();
                                float charlie = J6.charlie(location.getLatitude(), location.getLongitude(), d4, d9);
                                long longValue = ((Number) ((P7.c) aoVar.teal).invoke()).longValue();
                                float floatValue = ((Number) ((P7.c) aoVar.white).invoke()).floatValue();
                                if (time > longValue && charlie > floatValue) {
                                    xVar = new g3.x(g3.v.yellow);
                                }
                            }
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                xVar = alpha;
            }
        } else {
            xVar = new g3.x(g3.v.white);
        }
        if (xVar instanceof g3.x) {
            long currentTimeMillis = System.currentTimeMillis() - location.getTime();
            C2272d c2272d = abVar.alpha;
            if (AbstractC2056a.charlie(c2272d.alpha)) {
                str = "HIGH";
            } else {
                str = "DEGRADED";
            }
            String locationsTopic = c2272d.echo.getLocationsTopic();
            if (locationsTopic != null && !StringsKt.gray(locationsTopic)) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z10 = !z2;
            g3.v vVar = g3.v.yellow;
            InterfaceC3142e interfaceC3142e2 = c2272d.charlie;
            g3.v vVar2 = ((g3.x) xVar).bravo;
            if (vVar2 == vVar) {
                Location location3 = c2272d.mike.get();
                if (location3 != null) {
                    f5 = J6.charlie(location.getLatitude(), location.getLongitude(), location3.getLatitude(), location3.getLongitude());
                } else {
                    f5 = 0.0f;
                }
                interfaceC3142e2.alpha("LocationFlow", "SEND_REJECTED_STALE_VS_LAST_SENT source=" + aeVar + " ageMs=" + currentTimeMillis + " distanceM=" + f5 + " accuracyMode=" + str + " topicPresent=" + z10);
                return xVar;
            }
            if (vVar2 == g3.v.purple) {
                interfaceC3142e2.alpha("LocationFlow", "[MOCK_REJECTED] Location from mock provider rejected (mock not allowed) | source=" + aeVar);
                interfaceC3142e = interfaceC3142e2;
                ((Nb.i) c2272d.juliet).alpha("MockRejected", 0L, true);
            } else {
                interfaceC3142e = interfaceC3142e2;
            }
            interfaceC3142e.alpha("LocationFlow", "SEND_REJECTED_VALIDATION source=" + aeVar + " reason=" + vVar2 + " ageMs=" + currentTimeMillis + " accuracyMode=" + str + " topicPresent=" + z10);
            return xVar;
        }
        if (xVar instanceof g3.y) {
            return xVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void hotel(ab abVar, Function1 function1, k3.f fVar) {
        abVar.delta.post(new A2.s(function1, fVar, abVar, 26));
    }

    public static final void india(final ab abVar, final String str, final Ref.ObjectRef objectRef, final Function1 function1, String str2, final Location location, final boolean z2, final int i4) {
        long j5;
        double d4;
        long j6;
        if (location == null) {
            if (i4 < 4) {
                abVar.alpha.charlie.alpha("LocationFlow", "SEND_VALIDATION_RETRY source=FORCE_SEND attempt=" + i4 + " reason=no_location freshFix=" + z2);
                final int i5 = 0;
                abVar.delta.postDelayed(new Runnable() { // from class: p3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                Xd.l lVar = (Xd.l) objectRef.alpha;
                                if (lVar != null) {
                                    lVar.invoke(Integer.valueOf(i4 + 1), Boolean.FALSE);
                                    return;
                                }
                                return;
                            default:
                                Xd.l lVar2 = (Xd.l) objectRef.alpha;
                                if (lVar2 != null) {
                                    lVar2.invoke(Integer.valueOf(i4 + 1), Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                }, 800L);
                return;
            }
            hotel(abVar, function1, new C2005d(str));
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis() - location.getTime();
        Location location2 = abVar.alpha.mike.get();
        if (location2 != null) {
            j5 = location2.getTime();
        } else {
            j5 = 0;
        }
        double d9 = 0.0d;
        if (location2 != null) {
            d4 = location2.getLatitude();
        } else {
            d4 = 0.0d;
        }
        if (location2 != null) {
            d9 = location2.getLongitude();
        }
        double d10 = d9;
        if (j5 > 0) {
            j6 = System.currentTimeMillis() - j5;
        } else {
            j6 = Long.MAX_VALUE;
        }
        float charlie = J6.charlie(location.getLatitude(), location.getLongitude(), d4, d10);
        if (j6 < OkHttpConstants.READ_TIMEOUT_MS && charlie < 15.0f) {
            hotel(abVar, function1, new C2006e(Long.valueOf(currentTimeMillis), str, Boolean.valueOf(z2)));
            return;
        }
        ae aeVar = ae.alpha;
        M4 bravo = bravo(abVar, location, aeVar);
        boolean z10 = bravo instanceof g3.x;
        C2272d c2272d = abVar.alpha;
        if (z10) {
            g3.v vVar = ((g3.x) bravo).bravo;
            if (i4 < 4) {
                c2272d.charlie.alpha("LocationFlow", "SEND_VALIDATION_RETRY source=FORCE_SEND attempt=" + i4 + " reason=" + vVar + " freshFix=" + z2);
                final int i10 = 1;
                abVar.delta.postDelayed(new Runnable() { // from class: p3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                Xd.l lVar = (Xd.l) objectRef.alpha;
                                if (lVar != null) {
                                    lVar.invoke(Integer.valueOf(i4 + 1), Boolean.FALSE);
                                    return;
                                }
                                return;
                            default:
                                Xd.l lVar2 = (Xd.l) objectRef.alpha;
                                if (lVar2 != null) {
                                    lVar2.invoke(Integer.valueOf(i4 + 1), Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                }, 800L);
                return;
            }
            hotel(abVar, function1, new C2003b("validation exhausted: " + vVar, Long.valueOf(currentTimeMillis), str, Boolean.TRUE, Boolean.valueOf(z2)));
            return;
        }
        if (bravo instanceof g3.y) {
            abVar.echo.charlie(location, str2, c2272d.delta.toPayload(location), aeVar, new Function0() { // from class: p3.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    ab abVar2 = ab.this;
                    abVar2.alpha.mike.save(location);
                    abVar2.foxtrot(Long.valueOf(currentTimeMillis2));
                    ab.hotel(abVar2, function1, new C2004c(Long.valueOf(currentTimeMillis), str, Boolean.valueOf(z2)));
                    return Unit.INSTANCE;
                }
            }, new Function1() { // from class: p3.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Throwable e = (Throwable) obj;
                    Intrinsics.echo(e, "e");
                    String message = e.getMessage();
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    ab abVar2 = abVar;
                    ab.hotel(abVar2, function1, new C2003b(message, valueOf, abVar2.alpha.foxtrot.getState().name(), Boolean.TRUE, Boolean.valueOf(z2)));
                    return Unit.INSTANCE;
                }
            });
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [p3.j, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public static final void juliet(final ab abVar, long j5, final FusedLocationProviderClient fusedLocationProviderClient, final String str, final Ref.ObjectRef objectRef, final Function1 function1, final String str2, final int i4, boolean z2) {
        boolean z10;
        if (z2) {
            abVar.alpha.charlie.alpha("LocationFlow", "FORCE_SEND_FRESH_REQUEST attempt=" + i4 + " timeoutMs=" + j5);
            final ?? obj = new Object();
            final G6.b bVar = new G6.b();
            com.google.android.gms.location.n.alpha(100);
            if (j5 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            V5.x.alpha("durationMillis must be greater than 0", z10);
            CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(10000L, 0, 100, j5, false, 0, new WorkSource(null), null);
            final ?? r02 = new Runnable() { // from class: p3.j
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.jvm.internal.q qVar = kotlin.jvm.internal.q.this;
                    if (!qVar.alpha) {
                        qVar.alpha = true;
                        bVar.alpha();
                        ab abVar2 = abVar;
                        InterfaceC3142e interfaceC3142e = abVar2.alpha.charlie;
                        StringBuilder sb2 = new StringBuilder("FORCE_SEND_FRESH_TIMEOUT attempt=");
                        int i5 = i4;
                        sb2.append(i5);
                        sb2.append(", falling back to lastLocation");
                        interfaceC3142e.alpha("LocationFlow", sb2.toString());
                        fusedLocationProviderClient.getLastLocation().bravo(new l(i5, abVar2, str, objectRef, function1, str2, 1));
                    }
                }
            };
            abVar.delta.postDelayed(r02, j5);
            fusedLocationProviderClient.getCurrentLocation(currentLocationRequest, bVar.alpha).bravo(new G6.e() { // from class: p3.k
                @Override // G6.e
                public final void onComplete(Task task) {
                    Location location;
                    Intrinsics.echo(task, "task");
                    kotlin.jvm.internal.q qVar = kotlin.jvm.internal.q.this;
                    if (!qVar.alpha) {
                        qVar.alpha = true;
                        ab abVar2 = abVar;
                        abVar2.delta.removeCallbacks(r02);
                        if (task.juliet()) {
                            location = (Location) task.hotel();
                        } else {
                            location = null;
                        }
                        Location location2 = location;
                        Ref.ObjectRef objectRef2 = objectRef;
                        Function1 function12 = function1;
                        C2272d c2272d = abVar2.alpha;
                        int i5 = i4;
                        String str3 = str;
                        String str4 = str2;
                        InterfaceC3142e interfaceC3142e = c2272d.charlie;
                        if (location2 != null) {
                            interfaceC3142e.alpha("LocationFlow", "FORCE_SEND_FRESH_SUCCESS attempt=" + i5 + " ageMs=" + (System.currentTimeMillis() - location2.getTime()));
                            ab.india(abVar2, str3, objectRef2, function12, str4, location2, true, i5);
                            return;
                        }
                        interfaceC3142e.alpha("LocationFlow", "FORCE_SEND_FRESH_NULL attempt=" + i5 + ", falling back to lastLocation");
                        fusedLocationProviderClient.getLastLocation().bravo(new l(i5, abVar2, str3, objectRef2, function12, str4, 2));
                    }
                }
            });
            return;
        }
        fusedLocationProviderClient.getLastLocation().bravo(new l(i4, abVar, str, objectRef, function1, str2, 0));
    }

    public final LocationRequest charlie() {
        C2272d c2272d = this.alpha;
        UserInfoProvider userInfoProvider = c2272d.echo;
        long locationInterval = userInfoProvider.getLocationInterval();
        long locationFastestInterval = userInfoProvider.getLocationFastestInterval();
        Pair bravo = O4.bravo(locationInterval, locationFastestInterval);
        long longValue = ((Number) bravo.first).longValue();
        long longValue2 = ((Number) bravo.second).longValue();
        if (locationInterval != longValue || locationFastestInterval != longValue2) {
            InterfaceC3142e interfaceC3142e = c2272d.charlie;
            StringBuilder uniform = Q0.c.uniform("[REQUEST_CREATE] Location interval clamped from ", locationInterval, "ms/");
            uniform.append(locationFastestInterval);
            Q0.c.amber(uniform, "ms to ", longValue, "ms/");
            interfaceC3142e.alpha("LocationFlow", Q0.c.mike(longValue2, "ms (buildDefaultRequest)", uniform));
        }
        return O4.alpha(longValue, longValue2);
    }

    public final void delta() {
        Long l10;
        boolean z2 = this.hotel;
        C2272d c2272d = this.alpha;
        LastSentLocationStore lastSentLocationStore = c2272d.mike;
        Location location = lastSentLocationStore.get();
        Location location2 = lastSentLocationStore.get();
        if (location2 != null) {
            l10 = Long.valueOf(location2.getTime());
        } else {
            l10 = null;
        }
        StompStateHolder stompStateHolder = c2272d.foxtrot;
        LocationState locationState = new LocationState(z2, location, l10, null, stompStateHolder.getState(), stompStateHolder.getGpsQuality(), null, 72, null);
        N n5 = this.foxtrot;
        n5.getClass();
        n5.juliet(null, locationState);
    }

    public final C2273e echo() {
        return (C2273e) this.bravo.getValue();
    }

    public final void foxtrot(Long l10) {
        Location location;
        Long valueOf = Long.valueOf(this.zulu);
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        C2272d c2272d = this.alpha;
        if (l10 == null) {
            LastSentLocationStore lastSentLocationStore = c2272d.mike;
            if (lastSentLocationStore != null && (location = lastSentLocationStore.get()) != null) {
                l10 = Long.valueOf(location.getTime());
            } else {
                l10 = null;
            }
        }
        if (c2272d.romeo != null) {
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                boolean z2 = CaptainLocationMonitoringService.f12066D;
                CaptainLocationMonitoringService.f12080S = Long.valueOf(longValue);
            }
            if (l10 != null) {
                long longValue2 = l10.longValue();
                boolean z10 = CaptainLocationMonitoringService.f12066D;
                CaptainLocationMonitoringService.f12081T = Long.valueOf(longValue2);
            }
        }
    }

    @Override // com.app.feature.location.api.LocationFeature
    public final Location getLastSentLocation() {
        LastSentLocationStore lastSentLocationStore = this.alpha.mike;
        if (lastSentLocationStore != null) {
            return lastSentLocationStore.get();
        }
        return null;
    }

    @Override // com.app.feature.location.api.LocationFeature
    public final Location getLastStreamSentLocation() {
        LastSentLocationStore lastSentLocationStore = this.alpha.mike;
        if (lastSentLocationStore != null) {
            return lastSentLocationStore.getStreamSent();
        }
        return null;
    }

    public final m golf(LocationRequest locationRequest, LocationCallback locationCallback, FusedLocationProviderClient fusedLocationProviderClient, String str, String str2, LocationRequest locationRequest2) {
        ab abVar = this;
        boolean z2 = abVar.hotel;
        C2272d c2272d = abVar.alpha;
        String str3 = "DEGRADED";
        StompStateHolder stompStateHolder = c2272d.foxtrot;
        Context context = c2272d.alpha;
        InterfaceC3142e interfaceC3142e = c2272d.charlie;
        if (z2) {
            if (AbstractC2056a.charlie(context)) {
                str3 = "HIGH";
            }
            interfaceC3142e.alpha("LocationFlow", "[REGISTER_SKIP] Location updates already registered - skipping | accuracyMode=" + str3 + " | STOMP=" + stompStateHolder.getState());
            return null;
        }
        if (AbstractC2056a.charlie(context)) {
            str3 = "HIGH";
        }
        ah state = stompStateHolder.getState();
        StringBuilder india = av.q.india("[REGISTER_UPDATES] Registering location updates | requestType=", str, " | interval=", str2, " | accuracyMode=");
        india.append(str3);
        india.append(" | STOMP=");
        india.append(state);
        interfaceC3142e.alpha("LocationFlow", india.toString());
        try {
            fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper());
            abVar.hotel = true;
            abVar.amber = fusedLocationProviderClient;
            abVar.azure = locationCallback;
            abVar.beige = locationRequest2;
            ai aiVar = abVar.bronze;
            as asVar = aiVar.november;
            Handler handler = aiVar.alpha;
            if (asVar != null) {
                handler.removeCallbacks(asVar);
            }
            as asVar2 = new as(9, aiVar);
            aiVar.november = asVar2;
            try {
                handler.postDelayed(asVar2, 60000L);
                delta();
                interfaceC3142e.alpha("LocationFlow", "[REGISTER_SUCCESS] Location updates registered successfully | requestType=" + str + " | interval=" + str2 + " | accuracyMode=" + str3 + " | STOMP=" + state);
                interfaceC3142e.alpha("LocationFlow", "[PROVIDER_LISTENER] Registering location provider listener | accuracyMode=".concat(str3));
                abVar = this;
                c2272d.quebec.india((w) abVar.coral.getValue());
                interfaceC3142e.alpha("LocationFlow", "[PROVIDER_LISTENER_SUCCESS] Location provider listener registered | accuracyMode=".concat(str3));
                return new m(fusedLocationProviderClient, locationCallback, 1);
            } catch (Exception e) {
                e = e;
                abVar = this;
                StringBuilder india2 = av.q.india("[REGISTER_FAILED] Failed to register location updates | requestType=", str, " | error=", e.getMessage(), " | accuracyMode=");
                india2.append(str3);
                india2.append(" | STOMP=");
                india2.append(state);
                interfaceC3142e.alpha("LocationFlow", india2.toString());
                try {
                    K7.b.alpha().charlie(e);
                } catch (Exception unused) {
                }
                abVar.hotel = false;
                return null;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public final void kilo() {
        Function0 function0 = this.india;
        if (function0 != null) {
            function0.invoke();
        }
        this.india = null;
        this.hotel = false;
        ai aiVar = this.bronze;
        as asVar = aiVar.november;
        if (asVar != null) {
            aiVar.alpha.removeCallbacks(asVar);
        }
        aiVar.november = null;
        aiVar.oscar = 0;
        as asVar2 = this.kilo;
        if (asVar2 != null) {
            this.delta.removeCallbacks(asVar2);
        }
        this.kilo = null;
        this.amber = null;
        this.azure = null;
        this.beige = null;
        this.zulu = 0L;
        this.blue = false;
        C2271c c2271c = this.whiskey;
        c2271c.alpha = false;
        c2271c.bravo = Double.NaN;
        c2271c.charlie = Double.NaN;
        c2271c.delta = 0L;
        c2271c.echo = 0;
        B2.ad adVar = this.echo;
        as asVar3 = (as) adVar.hotel;
        if (asVar3 != null) {
            ((Handler) adVar.delta).removeCallbacks(asVar3);
        }
        adVar.hotel = null;
        ((ArrayList) adVar.foxtrot).clear();
        C2272d c2272d = this.alpha;
        C0796v c0796v = c2272d.quebec;
        F6.b bVar = (F6.b) c0796v.golf;
        if (bVar != null) {
            ((Handler) c0796v.delta).removeCallbacks(bVar);
        }
        c0796v.golf = null;
        c0796v.foxtrot = null;
        c0796v.echo = null;
        c0796v.hotel = null;
        com.google.firebase.messaging.o oVar = this.november;
        GnssStatus$Callback gnssStatus$Callback = (GnssStatus$Callback) oVar.charlie;
        InterfaceC3142e interfaceC3142e = (InterfaceC3142e) oVar.alpha;
        if (gnssStatus$Callback != null) {
            try {
                LocationManager locationManager = (LocationManager) oVar.bravo;
                if (locationManager != null) {
                    locationManager.unregisterGnssStatusCallback(gnssStatus$Callback);
                }
                interfaceC3142e.alpha("LocationFlow", "GNSS status callback unregistered");
            } catch (Exception e) {
                interfaceC3142e.alpha("LocationFlow", "Failed to unregister GNSS callback: " + e.getMessage());
            }
        }
        oVar.charlie = null;
        oVar.delta = null;
        oVar.bravo = null;
        interfaceC3142e.alpha("LocationFlow", "Location provider listener unregistered");
        B9.ab abVar = this.lima;
        abVar.silver = null;
        abVar.teal = null;
        if (C1477x.charlie() == this) {
            crimson = null;
            c2272d.charlie.alpha("LocationFlow", "Controller#" + this.juliet + " set inactive");
        }
        delta();
    }

    @Override // com.app.feature.location.api.LocationFeature
    public final void requestSendCurrentLocationIfNeeded(Function1 callback) {
        Intrinsics.echo(callback, "callback");
        C2272d c2272d = this.alpha;
        StompStateHolder stompStateHolder = c2272d.foxtrot;
        String name = stompStateHolder.getState().name();
        String locationsTopic = c2272d.echo.getLocationsTopic();
        if (locationsTopic != null && !StringsKt.gray(locationsTopic)) {
            if (stompStateHolder.getState() != ah.purple) {
                hotel(this, callback, new C2003b("STOMP not connected", name, Boolean.TRUE, 16));
                return;
            }
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(c2272d.alpha);
            Intrinsics.delta(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            long j5 = echo().lima;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.alpha = new y(this, j5, fusedLocationProviderClient, name, objectRef, callback, locationsTopic);
            juliet(this, j5, fusedLocationProviderClient, name, objectRef, callback, locationsTopic, 1, true);
            return;
        }
        hotel(this, callback, new C2003b("topic null", name, Boolean.FALSE, 16));
    }

    @Override // com.app.feature.location.api.LocationFeature
    public final void retryPendingSettingsResolution() {
        this.lima.jade();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.feature.location.api.LocationFeature
    public final Task startMonitoring(an anVar) {
        boolean z2;
        String str;
        kotlin.jvm.internal.h hVar;
        C2275g c2275g;
        Context context;
        kotlin.jvm.internal.h hVar2 = new kotlin.jvm.internal.h(4, 0, ab.class, this, "onLocationSettingsSuccess", "onLocationSettingsSuccess(Lcom/google/android/gms/location/FusedLocationProviderClient;Lcom/google/android/gms/location/LocationRequest;JJ)V");
        aa aaVar = new aa(3, 0, ab.class, this, "onLocationSettingsFailure", "onLocationSettingsFailure(Ljava/lang/Exception;Landroidx/fragment/app/FragmentActivity;Lcom/google/android/gms/location/LocationRequest;)V");
        androidx.compose.material3.internal.t tVar = this.mike;
        tVar.getClass();
        ah ahVar = (ah) ((C2275g) tVar.lima).invoke();
        C2275g c2275g2 = (C2275g) tVar.mike;
        long j5 = 0;
        if (((Number) c2275g2.invoke()).longValue() > 0) {
            j5 = System.currentTimeMillis() - ((Number) c2275g2.invoke()).longValue();
        }
        C2275g c2275g3 = (C2275g) tVar.golf;
        Object invoke = c2275g3.invoke();
        if (anVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = "Location monitoring start; registered=" + invoke + " | STOMP state: " + ahVar + " | timeSinceServiceStart: " + j5 + "ms | baseActivity=" + z2;
        InterfaceC3142e interfaceC3142e = (InterfaceC3142e) tVar.bravo;
        interfaceC3142e.alpha("LocationFlow", str2);
        Context context2 = (Context) tVar.alpha;
        if (AbstractC2056a.charlie(context2)) {
            str = "HIGH";
        } else {
            str = "DEGRADED";
        }
        if (anVar != null) {
            B9.ab abVar = (B9.ab) tVar.foxtrot;
            if (((ResolvableApiException) abVar.silver) != null) {
                interfaceC3142e.alpha("LocationFlow", "[RETRY_SETTINGS] baseActivity now available - will retry pending settings resolution | accuracyMode=".concat(str));
                abVar.teal = anVar;
                abVar.jade();
            }
        }
        if (((Boolean) c2275g3.invoke()).booleanValue()) {
            interfaceC3142e.alpha("LocationFlow", "[ALREADY_REGISTERED] Already registered — skipping re-register | accuracyMode=" + str + " | STOMP=" + ahVar);
            return null;
        }
        interfaceC3142e.alpha("LocationFlow", "[COMPLIANCE_CHECK] Running initial compliance check | accuracyMode=" + str + " | STOMP=" + ahVar);
        g3.s alpha = ((S9.a) ((InterfaceC1740a) tVar.charlie)).alpha();
        if (!(alpha instanceof g3.q)) {
            interfaceC3142e.alpha("LocationFlow", av.q.golf("[COMPLIANCE_FAILED] Compliance check FAILED before location settings: ", alpha.toString(), " | accuracyMode=", str, " — aborting start"));
            InterfaceC2002a interfaceC2002a = (InterfaceC2002a) tVar.delta;
            if (interfaceC2002a != null) {
                EnumC1747h enumC1747h = EnumC1747h.alpha;
                ((S9.b) interfaceC2002a).alpha(alpha);
            }
            return null;
        }
        interfaceC3142e.alpha("LocationFlow", "[COMPLIANCE_PASSED] Initial compliance check passed | accuracyMode=" + str + " | STOMP=" + ahVar);
        ((C2277i) tVar.hotel).invoke(Long.valueOf(System.currentTimeMillis()));
        interfaceC3142e.alpha("LocationFlow", "[START_INIT] Location monitoring initializing | accuracyMode=" + str + " | serviceStartMs=" + c2275g2.invoke() + " | STOMP=" + ahVar);
        ab charlie = C1477x.charlie();
        ab abVar2 = (ab) tVar.november;
        if (charlie != null && charlie != abVar2) {
            hVar = hVar2;
            c2275g = c2275g3;
            interfaceC3142e.alpha("LocationFlow", "Controller#" + ((C2275g) tVar.india).invoke() + " detected previous active controller#" + System.identityHashCode(charlie) + " — stopping it");
            ((kd.l) tVar.kilo).invoke(charlie);
        } else {
            hVar = hVar2;
            c2275g = c2275g3;
        }
        ((kd.l) tVar.juliet).invoke(abVar2);
        UserInfoProvider userInfoProvider = (UserInfoProvider) tVar.echo;
        long locationInterval = userInfoProvider.getLocationInterval();
        long locationFastestInterval = userInfoProvider.getLocationFastestInterval();
        Pair bravo = O4.bravo(locationInterval, locationFastestInterval);
        long longValue = ((Number) bravo.first).longValue();
        long longValue2 = ((Number) bravo.second).longValue();
        if (locationInterval == longValue && locationFastestInterval == longValue2) {
            context = context2;
        } else {
            context = context2;
            StringBuilder uniform = Q0.c.uniform("[REQUEST_CREATE] Location interval clamped from ", locationInterval, "ms/");
            uniform.append(locationFastestInterval);
            Q0.c.amber(uniform, "ms to ", longValue, "ms/");
            uniform.append(longValue2);
            uniform.append("ms | accuracyMode=");
            uniform.append(str);
            interfaceC3142e.alpha("LocationFlow", uniform.toString());
        }
        LocationRequest alpha2 = O4.alpha(longValue, longValue2);
        StringBuilder uniform2 = Q0.c.uniform("[REQUEST_CREATE] RequestConfig Adaptive interval=", longValue, "ms fastest=");
        uniform2.append(longValue2);
        uniform2.append("ms granularity=FINE | accuracyMode=");
        uniform2.append(str);
        interfaceC3142e.alpha("LocationFlow", uniform2.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(alpha2);
        interfaceC3142e.alpha("LocationFlow", "[SETTINGS_CHECK] Starting location settings check | accuracyMode=" + str + " | registered=" + c2275g.invoke() + " | STOMP=" + ahVar);
        com.google.android.gms.location.j settingsClient = LocationServices.getSettingsClient(context);
        LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest(arrayList, true, false);
        p6.h hVar3 = (p6.h) settingsClient;
        hVar3.getClass();
        T5.o bravo2 = T5.o.bravo();
        bravo2.delta = new C1718a(16, locationSettingsRequest);
        bravo2.charlie = 2426;
        G6.q delta = hVar3.delta(0, bravo2.alpha());
        Intrinsics.delta(delta, "checkLocationSettings(...)");
        delta.echo(G6.i.alpha, new aq(10, new af(tVar, hVar, alpha2, longValue, longValue2)));
        delta.lima(new A2.p(aaVar, anVar, alpha2, 18));
        return delta;
    }

    @Override // com.app.feature.location.api.LocationFeature
    public final InterfaceC3439i stateFlow() {
        return new av(this.foxtrot);
    }

    @Override // com.app.feature.location.api.LocationFeature
    public final void stopMonitoring() {
        kilo();
    }

    @Override // com.app.feature.location.api.LocationFeature
    public final void updateBaseActivity(an anVar) {
        if (anVar != null) {
            B9.ab abVar = this.lima;
            if (((ResolvableApiException) abVar.silver) != null) {
                this.alpha.charlie.alpha("LocationFlow", "[UPDATE_BASE_ACTIVITY] baseActivity updated - retrying pending settings resolution");
                abVar.teal = anVar;
                abVar.jade();
            }
        }
    }
}
