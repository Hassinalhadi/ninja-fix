package zendesk.support.request;

import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
class UtilsDate {
    private UtilsDate() {
    }

    public static Date getBeginOfDay(Date date) {
        Calendar calendar = getCalendar(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    private static Calendar getCalendar(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        gregorianCalendar.setTime(date);
        return gregorianCalendar;
    }

    private static Date getYesterday() {
        Calendar calendar = getCalendar(new Date());
        calendar.add(5, -1);
        return calendar.getTime();
    }

    public static boolean isSameDay(Date date, Date date2) {
        boolean z2;
        boolean z10;
        boolean z11;
        Calendar calendar = getCalendar(date);
        Calendar calendar2 = getCalendar(date2);
        if (calendar.get(1) == calendar2.get(1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (calendar.get(2) == calendar2.get(2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (calendar.get(5) == calendar2.get(5)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z2 && z10 && z11) {
            return true;
        }
        return false;
    }

    public static boolean isToday(Date date) {
        return DateUtils.isToday(date.getTime());
    }

    public static boolean isYesterday(Date date) {
        return isSameDay(date, getYesterday());
    }
}
