package t0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes3.dex */
public final class aq implements ComponentCallbacks2 {
    public final /* synthetic */ y0.d alpha;

    public aq(y0.d dVar) {
        this.alpha = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        y0.d dVar = this.alpha;
        synchronized (dVar) {
            dVar.alpha.charlie();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        y0.d dVar = this.alpha;
        synchronized (dVar) {
            dVar.alpha.charlie();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        y0.d dVar = this.alpha;
        synchronized (dVar) {
            dVar.alpha.charlie();
        }
    }
}
