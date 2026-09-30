package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory implements b {
    private final a sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(a aVar) {
        this.sdkSettingsProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(aVar);
    }

    public static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(Object obj) {
        SdkSettingsProviderInternal provideSdkSettingsProviderInternal = ZendeskProvidersModule.provideSdkSettingsProviderInternal((ZendeskSettingsProvider) obj);
        AbstractC2763s0.delta(provideSdkSettingsProviderInternal);
        return provideSdkSettingsProviderInternal;
    }

    @Override // Kd.a
    public SdkSettingsProviderInternal get() {
        return provideSdkSettingsProviderInternal(this.sdkSettingsProvider.get());
    }
}
