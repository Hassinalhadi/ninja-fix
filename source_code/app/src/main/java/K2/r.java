package K2;

import A2.z;

/* loaded from: classes3.dex */
public final class r implements Runnable {
    public final s alpha;
    public final J2.j purple;

    public r(s sVar, J2.j jVar) {
        this.alpha = sVar;
        this.purple = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.alpha.delta) {
            try {
                if (((r) this.alpha.bravo.remove(this.purple)) != null) {
                    q qVar = (q) this.alpha.charlie.remove(this.purple);
                    if (qVar != null) {
                        J2.j jVar = this.purple;
                        D2.g gVar = (D2.g) qVar;
                        z.echo().alpha(D2.g.f934h, "Exceeded time limits on execution for " + jVar);
                        gVar.f935a.execute(new D2.f(gVar, 0));
                    }
                } else {
                    z.echo().alpha("WrkTimerRunnable", "Timer with " + this.purple + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
