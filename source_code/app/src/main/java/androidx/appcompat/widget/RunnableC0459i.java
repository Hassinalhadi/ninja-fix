package androidx.appcompat.widget;

import android.view.View;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0459i implements Runnable {
    public final C0455g alpha;
    public final /* synthetic */ C0469n purple;

    public RunnableC0459i(C0469n c0469n, C0455g c0455g) {
        this.purple = c0469n;
        this.alpha = c0455g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ao.j jVar;
        C0469n c0469n = this.purple;
        ao.l lVar = c0469n.red;
        if (lVar != null && (jVar = lVar.teal) != null) {
            jVar.coral(lVar);
        }
        View view = (View) c0469n.f2901a;
        if (view != null && view.getWindowToken() != null) {
            C0455g c0455g = this.alpha;
            if (!c0455g.bravo()) {
                if (c0455g.echo != null) {
                    c0455g.delta(0, 0, false, false);
                }
            }
            c0469n.f2912m = c0455g;
        }
        c0469n.f2914o = null;
    }
}
