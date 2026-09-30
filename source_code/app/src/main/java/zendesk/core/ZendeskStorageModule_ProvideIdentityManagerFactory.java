package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideIdentityManagerFactory implements b {
    private final a identityStorageProvider;

    public ZendeskStorageModule_ProvideIdentityManagerFactory(a aVar) {
        this.identityStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideIdentityManagerFactory create(a aVar) {
        return new ZendeskStorageModule_ProvideIdentityManagerFactory(aVar);
    }

    public static IdentityManager provideIdentityManager(Object obj) {
        IdentityManager provideIdentityManager = ZendeskStorageModule.provideIdentityManager((IdentityStorage) obj);
        AbstractC2763s0.delta(provideIdentityManager);
        return provideIdentityManager;
    }

    @Override // Kd.a
    public IdentityManager get() {
        return provideIdentityManager(this.identityStorageProvider.get());
    }
}
