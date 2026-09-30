package delivery.samurai.android.injections.modules;

import Q9.c;
import com.app.feature.location.api.UserInfoProvider;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class CoreProvidersModule_ProvideUserInfoProviderFactory implements b {
    public static UserInfoProvider bravo() {
        UserInfoProvider provideUserInfoProvider = c.alpha.provideUserInfoProvider();
        AbstractC2763s0.delta(provideUserInfoProvider);
        return provideUserInfoProvider;
    }

    @Override // Kd.a
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public UserInfoProvider get() {
        return bravo();
    }
}
