package com.zendesk.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class DateUtils {
    private static final DateFormat ISO_8601_DATE_FORMAT;
    private static final String ISO_8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZ";
    private static final TimeZone TIME_ZONE_UTC;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_8601_PATTERN, Locale.US);
        ISO_8601_DATE_FORMAT = simpleDateFormat;
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        TIME_ZONE_UTC = timeZone;
        simpleDateFormat.setTimeZone(timeZone);
    }

    private DateUtils() {
    }

    public static Date deserialiseFromIso8601(String str) {
        try {
            return ISO_8601_DATE_FORMAT.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
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
        return isSameDay(date, getCalendar(new Date()).getTime());
    }

    public static boolean isYesterday(Date date) {
        Calendar calendar = getCalendar(new Date());
        calendar.add(5, -1);
        return isSameDay(date, calendar.getTime());
    }

    public static String serialiseToIso8601(Date date) {
        return ISO_8601_DATE_FORMAT.format(date);
    }
}
