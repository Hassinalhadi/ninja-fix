package p3;

import Jb.V;
import android.location.Location;
import android.os.Looper;
import androidx.appcompat.widget.P0;
import bd.ExecutorC0753f;
import com.app.feature.location.api.StompStateHolder;
import com.app.feature.location.api.UserInfoProvider;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.measurement.internal.C1475w;
import com.google.android.gms.tasks.Task;
import g3.InterfaceC1748i;
import g3.aj;
import g3.ak;
import h9.aq;
import java.util.ArrayList;
import java.util.List;
import k4.C2007a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l3.AbstractC2056a;
import s6.J4;
import s6.M4;
import s6.O4;
import s6.P4;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final class u extends LocationCallback {
    public final /* synthetic */ ab alpha;
    public final /* synthetic */ FusedLocationProviderClient bravo;
    public final /* synthetic */ C2269a charlie;

    public u(ab abVar, FusedLocationProviderClient fusedLocationProviderClient, C2269a c2269a) {
        this.alpha = abVar;
        this.bravo = fusedLocationProviderClient;
        this.charlie = c2269a;
    }

    public static final void alpha(ab abVar, FusedLocationProviderClient fusedLocationProviderClient, u uVar, C2269a c2269a, String str) {
        if (!abVar.tango) {
            return;
        }
        abVar.tango = false;
        abVar.alpha.charlie.alpha("LocationFlow", "Warmup ended: ".concat(str));
        fusedLocationProviderClient.removeLocationUpdates(uVar);
        fusedLocationProviderClient.requestLocationUpdates(c2269a.alpha, uVar, Looper.getMainLooper());
        abVar.beige = c2269a.alpha;
    }

    public static final void bravo(float f5, long j5, Location location, String str, ab abVar) {
        abVar.alpha.charlie.alpha("LocationFlow", str + " acc=" + f5 + "m");
        ae aeVar = ae.red;
        M4 bravo = ab.bravo(abVar, location, aeVar);
        boolean z2 = bravo instanceof g3.x;
        C2272d c2272d = abVar.alpha;
        InterfaceC3142e interfaceC3142e = c2272d.charlie;
        if (z2) {
            interfaceC3142e.alpha("LocationFlow", "Skipping location (validation: " + ((g3.x) bravo).bravo + ")");
            return;
        }
        if (bravo instanceof g3.y) {
            if (g3.aa.alpha(location.getLatitude(), location.getLongitude(), j5, abVar.victor)) {
                interfaceC3142e.alpha("LocationFlow", "Skipped near-duplicate (warmup)");
                return;
            }
            g3.ab abVar2 = abVar.victor;
            if (abVar2.alpha != 0 && location.getTime() == abVar2.alpha) {
                interfaceC3142e.alpha("LocationFlow", "Skipped duplicate timestamp");
                return;
            }
            if (c2272d.foxtrot.getState() == ah.purple) {
                try {
                    long j6 = abVar.yankee + 1;
                    abVar.yankee = j6;
                    String locationsTopic = c2272d.echo.getLocationsTopic();
                    if (locationsTopic != null && !StringsKt.gray(locationsTopic)) {
                        abVar.echo.charlie(location, locationsTopic, c2272d.delta.toPayload(location), aeVar, new n(abVar, location, 1), new V(j6, 2, abVar));
                        location.getLatitude();
                        location.getLongitude();
                        abVar.oscar = true;
                        return;
                    }
                    interfaceC3142e.alpha("LocationFlow", "STOMP locationsTopic is null or blank");
                    location.getLatitude();
                    location.getLongitude();
                    abVar.oscar = true;
                    return;
                } catch (Exception e) {
                    interfaceC3142e.alpha("LocationFlow", "Exception sending location ➜ " + e.getMessage());
                    return;
                }
            }
            interfaceC3142e.alpha("LocationFlow", "STOMP not connected — skipping location push");
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0307, code lost:
    
        if (r13 < r27) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x045e  */
    @Override // com.google.android.gms.location.LocationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLocationResult(LocationResult locationResult) {
        String str;
        Location location;
        FusedLocationProviderClient fusedLocationProviderClient;
        String str2;
        long j5;
        long j6;
        long j7;
        long j10;
        long j11;
        Location location2;
        long j12;
        long j13;
        long max;
        long max2;
        String str3;
        String str4;
        ah state;
        boolean z2;
        M4 bravo;
        EnumC2270b enumC2270b;
        long j14;
        long j15;
        float f5;
        boolean z10;
        boolean z11;
        boolean z12;
        P4 ahVar;
        String str5;
        Intrinsics.echo(locationResult, "locationResult");
        ab abVar = this.alpha;
        if (!AbstractC2056a.charlie(abVar.alpha.alpha)) {
            str = "DEGRADED";
        } else {
            str = "HIGH";
        }
        C2272d c2272d = abVar.alpha;
        ah state2 = c2272d.foxtrot.getState();
        int size = locationResult.getLocations().size();
        InterfaceC3142e interfaceC3142e = c2272d.charlie;
        boolean z13 = abVar.hotel;
        StringBuilder lima = A0.z.lima("[CALLBACK_TRIGGERED] onLocationResult called | locationsCount=", " | accuracyMode=", str, " | STOMP=", size);
        lima.append(state2);
        lima.append(" | callbackRegistered=");
        lima.append(z13);
        interfaceC3142e.alpha("LocationFlow", lima.toString());
        List locations = locationResult.getLocations();
        Intrinsics.delta(locations, "getLocations(...)");
        Location location3 = (Location) CollectionsKt.green(locations);
        if (location3 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            float accuracy = location3.getAccuracy();
            if (Math.abs(accuracy) <= Float.MAX_VALUE) {
                float f10 = c2272d.kilo;
                FusedLocationProviderClient fusedLocationProviderClient2 = this.bravo;
                InterfaceC3142e interfaceC3142e2 = c2272d.charlie;
                if (accuracy > f10) {
                    c2272d.charlie.alpha("LocationFlow", "[SKIP_POOR_ACCURACY] Skipping due to poor accuracy: " + accuracy + "m (> " + f10 + "m) | lat=" + location3.getLatitude() + ", lng=" + location3.getLongitude() + " | accuracyMode=" + str);
                    try {
                        Task lastLocation = fusedLocationProviderClient2.getLastLocation();
                        aq aqVar = new aq(9, new C2007a(8, abVar, this));
                        G6.q qVar = (G6.q) lastLocation;
                        qVar.getClass();
                        ExecutorC0753f executorC0753f = G6.i.alpha;
                        qVar.echo(executorC0753f, aqVar);
                        qVar.delta(executorC0753f, new C2274f(abVar));
                        Intrinsics.checkNotNull(qVar);
                        return;
                    } catch (Exception e) {
                        interfaceC3142e2.alpha("LocationFlow", "Exception getting last-known location: " + e.getMessage());
                        return;
                    }
                }
                abVar.zulu = currentTimeMillis;
                abVar.foxtrot(null);
                boolean z14 = abVar.tango;
                C2269a c2269a = this.charlie;
                InterfaceC1748i interfaceC1748i = c2272d.juliet;
                if (z14) {
                    g3.ag agVar = abVar.uniform;
                    boolean z15 = agVar.bravo;
                    P4 p4 = g3.ai.bravo;
                    if (!z15) {
                        j15 = currentTimeMillis;
                        f5 = accuracy;
                    } else {
                        j15 = currentTimeMillis;
                        f5 = accuracy;
                        long j16 = j15 - agVar.charlie;
                        if (f5 <= 10.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (f5 <= 20.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (f5 <= agVar.alpha) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!agVar.echo && j16 >= 3000 && z12) {
                            agVar.echo = true;
                            p4 = aj.bravo;
                        } else if (z11 && !agVar.foxtrot) {
                            agVar.foxtrot = true;
                            agVar.bravo = false;
                            p4 = ak.bravo;
                        } else {
                            if (z10) {
                                agVar.bravo = false;
                                ahVar = new g3.ah("<=10m_fix");
                            } else if (j15 >= agVar.delta) {
                                agVar.bravo = false;
                                ahVar = new g3.ah("timeout");
                            }
                            if (ahVar instanceof g3.ai) {
                                if (ahVar instanceof aj) {
                                    location = location3;
                                    float f11 = f5;
                                    bravo(f11, j15, location, "ProvisionalSent", abVar);
                                    f5 = f11;
                                    abVar.sierra = true;
                                } else {
                                    location = location3;
                                    if (ahVar instanceof ak) {
                                        bravo(f5, j15, location, "UpgradeSent", abVar);
                                        alpha(abVar, fusedLocationProviderClient2, this, c2269a, "accurate_fix");
                                        return;
                                    }
                                    float f12 = f5;
                                    if (ahVar instanceof g3.ah) {
                                        String str6 = ((g3.ah) ahVar).bravo;
                                        if (Intrinsics.areEqual(str6, "timeout")) {
                                            interfaceC3142e2.alpha("LocationFlow", com.google.android.material.datepicker.j.kilo("WarmupTimeout after ", j15 - abVar.romeo, "ms"));
                                            com.google.android.material.datepicker.j.charlie(interfaceC1748i, "WarmupTimeout", 2);
                                            if (!abVar.sierra && f12 <= c2272d.kilo) {
                                                accuracy = f12;
                                                str5 = str6;
                                                fusedLocationProviderClient = fusedLocationProviderClient2;
                                                str2 = " | STOMP=";
                                                bravo(accuracy, j15, location, "TimeoutForcedSend", abVar);
                                                alpha(abVar, fusedLocationProviderClient, this, c2269a, str5);
                                                if (abVar.tango) {
                                                    return;
                                                }
                                            } else {
                                                str5 = str6;
                                                fusedLocationProviderClient = fusedLocationProviderClient2;
                                                str2 = " | STOMP=";
                                            }
                                        } else {
                                            fusedLocationProviderClient = fusedLocationProviderClient2;
                                            str2 = " | STOMP=";
                                            str5 = str6;
                                        }
                                        accuracy = f12;
                                        alpha(abVar, fusedLocationProviderClient, this, c2269a, str5);
                                        if (abVar.tango) {
                                        }
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else {
                                location = location3;
                            }
                            accuracy = f5;
                            fusedLocationProviderClient = fusedLocationProviderClient2;
                            str2 = " | STOMP=";
                            if (abVar.tango) {
                            }
                        }
                    }
                    ahVar = p4;
                    if (ahVar instanceof g3.ai) {
                    }
                    accuracy = f5;
                    fusedLocationProviderClient = fusedLocationProviderClient2;
                    str2 = " | STOMP=";
                    if (abVar.tango) {
                    }
                } else {
                    location = location3;
                    fusedLocationProviderClient = fusedLocationProviderClient2;
                    str2 = " | STOMP=";
                }
                if (accuracy > 50.0f) {
                    com.google.android.material.datepicker.j.charlie(interfaceC1748i, "WeakOrPoorAccuracy(" + accuracy + "m)", 6);
                }
                if (!abVar.oscar) {
                    location.getLatitude();
                    location.getLongitude();
                    abVar.oscar = true;
                }
                float charlie = J4.charlie(location.getSpeed(), 0.0f, 50.0f);
                long currentTimeMillis2 = System.currentTimeMillis();
                g3.ac acVar = abVar.xray;
                acVar.getClass();
                float f13 = accuracy;
                float charlie2 = J4.charlie(charlie, 0.0f, 50.0f);
                if (!acVar.bravo) {
                    acVar.bravo = true;
                    if (charlie2 > 30.0f) {
                        charlie2 = 30.0f;
                    }
                    acVar.alpha = charlie2;
                } else {
                    float f14 = ((1 - 0.3f) * acVar.alpha) + (charlie2 * 0.3f);
                    if (f14 > 30.0f) {
                        f14 = 30.0f;
                    }
                    acVar.alpha = f14;
                    charlie2 = f14;
                }
                g3.ab state3 = abVar.victor;
                Intrinsics.echo(state3, "state");
                if (charlie2 <= 1.6f) {
                    if (state3.foxtrot == 0) {
                        state3.foxtrot = currentTimeMillis2;
                    }
                    j5 = 0;
                } else {
                    j5 = 0;
                    state3.foxtrot = 0L;
                    state3.golf = false;
                }
                long j17 = 10000;
                if (!state3.golf) {
                    long j18 = j5;
                    long j19 = state3.foxtrot;
                    if (j19 != j18 && currentTimeMillis2 - j19 >= 10000) {
                        state3.golf = true;
                        if (charlie2 >= 0.5f) {
                            j6 = 0;
                            if (state3.india == 0) {
                                state3.india = currentTimeMillis2;
                                j6 = 0;
                            }
                        } else {
                            j6 = 0;
                            state3.india = 0L;
                        }
                        abVar.papa = state3.golf;
                        j7 = j6;
                        long currentTimeMillis3 = System.currentTimeMillis();
                        j10 = state3.india;
                        if (j10 != j7) {
                            j11 = currentTimeMillis3 - j10;
                        }
                        j11 = 0;
                        if (j11 >= OkHttpConstants.READ_TIMEOUT_MS || charlie2 >= 0.5f) {
                            if (charlie2 <= 20.0f) {
                                j17 = 5000;
                            } else if (charlie2 > 5.0f) {
                                j17 = 8000;
                            } else if (f13 <= 80.0f) {
                                if (f13 <= 40.0f) {
                                    location2 = location;
                                    j12 = 15000;
                                    j13 = j12 / 2;
                                    if (j13 < 3000) {
                                        j13 = 3000;
                                    }
                                    UserInfoProvider userInfoProvider = c2272d.echo;
                                    long locationInterval = userInfoProvider.getLocationInterval();
                                    long locationFastestInterval = userInfoProvider.getLocationFastestInterval();
                                    max = Math.max(locationInterval, j12);
                                    max2 = Math.max(locationFastestInterval, j13);
                                    if ((Math.abs(max - c2269a.bravo) >= Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS && currentTimeMillis3 - state3.hotel <= 15000) || (max == c2269a.bravo && max2 == c2269a.charlie)) {
                                        str3 = "LocationFlow";
                                    } else {
                                        c2269a.bravo = max;
                                        c2269a.charlie = max2;
                                        LocationRequest alpha = O4.alpha(max, max2);
                                        c2269a.alpha = alpha;
                                        abVar.beige = alpha;
                                        fusedLocationProviderClient.removeLocationUpdates(this);
                                        fusedLocationProviderClient.requestLocationUpdates(c2269a.alpha, this, Looper.getMainLooper());
                                        str3 = "LocationFlow";
                                        interfaceC3142e2.alpha(str3, Q0.c.mike(c2269a.charlie, "ms", Q0.c.uniform("Intervals updated: ", c2269a.bravo, "/")));
                                        state3.hotel = currentTimeMillis3;
                                    }
                                    if (AbstractC2056a.charlie(c2272d.alpha)) {
                                        str4 = "DEGRADED";
                                    } else {
                                        str4 = "HIGH";
                                    }
                                    StompStateHolder stompStateHolder = c2272d.foxtrot;
                                    state = stompStateHolder.getState();
                                    double latitude = location2.getLatitude();
                                    double longitude = location2.getLongitude();
                                    float accuracy2 = location2.getAccuracy();
                                    if (state != ah.purple) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    interfaceC3142e2.alpha(str3, "[LOCATION_RECEIVED] Location received | lat=" + latitude + ", lng=" + longitude + ", accuracy=" + accuracy2 + "m | accuracyMode=" + str4 + str2 + state + " | willSend=" + z2);
                                    Location location4 = location2;
                                    bravo = ab.bravo(abVar, location4, ae.purple);
                                    if (!(bravo instanceof g3.x)) {
                                        interfaceC3142e2.alpha(str3, "[SKIP_VALIDATION] Skipping location: " + ((g3.x) bravo).bravo + " | lat=" + location4.getLatitude() + ", lng=" + location4.getLongitude() + " | accuracyMode=" + str4);
                                        return;
                                    }
                                    if (bravo instanceof g3.y) {
                                        C1475w c1475w = EnumC2270b.purple;
                                        float accuracy3 = location4.getAccuracy();
                                        c1475w.getClass();
                                        EnumC2270b[] values = EnumC2270b.values();
                                        int length = values.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < length) {
                                                EnumC2270b enumC2270b2 = values[i4];
                                                Float f15 = enumC2270b2.alpha;
                                                if (f15 != null && accuracy3 <= f15.floatValue()) {
                                                    enumC2270b = enumC2270b2;
                                                    break;
                                                }
                                                i4++;
                                            } else {
                                                enumC2270b = null;
                                                break;
                                            }
                                        }
                                        if (enumC2270b == null) {
                                            enumC2270b = EnumC2270b.yellow;
                                        }
                                        EnumC2270b enumC2270b3 = enumC2270b;
                                        if (stompStateHolder.getGpsQuality() != enumC2270b3) {
                                            interfaceC3142e2.alpha(str3, "GPS quality changed: " + enumC2270b3);
                                            stompStateHolder.setGpsQuality(enumC2270b3);
                                        }
                                        if (stompStateHolder.getState() == ah.purple) {
                                            B2.ad adVar = abVar.echo;
                                            if (!((ArrayList) adVar.foxtrot).isEmpty()) {
                                                interfaceC3142e2.alpha(str3, "[STOMP_RECONNECT] Retrying " + ((ArrayList) adVar.foxtrot).size() + " pending locations | accuracyMode=" + str4);
                                                adVar.bravo();
                                            }
                                            try {
                                                ab.alpha(abVar, location4, abVar.papa);
                                                return;
                                            } catch (Exception e4) {
                                                long j20 = abVar.yankee;
                                                String message = e4.getMessage();
                                                StringBuilder sb2 = new StringBuilder("[EXCEPTION] Exception sending location | seq=");
                                                sb2.append(j20);
                                                sb2.append(" | error=");
                                                sb2.append(message);
                                                interfaceC3142e2.bravo(str3, P0.gold(sb2, " | accuracyMode=", str4), e4);
                                                try {
                                                    K7.b.alpha().charlie(e4);
                                                    return;
                                                } catch (Exception unused) {
                                                    return;
                                                }
                                            }
                                        }
                                        ah state4 = stompStateHolder.getState();
                                        if (abVar.quebec > 0) {
                                            j14 = System.currentTimeMillis() - abVar.quebec;
                                        } else {
                                            j14 = 0;
                                        }
                                        interfaceC3142e2.alpha(str3, "[STOMP_SKIP] STOMP not connected (" + state4 + ") skipping location push | timeSinceServiceStart=" + j14 + "ms");
                                        return;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            location2 = location;
                            j12 = j17;
                            j13 = j12 / 2;
                            if (j13 < 3000) {
                            }
                            UserInfoProvider userInfoProvider2 = c2272d.echo;
                            long locationInterval2 = userInfoProvider2.getLocationInterval();
                            long locationFastestInterval2 = userInfoProvider2.getLocationFastestInterval();
                            max = Math.max(locationInterval2, j12);
                            max2 = Math.max(locationFastestInterval2, j13);
                            if (Math.abs(max - c2269a.bravo) >= Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS) {
                            }
                            c2269a.bravo = max;
                            c2269a.charlie = max2;
                            LocationRequest alpha2 = O4.alpha(max, max2);
                            c2269a.alpha = alpha2;
                            abVar.beige = alpha2;
                            fusedLocationProviderClient.removeLocationUpdates(this);
                            fusedLocationProviderClient.requestLocationUpdates(c2269a.alpha, this, Looper.getMainLooper());
                            str3 = "LocationFlow";
                            interfaceC3142e2.alpha(str3, Q0.c.mike(c2269a.charlie, "ms", Q0.c.uniform("Intervals updated: ", c2269a.bravo, "/")));
                            state3.hotel = currentTimeMillis3;
                            if (AbstractC2056a.charlie(c2272d.alpha)) {
                            }
                            StompStateHolder stompStateHolder2 = c2272d.foxtrot;
                            state = stompStateHolder2.getState();
                            double latitude2 = location2.getLatitude();
                            double longitude2 = location2.getLongitude();
                            float accuracy22 = location2.getAccuracy();
                            if (state != ah.purple) {
                            }
                            interfaceC3142e2.alpha(str3, "[LOCATION_RECEIVED] Location received | lat=" + latitude2 + ", lng=" + longitude2 + ", accuracy=" + accuracy22 + "m | accuracyMode=" + str4 + str2 + state + " | willSend=" + z2);
                            Location location42 = location2;
                            bravo = ab.bravo(abVar, location42, ae.purple);
                            if (!(bravo instanceof g3.x)) {
                            }
                        }
                        location2 = location;
                        j12 = 25000;
                        j13 = j12 / 2;
                        if (j13 < 3000) {
                        }
                        UserInfoProvider userInfoProvider22 = c2272d.echo;
                        long locationInterval22 = userInfoProvider22.getLocationInterval();
                        long locationFastestInterval22 = userInfoProvider22.getLocationFastestInterval();
                        max = Math.max(locationInterval22, j12);
                        max2 = Math.max(locationFastestInterval22, j13);
                        if (Math.abs(max - c2269a.bravo) >= Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS) {
                        }
                        c2269a.bravo = max;
                        c2269a.charlie = max2;
                        LocationRequest alpha22 = O4.alpha(max, max2);
                        c2269a.alpha = alpha22;
                        abVar.beige = alpha22;
                        fusedLocationProviderClient.removeLocationUpdates(this);
                        fusedLocationProviderClient.requestLocationUpdates(c2269a.alpha, this, Looper.getMainLooper());
                        str3 = "LocationFlow";
                        interfaceC3142e2.alpha(str3, Q0.c.mike(c2269a.charlie, "ms", Q0.c.uniform("Intervals updated: ", c2269a.bravo, "/")));
                        state3.hotel = currentTimeMillis3;
                        if (AbstractC2056a.charlie(c2272d.alpha)) {
                        }
                        StompStateHolder stompStateHolder22 = c2272d.foxtrot;
                        state = stompStateHolder22.getState();
                        double latitude22 = location2.getLatitude();
                        double longitude22 = location2.getLongitude();
                        float accuracy222 = location2.getAccuracy();
                        if (state != ah.purple) {
                        }
                        interfaceC3142e2.alpha(str3, "[LOCATION_RECEIVED] Location received | lat=" + latitude22 + ", lng=" + longitude22 + ", accuracy=" + accuracy222 + "m | accuracyMode=" + str4 + str2 + state + " | willSend=" + z2);
                        Location location422 = location2;
                        bravo = ab.bravo(abVar, location422, ae.purple);
                        if (!(bravo instanceof g3.x)) {
                        }
                    }
                }
                if (charlie2 >= 0.5f) {
                }
                abVar.papa = state3.golf;
                j7 = j6;
                long currentTimeMillis32 = System.currentTimeMillis();
                j10 = state3.india;
                if (j10 != j7) {
                }
                j11 = 0;
                if (j11 >= OkHttpConstants.READ_TIMEOUT_MS) {
                }
                if (charlie2 <= 20.0f) {
                }
                location2 = location;
                j12 = j17;
                j13 = j12 / 2;
                if (j13 < 3000) {
                }
                UserInfoProvider userInfoProvider222 = c2272d.echo;
                long locationInterval222 = userInfoProvider222.getLocationInterval();
                long locationFastestInterval222 = userInfoProvider222.getLocationFastestInterval();
                max = Math.max(locationInterval222, j12);
                max2 = Math.max(locationFastestInterval222, j13);
                if (Math.abs(max - c2269a.bravo) >= Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS) {
                }
                c2269a.bravo = max;
                c2269a.charlie = max2;
                LocationRequest alpha222 = O4.alpha(max, max2);
                c2269a.alpha = alpha222;
                abVar.beige = alpha222;
                fusedLocationProviderClient.removeLocationUpdates(this);
                fusedLocationProviderClient.requestLocationUpdates(c2269a.alpha, this, Looper.getMainLooper());
                str3 = "LocationFlow";
                interfaceC3142e2.alpha(str3, Q0.c.mike(c2269a.charlie, "ms", Q0.c.uniform("Intervals updated: ", c2269a.bravo, "/")));
                state3.hotel = currentTimeMillis32;
                if (AbstractC2056a.charlie(c2272d.alpha)) {
                }
                StompStateHolder stompStateHolder222 = c2272d.foxtrot;
                state = stompStateHolder222.getState();
                double latitude222 = location2.getLatitude();
                double longitude222 = location2.getLongitude();
                float accuracy2222 = location2.getAccuracy();
                if (state != ah.purple) {
                }
                interfaceC3142e2.alpha(str3, "[LOCATION_RECEIVED] Location received | lat=" + latitude222 + ", lng=" + longitude222 + ", accuracy=" + accuracy2222 + "m | accuracyMode=" + str4 + str2 + state + " | willSend=" + z2);
                Location location4222 = location2;
                bravo = ab.bravo(abVar, location4222, ae.purple);
                if (!(bravo instanceof g3.x)) {
                }
            } else {
                c2272d.charlie.alpha("LocationFlow", "[SKIP_INVALID_ACCURACY] Invalid accuracy value; skipping | lat=" + location3.getLatitude() + ", lng=" + location3.getLongitude() + " | accuracyMode=" + str);
            }
        }
    }
}
