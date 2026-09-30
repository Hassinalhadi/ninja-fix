package delivery.samurai.android.injections.modules;

import Q9.c;
import android.content.Context;
import dagger.internal.b;
import dagger.internal.d;
import h3.InterfaceC1804a;
import h3.InterfaceC1805b;
import h3.InterfaceC1806c;
import h3.InterfaceC1807d;
import o3.g;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideConnectionDiagnosticsFactory implements b {
    private final d alpha;
    private final d bravo;
    private final d charlie;
    private final d delta;
    private final d echo;
    private final d foxtrot;

    public static m3.d bravo(Context context, g gVar, InterfaceC1806c interfaceC1806c, InterfaceC1807d interfaceC1807d, InterfaceC1805b interfaceC1805b, InterfaceC1804a interfaceC1804a) {
        m3.d provideConnectionDiagnostics = c.alpha.provideConnectionDiagnostics(context, gVar, interfaceC1806c, interfaceC1807d, interfaceC1805b, interfaceC1804a);
        AbstractC2763s0.delta(provideConnectionDiagnostics);
        return provideConnectionDiagnostics;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public m3.d get() {
        return bravo((Context) this.alpha.get(), (g) this.bravo.get(), (InterfaceC1806c) this.charlie.get(), (InterfaceC1807d) this.delta.get(), (InterfaceC1805b) this.echo.get(), (InterfaceC1804a) this.foxtrot.get());
    }
}
