package t6;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: t6.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3087z {
    public static final T.s alpha(T.s sVar, a0.as asVar) {
        return androidx.compose.ui.graphics.a.charlie(sVar, 0.0f, 0.0f, 0.0f, asVar, 518143);
    }

    public static final T.s bravo(T.s sVar) {
        return androidx.compose.ui.graphics.a.charlie(sVar, 0.0f, 0.0f, 0.0f, null, 520191);
    }

    public static void charlie(Window window, boolean z2) {
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            bc.d.golf(window, z2);
            return;
        }
        if (i5 >= 30) {
            bc.d.foxtrot(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z2) {
            i4 = systemUiVisibility & (-1793);
        } else {
            i4 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i4);
    }
}
