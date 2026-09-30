package androidx.appcompat.app;

import a7.C0408c;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class v {
    public static OnBackInvokedDispatcher alpha(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback bravo(Object obj, ab abVar) {
        Objects.requireNonNull(abVar);
        C0408c c0408c = new C0408c(2, abVar);
        E0.c.papa(obj).registerOnBackInvokedCallback(1000000, c0408c);
        return c0408c;
    }

    public static void charlie(Object obj, Object obj2) {
        E0.c.papa(obj).unregisterOnBackInvokedCallback(E0.c.lima(obj2));
    }
}
