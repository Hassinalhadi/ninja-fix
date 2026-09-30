package k0;

import a0.C0366t;
import a0.au;
import android.os.Build;
import android.view.KeyEvent;
import com.google.android.material.datepicker.ai;
import g0.C1725e;
import g0.C1726f;
import g0.ah;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import r1.C2483b;
import s6.P5;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1996c {
    public static C1726f alpha;

    public static final C1726f alpha() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = ah.alpha;
        au auVar = new au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(19.0f, 6.41f);
        bVar.hotel(17.59f, 5.0f);
        bVar.hotel(12.0f, 10.59f);
        bVar.hotel(6.41f, 5.0f);
        bVar.hotel(5.0f, 6.41f);
        bVar.hotel(10.59f, 12.0f);
        bVar.hotel(5.0f, 17.59f);
        bVar.hotel(6.41f, 19.0f);
        bVar.hotel(12.0f, 13.41f);
        bVar.hotel(17.59f, 19.0f);
        bVar.hotel(19.0f, 17.59f);
        bVar.hotel(13.41f, 12.0f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public static C2483b bravo(Long l10, Long l11) {
        if (l10 == null && l11 == null) {
            return new C2483b(null, null);
        }
        if (l10 == null) {
            return new C2483b(null, charlie(l11.longValue()));
        }
        if (l11 == null) {
            return new C2483b(charlie(l10.longValue()), null);
        }
        Calendar hotel = ai.hotel();
        Calendar india = ai.india(null);
        india.setTimeInMillis(l10.longValue());
        Calendar india2 = ai.india(null);
        india2.setTimeInMillis(l11.longValue());
        if (india.get(1) == india2.get(1)) {
            if (india.get(1) == hotel.get(1)) {
                return new C2483b(echo(l10.longValue(), Locale.getDefault()), echo(l11.longValue(), Locale.getDefault()));
            }
            return new C2483b(echo(l10.longValue(), Locale.getDefault()), golf(l11.longValue(), Locale.getDefault()));
        }
        return new C2483b(golf(l10.longValue(), Locale.getDefault()), golf(l11.longValue(), Locale.getDefault()));
    }

    public static String charlie(long j5) {
        Calendar hotel = ai.hotel();
        Calendar india = ai.india(null);
        india.setTimeInMillis(j5);
        if (hotel.get(1) == india.get(1)) {
            return echo(j5, Locale.getDefault());
        }
        return golf(j5, Locale.getDefault());
    }

    public static final long delta(KeyEvent keyEvent) {
        return P5.alpha(keyEvent.getKeyCode());
    }

    public static String echo(long j5, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = ai.charlie("MMMd", locale).format(new Date(j5));
            return format;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) ai.golf(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int bravo = ai.bravo(pattern, 1, 0, "yY");
        if (bravo < pattern.length()) {
            String str = "EMd";
            int bravo2 = ai.bravo(pattern, 1, bravo, "EMd");
            if (bravo2 < pattern.length()) {
                str = "EMd,";
            }
            pattern = pattern.replace(pattern.substring(ai.bravo(pattern, -1, bravo, str) + 1, bravo2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j5));
    }

    public static final int foxtrot(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static String golf(long j5, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = ai.charlie("yMMMd", locale).format(new Date(j5));
            return format;
        }
        return ai.golf(2, locale).format(new Date(j5));
    }
}
