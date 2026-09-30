package delivery.samurai.android.injections.modules;

import Q9.g;
import android.content.Context;
import dagger.internal.b;
import dagger.internal.d;
import ea.InterfaceC1643a;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class TelemetryModule_ProvideAnalyticsTrackerFactory implements b {
    private final d alpha;

    public static InterfaceC1643a bravo(Context context) {
        InterfaceC1643a provideAnalyticsTracker = g.alpha.provideAnalyticsTracker(context);
        AbstractC2763s0.delta(provideAnalyticsTracker);
        return provideAnalyticsTracker;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC1643a get() {
        return bravo((Context) this.alpha.get());
    }
}
