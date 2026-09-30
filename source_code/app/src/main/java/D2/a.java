package D2;

import A2.z;
import Aa.m;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final String alpha = z.golf("Alarms");

    public static void alpha(Context context, J2.j jVar, int i4) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = b.white;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.echo(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i4, intent, 603979776);
        if (service != null && alarmManager != null) {
            z.echo().alpha(alpha, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i4 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void bravo(Context context, WorkDatabase workDatabase, J2.j jVar, long j5) {
        J2.i quebec = workDatabase.quebec();
        J2.g bravo = quebec.bravo(jVar);
        if (bravo != null) {
            int i4 = bravo.charlie;
            alpha(context, jVar, i4);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = b.white;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.echo(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i4, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j5, service);
                return;
            }
            return;
        }
        Object november = workDatabase.november(new E8.g(2, new m(workDatabase)));
        Intrinsics.delta(november, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int intValue = ((Number) november).intValue();
        quebec.delta(new J2.g(jVar.alpha, jVar.bravo, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = b.white;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.echo(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j5, service2);
        }
    }
}
