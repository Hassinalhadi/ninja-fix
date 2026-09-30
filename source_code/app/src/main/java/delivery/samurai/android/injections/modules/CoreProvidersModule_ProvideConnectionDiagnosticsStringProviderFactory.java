package delivery.samurai.android.injections.modules;

import Q9.c;
import android.content.Context;
import dagger.internal.b;
import dagger.internal.d;
import h3.InterfaceC1807d;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideConnectionDiagnosticsStringProviderFactory implements b {
    private final d alpha;

    public static InterfaceC1807d bravo(Context context) {
        InterfaceC1807d provideConnectionDiagnosticsStringProvider = c.alpha.provideConnectionDiagnosticsStringProvider(context);
        AbstractC2763s0.delta(provideConnectionDiagnosticsStringProvider);
        return provideConnectionDiagnosticsStringProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC1807d get() {
        return bravo((Context) this.alpha.get());
    }
}
