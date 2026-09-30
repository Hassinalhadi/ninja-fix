package delivery.samurai.android.injections.modules;

import Q9.c;
import da.InterfaceC1598d;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideSessionInvalidatorFactory implements b {
    public static InterfaceC1598d bravo() {
        InterfaceC1598d provideSessionInvalidator = c.alpha.provideSessionInvalidator();
        AbstractC2763s0.delta(provideSessionInvalidator);
        return provideSessionInvalidator;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC1598d get() {
        return bravo();
    }
}
