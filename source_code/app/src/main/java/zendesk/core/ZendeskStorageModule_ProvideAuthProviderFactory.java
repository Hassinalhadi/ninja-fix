package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideAuthProviderFactory implements b {
    private final a identityManagerProvider;

    public ZendeskStorageModule_ProvideAuthProviderFactory(a aVar) {
        this.identityManagerProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideAuthProviderFactory create(a aVar) {
        return new ZendeskStorageModule_ProvideAuthProviderFactory(aVar);
    }

    public static AuthenticationProvider provideAuthProvider(Object obj) {
        AuthenticationProvider provideAuthProvider = ZendeskStorageModule.provideAuthProvider((IdentityManager) obj);
        AbstractC2763s0.delta(provideAuthProvider);
        return provideAuthProvider;
    }

    @Override // Kd.a
    public AuthenticationProvider get() {
        return provideAuthProvider(this.identityManagerProvider.get());
    }
}
