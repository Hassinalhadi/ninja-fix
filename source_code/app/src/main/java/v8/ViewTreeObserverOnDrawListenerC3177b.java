package v8;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* renamed from: v8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnDrawListenerC3177b implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AppStartTrace alpha;

    public ViewTreeObserverOnDrawListenerC3177b(AppStartTrace appStartTrace) {
        this.alpha = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.alpha.f8296l++;
    }
}
