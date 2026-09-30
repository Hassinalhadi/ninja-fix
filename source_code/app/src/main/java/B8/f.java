package B8;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
import v8.RunnableC3176a;

/* loaded from: classes2.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final Handler alpha = new Handler(Looper.getMainLooper());
    public final AtomicReference purple;
    public final RunnableC3176a red;
    public final RunnableC3176a silver;

    public f(View view, RunnableC3176a runnableC3176a, RunnableC3176a runnableC3176a2) {
        this.purple = new AtomicReference(view);
        this.red = runnableC3176a;
        this.silver = runnableC3176a2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.purple.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.alpha;
        handler.post(this.red);
        handler.postAtFrontOfQueue(this.silver);
        return true;
    }
}
