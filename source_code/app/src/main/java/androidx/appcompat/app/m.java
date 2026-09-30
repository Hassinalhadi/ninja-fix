package androidx.appcompat.app;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: classes3.dex */
public abstract class m {
    public static LocaleList alpha(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void bravo(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
