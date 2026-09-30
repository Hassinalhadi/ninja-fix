package Y9;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import androidx.lifecycle.G;
import androidx.lifecycle.ab;
import com.app.network.network.models.Jwt;
import com.app.network.network.models.UserInfo;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g1.AbstractC1735d;
import h3.InterfaceC1808e;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;
import t6.AbstractC3016k2;
import t6.AbstractC3026m2;
import t6.AbstractC3031n2;
import t6.AbstractC3036o2;
import t6.V2;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class l implements InterfaceC1808e {
    public static boolean alpha(Context context) {
        Object m206constructorimpl;
        AlarmManager alarmManager;
        boolean canScheduleExactAlarms;
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean z2 = true;
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = context.getSystemService("alarm");
                if (systemService instanceof AlarmManager) {
                    alarmManager = (AlarmManager) systemService;
                } else {
                    alarmManager = null;
                }
                if (alarmManager != null) {
                    canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                    if (!canScheduleExactAlarms) {
                        z2 = false;
                    }
                }
            }
            m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(z2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = bool;
        }
        return ((Boolean) m206constructorimpl).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean bravo(Context context) {
        Object m206constructorimpl;
        Jwt jwt;
        boolean z2;
        String romeo;
        boolean z10 = CaptainLocationMonitoringService.f12066D;
        if (AbstractC3016k2.bravo(context)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AndroidApp androidApp = AndroidApp.yellow;
                UserInfo sierra = L9.d.sierra(V2.delta());
                if (sierra != null) {
                    jwt = sierra.getJwt();
                } else {
                    jwt = null;
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (jwt != null && (romeo = L9.d.romeo(V2.delta())) != null && !StringsKt.gray(romeo)) {
                z2 = true;
                m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(z2));
                Boolean bool = Boolean.FALSE;
                if (m206constructorimpl instanceof kotlin.k) {
                    m206constructorimpl = bool;
                }
                if (!((Boolean) m206constructorimpl).booleanValue() || AbstractC1735d.alpha(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    return false;
                }
                return true;
            }
            z2 = false;
            m206constructorimpl = Result.m206constructorimpl(Boolean.valueOf(z2));
            Boolean bool2 = Boolean.FALSE;
            if (m206constructorimpl instanceof kotlin.k) {
            }
            if (!((Boolean) m206constructorimpl).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
    
        if (androidx.lifecycle.G.f3128b.white.delta.compareTo(androidx.lifecycle.ab.silver) >= 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean charlie(Context context, String str, boolean z2) {
        Object m206constructorimpl;
        String message;
        Object m206constructorimpl2;
        boolean z10;
        ActivityManager activityManager;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object obj;
        if (!CaptainLocationMonitoringService.f12069G.get() && bravo(context)) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31 && !z2) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    z10 = true;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th));
                }
                if (i4 >= 34) {
                    Object systemService = context.getSystemService("activity");
                    if (systemService instanceof ActivityManager) {
                        activityManager = (ActivityManager) systemService;
                    } else {
                        activityManager = null;
                    }
                    if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
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
                        runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                    } else {
                        runningAppProcessInfo = null;
                    }
                    if (runningAppProcessInfo != null) {
                        if (runningAppProcessInfo.importance == 100) {
                            m206constructorimpl2 = Result.m206constructorimpl(Boolean.valueOf(z10));
                            Boolean bool = Boolean.FALSE;
                            if (m206constructorimpl2 instanceof kotlin.k) {
                                m206constructorimpl2 = bool;
                            }
                            if (!((Boolean) m206constructorimpl2).booleanValue()) {
                                C3462a.alpha("LocationFlow", 12, "▶️ [LAUNCHER] backgrounded without exemption — deferring to watchdog/backstop", null);
                                AbstractC3026m2.alpha(context, str, "backgrounded_no_exemption", alpha(context));
                                AbstractC3031n2.bravo(context);
                                AbstractC3036o2.echo(context);
                                return false;
                            }
                        }
                        z10 = false;
                        m206constructorimpl2 = Result.m206constructorimpl(Boolean.valueOf(z10));
                        Boolean bool2 = Boolean.FALSE;
                        if (m206constructorimpl2 instanceof kotlin.k) {
                        }
                        if (!((Boolean) m206constructorimpl2).booleanValue()) {
                        }
                    } else {
                        if (G.f3128b.white.delta.compareTo(ab.silver) >= 0) {
                            m206constructorimpl2 = Result.m206constructorimpl(Boolean.valueOf(z10));
                            Boolean bool22 = Boolean.FALSE;
                            if (m206constructorimpl2 instanceof kotlin.k) {
                            }
                            if (!((Boolean) m206constructorimpl2).booleanValue()) {
                            }
                        }
                        z10 = false;
                        m206constructorimpl2 = Result.m206constructorimpl(Boolean.valueOf(z10));
                        Boolean bool222 = Boolean.FALSE;
                        if (m206constructorimpl2 instanceof kotlin.k) {
                        }
                        if (!((Boolean) m206constructorimpl2).booleanValue()) {
                        }
                    }
                }
            }
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intent intent = new Intent(context, (Class<?>) CaptainLocationMonitoringService.class);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 31) {
                    try {
                        context.startForegroundService(intent);
                    } catch (ForegroundServiceStartNotAllowedException e) {
                        message = e.getMessage();
                        C3462a.alpha("LocationFlow", 12, "▶️ [LAUNCHER] FGS start refused: " + message + " — deferring to watchdog/backstop", null);
                        AbstractC3026m2.alpha(context, str, "fgs_start_refused", alpha(context));
                        AbstractC3031n2.bravo(context);
                        AbstractC3036o2.echo(context);
                    }
                } else if (i5 >= 26) {
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
                m206constructorimpl = Result.m206constructorimpl(Boolean.TRUE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
            }
            Boolean bool3 = Boolean.FALSE;
            if (m206constructorimpl instanceof kotlin.k) {
                m206constructorimpl = bool3;
            }
            return ((Boolean) m206constructorimpl).booleanValue();
        }
        return false;
    }
}
