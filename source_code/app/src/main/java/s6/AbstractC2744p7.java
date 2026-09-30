package s6;

import a0.C0366t;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.WorkSource;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.feature.location.store.LastSentLocationStore;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import pb.C2299a;
import t6.AbstractC3016k2;
import z3.C3462a;

/* renamed from: s6.p7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2744p7 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(String text, Function0 onClick, boolean z2, T.s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        P.d dVar2;
        int i14;
        boolean z11;
        C0585q c0585q;
        T.s sVar2;
        boolean z12;
        androidx.compose.runtime.Q uniform;
        int i15;
        boolean z13 = true;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-751922389);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(text)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        int i16 = i5 & 4;
        if (i16 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z10 = z2;
            if (c0585q2.hotel(z10)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i10 | 3072;
            i13 = i5 & 16;
            if (i13 == 0) {
                i12 = i10 | 27648;
            } else if ((i4 & 24576) == 0) {
                dVar2 = dVar;
                if (c0585q2.india(dVar2)) {
                    i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
                if ((i12 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0585q2.magenta(i12 & 1, z11)) {
                    if (i16 == 0) {
                        z13 = z10;
                    }
                    T.p pVar = T.p.alpha;
                    if (i13 != 0) {
                        dVar2 = null;
                    }
                    T.s charlie = androidx.compose.foundation.layout.V.charlie(androidx.compose.foundation.layout.V.echo(pVar, 52), 1.0f);
                    androidx.compose.foundation.layout.M m4 = F.al.alpha;
                    int i17 = i12;
                    long j5 = Db.c.india;
                    long bravo = C0366t.bravo(0.5f, j5);
                    long j6 = C0366t.echo;
                    c0585q = c0585q2;
                    boolean z14 = z13;
                    F.K1.bravo(onClick, charlie, z14, Db.a.bravo, F.al.alpha(j5, j6, bravo, C0366t.bravo(0.6f, j6), c0585q2, 0), null, null, null, P.e.echo(1517595419, new Pa.e(dVar2, 2, text), c0585q2), c0585q, 805309446 | (i17 & 896), 480);
                    sVar2 = pVar;
                    z12 = z14;
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    sVar2 = sVar;
                    z12 = z10;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new C2299a(text, onClick, z12, sVar2, dVar2, i4, i5, 1);
                    return;
                }
                return;
            }
            dVar2 = dVar;
            if ((i12 & 9363) != 9362) {
            }
            if (c0585q2.magenta(i12 & 1, z11)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        z10 = z2;
        i12 = i10 | 3072;
        i13 = i5 & 16;
        if (i13 == 0) {
        }
        dVar2 = dVar;
        if ((i12 & 9363) != 9362) {
        }
        if (c0585q2.magenta(i12 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static void bravo(Context context, String label, LastSentLocationStore lastSentLocationStore) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(label, "label");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.delta(uuid, "toString(...)");
        String yellow = StringsKt.yellow(8, uuid);
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder india = av.q.india("LOCATION_SNAPSHOT_BEGIN id=", yellow, " label=", label, " nowMs=");
        india.append(currentTimeMillis);
        C3462a.alpha("LocationFlow", 12, india.toString(), null);
        try {
            Result.Companion companion = Result.INSTANCE;
            golf(context, yellow);
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        try {
            echo(context, yellow);
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            foxtrot(context, yellow);
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th3));
        }
        try {
            delta(yellow, currentTimeMillis, lastSentLocationStore);
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion5 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th4));
        }
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.delta(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        fusedLocationProviderClient.getLastLocation().bravo(new R9.l(yellow, currentTimeMillis));
        com.google.android.gms.location.n.alpha(100);
        fusedLocationProviderClient.getCurrentLocation(new CurrentLocationRequest(10000L, 0, 100, 3000L, false, 0, new WorkSource(null), null), new G6.l()).bravo(new R9.l(currentTimeMillis, yellow));
    }

    public static String charlie(Location location, long j5) {
        long j6;
        if (location == null) {
            return "location=null";
        }
        if (location.getTime() > 0) {
            j6 = System.currentTimeMillis() - location.getTime();
        } else {
            j6 = -1;
        }
        long currentTimeMillis = System.currentTimeMillis() - j5;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float accuracy = location.getAccuracy();
        String provider = location.getProvider();
        long time = location.getTime();
        StringBuilder sb2 = new StringBuilder("lat=");
        sb2.append(latitude);
        sb2.append(" lng=");
        sb2.append(longitude);
        sb2.append(" acc=");
        sb2.append(accuracy);
        sb2.append("m provider=");
        sb2.append(provider);
        sb2.append(" time=");
        sb2.append(time);
        Q0.c.amber(sb2, " ageMs=", j6, " resolvedAfterMs=");
        sb2.append(currentTimeMillis);
        return sb2.toString();
    }

    public static void delta(String str, long j5, LastSentLocationStore lastSentLocationStore) {
        long j6;
        Location location = lastSentLocationStore.get();
        if (location == null) {
            C3462a.alpha("LocationFlow", 12, ao.ad.gray("LOCATION_SNAPSHOT id=", str, " lastSent: null"), null);
            return;
        }
        if (location.getTime() > 0) {
            j6 = j5 - location.getTime();
        } else {
            j6 = -1;
        }
        C3462a.alpha("LocationFlow", 12, "LOCATION_SNAPSHOT id=" + str + " lastSent: lat=" + location.getLatitude() + " lng=" + location.getLongitude() + " acc=" + location.getAccuracy() + "m ageMs=" + j6, null);
    }

    public static void echo(Context context, String str) {
        LocationManager locationManager;
        Object m206constructorimpl;
        Boolean valueOf;
        Object m206constructorimpl2;
        Boolean valueOf2;
        Object m206constructorimpl3;
        Boolean valueOf3;
        Object m206constructorimpl4;
        Boolean bool;
        boolean isLocationEnabled;
        Boolean valueOf4;
        Object m206constructorimpl5;
        Boolean bool2;
        Object systemService = context.getSystemService("location");
        if (systemService instanceof LocationManager) {
            locationManager = (LocationManager) systemService;
        } else {
            locationManager = null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (locationManager != null) {
                bool2 = Boolean.valueOf(locationManager.isProviderEnabled("gps"));
            } else {
                bool2 = null;
            }
            m206constructorimpl = Result.m206constructorimpl(bool2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        Boolean bool3 = (Boolean) m206constructorimpl;
        if (locationManager != null) {
            try {
                valueOf = Boolean.valueOf(locationManager.isProviderEnabled("network"));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
            }
        } else {
            valueOf = null;
        }
        m206constructorimpl2 = Result.m206constructorimpl(valueOf);
        if (m206constructorimpl2 instanceof kotlin.k) {
            m206constructorimpl2 = null;
        }
        Boolean bool4 = (Boolean) m206constructorimpl2;
        if (locationManager != null) {
            try {
                valueOf2 = Boolean.valueOf(locationManager.isProviderEnabled("fused"));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m206constructorimpl3 = Result.m206constructorimpl(ResultKt.createFailure(th3));
            }
        } else {
            valueOf2 = null;
        }
        m206constructorimpl3 = Result.m206constructorimpl(valueOf2);
        if (m206constructorimpl3 instanceof kotlin.k) {
            m206constructorimpl3 = null;
        }
        Boolean bool5 = (Boolean) m206constructorimpl3;
        if (locationManager != null) {
            try {
                valueOf3 = Boolean.valueOf(locationManager.isProviderEnabled("passive"));
            } catch (Throwable th4) {
                Result.Companion companion5 = Result.INSTANCE;
                m206constructorimpl4 = Result.m206constructorimpl(ResultKt.createFailure(th4));
            }
        } else {
            valueOf3 = null;
        }
        m206constructorimpl4 = Result.m206constructorimpl(valueOf3);
        if (m206constructorimpl4 instanceof kotlin.k) {
            m206constructorimpl4 = null;
        }
        Boolean bool6 = (Boolean) m206constructorimpl4;
        if (Build.VERSION.SDK_INT >= 28) {
            if (locationManager != null) {
                try {
                    isLocationEnabled = locationManager.isLocationEnabled();
                    valueOf4 = Boolean.valueOf(isLocationEnabled);
                } catch (Throwable th5) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m206constructorimpl5 = Result.m206constructorimpl(ResultKt.createFailure(th5));
                }
            } else {
                valueOf4 = null;
            }
            m206constructorimpl5 = Result.m206constructorimpl(valueOf4);
            if (m206constructorimpl5 instanceof kotlin.k) {
                m206constructorimpl5 = null;
            }
            bool = (Boolean) m206constructorimpl5;
        } else {
            bool = null;
        }
        C3462a.alpha("LocationFlow", 12, "LOCATION_SNAPSHOT id=" + str + " providers: gps=" + bool3 + " network=" + bool4 + " fused=" + bool5 + " passive=" + bool6 + " locationEnabled=" + bool, null);
    }

    public static void foxtrot(Context context, String str) {
        long j5;
        Object m206constructorimpl;
        Object m206constructorimpl2;
        long j6;
        boolean xray = L9.d.xray(context);
        boolean z2 = CaptainLocationMonitoringService.f12066D;
        C3462a.alpha("LocationFlow", 12, "LOCATION_SNAPSHOT id=" + str + " service: running=" + xray + " enabled=" + AbstractC3016k2.bravo(context) + " stomp=" + ((p3.ah) CaptainLocationMonitoringService.f12067E.getValue()).name(), null);
        long currentTimeMillis = System.currentTimeMillis();
        Long l10 = CaptainLocationMonitoringService.f12081T;
        if (l10 != null && l10.longValue() > 0) {
            j5 = currentTimeMillis - l10.longValue();
        } else {
            j5 = -1;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(context.getApplicationContext().getSharedPreferences("LocationServicePrefs", 0).getString("last_restart_trigger", null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        String str2 = (String) m206constructorimpl;
        try {
            m206constructorimpl2 = Result.m206constructorimpl(Long.valueOf(context.getApplicationContext().getSharedPreferences("LocationServicePrefs", 0).getLong("last_restart_at_ms", 0L)));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        if (m206constructorimpl2 instanceof kotlin.k) {
            m206constructorimpl2 = 0L;
        }
        long longValue = ((Number) m206constructorimpl2).longValue();
        if (longValue > 0) {
            j6 = currentTimeMillis - longValue;
        } else {
            j6 = -1;
        }
        C3462a.alpha("LocationFlow", 12, "LOCATION_SNAPSHOT id=" + str + " resilience: coverageGapMs=" + j5 + " lastRestartTrigger=" + str2 + " lastRestartAgeMs=" + j6, null);
    }

    public static void golf(Context context, String str) {
        PowerManager powerManager;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Object m206constructorimpl;
        Integer num;
        UsageStatsManager usageStatsManager;
        Integer num2;
        int appStandbyBucket;
        Object systemService = context.getSystemService("power");
        if (systemService instanceof PowerManager) {
            powerManager = (PowerManager) systemService;
        } else {
            powerManager = null;
        }
        String packageName = context.getPackageName();
        if (powerManager != null) {
            bool = Boolean.valueOf(powerManager.isDeviceIdleMode());
        } else {
            bool = null;
        }
        if (powerManager != null) {
            bool2 = Boolean.valueOf(powerManager.isPowerSaveMode());
        } else {
            bool2 = null;
        }
        if (powerManager != null) {
            bool3 = Boolean.valueOf(powerManager.isIgnoringBatteryOptimizations(packageName));
        } else {
            bool3 = null;
        }
        if (powerManager != null) {
            bool4 = Boolean.valueOf(powerManager.isInteractive());
        } else {
            bool4 = null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Object systemService2 = context.getSystemService("usagestats");
                if (systemService2 instanceof UsageStatsManager) {
                    usageStatsManager = (UsageStatsManager) systemService2;
                } else {
                    usageStatsManager = null;
                }
                if (usageStatsManager != null) {
                    appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                    num2 = Integer.valueOf(appStandbyBucket);
                } else {
                    num2 = null;
                }
                m206constructorimpl = Result.m206constructorimpl(num2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (m206constructorimpl instanceof kotlin.k) {
                m206constructorimpl = null;
            }
            num = (Integer) m206constructorimpl;
        } else {
            num = null;
        }
        C3462a.alpha("LocationFlow", 12, "LOCATION_SNAPSHOT id=" + str + " system: dozeMode=" + bool + " powerSave=" + bool2 + " ignoringBattOpt=" + bool3 + " interactive=" + bool4 + " standbyBucket=" + num + " sdk=" + Build.VERSION.SDK_INT, null);
    }
}
