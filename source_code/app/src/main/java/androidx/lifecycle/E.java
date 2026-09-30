package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.F;

/* loaded from: classes3.dex */
public abstract class E {
    public static final void alpha(Activity activity, F.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
