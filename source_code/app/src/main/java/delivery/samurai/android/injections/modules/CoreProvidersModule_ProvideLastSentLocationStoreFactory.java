package delivery.samurai.android.injections.modules;

import Q9.c;
import android.content.Context;
import com.app.feature.location.store.LastSentLocationStore;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideLastSentLocationStoreFactory implements b {
    private final d alpha;

    public static LastSentLocationStore bravo(Context context) {
        LastSentLocationStore provideLastSentLocationStore = c.alpha.provideLastSentLocationStore(context);
        AbstractC2763s0.delta(provideLastSentLocationStore);
        return provideLastSentLocationStore;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public LastSentLocationStore get() {
        return bravo((Context) this.alpha.get());
    }
}
