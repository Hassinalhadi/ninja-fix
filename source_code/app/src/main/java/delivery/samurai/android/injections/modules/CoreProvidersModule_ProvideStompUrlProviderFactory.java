package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import g3.ae;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideStompUrlProviderFactory implements b {
    public static ae bravo() {
        ae provideStompUrlProvider = c.alpha.provideStompUrlProvider();
        AbstractC2763s0.delta(provideStompUrlProvider);
        return provideStompUrlProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public ae get() {
        return bravo();
    }
}
