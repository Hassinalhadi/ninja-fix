package delivery.samurai.android.injections.modules;

import Q9.c;
import android.content.Context;
import dagger.internal.b;
import dagger.internal.d;
import g3.InterfaceC1740a;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideComplianceCheckerFactory implements b {
    private final d alpha;

    public static InterfaceC1740a bravo(Context context) {
        InterfaceC1740a provideComplianceChecker = c.alpha.provideComplianceChecker(context);
        AbstractC2763s0.delta(provideComplianceChecker);
        return provideComplianceChecker;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC1740a get() {
        return bravo((Context) this.alpha.get());
    }
}
