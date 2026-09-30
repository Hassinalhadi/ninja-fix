package av;

import id.C1915c;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1915c purple;

    public /* synthetic */ p(C1915c c1915c, int i4) {
        this.alpha = i4;
        this.purple = c1915c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C1915c c1915c = this.purple;
                if (!((AtomicBoolean) c1915c.red).getAndSet(true)) {
                    ((s) ((J2.c) c1915c.silver).red).red.execute(new p(c1915c, 1));
                    return;
                }
                return;
            default:
                C1915c c1915c2 = this.purple;
                if (((s) ((J2.c) c1915c2.silver).red).A != 8) {
                    s sVar = (s) ((J2.c) c1915c2.silver).red;
                    sVar.uniform("Camera skip reopen at state: ".concat(q.november(sVar.A)), null);
                    return;
                } else {
                    ((s) ((J2.c) c1915c2.silver).red).uniform("Camera onError timeout, reopen it.", null);
                    ((s) ((J2.c) c1915c2.silver).red).coral(7);
                    ((s) ((J2.c) c1915c2.silver).red).f3260a.bravo();
                    return;
                }
        }
    }
}
