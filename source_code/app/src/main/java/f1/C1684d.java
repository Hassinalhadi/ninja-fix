package f1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1684d implements Application.ActivityLifecycleCallbacks {
    public Object alpha;
    public Activity purple;
    public final int red;
    public boolean silver = false;
    public boolean teal = false;
    public boolean white = false;

    public C1684d(Activity activity) {
        this.purple = activity;
        this.red = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.purple == activity) {
            this.purple = null;
            this.teal = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.teal && !this.white && !this.silver) {
            Object obj = this.alpha;
            try {
                Object obj2 = AbstractC1685e.charlie.get(activity);
                if (obj2 == obj && activity.hashCode() == this.red) {
                    AbstractC1685e.golf.postAtFrontOfQueue(new be.g(18, AbstractC1685e.bravo.get(activity), obj2));
                    this.white = true;
                    this.alpha = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.purple == activity) {
            this.silver = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
