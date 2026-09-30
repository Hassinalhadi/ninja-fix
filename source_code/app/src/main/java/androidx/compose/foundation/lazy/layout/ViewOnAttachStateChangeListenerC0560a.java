package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2788u7;

/* renamed from: androidx.compose.foundation.lazy.layout.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC0560a implements aw, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public static long f2970a;
    public final View alpha;
    public boolean red;
    public boolean white;
    public long yellow;
    public final PriorityQueue purple = new PriorityQueue(11, new E0.k(6));
    public final Choreographer silver = Choreographer.getInstance();
    public final androidx.appcompat.app.am teal = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.appcompat.app.am] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnAttachStateChangeListenerC0560a(View view) {
        float f5;
        this.alpha = view;
        if (f2970a == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f5 = display.getRefreshRate();
            }
            f5 = 60.0f;
            f2970a = 1000000000 / f5;
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.white = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.aw
    public final void alpha(au auVar) {
        this.purple.add(new az(1, auVar));
        if (!this.red) {
            this.red = true;
            this.alpha.post(this);
        }
    }

    public final boolean bravo() {
        androidx.appcompat.app.am amVar = this.teal;
        long alpha = amVar.alpha();
        AbstractC2788u7.alpha(alpha, "compose:lazy:prefetch:available_time_nanos");
        boolean z2 = true;
        if (alpha > 0) {
            PriorityQueue priorityQueue = this.purple;
            Object peek = priorityQueue.peek();
            Intrinsics.checkNotNull(peek);
            if (!((az) peek).bravo.charlie(amVar)) {
                priorityQueue.poll();
                z2 = false;
            }
            amVar.alpha = false;
        }
        return z2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        if (this.white) {
            this.yellow = j5;
            this.alpha.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.white = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.white = false;
        this.alpha.removeCallbacks(this);
        this.silver.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        PriorityQueue priorityQueue = this.purple;
        if (!priorityQueue.isEmpty() && this.red && this.white) {
            View view = this.alpha;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                if (System.nanoTime() > (2 * f2970a) + nanos) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                androidx.appcompat.app.am amVar = this.teal;
                amVar.alpha = z2;
                amVar.bravo = Math.max(this.yellow, nanos) + f2970a;
                boolean z10 = false;
                while (!priorityQueue.isEmpty() && !z10) {
                    if (amVar.alpha) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z10 = bravo();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z10 = bravo();
                    }
                }
                if (z10) {
                    this.silver.postFrameCallback(this);
                } else {
                    this.red = false;
                }
                AbstractC2788u7.alpha(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.red = false;
    }
}
