package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import g3.ad;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideStompTokenProviderFactory implements b {
    public static ad bravo() {
        ad provideStompTokenProvider = c.alpha.provideStompTokenProvider();
        AbstractC2763s0.delta(provideStompTokenProvider);
        return provideStompTokenProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public ad get() {
        return bravo();
    }
}
