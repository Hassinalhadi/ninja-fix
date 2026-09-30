package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskStorageModule_ProvideIdentityStorageFactory implements b {
    private final a baseStorageProvider;

    public ZendeskStorageModule_ProvideIdentityStorageFactory(a aVar) {
        this.baseStorageProvider = aVar;
    }

    public static ZendeskStorageModule_ProvideIdentityStorageFactory create(a aVar) {
        return new ZendeskStorageModule_ProvideIdentityStorageFactory(aVar);
    }

    public static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        IdentityStorage provideIdentityStorage = ZendeskStorageModule.provideIdentityStorage(baseStorage);
        AbstractC2763s0.delta(provideIdentityStorage);
        return provideIdentityStorage;
    }

    @Override // Kd.a
    public IdentityStorage get() {
        return provideIdentityStorage((BaseStorage) this.baseStorageProvider.get());
    }
}
