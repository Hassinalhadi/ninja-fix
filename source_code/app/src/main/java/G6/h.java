package G6;

import V5.x;

/* loaded from: classes2.dex */
public final class h {
    public final q alpha = new q();

    public h() {
    }

    public final void alpha(Exception exc) {
        this.alpha.oscar(exc);
    }

    public final void bravo(Object obj) {
        this.alpha.papa(obj);
    }

    public final boolean charlie(Exception exc) {
        q qVar = this.alpha;
        qVar.getClass();
        x.india(exc, "Exception must not be null");
        synchronized (qVar.alpha) {
            try {
                if (qVar.charlie) {
                    return false;
                }
                qVar.charlie = true;
                qVar.foxtrot = exc;
                qVar.bravo.india(qVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delta(Object obj) {
        this.alpha.romeo(obj);
    }

    public h(a aVar) {
        aVar.alpha(new p(this));
    }
}
