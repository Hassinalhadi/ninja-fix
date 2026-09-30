package E2;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.LocaleList;
import android.os.UserManager;
import android.view.PointerIcon;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class d {
    public static LocaleList alpha(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static String bravo() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }

    public static DecimalFormatSymbols charlie(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList delta(Configuration configuration) {
        return configuration.getLocales();
    }

    public static PointerIcon echo(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static String[] foxtrot(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] golf(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static boolean hotel(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
