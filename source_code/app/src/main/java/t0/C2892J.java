package t0;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* renamed from: t0.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2892J implements InterfaceC2888F {
    public static final C2892J alpha = new Object();

    @Override // t0.InterfaceC2888F
    public final Rect alpha(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
