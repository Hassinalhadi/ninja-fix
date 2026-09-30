package a0;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0352f {
    public final Bitmap alpha;

    public C0352f(Bitmap bitmap) {
        this.alpha = bitmap;
    }

    public final int alpha() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.alpha.getConfig();
        Intrinsics.checkNotNull(config3);
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 != Bitmap.Config.ARGB_4444) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26) {
                config2 = Bitmap.Config.RGBA_F16;
                if (config3 == config2) {
                    return 3;
                }
            }
            if (i4 >= 26) {
                config = Bitmap.Config.HARDWARE;
                if (config3 == config) {
                    return 4;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }
}
