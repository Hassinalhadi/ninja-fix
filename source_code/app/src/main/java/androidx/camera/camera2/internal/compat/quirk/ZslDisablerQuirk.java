package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ZslDisablerQuirk implements D {
    public static final List alpha = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");
    public static final List bravo = Arrays.asList("MI 8");

    public static boolean bravo(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
