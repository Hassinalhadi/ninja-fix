package s1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class ac extends aa {
    public View bravo;

    /* JADX WARN: Type inference failed for: r4v0, types: [s1.ab] */
    @Override // s1.aa
    public final void alpha() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.bravo;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: s1.ab
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i4) {
                    boolean z2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i4 & 8) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    atomicBoolean2.set(z2);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r4);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r4);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.alpha();
    }

    @Override // s1.aa
    public final void bravo() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.bravo;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.bravo();
    }
}
