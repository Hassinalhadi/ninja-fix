package t6;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import x.C3271b;

/* loaded from: classes2.dex */
public abstract class Z2 {
    public static C3271b alpha(C3271b c3271b, Q0.n nVar, D0.an anVar, Q0.d dVar, H0.j jVar) {
        if (c3271b != null && nVar == c3271b.alpha && Intrinsics.areEqual(D0.ae.hotel(anVar, nVar), c3271b.bravo) && dVar.alpha() == c3271b.charlie.alpha && jVar == c3271b.delta) {
            return c3271b;
        }
        C3271b c3271b2 = C3271b.hotel;
        if (c3271b2 != null && nVar == c3271b2.alpha && Intrinsics.areEqual(D0.ae.hotel(anVar, nVar), c3271b2.bravo) && dVar.alpha() == c3271b2.charlie.alpha && jVar == c3271b2.delta) {
            return c3271b2;
        }
        C3271b c3271b3 = new C3271b(nVar, D0.ae.hotel(anVar, nVar), new Q0.e(dVar.alpha(), dVar.indigo()), jVar);
        C3271b.hotel = c3271b3;
        return c3271b3;
    }

    public static final int bravo(Bitmap bitmap) {
        int i4;
        Bitmap.Config config;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 == Bitmap.Config.ALPHA_8) {
                    i4 = 1;
                } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                    i4 = 2;
                } else {
                    if (Build.VERSION.SDK_INT >= 26) {
                        config = Bitmap.Config.RGBA_F16;
                        if (config2 == config) {
                            i4 = 8;
                        }
                    }
                    i4 = 4;
                }
                return height * i4;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final boolean charlie(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
