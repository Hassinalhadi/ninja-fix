package s6;

import com.checkout.components.insight.common.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: s6.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2634d5 {
    public static final String alpha(String str) {
        String bravo;
        if (str == null) {
            return "--";
        }
        if (!StringsKt.gray(str)) {
            try {
                Iterator it = CollectionsKt.listOf(Constants.DATE_TIME_PATTERN_ISO_8601, "yyyy-MM-dd'T'HH:mm:ssXXX", "yyyy-MM-dd'T'HH:mm:ss'Z'").iterator();
                Date date = null;
                while (it.hasNext()) {
                    try {
                        date = new SimpleDateFormat((String) it.next(), Locale.getDefault()).parse(str);
                    } catch (Exception unused) {
                    }
                    if (date != null) {
                        break;
                    }
                }
                if (date == null) {
                    return "--";
                }
                bravo = bravo(date);
                if (bravo == null) {
                    return "--";
                }
            } catch (Exception unused2) {
                return "--";
            }
        }
        return bravo;
    }

    public static final String bravo(Date date) {
        if (date == null) {
            return "--";
        }
        String format = new SimpleDateFormat("MMM dd", Locale.getDefault()).format(date);
        String format2 = new SimpleDateFormat("hh:mm aa", Locale.getDefault()).format(date);
        Intrinsics.delta(format2, "format(...)");
        String upperCase = format2.toUpperCase(Locale.ROOT);
        Intrinsics.delta(upperCase, "toUpperCase(...)");
        return format + "   -   " + upperCase;
    }

    public static final String charlie(Date date) {
        Intrinsics.echo(date, "<this>");
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date);
        Intrinsics.delta(format, "format(...)");
        return format;
    }

    public static final String delta(Date date) {
        Intrinsics.echo(date, "<this>");
        String format = new SimpleDateFormat("hh:mm aa", Locale.getDefault()).format(date);
        Intrinsics.delta(format, "format(...)");
        String upperCase = format.toUpperCase(Locale.ROOT);
        Intrinsics.delta(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final int echo(Date date) {
        if (date == null) {
            return 0;
        }
        long time = date.getTime() - new Date().getTime();
        if (time <= 0) {
            return 0;
        }
        return (int) TimeUnit.MILLISECONDS.toDays(time);
    }

    public static Ge.o foxtrot(AbstractC2778t6 abstractC2778t6) {
        if (abstractC2778t6 instanceof Me.e) {
            Me.e eVar = (Me.e) abstractC2778t6;
            String name = eVar.bravo;
            Intrinsics.echo(name, "name");
            String desc = eVar.charlie;
            Intrinsics.echo(desc, "desc");
            return new Ge.o(name.concat(desc));
        }
        if (abstractC2778t6 instanceof Me.d) {
            Me.d dVar = (Me.d) abstractC2778t6;
            String name2 = dVar.bravo;
            Intrinsics.echo(name2, "name");
            String desc2 = dVar.charlie;
            Intrinsics.echo(desc2, "desc");
            return new Ge.o(name2 + '#' + desc2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String golf(String str) {
        try {
            Iterator it = CollectionsKt.listOf(Constants.DATE_TIME_PATTERN_ISO_8601, "yyyy-MM-dd'T'HH:mm:ssXXX", "yyyy-MM-dd'T'HH:mm:ss'Z'").iterator();
            Date date = null;
            while (it.hasNext()) {
                try {
                    date = new SimpleDateFormat((String) it.next(), Locale.getDefault()).parse(str);
                } catch (Exception unused) {
                }
                if (date != null) {
                    break;
                }
            }
            if (date == null) {
                return "";
            }
            String hotel = hotel(date);
            if (hotel == null) {
                return "";
            }
            return hotel;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static final String hotel(Date date) {
        try {
            long currentTimeMillis = System.currentTimeMillis() - date.getTime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long minutes = timeUnit.toMinutes(currentTimeMillis);
            long hours = timeUnit.toHours(currentTimeMillis);
            long days = timeUnit.toDays(currentTimeMillis);
            if (minutes < 60) {
                return minutes + "m";
            }
            if (hours < 24) {
                return hours + "h";
            }
            return days + com.clevertap.android.sdk.Constants.INAPP_DATA_TAG;
        } catch (Exception unused) {
            return "";
        }
    }
}
