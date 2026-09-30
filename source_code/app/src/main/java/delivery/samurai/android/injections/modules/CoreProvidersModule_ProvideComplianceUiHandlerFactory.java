package delivery.samurai.android.injections.modules;

import Q9.c;
import dagger.internal.b;
import k3.InterfaceC2002a;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideComplianceUiHandlerFactory implements b {
    public static InterfaceC2002a bravo() {
        InterfaceC2002a provideComplianceUiHandler = c.alpha.provideComplianceUiHandler();
        AbstractC2763s0.delta(provideComplianceUiHandler);
        return provideComplianceUiHandler;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC2002a get() {
        return bravo();
    }
}
