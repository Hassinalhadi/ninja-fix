package B8;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
import v8.RunnableC3176a;

/* loaded from: classes2.dex */
public final class c implements ViewTreeObserver.OnDrawListener {
    public final Handler alpha = new Handler(Looper.getMainLooper());
    public final AtomicReference purple;
    public final RunnableC3176a red;

    public c(View view, RunnableC3176a runnableC3176a) {
        this.purple = new AtomicReference(view);
        this.red = runnableC3176a;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.purple.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: B8.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                c cVar = c.this;
                cVar.getClass();
                view.getViewTreeObserver().removeOnDrawListener(cVar);
            }
        });
        this.alpha.postAtFrontOfQueue(this.red);
    }
}
