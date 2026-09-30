package T5;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final d teal = new d();
    public final AtomicBoolean alpha = new AtomicBoolean();
    public final AtomicBoolean purple = new AtomicBoolean();
    public final ArrayList red = new ArrayList();
    public boolean silver = false;

    public static void bravo(Application application) {
        d dVar = teal;
        synchronized (dVar) {
            try {
                if (!dVar.silver) {
                    application.registerActivityLifecycleCallbacks(dVar);
                    application.registerComponentCallbacks(dVar);
                    dVar.silver = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void alpha(c cVar) {
        synchronized (teal) {
            this.red.add(cVar);
        }
    }

    public final void charlie(boolean z2) {
        synchronized (teal) {
            try {
                Iterator it = this.red.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).alpha(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.purple;
        boolean compareAndSet = this.alpha.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            charlie(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.purple;
        boolean compareAndSet = this.alpha.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            charlie(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.alpha.compareAndSet(false, true)) {
            this.purple.set(true);
            charlie(true);
        }
    }
}
