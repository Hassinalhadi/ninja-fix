package z9;

import N2.ae;
import android.app.ActivityManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import androidx.lifecycle.G;
import androidx.lifecycle.ab;
import ca.n;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.UserInfo;
import com.google.android.gms.tasks.Task;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.C1743d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p3.ah;
import t6.AbstractC3016k2;
import t6.AbstractC3021l2;
import yf.N;
import z3.C3462a;

/* renamed from: z9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3490g {
    public final Y9.k alpha;

    public C3490g(Y9.k locationManager) {
        Intrinsics.echo(locationManager, "locationManager");
        this.alpha = locationManager;
    }

    public final void alpha() {
        this.alpha.delta();
    }

    public final void bravo() {
        Y9.k kVar = this.alpha;
        kVar.alpha();
        kVar.bravo();
        if (kVar.delta) {
            kVar.delta = false;
            kVar.charlie = null;
            kVar.bravo = null;
            kVar.alpha.unbindService(kVar.juliet);
        }
    }

    public final void charlie(d3.k kVar, Function1 function1) {
        CaptainLocationMonitoringService captainLocationMonitoringService;
        Y9.k kVar2 = this.alpha;
        kVar2.getClass();
        if (kVar2.delta && (captainLocationMonitoringService = kVar2.charlie) != null) {
            captainLocationMonitoringService.hotel(new ae(2, function1));
            return;
        }
        kVar2.foxtrot = function1;
        Y9.i iVar = new Y9.i(kVar2, 0);
        kVar2.golf = iVar;
        Handler handler = kVar2.echo;
        Intrinsics.checkNotNull(iVar);
        handler.postDelayed(iVar, 4000L);
        if (!kVar2.delta) {
            kVar2.delta();
        }
    }

    public final void delta() {
        boolean z2;
        CaptainLocationMonitoringService captainLocationMonitoringService;
        Y9.k kVar = this.alpha;
        boolean z10 = kVar.delta;
        if (z10 && (captainLocationMonitoringService = kVar.charlie) != null) {
            captainLocationMonitoringService.india();
            return;
        }
        if (kVar.charlie == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Log.w("LocationFlow", "STOMP_RECONNECT_SKIPPED bound=" + z10 + " serviceNull=" + z2);
        if (!kVar.delta) {
            kVar.delta();
        }
    }

    public final void echo(d3.k baseActivity) {
        Intrinsics.echo(baseActivity, "baseActivity");
        Y9.k kVar = this.alpha;
        kVar.getClass();
        if (kVar.bravo == null) {
            CaptainLocationMonitoringService captainLocationMonitoringService = kVar.charlie;
            Task task = null;
            if (captainLocationMonitoringService != null && CaptainLocationMonitoringService.f12069G.get() && captainLocationMonitoringService.e) {
                N n5 = CaptainLocationMonitoringService.f12067E;
                ah ahVar = (ah) n5.getValue();
                if (ahVar == ah.red) {
                    Log.w("LocationFlow", "🔧 [FETCH_LOCATION] STOMP not connected — ensuring STOMP starts before location monitoring | state: " + ahVar);
                    C3462a.alpha("LocationFlow", 12, "🔧 [FETCH_LOCATION] STOMP not connected — ensuring STOMP starts", null);
                    ((n) captainLocationMonitoringService.echo()).charlie();
                    Log.i("LocationFlow", "🔧 [FETCH_LOCATION] stompCoordinator.ensureStarted() called | new state: " + n5.getValue());
                }
                captainLocationMonitoringService.delta().updateBaseActivity(baseActivity);
                task = captainLocationMonitoringService.delta().startMonitoring(baseActivity);
            }
            kVar.bravo = task;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0132, code lost:
    
        if (androidx.lifecycle.G.f3128b.white.delta.compareTo(androidx.lifecycle.ab.silver) < 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        if (androidx.lifecycle.G.f3128b.white.delta.compareTo(androidx.lifecycle.ab.silver) >= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0100, code lost:
    
        if (androidx.lifecycle.G.f3128b.white.delta.compareTo(androidx.lifecycle.ab.silver) >= 0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168 A[Catch: all -> 0x006b, TryCatch #9 {all -> 0x006b, blocks: (B:8:0x0057, B:10:0x005d, B:13:0x006e, B:15:0x0078, B:18:0x0082, B:21:0x008a, B:68:0x0090, B:70:0x009a, B:72:0x00a2, B:74:0x00a8, B:76:0x00ae, B:77:0x00b2, B:79:0x00b8, B:83:0x00c9, B:85:0x00cd, B:27:0x0144, B:32:0x0152, B:88:0x00d5, B:94:0x00e5, B:97:0x00f4, B:103:0x0103, B:35:0x0160, B:37:0x0168, B:38:0x01ac, B:40:0x01b2, B:42:0x01b7, B:49:0x01c4, B:47:0x021a, B:46:0x0213, B:52:0x01cb, B:54:0x0200, B:55:0x0210, B:58:0x0217, B:60:0x0221, B:63:0x0253, B:64:0x0285, B:111:0x028d), top: B:7:0x0057, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ac A[Catch: all -> 0x006b, TryCatch #9 {all -> 0x006b, blocks: (B:8:0x0057, B:10:0x005d, B:13:0x006e, B:15:0x0078, B:18:0x0082, B:21:0x008a, B:68:0x0090, B:70:0x009a, B:72:0x00a2, B:74:0x00a8, B:76:0x00ae, B:77:0x00b2, B:79:0x00b8, B:83:0x00c9, B:85:0x00cd, B:27:0x0144, B:32:0x0152, B:88:0x00d5, B:94:0x00e5, B:97:0x00f4, B:103:0x0103, B:35:0x0160, B:37:0x0168, B:38:0x01ac, B:40:0x01b2, B:42:0x01b7, B:49:0x01c4, B:47:0x021a, B:46:0x0213, B:52:0x01cb, B:54:0x0200, B:55:0x0210, B:58:0x0217, B:60:0x0221, B:63:0x0253, B:64:0x0285, B:111:0x028d), top: B:7:0x0057, inners: #6, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void foxtrot() {
        Jwt jwt;
        ActivityManager activityManager;
        Object obj;
        C1743d charlie;
        String message;
        String message2;
        String message3;
        String message4;
        int i4 = 12;
        Y9.k kVar = this.alpha;
        kVar.getClass();
        ah ahVar = (ah) CaptainLocationMonitoringService.f12067E.getValue();
        Context context = kVar.alpha;
        Log.i("LocationFlow", "▶️ [SERVICE_START] startLocationService() called | STOMP state: " + ahVar + " | service running: " + L9.d.xray(context));
        StringBuilder sb2 = new StringBuilder("▶️ [SERVICE_START] startLocationService() called | STOMP state: ");
        sb2.append(ahVar);
        C3462a.alpha("LocationFlow", 12, sb2.toString(), null);
        AtomicBoolean atomicBoolean = Y9.k.kilo;
        if (!AbstractC3021l2.alpha(true)) {
            Log.w("LocationFlow", "▶️ [SERVICE_START] Service restart already in progress — skipping duplicate start");
            C3462a.alpha("LocationFlow", 12, "Service restart already in progress — skipping duplicate start", null);
            return;
        }
        try {
            if (!AbstractC3016k2.bravo(context)) {
                Log.w("LocationFlow", "▶️ [SERVICE_START] Service disabled — skipping start");
                C3462a.alpha("LocationFlow", 12, "startLocationService(): disabled flag is set — skipping service start", null);
                return;
            }
            UserInfo sierra = L9.d.sierra(context);
            String romeo = L9.d.romeo(context);
            if (sierra != null) {
                jwt = sierra.getJwt();
            } else {
                jwt = null;
            }
            if (jwt != null && romeo != null && !StringsKt.gray(romeo)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        Object systemService = context.getSystemService("activity");
                        if (systemService instanceof ActivityManager) {
                            activityManager = (ActivityManager) systemService;
                        } else {
                            activityManager = null;
                        }
                    } catch (Exception e) {
                        try {
                            K7.b.alpha().bravo("LocationManager: Foreground check failed on Android 14+: " + e.getMessage());
                            K7.b.alpha().charlie(e);
                        } catch (Exception unused) {
                        }
                    }
                    if (activityManager != null) {
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                        if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                            Iterator<T> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == Process.myPid()) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                            if (runningAppProcessInfo != null) {
                                if (runningAppProcessInfo.importance == 100) {
                                    charlie = L9.d.charlie(context);
                                    if (!charlie.alpha) {
                                    }
                                    return;
                                }
                                Log.w("LocationFlow", "▶️ [SERVICE_START] App not in foreground — deferring start");
                                C3462a.alpha("LocationFlow", 12, "App not in foreground — deferring FGS start", null);
                                if (Build.VERSION.SDK_INT >= 34) {
                                }
                                return;
                            }
                            if (G.f3128b.white.delta.compareTo(ab.silver) >= 0) {
                                charlie = L9.d.charlie(context);
                                if (!charlie.alpha) {
                                }
                                return;
                            }
                            Log.w("LocationFlow", "▶️ [SERVICE_START] App not in foreground — deferring start");
                            C3462a.alpha("LocationFlow", 12, "App not in foreground — deferring FGS start", null);
                            if (Build.VERSION.SDK_INT >= 34) {
                            }
                            return;
                        }
                        if (G.f3128b.white.delta.compareTo(ab.silver) >= 0) {
                            charlie = L9.d.charlie(context);
                            if (!charlie.alpha) {
                                String maroon = CollectionsKt.maroon(charlie.bravo, ", ", null, null, new X9.i(i4), 30);
                                Log.w("LocationFlow", "▶️ [SERVICE_START] Compliance check FAILED: " + maroon + " — skipping start");
                                C3462a.alpha("LocationFlow", 12, "Location compliance check FAILED: " + maroon + " → skip service start", null);
                            } else if (!L9.d.xray(context)) {
                                Log.i("LocationFlow", "▶️ [SERVICE_START] Starting service (not running)");
                                try {
                                    try {
                                        Intent intent = new Intent(context, (Class<?>) CaptainLocationMonitoringService.class);
                                        int i5 = Build.VERSION.SDK_INT;
                                        if (i5 >= 26) {
                                            if (i5 >= 34) {
                                                try {
                                                    context.startForegroundService(intent);
                                                } catch (ForegroundServiceStartNotAllowedException e4) {
                                                    message3 = e4.getMessage();
                                                    Log.e("LocationFlow", "▶️ [SERVICE_START] ForegroundServiceStartNotAllowedException: " + message3);
                                                    message4 = e4.getMessage();
                                                    C3462a.alpha("LocationFlow", 12, "ForegroundServiceStartNotAllowedException: " + message4 + " — service start blocked by system", null);
                                                    try {
                                                        K7.b.alpha().bravo("LocationManager: ForegroundServiceStartNotAllowedException (inner catch) - service start blocked");
                                                        K7.b.alpha().charlie(e4);
                                                    } catch (Exception unused2) {
                                                    }
                                                    throw e4;
                                                }
                                            } else {
                                                context.startForegroundService(intent);
                                            }
                                        } else {
                                            context.startService(intent);
                                        }
                                        Log.i("LocationFlow", "▶️ [SERVICE_START] startForegroundService/startService() called");
                                    } catch (Exception e5) {
                                        Log.e("LocationFlow", "▶️ [SERVICE_START] Unexpected error starting service: " + e5.getMessage(), e5);
                                        C3462a.alpha("LocationFlow", 12, "Unexpected error starting service: " + e5.getMessage(), null);
                                    }
                                } catch (ForegroundServiceStartNotAllowedException e10) {
                                    message = e10.getMessage();
                                    Log.e("LocationFlow", "▶️ [SERVICE_START] Failed to start foreground service: " + message);
                                    message2 = e10.getMessage();
                                    C3462a.alpha("LocationFlow", 12, "Failed to start foreground service (Android 14+ restriction): " + message2, null);
                                }
                            } else {
                                Log.i("LocationFlow", "▶️ [SERVICE_START] Service already running — skipping start");
                            }
                            return;
                        }
                        Log.w("LocationFlow", "▶️ [SERVICE_START] App not in foreground — deferring start");
                        C3462a.alpha("LocationFlow", 12, "App not in foreground — deferring FGS start", null);
                        if (Build.VERSION.SDK_INT >= 34) {
                            try {
                                K7.b.alpha().bravo("LocationManager: Service start blocked - app not in foreground (Android 14+)");
                            } catch (Exception unused3) {
                            }
                        }
                        return;
                    }
                }
            }
            Log.w("LocationFlow", "▶️ [SERVICE_START] No valid session (jwt or uuid missing) — skipping start");
            C3462a.alpha("LocationFlow", 12, "startLocationService(): no valid session — skipping service start", null);
        } finally {
            AbstractC3021l2.alpha(false);
        }
    }

    public final void golf() {
        Unit unit;
        Unit unit2;
        Y9.k kVar = this.alpha;
        kVar.getClass();
        ah ahVar = (ah) CaptainLocationMonitoringService.f12067E.getValue();
        Log.w("LocationFlow", "🛑 [SERVICE_STOP] stopService() called | STOMP state: " + ahVar + " | service running: " + L9.d.xray(kVar.alpha) + " | bound: " + kVar.delta);
        StringBuilder sb2 = new StringBuilder("🛑 [SERVICE_STOP] stopService() called | STOMP state: ");
        sb2.append(ahVar);
        C3462a.alpha("LocationFlow", 12, sb2.toString(), null);
        try {
            Result.Companion companion = Result.INSTANCE;
            CaptainLocationMonitoringService captainLocationMonitoringService = kVar.charlie;
            if (captainLocationMonitoringService != null) {
                captainLocationMonitoringService.stopSelf();
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            Result.m206constructorimpl(unit2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.m206constructorimpl(Boolean.valueOf(kVar.alpha.stopService(new Intent(kVar.alpha, (Class<?>) CaptainLocationMonitoringService.class))));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            n nVar = n.crimson;
            if (nVar != null) {
                nVar.lima();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m206constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th3));
        }
        kVar.bravo = null;
        if (kVar.delta) {
            kVar.alpha();
            kVar.bravo();
            if (kVar.delta) {
                kVar.delta = false;
                kVar.charlie = null;
                kVar.bravo = null;
                kVar.alpha.unbindService(kVar.juliet);
            }
        }
        Log.w("LocationFlow", "🛑 [SERVICE_STOP] stopService() completed");
    }
}
