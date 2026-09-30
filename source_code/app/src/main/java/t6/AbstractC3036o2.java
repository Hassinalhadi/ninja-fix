package t6;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.services.LocationServiceWatchdogReceiver;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

/* renamed from: t6.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3036o2 {
    public static final void alpha(boolean z2, Function0 onRefresh, T.s sVar, P.d content, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z10;
        T.s sVar2;
        T.s sVar3;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(onRefresh, "onRefresh");
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1446816637);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onRefresh)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(content)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i12;
        }
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i10 & 1, z10)) {
            if (i15 != 0) {
                sVar3 = T.p.alpha;
            } else {
                sVar3 = sVar;
            }
            int i16 = (i10 & 14) | 1572864 | (i10 & 112) | (i10 & 896);
            T.s sVar4 = sVar3;
            G.l.alpha(z2, onRefresh, sVar4, null, null, null, P.e.echo(-851947031, new Lb.V(content, 5), c0585q), c0585q, i16);
            sVar2 = sVar4;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new androidx.compose.foundation.layout.r(z2, onRefresh, sVar2, content, i4, i5);
        }
    }

    public static PendingIntent bravo(int i4, Context context) {
        Intent action = new Intent(context, (Class<?>) LocationServiceWatchdogReceiver.class).setAction("delivery.samurai.android.LOCATION_WATCHDOG");
        Intrinsics.delta(action, "setAction(...)");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i4, action, 201326592);
        Intrinsics.delta(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public static void charlie(Context context) {
        AlarmManager alarmManager;
        Intrinsics.echo(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService("alarm");
        if (systemService instanceof AlarmManager) {
            alarmManager = (AlarmManager) systemService;
        } else {
            alarmManager = null;
        }
        if (alarmManager != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNull(applicationContext);
                alarmManager.cancel(bravo(7731, applicationContext));
                Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            try {
                Intrinsics.checkNotNull(applicationContext);
                alarmManager.cancel(bravo(7732, applicationContext));
                Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    public static void delta(Context context) {
        AlarmManager alarmManager;
        Object m206constructorimpl;
        boolean canScheduleExactAlarms;
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService("alarm");
        if (systemService instanceof AlarmManager) {
            alarmManager = (AlarmManager) systemService;
        } else {
            alarmManager = null;
        }
        if (alarmManager != null) {
            long currentTimeMillis = System.currentTimeMillis() + 900000;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (Build.VERSION.SDK_INT >= 31) {
                    canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                    if (!canScheduleExactAlarms) {
                        C3462a.alpha("LocationFlow", 12, "🐶 [WATCHDOG] exact alarms not permitted — watchdog inactive", null);
                        return;
                    }
                }
                Intrinsics.checkNotNull(applicationContext);
                alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, bravo(7731, applicationContext));
                m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
            if (m207exceptionOrNullimpl != null) {
                C3462a.alpha("LocationFlow", 12, "🐶 [WATCHDOG] schedule failed: ".concat(m207exceptionOrNullimpl.getClass().getSimpleName()), null);
            }
        }
    }

    public static void echo(Context context) {
        AlarmManager alarmManager;
        Object m206constructorimpl;
        boolean canScheduleExactAlarms;
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService("alarm");
        if (systemService instanceof AlarmManager) {
            alarmManager = (AlarmManager) systemService;
        } else {
            alarmManager = null;
        }
        if (alarmManager != null) {
            long currentTimeMillis = System.currentTimeMillis() + 1500;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (Build.VERSION.SDK_INT >= 31) {
                    canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                    if (!canScheduleExactAlarms) {
                        C3462a.alpha("LocationFlow", 12, "🐶 [WATCHDOG] exact alarms not permitted — immediate restart skipped (WorkManager backstop covers it)", null);
                        return;
                    }
                }
                Intrinsics.checkNotNull(applicationContext);
                alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, bravo(7732, applicationContext));
                m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
            if (m207exceptionOrNullimpl != null) {
                C3462a.alpha("LocationFlow", 12, "🐶 [WATCHDOG] scheduleImmediate failed: ".concat(m207exceptionOrNullimpl.getClass().getSimpleName()), null);
            }
        }
    }
}
