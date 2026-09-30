package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import androidx.camera.core.impl.D;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements D {
    public static final HashSet alpha;

    static {
        HashSet hashSet = new HashSet();
        alpha = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
