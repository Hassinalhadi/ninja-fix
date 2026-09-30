package w9;

import com.google.android.gms.internal.measurement.C1298c;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;

/* loaded from: classes2.dex */
public final class l extends AbstractC3242c {
    public final p alpha;
    public final l bravo = this;
    public final dagger.internal.d charlie = dagger.internal.a.bravo(new Object());

    /* JADX WARN: Type inference failed for: r1v1, types: [dagger.internal.d, java.lang.Object] */
    public l(p pVar) {
        this.alpha = pVar;
    }

    @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
    public final ActivityComponentBuilder activityComponentBuilder() {
        return new C1298c(this.alpha, this.bravo);
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
    public final ActivityRetainedLifecycle getActivityRetainedLifecycle() {
        return (ActivityRetainedLifecycle) this.charlie.get();
    }
}
