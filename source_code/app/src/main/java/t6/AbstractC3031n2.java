package t6;

import android.content.Context;
import com.checkout.components.kmp.rememberme.utils.Constants;
import com.google.maps.android.BuildConfig;
import delivery.samurai.android.services.LocationServiceKeepAliveWorker;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

/* renamed from: t6.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3031n2 {
    public static void alpha(Context context) {
        Intrinsics.echo(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.delta(applicationContext, "getApplicationContext(...)");
            B2.w.golf(applicationContext).delta("location_service_keepalive");
            C3462a.alpha("LocationFlow", 12, "🧰 [BACKSTOP] periodic keep-alive cancelled", null);
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static void bravo(Context context) {
        Object m206constructorimpl;
        long j5;
        Intrinsics.echo(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            TimeUnit repeatIntervalTimeUnit = TimeUnit.MINUTES;
            Intrinsics.echo(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            A2.ab abVar = new A2.ab(1, LocationServiceKeepAliveWorker.class);
            J2.p pVar = (J2.p) abVar.charlie;
            long millis = repeatIntervalTimeUnit.toMillis(15L);
            pVar.getClass();
            if (millis < 900000) {
                A2.z.echo().hotel(J2.p.yankee, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            if (millis < 900000) {
                j5 = 900000;
            } else {
                j5 = millis;
            }
            if (millis < 900000) {
                millis = 900000;
            }
            pVar.echo(j5, millis);
            A2.ah ahVar = (A2.ah) abVar.bravo();
            Context applicationContext = context.getApplicationContext();
            Intrinsics.delta(applicationContext, "getApplicationContext(...)");
            B2.w.golf(applicationContext).echo("location_service_keepalive", 2, ahVar);
            C3462a.alpha("LocationFlow", 12, "🧰 [BACKSTOP] periodic keep-alive enqueued", null);
            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl != null) {
            C3462a.alpha("LocationFlow", 12, "🧰 [BACKSTOP] enqueue failed: ".concat(m207exceptionOrNullimpl.getClass().getSimpleName()), null);
        }
    }

    public static String charlie(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                sb2 = BuildConfig.TRAVIS;
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder victor = Q0.c.victor("<", str2, " threw ");
                    victor.append(e.getClass().getName());
                    victor.append(">");
                    sb2 = victor.toString();
                }
            }
            objArr[i5] = sb2;
            i5++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i10 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf(Constants.EMBOLDEN_PLACEHOLDER, i10)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i10, indexOf);
            sb3.append(objArr[i4]);
            i4++;
            i10 = indexOf + 2;
        }
        sb3.append((CharSequence) str, i10, str.length());
        if (i4 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i4]);
            for (int i11 = i4 + 1; i11 < objArr.length; i11++) {
                sb3.append(", ");
                sb3.append(objArr[i11]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
