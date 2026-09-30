package Y9;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.splash.SplashActivity;
import f1.s;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.J7;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class e extends BroadcastReceiver {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CaptainLocationMonitoringService bravo;

    public /* synthetic */ e(CaptainLocationMonitoringService captainLocationMonitoringService, int i4) {
        this.alpha = i4;
        this.bravo = captainLocationMonitoringService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        boolean z2;
        boolean z10;
        String str3;
        CaptainLocationMonitoringService captainLocationMonitoringService = this.bravo;
        switch (this.alpha) {
            case 0:
                if (intent != null) {
                    str = intent.getAction();
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str, captainLocationMonitoringService.charlie().action("LOCATION_STUCK"))) {
                    C3462a.alpha("LocationFlow", 12, "Received LOCATION_STUCK broadcast → updating FGS notification", null);
                    String message = "FGS updateToLocationStuck importance=" + J7.alpha();
                    Intrinsics.echo(message, "message");
                    try {
                        K7.b.alpha().bravo(message);
                    } catch (Exception unused) {
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 34) {
                        if (captainLocationMonitoringService.checkSelfPermission("android.permission.FOREGROUND_SERVICE_LOCATION") == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (captainLocationMonitoringService.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z2 || !z10) {
                            return;
                        }
                    }
                    if (i4 >= 26) {
                        J7.charlie(captainLocationMonitoringService);
                        str2 = "my_service";
                    } else {
                        str2 = "";
                    }
                    Intent intent2 = new Intent(captainLocationMonitoringService, (Class<?>) SplashActivity.class);
                    intent2.setFlags(608174080);
                    PendingIntent activity = PendingIntent.getActivity(captainLocationMonitoringService, 0, intent2, 201326592);
                    s sVar = new s(captainLocationMonitoringService, str2);
                    sVar.charlie(2, true);
                    sVar.xray.icon = R.drawable.ic_stat_name;
                    sVar.juliet = 0;
                    sVar.echo = s.bravo(captainLocationMonitoringService.getString(R.string.location_stuck_title));
                    sVar.foxtrot = s.bravo(captainLocationMonitoringService.getString(R.string.location_stuck_notification_content));
                    sVar.golf = activity;
                    sVar.quebec = "status";
                    Notification alpha = sVar.alpha();
                    Intrinsics.delta(alpha, "build(...)");
                    Object systemService = captainLocationMonitoringService.getSystemService("notification");
                    Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    NotificationManager notificationManager = (NotificationManager) systemService;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        notificationManager.notify(101, alpha);
                        Result.m206constructorimpl(Unit.INSTANCE);
                        return;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m206constructorimpl(ResultKt.createFailure(th));
                        return;
                    }
                }
                return;
            default:
                if (intent != null) {
                    str3 = intent.getAction();
                } else {
                    str3 = null;
                }
                if (Intrinsics.areEqual(str3, captainLocationMonitoringService.charlie().action("SYSTEM_LOCATION_DISABLED"))) {
                    C3462a.alpha("LocationFlow", 12, "Received system location disabled broadcast → stopping service", null);
                    captainLocationMonitoringService.delta().stopMonitoring();
                    captainLocationMonitoringService.kilo("system_location_disabled");
                    return;
                }
                return;
        }
    }
}
