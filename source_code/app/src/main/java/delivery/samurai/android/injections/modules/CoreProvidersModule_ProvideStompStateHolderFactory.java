package delivery.samurai.android.injections.modules;

import Q9.c;
import com.app.feature.location.api.StompStateHolder;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideStompStateHolderFactory implements b {
    public static StompStateHolder bravo() {
        StompStateHolder provideStompStateHolder = c.alpha.provideStompStateHolder();
        AbstractC2763s0.delta(provideStompStateHolder);
        return provideStompStateHolder;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public StompStateHolder get() {
        return bravo();
    }
}
