package a0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ComponentCallbacks2C0350d implements ComponentCallbacks2 {
    public final /* synthetic */ C0351e alpha;

    public ComponentCallbacks2C0350d(C0351e c0351e) {
        this.alpha = c0351e;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 >= 40) {
            this.alpha.getClass();
        }
    }
}
