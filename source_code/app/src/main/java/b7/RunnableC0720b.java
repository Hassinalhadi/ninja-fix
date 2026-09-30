package b7;

import android.os.SystemClock;

/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0720b implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC0722d purple;

    public /* synthetic */ RunnableC0720b(AbstractC0722d abstractC0722d, int i4) {
        this.alpha = i4;
        this.purple = abstractC0722d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                AbstractC0722d abstractC0722d = this.purple;
                if (abstractC0722d.silver > 0) {
                    SystemClock.uptimeMillis();
                }
                abstractC0722d.setVisibility(0);
                return;
            default:
                AbstractC0722d abstractC0722d2 = this.purple;
                ((q) abstractC0722d2.getCurrentDrawable()).delta(false, false, true);
                if ((abstractC0722d2.getProgressDrawable() == null || !abstractC0722d2.getProgressDrawable().isVisible()) && (abstractC0722d2.getIndeterminateDrawable() == null || !abstractC0722d2.getIndeterminateDrawable().isVisible())) {
                    abstractC0722d2.setVisibility(4);
                }
                abstractC0722d2.getClass();
                return;
        }
    }
}
