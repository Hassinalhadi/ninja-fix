package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes3.dex */
public abstract class u {
    public static void alpha(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (!equals) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static o1.e bravo(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return o1.e.bravo(languageTags);
    }

    public static void charlie(o1.e eVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(eVar.alpha.alpha());
        LocaleList.setDefault(forLanguageTags);
    }

    public static void delta(Configuration configuration, o1.e eVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(eVar.alpha.alpha());
        configuration.setLocales(forLanguageTags);
    }
}
