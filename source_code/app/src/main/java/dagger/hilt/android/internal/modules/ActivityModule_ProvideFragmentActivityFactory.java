package dagger.hilt.android.internal.modules;

import android.app.Activity;
import androidx.fragment.app.an;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class ActivityModule_ProvideFragmentActivityFactory implements b {
    private final d activityProvider;

    private ActivityModule_ProvideFragmentActivityFactory(d dVar) {
        this.activityProvider = dVar;
    }

    public static ActivityModule_ProvideFragmentActivityFactory create(d dVar) {
        return new ActivityModule_ProvideFragmentActivityFactory(dVar);
    }

    public static an provideFragmentActivity(Activity activity) {
        an provideFragmentActivity = ActivityModule.provideFragmentActivity(activity);
        AbstractC2763s0.delta(provideFragmentActivity);
        return provideFragmentActivity;
    }

    @Override // Kd.a
    public an get() {
        return provideFragmentActivity((Activity) this.activityProvider.get());
    }
}
