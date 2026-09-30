package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskNetworkModule_ProvideSettingsInterceptorFactory implements b {
    private final a sdkSettingsProvider;
    private final a settingsStorageProvider;

    public ZendeskNetworkModule_ProvideSettingsInterceptorFactory(a aVar, a aVar2) {
        this.sdkSettingsProvider = aVar;
        this.settingsStorageProvider = aVar2;
    }

    public static ZendeskNetworkModule_ProvideSettingsInterceptorFactory create(a aVar, a aVar2) {
        return new ZendeskNetworkModule_ProvideSettingsInterceptorFactory(aVar, aVar2);
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(Object obj, Object obj2) {
        ZendeskSettingsInterceptor provideSettingsInterceptor = ZendeskNetworkModule.provideSettingsInterceptor((SdkSettingsProviderInternal) obj, (SettingsStorage) obj2);
        AbstractC2763s0.delta(provideSettingsInterceptor);
        return provideSettingsInterceptor;
    }

    @Override // Kd.a
    public ZendeskSettingsInterceptor get() {
        return provideSettingsInterceptor(this.sdkSettingsProvider.get(), this.settingsStorageProvider.get());
    }
}
