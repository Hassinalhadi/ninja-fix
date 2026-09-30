package zendesk.core;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import vg.at;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideSdkSettingsServiceFactory implements b {
    private final a retrofitProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(a aVar) {
        this.retrofitProvider = aVar;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsServiceFactory create(a aVar) {
        return new ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(aVar);
    }

    public static SdkSettingsService provideSdkSettingsService(at atVar) {
        SdkSettingsService provideSdkSettingsService = ZendeskProvidersModule.provideSdkSettingsService(atVar);
        AbstractC2763s0.delta(provideSdkSettingsService);
        return provideSdkSettingsService;
    }

    @Override // Kd.a
    public SdkSettingsService get() {
        return provideSdkSettingsService((at) this.retrofitProvider.get());
    }
}
