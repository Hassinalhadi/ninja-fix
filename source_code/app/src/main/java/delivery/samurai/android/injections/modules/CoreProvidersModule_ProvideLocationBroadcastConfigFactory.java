package delivery.samurai.android.injections.modules;

import Q9.c;
import com.app.feature.location.LocationBroadcastConfig;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideLocationBroadcastConfigFactory implements b {
    public static LocationBroadcastConfig bravo() {
        LocationBroadcastConfig provideLocationBroadcastConfig = c.alpha.provideLocationBroadcastConfig();
        AbstractC2763s0.delta(provideLocationBroadcastConfig);
        return provideLocationBroadcastConfig;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public LocationBroadcastConfig get() {
        return bravo();
    }
}
