package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import s6.AbstractC2763s0;
import u3.InterfaceC3138a;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideAuthTokenProviderFactory implements b {
    public static InterfaceC3138a bravo() {
        InterfaceC3138a provideAuthTokenProvider = c.alpha.provideAuthTokenProvider();
        AbstractC2763s0.delta(provideAuthTokenProvider);
        return provideAuthTokenProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC3138a get() {
        return bravo();
    }
}
