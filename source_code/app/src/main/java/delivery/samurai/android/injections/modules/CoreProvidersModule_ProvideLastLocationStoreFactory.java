package delivery.samurai.android.injections.modules;

import Q9.c;
import com.app.feature.location.store.LastSentLocationStore;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;
import u3.InterfaceC3141d;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideLastLocationStoreFactory implements b {
    private final d alpha;

    public static InterfaceC3141d bravo(LastSentLocationStore lastSentLocationStore) {
        InterfaceC3141d provideLastLocationStore = c.alpha.provideLastLocationStore(lastSentLocationStore);
        AbstractC2763s0.delta(provideLastLocationStore);
        return provideLastLocationStore;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public InterfaceC3141d get() {
        return bravo((LastSentLocationStore) this.alpha.get());
    }
}
