package z8;

import C8.k;
import com.google.firebase.perf.util.Timer;

/* renamed from: z8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3480a implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3481b purple;
    public final /* synthetic */ Timer red;

    public /* synthetic */ RunnableC3480a(C3481b c3481b, Timer timer, int i4) {
        this.alpha = i4;
        this.purple = c3481b;
        this.red = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C3481b c3481b = this.purple;
                k bravo = c3481b.bravo(this.red);
                if (bravo != null) {
                    c3481b.alpha.add(bravo);
                    return;
                }
                return;
            default:
                C3481b c3481b2 = this.purple;
                k bravo2 = c3481b2.bravo(this.red);
                if (bravo2 != null) {
                    c3481b2.alpha.add(bravo2);
                    return;
                }
                return;
        }
    }
}
