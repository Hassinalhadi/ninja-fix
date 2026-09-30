package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class ai {
    public static final AtomicReference alpha = new AtomicReference();

    public static long alpha(long j5) {
        Calendar india = india(null);
        india.setTimeInMillis(j5);
        return delta(india).getTimeInMillis();
    }

    public static int bravo(String str, int i4, int i5, String str2) {
        while (i5 >= 0 && i5 < str.length() && str2.indexOf(str.charAt(i5)) == -1) {
            if (str.charAt(i5) != '\'') {
                i5 += i4;
            }
            do {
                i5 += i4;
                if (i5 >= 0 && i5 < str.length()) {
                }
                i5 += i4;
            } while (str.charAt(i5) != '\'');
            i5 += i4;
        }
        return i5;
    }

    public static DateFormat charlie(String str, Locale locale) {
        TimeZone timeZone;
        DisplayContext unused;
        DateFormat echo = Rf.a.echo(str, locale);
        timeZone = TimeZone.getTimeZone("UTC");
        echo.setTimeZone(timeZone);
        unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        echo.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return echo;
    }

    public static Calendar delta(Calendar calendar) {
        Calendar india = india(calendar);
        Calendar india2 = india(null);
        india2.set(india.get(1), india.get(2), india.get(5));
        return india2;
    }

    public static SimpleDateFormat echo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String foxtrot(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", Constants.INAPP_DATA_TAG).replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace(Constants.INAPP_DATA_TAG, string3).replace("M", string2).replace("y", string);
    }

    public static java.text.DateFormat golf(int i4, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i4, locale);
        dateInstance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    public static Calendar hotel() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar india(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
