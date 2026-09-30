package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ProviderModule_ProvideProviderStoreFactory implements b {
    private final a helpCenterProvider;
    private final ProviderModule module;
    private final a requestProvider;
    private final a uploadProvider;

    public ProviderModule_ProvideProviderStoreFactory(ProviderModule providerModule, a aVar, a aVar2, a aVar3) {
        this.module = providerModule;
        this.helpCenterProvider = aVar;
        this.requestProvider = aVar2;
        this.uploadProvider = aVar3;
    }

    public static ProviderModule_ProvideProviderStoreFactory create(ProviderModule providerModule, a aVar, a aVar2, a aVar3) {
        return new ProviderModule_ProvideProviderStoreFactory(providerModule, aVar, aVar2, aVar3);
    }

    public static ProviderStore provideProviderStore(ProviderModule providerModule, HelpCenterProvider helpCenterProvider, RequestProvider requestProvider, UploadProvider uploadProvider) {
        ProviderStore provideProviderStore = providerModule.provideProviderStore(helpCenterProvider, requestProvider, uploadProvider);
        AbstractC2763s0.delta(provideProviderStore);
        return provideProviderStore;
    }

    @Override // Kd.a
    public ProviderStore get() {
        return provideProviderStore(this.module, (HelpCenterProvider) this.helpCenterProvider.get(), (RequestProvider) this.requestProvider.get(), (UploadProvider) this.uploadProvider.get());
    }
}
