package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.D;
import av.q;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ExtraCroppingQuirk implements D {
    public static final HashMap alpha;

    static {
        HashMap hashMap = new HashMap();
        alpha = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size bravo(int i4) {
        if (charlie()) {
            int mike = q.mike(i4);
            if (mike != 0) {
                if (mike != 1) {
                    if (mike == 2) {
                        return new Size(3264, 1836);
                    }
                    return null;
                }
                return new Size(1280, 720);
            }
            return new Size(1920, 1080);
        }
        return null;
    }

    public static boolean charlie() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            HashMap hashMap = alpha;
            String str = Build.MODEL;
            Locale locale = Locale.US;
            if (hashMap.containsKey(str.toUpperCase(locale))) {
                Range range = (Range) hashMap.get(str.toUpperCase(locale));
                if (range == null) {
                    return true;
                }
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return false;
        }
        return false;
    }
}
