package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsProviderFactory implements b {
    private final a sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(a aVar) {
        this.sdkSettingsProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(aVar);
    }

    public static SettingsProvider provideSdkSettingsProvider(Object obj) {
        SettingsProvider provideSdkSettingsProvider = ZendeskProvidersModule.provideSdkSettingsProvider((ZendeskSettingsProvider) obj);
        AbstractC2763s0.delta(provideSdkSettingsProvider);
        return provideSdkSettingsProvider;
    }

    @Override // Kd.a
    public SettingsProvider get() {
        return provideSdkSettingsProvider(this.sdkSettingsProvider.get());
    }
}
