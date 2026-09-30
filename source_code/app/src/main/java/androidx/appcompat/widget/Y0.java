package androidx.appcompat.widget;

import a7.C0408c;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class Y0 {
    public static OnBackInvokedDispatcher alpha(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback bravo(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0408c(3, runnable);
    }

    public static void charlie(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void delta(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
