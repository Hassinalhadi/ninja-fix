package ae;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {
    public final long alpha = SystemClock.uptimeMillis() + 10000;
    public Runnable purple;
    public boolean red;
    public final /* synthetic */ o silver;

    public k(o oVar) {
        this.silver = oVar;
    }

    public final void alpha(View view) {
        if (!this.red) {
            this.red = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.echo(runnable, "runnable");
        this.purple = runnable;
        View decorView = this.silver.getWindow().getDecorView();
        Intrinsics.delta(decorView, "window.decorView");
        if (this.red) {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new A2.q(23, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.purple;
        if (runnable != null) {
            runnable.run();
            this.purple = null;
            w fullyDrawnReporter = this.silver.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.alpha) {
                z2 = fullyDrawnReporter.bravo;
            }
            if (z2) {
                this.red = false;
                this.silver.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.alpha) {
            this.red = false;
            this.silver.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.silver.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
