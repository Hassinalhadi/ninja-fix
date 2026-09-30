package p7;

/* loaded from: classes2.dex */
public abstract class u implements Runnable {
    public final G6.h alpha;

    public u() {
        this.alpha = null;
    }

    public void alpha(Exception exc) {
        G6.h hVar = this.alpha;
        if (hVar != null) {
            hVar.charlie(exc);
        }
    }

    public abstract void bravo();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bravo();
        } catch (Exception e) {
            alpha(e);
        }
    }

    public u(G6.h hVar) {
        this.alpha = hVar;
    }
}
