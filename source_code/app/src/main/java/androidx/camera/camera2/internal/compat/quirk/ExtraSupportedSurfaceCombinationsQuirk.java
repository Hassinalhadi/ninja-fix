package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C0510h;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.U;
import av.q;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements D {
    public static final T alpha;
    public static final T bravo;
    public static final HashSet charlie;
    public static final HashSet delta;

    static {
        T t5 = new T();
        U u4 = U.VGA;
        q.juliet(2, u4, 0L, t5);
        U u10 = U.PREVIEW;
        q.juliet(1, u10, 0L, t5);
        U u11 = U.MAXIMUM;
        q.juliet(2, u11, 0L, t5);
        alpha = t5;
        T t10 = new T();
        t10.alpha(new C0510h(1, u10, 0L));
        t10.alpha(new C0510h(1, u4, 0L));
        q.juliet(2, u11, 0L, t10);
        bravo = t10;
        charlie = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        delta = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean bravo() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String upperCase = Build.MODEL.toUpperCase(Locale.US);
            Iterator it = delta.iterator();
            while (it.hasNext()) {
                if (upperCase.startsWith((String) it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
