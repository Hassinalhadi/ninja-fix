package delivery.samurai.android.injections.modules;

import Q9.c;
import com.app.feature.location.api.LocationPayloadMapper;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideLocationPayloadMapperFactory implements b {
    public static LocationPayloadMapper bravo() {
        LocationPayloadMapper provideLocationPayloadMapper = c.alpha.provideLocationPayloadMapper();
        AbstractC2763s0.delta(provideLocationPayloadMapper);
        return provideLocationPayloadMapper;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public LocationPayloadMapper get() {
        return bravo();
    }
}
