package Bd;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import r6.u;

/* loaded from: classes2.dex */
public abstract class a {
    public static final TimeZone alpha = TimeZone.getTimeZone("GMT");

    public static final e alpha(Long l10) {
        Calendar calendar = Calendar.getInstance(alpha, Locale.ROOT);
        Intrinsics.checkNotNull(calendar);
        Intrinsics.echo(calendar, "<this>");
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        int i4 = calendar.get(16) + calendar.get(15);
        int i5 = calendar.get(13);
        int i10 = calendar.get(12);
        int i11 = calendar.get(11);
        int i12 = (calendar.get(7) + 5) % 7;
        g.alpha.getClass();
        g gVar = (g) g.red.get(i12);
        int i13 = calendar.get(5);
        int i14 = calendar.get(6);
        u uVar = f.alpha;
        int i15 = calendar.get(2);
        uVar.getClass();
        return new e(i5, i10, i11, gVar, i13, i14, (f) f.red.get(i15), calendar.get(1), calendar.getTimeInMillis() + i4);
    }
}
