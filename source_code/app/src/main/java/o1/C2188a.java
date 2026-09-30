package o1;

import A2.p;
import androidx.fragment.app.RunnableC0628x;
import x2.z;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2188a {
    public boolean alpha;
    public p bravo;
    public boolean charlie;

    public final void alpha() {
        synchronized (this) {
            try {
                if (this.alpha) {
                    return;
                }
                this.alpha = true;
                this.charlie = true;
                p pVar = this.bravo;
                if (pVar != null) {
                    try {
                        RunnableC0628x runnableC0628x = (RunnableC0628x) pVar.purple;
                        if (runnableC0628x == null) {
                            ((z) pVar.red).cancel();
                            ((Runnable) pVar.silver).run();
                        } else {
                            runnableC0628x.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.charlie = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.charlie = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
