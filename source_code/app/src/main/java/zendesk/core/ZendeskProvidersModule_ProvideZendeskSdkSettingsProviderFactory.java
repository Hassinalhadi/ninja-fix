package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory implements b {
    private final a actionHandlerRegistryProvider;
    private final a configurationProvider;
    private final a contextProvider;
    private final a coreSettingsStorageProvider;
    private final a sdkSettingsServiceProvider;
    private final a serializerProvider;
    private final a settingsStorageProvider;
    private final a zendeskLocaleConverterProvider;

    public ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        this.sdkSettingsServiceProvider = aVar;
        this.settingsStorageProvider = aVar2;
        this.coreSettingsStorageProvider = aVar3;
        this.actionHandlerRegistryProvider = aVar4;
        this.serializerProvider = aVar5;
        this.zendeskLocaleConverterProvider = aVar6;
        this.configurationProvider = aVar7;
        this.contextProvider = aVar8;
    }

    public static ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        return new ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(Object obj, Object obj2, Object obj3, ActionHandlerRegistry actionHandlerRegistry, Object obj4, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        ZendeskSettingsProvider provideZendeskSdkSettingsProvider = ZendeskProvidersModule.provideZendeskSdkSettingsProvider((SdkSettingsService) obj, (SettingsStorage) obj2, (CoreSettingsStorage) obj3, actionHandlerRegistry, (Serializer) obj4, zendeskLocaleConverter, applicationConfiguration, context);
        AbstractC2763s0.delta(provideZendeskSdkSettingsProvider);
        return provideZendeskSdkSettingsProvider;
    }

    @Override // Kd.a
    public ZendeskSettingsProvider get() {
        return provideZendeskSdkSettingsProvider(this.sdkSettingsServiceProvider.get(), this.settingsStorageProvider.get(), this.coreSettingsStorageProvider.get(), (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get(), this.serializerProvider.get(), (ZendeskLocaleConverter) this.zendeskLocaleConverterProvider.get(), (ApplicationConfiguration) this.configurationProvider.get(), (Context) this.contextProvider.get());
    }
}
