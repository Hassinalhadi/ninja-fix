package ae;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab implements androidx.lifecycle.aj {
    public static final Lazy purple = LazyKt.lazy(y.alpha);
    public final o alpha;

    public ab(o oVar) {
        this.alpha = oVar;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
        if (aaVar == androidx.lifecycle.aa.ON_DESTROY) {
            Object systemService = this.alpha.getSystemService("input_method");
            Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            x xVar = (x) purple.getValue();
            Object bravo = xVar.bravo(inputMethodManager);
            if (bravo != null) {
                synchronized (bravo) {
                    View charlie = xVar.charlie(inputMethodManager);
                    if (charlie == null) {
                        return;
                    }
                    if (charlie.isAttachedToWindow()) {
                        return;
                    }
                    boolean alpha = xVar.alpha(inputMethodManager);
                    if (alpha) {
                        inputMethodManager.isActive();
                    }
                }
            }
        }
    }
}
