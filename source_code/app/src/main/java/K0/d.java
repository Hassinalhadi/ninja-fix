package K0;

import J2.t;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class d {
    public static final c alpha;

    static {
        c bVar;
        if (Build.VERSION.SDK_INT >= 24) {
            bVar = new t(15);
        } else {
            bVar = new u8.b(4);
        }
        alpha = bVar;
    }
}
