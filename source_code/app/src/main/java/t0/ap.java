package t0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import y0.C3387a;

/* loaded from: classes3.dex */
public final class ap implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration alpha;
    public final /* synthetic */ y0.c purple;

    public ap(Configuration configuration, y0.c cVar) {
        this.alpha = configuration;
        this.purple = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.alpha;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.purple.alpha.entrySet().iterator();
        while (it.hasNext()) {
            C3387a c3387a = (C3387a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c3387a == null || Configuration.needNewResources(updateFrom, c3387a.bravo)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.purple.alpha.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        this.purple.alpha.clear();
    }
}
