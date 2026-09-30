package j1;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import s6.AbstractC2813x5;

/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1930d {
    public static final /* synthetic */ int alpha = 0;

    static {
        new ThreadLocal();
    }

    public static void alpha(Paint paint, EnumC1927a enumC1927a) {
        PorterDuffXfermode porterDuffXfermode = null;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 29) {
            if (enumC1927a != null) {
                obj = I2.b.india(enumC1927a);
            }
            I2.b.kilo(paint, obj);
        } else {
            if (enumC1927a != null) {
                PorterDuff.Mode alpha2 = AbstractC2813x5.alpha(enumC1927a);
                if (alpha2 != null) {
                    porterDuffXfermode = new PorterDuffXfermode(alpha2);
                }
                paint.setXfermode(porterDuffXfermode);
                return;
            }
            paint.setXfermode(null);
        }
    }
}
