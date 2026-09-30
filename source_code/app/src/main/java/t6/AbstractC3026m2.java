package t6;

import android.content.Context;
import android.os.Build;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: t6.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3026m2 {
    public static void alpha(Context context, String str, String str2, boolean z2) {
        try {
            Result.Companion companion = Result.INSTANCE;
            AbstractC3070v2.charlie(context, "location_service_start_deferred", kotlin.collections.y.sierra(new Pair("trigger", str), new Pair("reason", str2), new Pair("can_schedule_exact_alarms", String.valueOf(z2)), new Pair("manufacturer", Build.MANUFACTURER), new Pair("model", Build.MODEL), new Pair("sdk", String.valueOf(Build.VERSION.SDK_INT))));
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static void bravo(Context context, String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            context.getApplicationContext().getSharedPreferences("LocationServicePrefs", 0).edit().putString("last_restart_trigger", str).putLong("last_restart_at_ms", System.currentTimeMillis()).apply();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static void charlie(int i4, int i5) {
        String charlie;
        if (i4 >= 0 && i4 < i5) {
            return;
        }
        if (i4 >= 0) {
            if (i5 < 0) {
                throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
            }
            charlie = AbstractC3031n2.charlie("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
        } else {
            charlie = AbstractC3031n2.charlie("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(charlie);
    }

    public static void delta(int i4, int i5, int i10) {
        String echo;
        if (i4 >= 0 && i5 >= i4 && i5 <= i10) {
            return;
        }
        if (i4 >= 0 && i4 <= i10) {
            if (i5 >= 0 && i5 <= i10) {
                echo = AbstractC3031n2.charlie("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                echo = echo(i5, i10, "end index");
            }
        } else {
            echo = echo(i4, i10, "start index");
        }
        throw new IndexOutOfBoundsException(echo);
    }

    public static String echo(int i4, int i5, String str) {
        if (i4 < 0) {
            return AbstractC3031n2.charlie("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return AbstractC3031n2.charlie("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
    }
}
