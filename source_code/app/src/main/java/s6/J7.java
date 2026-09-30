package s6;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.os.Build;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

/* loaded from: classes2.dex */
public abstract class J7 {
    public static String alpha() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i4 = runningAppProcessInfo.importance;
            if (i4 <= 100) {
                return "FG(" + i4 + ")";
            }
            if (i4 <= 125) {
                return "FGS(" + i4 + ")";
            }
            return "BG(" + i4 + ")";
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static void charlie(Service service) {
        androidx.camera.camera2.internal.compat.a.lima();
        NotificationChannel bravo = U.g.bravo();
        bravo.setLightColor(-16776961);
        bravo.setLockscreenVisibility(0);
        Object systemService = service.getSystemService("notification");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(bravo);
    }

    public static void echo(CaptainLocationMonitoringService captainLocationMonitoringService) {
        charlie(captainLocationMonitoringService);
        f1.s sVar = new f1.s(captainLocationMonitoringService, "my_service");
        sVar.xray.icon = R.drawable.ic_stat_name;
        sVar.juliet = -2;
        sVar.foxtrot = f1.s.bravo(captainLocationMonitoringService.getString(R.string.app_is_running_in_background, captainLocationMonitoringService.getString(R.string.app_name)));
        Notification alpha = sVar.alpha();
        Intrinsics.delta(alpha, "build(...)");
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                captainLocationMonitoringService.startForeground(101, alpha, 8);
            } else {
                captainLocationMonitoringService.startForeground(101, alpha);
            }
        } catch (Exception e) {
            C3462a.alpha("CaptainLocationMonitoringService", 12, ao.ad.gray("startForeground with location type failed: ", e.getMessage(), " — falling back"), null);
            try {
                captainLocationMonitoringService.startForeground(101, alpha);
            } catch (Exception unused) {
            }
        }
    }

    public abstract boolean bravo(r0.g gVar);

    public abstract Object delta(r0.g gVar);
}
