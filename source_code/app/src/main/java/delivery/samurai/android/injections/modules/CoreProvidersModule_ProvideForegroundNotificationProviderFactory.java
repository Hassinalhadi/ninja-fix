package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import s6.AbstractC2763s0;
import u3.InterfaceC3139b;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideForegroundNotificationProviderFactory implements b {
    public static InterfaceC3139b bravo() {
        InterfaceC3139b provideForegroundNotificationProvider = c.alpha.provideForegroundNotificationProvider();
        AbstractC2763s0.delta(provideForegroundNotificationProvider);
        return provideForegroundNotificationProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC3139b get() {
        return bravo();
    }
}
