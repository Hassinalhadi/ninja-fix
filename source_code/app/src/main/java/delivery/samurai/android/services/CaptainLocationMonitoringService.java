package delivery.samurai.android.services;

import F6.b;
import F8.q;
import L9.d;
import N9.a;
import Nb.i;
import X9.m;
import Y9.e;
import Y9.h;
import Y9.l;
import Z9.c;
import Z9.f;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import androidx.appcompat.widget.P0;
import ca.n;
import com.app.feature.location.LocationBroadcastConfig;
import com.app.feature.location.api.AllowMockProvider;
import com.app.feature.location.api.LocationFeature;
import com.app.feature.location.api.LocationPayloadMapper;
import com.app.feature.location.api.StompStateHolder;
import com.app.feature.location.api.UserInfoProvider;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.UserInfo;
import com.google.maps.android.BuildConfig;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.splash.SplashActivity;
import f1.s;
import g3.C1743d;
import g3.InterfaceC1740a;
import g3.ad;
import g3.ae;
import g3.w;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.C2003b;
import k3.InterfaceC2002a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p3.EnumC2270b;
import p3.ah;
import pe.AbstractC2327c;
import s6.AbstractC2754r0;
import s6.J7;
import t6.AbstractC3016k2;
import t6.AbstractC3026m2;
import t6.AbstractC3031n2;
import t6.AbstractC3036o2;
import t6.AbstractC3070v2;
import t6.AbstractC3075w2;
import u3.InterfaceC3142e;
import u3.InterfaceC3143f;
import v3.InterfaceC3171a;
import yf.AbstractC3428A;
import yf.N;
import z3.C3462a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ldelivery/samurai/android/services/CaptainLocationMonitoringService;", "Landroid/app/Service;", "<init>", "()V", "Y9/c", "t6/k2", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class CaptainLocationMonitoringService extends h {
    public static long C;

    /* renamed from: D, reason: collision with root package name */
    public static volatile boolean f12066D;

    /* renamed from: E, reason: collision with root package name */
    public static final N f12067E = AbstractC3428A.charlie(ah.alpha);

    /* renamed from: F, reason: collision with root package name */
    public static final N f12068F = AbstractC3428A.charlie(EnumC2270b.f13137a);

    /* renamed from: G, reason: collision with root package name */
    public static final AtomicBoolean f12069G = new AtomicBoolean(false);

    /* renamed from: H, reason: collision with root package name */
    public static Integer f12070H;

    /* renamed from: I, reason: collision with root package name */
    public static String f12071I;

    /* renamed from: J, reason: collision with root package name */
    public static String f12072J;

    /* renamed from: K, reason: collision with root package name */
    public static Long f12073K;

    /* renamed from: L, reason: collision with root package name */
    public static Long f12074L;

    /* renamed from: M, reason: collision with root package name */
    public static int f12075M;

    /* renamed from: N, reason: collision with root package name */
    public static int f12076N;

    /* renamed from: O, reason: collision with root package name */
    public static Long f12077O;

    /* renamed from: P, reason: collision with root package name */
    public static Long f12078P;
    public static Long Q;

    /* renamed from: R, reason: collision with root package name */
    public static Integer f12079R;

    /* renamed from: S, reason: collision with root package name */
    public static Long f12080S;

    /* renamed from: T, reason: collision with root package name */
    public static Long f12081T;
    public final e A;

    /* renamed from: a, reason: collision with root package name */
    public ad f12082a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3142e f12083b;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f12086f;

    /* renamed from: g, reason: collision with root package name */
    public i f12087g;

    /* renamed from: h, reason: collision with root package name */
    public w f12088h;

    /* renamed from: i, reason: collision with root package name */
    public c f12089i;

    /* renamed from: j, reason: collision with root package name */
    public UserInfoProvider f12090j;

    /* renamed from: k, reason: collision with root package name */
    public StompStateHolder f12091k;

    /* renamed from: l, reason: collision with root package name */
    public AllowMockProvider f12092l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC1740a f12093m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC2002a f12094n;

    /* renamed from: o, reason: collision with root package name */
    public LocationBroadcastConfig f12095o;

    /* renamed from: p, reason: collision with root package name */
    public LocationPayloadMapper f12096p;

    /* renamed from: q, reason: collision with root package name */
    public PowerManager.WakeLock f12097q;

    /* renamed from: r, reason: collision with root package name */
    public Handler f12098r;

    /* renamed from: s, reason: collision with root package name */
    public b f12099s;
    public InterfaceC3143f silver;

    /* renamed from: t, reason: collision with root package name */
    public long f12100t;
    public LastSentLocationStore teal;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f12101u;

    /* renamed from: v, reason: collision with root package name */
    public long f12102v;
    public InterfaceC3171a white;
    public ae yellow;

    /* renamed from: z, reason: collision with root package name */
    public final Lazy f12106z;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f12084c = LazyKt.lazy(new Vc.i(15));

    /* renamed from: d, reason: collision with root package name */
    public final Y9.c f12085d = new Y9.c(this);

    /* renamed from: w, reason: collision with root package name */
    public final q f12103w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final l f12104x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final Lazy f12105y = LazyKt.lazy(new Y9.b(this, 0));
    public final e B = new e(this, 0);

    /* JADX WARN: Type inference failed for: r0v3, types: [F8.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Y9.l, java.lang.Object] */
    public CaptainLocationMonitoringService() {
        int i4 = 1;
        this.f12106z = LazyKt.lazy(new Y9.b(this, i4));
        this.A = new e(this, i4);
    }

    public static void golf(C1743d c1743d, String str) {
        C3462a.alpha("LocationFlow", 12, AbstractC2327c.xray(str, ": ", CollectionsKt.maroon(c1743d.bravo, ", ", null, null, new X9.i(10), 30), " → stopping service"), null);
    }

    public final AndroidApp bravo() {
        Application application = getApplication();
        Intrinsics.charlie(application, "null cannot be cast to non-null type delivery.samurai.android.AndroidApp");
        return (AndroidApp) application;
    }

    public final LocationBroadcastConfig charlie() {
        LocationBroadcastConfig locationBroadcastConfig = this.f12095o;
        if (locationBroadcastConfig != null) {
            return locationBroadcastConfig;
        }
        Intrinsics.lima("broadcastConfig");
        throw null;
    }

    public final LocationFeature delta() {
        return (LocationFeature) this.f12105y.getValue();
    }

    public final f echo() {
        return (f) this.f12106z.getValue();
    }

    public final boolean foxtrot() {
        Jwt jwt;
        UserInfo sierra = d.sierra(bravo());
        String romeo = d.romeo(bravo());
        if (sierra != null) {
            jwt = sierra.getJwt();
        } else {
            jwt = null;
        }
        if (jwt != null && romeo != null && !StringsKt.gray(romeo)) {
            return true;
        }
        return false;
    }

    public final void hotel(Function1 function1) {
        if (f12069G.get() && this.e) {
            delta().requestSendCurrentLocationIfNeeded(function1);
        } else {
            function1.invoke(new C2003b("service not running", null, null, 30));
        }
    }

    public final void india() {
        if (f12069G.get() && this.e) {
            if (f12066D && f12067E.getValue() != ah.purple) {
                ((n) echo()).echo();
            } else {
                ((n) echo()).charlie();
            }
        }
    }

    public final void juliet() {
        Handler handler;
        b bVar = this.f12099s;
        if (bVar != null && (handler = this.f12098r) != null) {
            handler.removeCallbacks(bVar);
        }
        this.f12098r = null;
        this.f12099s = null;
        C3462a.alpha("LocationFlow", 12, "Periodic compliance check stopped", null);
    }

    public final void kilo(String str) {
        this.f12086f = true;
        C3462a.alpha("LocationFlow", 12, ao.ad.gray("🛑 [SERVICE_LIFECYCLE] intentional stop (", str, ")"), null);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f12085d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|4|(2:5|6)|7|(5:9|(1:11)(1:72)|12|(1:14)(1:71)|(3:17|18|(2:20|21)(2:23|(3:25|(1:27)(2:57|(1:59)(2:60|(4:62|63|64|65)(1:68)))|(2:29|30)(2:31|(6:33|34|35|(5:43|(1:45)|46|(1:48)(1:51)|49)|38|39)(2:55|56)))(2:69|70))))|73|(1:75)(1:85)|76|77|(1:79)(1:82)|80|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00de, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00df, code lost:
    
        z3.C3462a.alpha("CaptainLocationMonitoringService", 12, ao.ad.gray("startForeground with location type failed (perms present): ", r0.getMessage(), " — falling back to minimal"), null);
        s6.J7.echo(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    @Override // Y9.h, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate() {
        String str;
        String str2;
        boolean z2;
        boolean z10;
        super.onCreate();
        try {
            Result.Companion companion = Result.INSTANCE;
            K7.b.alpha().echo("stomp_transport", "v2");
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        String message = "FGS startForeground begin importance=" + J7.alpha();
        Intrinsics.echo(message, "message");
        try {
            K7.b.alpha().bravo(message);
        } catch (Exception unused) {
        }
        AbstractC3075w2.charlie("fgs_process_importance", J7.alpha());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            if (checkSelfPermission("android.permission.FOREGROUND_SERVICE_LOCATION") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z2 || !z10) {
                C3462a.alpha("CaptainLocationMonitoringService", 12, "Missing perms → minimal foreground (no location type)", null);
                J7.echo(this);
                if (f12069G.compareAndSet(false, true)) {
                    C3462a.alpha("LocationFlow", 12, "CaptainLocationMonitoringService duplicate onCreate detected — stopping this instance", null);
                    kilo("duplicate_oncreate");
                    return;
                }
                ah ahVar = (ah) f12067E.getValue();
                C3462a.alpha("LocationFlow", 12, "🔵 [SERVICE_LIFECYCLE] onCreate — instance started | STOMP state: " + ahVar, null);
                Log.i("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onCreate — instance started | STOMP state: " + ahVar);
                InterfaceC3142e interfaceC3142e = this.f12083b;
                if (interfaceC3142e != null) {
                    this.f12087g = new i(this, interfaceC3142e, new Vc.i(17));
                    if (m.bravo(this, "location_service_on_create")) {
                        str2 = "integrity_blocked";
                    } else if (!foxtrot()) {
                        C3462a.alpha("LocationFlow", 12, "🔵 [SERVICE_LIFECYCLE] onCreate — no valid session (jwt or installation id missing) — terminating", null);
                        Log.w("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onCreate — no valid session — terminating");
                        AbstractC2754r0.bravo(null);
                        str2 = "no_valid_session";
                    } else {
                        C1743d charlie = d.charlie(this);
                        if (!charlie.alpha) {
                            String maroon = CollectionsKt.maroon(charlie.bravo, ", ", null, null, new X9.i(11), 30);
                            C3462a.alpha("LocationFlow", 12, ao.ad.gray("🔵 [SERVICE_LIFECYCLE] onCreate — compliance check FAILED: ", maroon, " — stopping service immediately"), null);
                            Log.w("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onCreate — compliance check FAILED: " + maroon + " — stopping service");
                            try {
                                K7.b.alpha().bravo("CaptainLocationMonitoringService: Compliance check failed in onCreate (process death recovery): " + maroon);
                            } catch (Exception unused2) {
                            }
                            str2 = av.q.echo("compliance_failed:", maroon);
                        } else {
                            str2 = null;
                        }
                    }
                    if (str2 != null) {
                        C3462a.alpha("LocationFlow", 12, "🔵 [SERVICE_LIFECYCLE] onCreate — blocked: ".concat(str2), null);
                        kilo("oncreate_guard:".concat(str2));
                        return;
                    }
                    Q = Long.valueOf(System.currentTimeMillis());
                    InterfaceC3143f interfaceC3143f = this.silver;
                    if (interfaceC3143f != null) {
                        f12066D = ((N9.e) interfaceC3143f).alpha(a.golf.alpha, false);
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("LocationServicePrefs", 0);
                            long j5 = 0;
                            long j6 = sharedPreferences.getLong("last_restart_at_ms", 0L);
                            if (j6 > 0 && j6 > sharedPreferences.getLong("last_restart_reported_at_ms", 0L)) {
                                String string = sharedPreferences.getString("last_restart_trigger", null);
                                if (string == null) {
                                    string = "unknown";
                                }
                                long currentTimeMillis = System.currentTimeMillis() - j6;
                                if (currentTimeMillis >= 0) {
                                    j5 = currentTimeMillis;
                                }
                                AbstractC3070v2.charlie(this, "location_service_restart", y.sierra(new Pair("trigger", string), new Pair("downtime_ms", String.valueOf(j5)), new Pair("manufacturer", Build.MANUFACTURER), new Pair("model", Build.MODEL), new Pair("sdk", String.valueOf(Build.VERSION.SDK_INT))));
                                sharedPreferences.edit().putLong("last_restart_reported_at_ms", j6).apply();
                                Result.m206constructorimpl(Unit.INSTANCE);
                            }
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Result.m206constructorimpl(ResultKt.createFailure(th2));
                        }
                        W1.b.alpha(this).bravo(this.A, new IntentFilter(charlie().action("SYSTEM_LOCATION_DISABLED")));
                        W1.b.alpha(this).bravo(this.B, new IntentFilter(charlie().action("LOCATION_STUCK")));
                        return;
                    }
                    Intrinsics.lima("remoteConfigProvider");
                    throw null;
                }
                Intrinsics.lima("logger");
                throw null;
            }
        }
        if (i4 >= 26) {
            J7.charlie(this);
            str = "my_service";
        } else {
            str = "";
        }
        Intent intent = new Intent(this, (Class<?>) SplashActivity.class);
        intent.setFlags(608174080);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        s sVar = new s(this, str);
        sVar.charlie(2, true);
        sVar.xray.icon = R.drawable.ic_stat_name;
        sVar.juliet = -2;
        sVar.foxtrot = s.bravo(getString(R.string.app_is_running_in_background, getString(R.string.app_name)));
        sVar.golf = activity;
        sVar.quebec = "status";
        Notification alpha = sVar.alpha();
        Intrinsics.delta(alpha, "build(...)");
        if (i4 >= 29) {
            startForeground(101, alpha, 8);
        } else {
            startForeground(101, alpha);
        }
        if (f12069G.compareAndSet(false, true)) {
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        N n5 = f12067E;
        ah ahVar = (ah) n5.getValue();
        f12069G.set(false);
        super.onDestroy();
        this.e = false;
        Log.i("LocationFlow", "🔴 [SERVICE_LIFECYCLE] onDestroy — service destroying | STOMP state before: " + ahVar);
        C3462a.alpha("LocationFlow", 12, "🔴 [SERVICE_LIFECYCLE] onDestroy — service destroying | STOMP state before: " + ahVar, null);
        ah ahVar2 = ah.red;
        n5.getClass();
        n5.juliet(null, ahVar2);
        Log.i("LocationFlow", "STOMP_STATE_CHANGE from=" + ahVar + " to=NOT_CONNECTED timestamp=" + System.currentTimeMillis());
        C3462a.alpha("LocationFlow", 12, "STOMP_STATE_CHANGE from=" + ahVar + " to=NOT_CONNECTED timestamp=" + System.currentTimeMillis(), null);
        StringBuilder sb2 = new StringBuilder("🔴 [SERVICE_LIFECYCLE] onDestroy — STOMP state set to NOT_CONNECTED | previous state: ");
        sb2.append(ahVar);
        Log.i("LocationFlow", sb2.toString());
        C3462a.alpha("LocationFlow", 12, "CaptainLocationMonitoringService onDestroy — stopping location controller and STOMP", null);
        delta().stopMonitoring();
        juliet();
        try {
            Result.Companion companion = Result.INSTANCE;
            PowerManager.WakeLock wakeLock = this.f12097q;
            if (wakeLock != null && wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.f12097q;
                if (wakeLock2 != null) {
                    wakeLock2.release();
                }
                C3462a.alpha("LocationFlow", 12, "🔋 [WAKELOCK] released", null);
            }
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        this.f12097q = null;
        try {
            W1.b.alpha(this).delta(this.A);
        } catch (Exception e) {
            C3462a.alpha("LocationFlow", 12, "Failed to unregister system location receiver: " + e.getMessage(), null);
        }
        try {
            W1.b.alpha(this).delta(this.B);
        } catch (Exception e4) {
            C3462a.alpha("LocationFlow", 12, "Failed to unregister location stuck receiver: " + e4.getMessage(), null);
        }
        ((n) echo()).lima();
        if (!this.f12086f && AbstractC3016k2.bravo(this) && foxtrot()) {
            C3462a.alpha("LocationFlow", 12, "🔁 [SERVICE_LIFECYCLE] onDestroy — unexpected kill while on-duty — scheduling immediate restart", null);
            AbstractC3026m2.bravo(this, "os_kill");
            AbstractC3036o2.echo(this);
        }
        Log.i("LocationFlow", "🔴 [SERVICE_LIFECYCLE] onDestroy — cleanup completed");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        String str;
        String str2;
        String str3;
        Object m206constructorimpl;
        if (m.bravo(this, "location_service_on_start_command")) {
            kilo("onstartcommand_integrity_blocked");
            return 2;
        }
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "delivery.samurai.android.action.STOMP_RECONNECT")) {
            if (this.e) {
                india();
            }
            return 1;
        }
        N n5 = f12067E;
        ah ahVar = (ah) n5.getValue();
        Log.i("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onStartCommand called | STOMP state: " + ahVar + " | flags: " + i4 + " | startId: " + i5);
        StringBuilder sb2 = new StringBuilder("🔵 [SERVICE_LIFECYCLE] onStartCommand called | STOMP state: ");
        sb2.append(ahVar);
        C3462a.alpha("LocationFlow", 12, sb2.toString(), null);
        if (intent != null) {
            str2 = intent.getAction();
        } else {
            str2 = null;
        }
        StringBuilder green = P0.green("FGS onStartCommand action=", str2, " flags=", " stomp=", i4);
        green.append(ahVar);
        String message = green.toString();
        Intrinsics.echo(message, "message");
        try {
            K7.b.alpha().bravo(message);
        } catch (Exception unused) {
        }
        if (intent == null || (str3 = intent.getAction()) == null) {
            str3 = BuildConfig.TRAVIS;
        }
        AbstractC3075w2.charlie("fgs_last_start_action", str3);
        if (!foxtrot()) {
            Log.w("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onStartCommand — no valid session — terminating");
            C3462a.alpha("LocationFlow", 12, "🔵 [SERVICE_LIFECYCLE] onStartCommand — no valid session — terminating", null);
            AbstractC2754r0.bravo(null);
            return 2;
        }
        boolean bravo = AbstractC3016k2.bravo(this);
        Log.w("LocationFlow", "🔍 [VALIDATION] validateServiceStart() called | isServiceEnabled: " + bravo);
        C3462a.alpha("LocationFlow", 12, "🔍 [VALIDATION] validateServiceStart() called | isServiceEnabled: " + bravo, null);
        if (!bravo) {
            C3462a.alpha("LocationFlow", 12, "🔍 [VALIDATION] Service disabled — stopping, not auto-enabling", null);
            Log.w("LocationFlow", "🔍 [VALIDATION] Service disabled — stopping");
            kilo("validate_disabled");
            Log.w("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onStartCommand — validation failed, returning START_NOT_STICKY");
            return 2;
        }
        Log.i("LocationFlow", "🔍 [VALIDATION] Service enabled — validation passed");
        if (this.e) {
            Log.i("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onStartCommand — already running, returning START_STICKY");
            return 1;
        }
        this.e = true;
        C3462a.alpha("CaptainLocationMonitoringService", 12, "onStartCommand", null);
        Log.i("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onStartCommand — calling stompCoordinator.ensureStarted() | STOMP state before: " + ahVar);
        ((n) echo()).charlie();
        Log.i("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onStartCommand — stompCoordinator.ensureStarted() called | STOMP state after: " + n5.getValue());
        C1743d charlie = d.charlie(this);
        if (!charlie.alpha) {
            golf(charlie, "Service compliance check FAILED");
            delta().stopMonitoring();
            kilo("start_compliance_failed");
            Log.w("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onStartCommand — compliance check failed, returning START_NOT_STICKY");
            return 2;
        }
        this.f12101u = null;
        this.f12102v = System.currentTimeMillis();
        C3462a.alpha("LocationFlow", 12, "Service starting location monitoring (baseActivity=null)", null);
        delta().startMonitoring(null);
        juliet();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f12098r = handler;
        b bVar = new b(8, this);
        this.f12099s = bVar;
        Intrinsics.checkNotNull(bVar);
        handler.postDelayed(bVar, 10000L);
        C3462a.alpha("LocationFlow", 12, "Periodic compliance check started (interval: 10000ms)", null);
        PowerManager.WakeLock wakeLock = this.f12097q;
        if (wakeLock == null || !wakeLock.isHeld()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Object systemService = getSystemService("power");
                Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "samurai:location_tracking");
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire();
                this.f12097q = newWakeLock;
                C3462a.alpha("LocationFlow", 12, "🔋 [WAKELOCK] acquired", null);
                m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
            if (m207exceptionOrNullimpl != null) {
                C3462a.alpha("LocationFlow", 12, "🔋 [WAKELOCK] acquire failed: ".concat(m207exceptionOrNullimpl.getClass().getSimpleName()), null);
            }
        }
        AbstractC3036o2.delta(this);
        AbstractC3031n2.bravo(this);
        Log.i("LocationFlow", "🔵 [SERVICE_LIFECYCLE] onStartCommand — completed successfully, returning START_STICKY");
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (AbstractC3016k2.bravo(this) && foxtrot()) {
            C3462a.alpha("LocationFlow", 12, "🔁 [TASK_REMOVED] app swiped from recents while on-duty — scheduling immediate restart", null);
            AbstractC3026m2.bravo(this, "task_removed");
            AbstractC3036o2.echo(this);
        } else {
            C3462a.alpha("LocationFlow", 12, "🔁 [TASK_REMOVED] off-duty/no session — not restarting", null);
        }
        super.onTaskRemoved(intent);
    }
}
