package androidx.appcompat.app;

import android.os.PowerManager;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class t {
    public static boolean alpha(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String bravo(Locale locale) {
        return locale.toLanguageTag();
    }
}
