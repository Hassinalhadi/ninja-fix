package s1;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class ai implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap alpha = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z2;
        int i4;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.alpha.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (booleanValue != z2) {
                    if (z2) {
                        i4 = 16;
                    } else {
                        i4 = 32;
                    }
                    au.hotel(i4, view);
                    entry.setValue(Boolean.valueOf(z2));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
