package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ProviderModule_ProvideUploadProviderFactory implements b {
    private final ProviderModule module;
    private final a uploadServiceProvider;

    public ProviderModule_ProvideUploadProviderFactory(ProviderModule providerModule, a aVar) {
        this.module = providerModule;
        this.uploadServiceProvider = aVar;
    }

    public static ProviderModule_ProvideUploadProviderFactory create(ProviderModule providerModule, a aVar) {
        return new ProviderModule_ProvideUploadProviderFactory(providerModule, aVar);
    }

    public static UploadProvider provideUploadProvider(ProviderModule providerModule, Object obj) {
        UploadProvider provideUploadProvider = providerModule.provideUploadProvider((ZendeskUploadService) obj);
        AbstractC2763s0.delta(provideUploadProvider);
        return provideUploadProvider;
    }

    @Override // Kd.a
    public UploadProvider get() {
        return provideUploadProvider(this.module, this.uploadServiceProvider.get());
    }
}
