package delivery.samurai.android.injections.modules;

import Q9.c;
import com.app.feature.location.api.AllowMockProvider;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;
import u3.InterfaceC3143f;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideAllowMockProviderFactory implements b {
    private final d alpha;

    public static AllowMockProvider bravo(InterfaceC3143f interfaceC3143f) {
        AllowMockProvider provideAllowMockProvider = c.alpha.provideAllowMockProvider(interfaceC3143f);
        AbstractC2763s0.delta(provideAllowMockProvider);
        return provideAllowMockProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public AllowMockProvider get() {
        return bravo((InterfaceC3143f) this.alpha.get());
    }
}
