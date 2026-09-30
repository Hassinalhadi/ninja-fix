package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import java.util.concurrent.ScheduledExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvideCoreSdkModuleFactory implements b {
    private final a actionHandlerRegistryProvider;
    private final a authenticationProvider;
    private final a blipsProvider;
    private final a contextProvider;
    private final a executorProvider;
    private final a machineIdStorageProvider;
    private final a memoryCacheProvider;
    private final a networkInfoProvider;
    private final a pushRegistrationProvider;
    private final a restServiceProvider;
    private final a sessionStorageProvider;
    private final a settingsProvider;
    private final a zendeskConfigurationProvider;

    public ZendeskProvidersModule_ProvideCoreSdkModuleFactory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13) {
        this.settingsProvider = aVar;
        this.restServiceProvider = aVar2;
        this.blipsProvider = aVar3;
        this.sessionStorageProvider = aVar4;
        this.networkInfoProvider = aVar5;
        this.memoryCacheProvider = aVar6;
        this.actionHandlerRegistryProvider = aVar7;
        this.executorProvider = aVar8;
        this.contextProvider = aVar9;
        this.authenticationProvider = aVar10;
        this.zendeskConfigurationProvider = aVar11;
        this.pushRegistrationProvider = aVar12;
        this.machineIdStorageProvider = aVar13;
    }

    public static ZendeskProvidersModule_ProvideCoreSdkModuleFactory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13) {
        return new ZendeskProvidersModule_ProvideCoreSdkModuleFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13);
    }

    public static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ScheduledExecutorService scheduledExecutorService, Context context, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider, MachineIdStorage machineIdStorage) {
        CoreModule provideCoreSdkModule = ZendeskProvidersModule.provideCoreSdkModule(settingsProvider, restServiceProvider, blipsProvider, sessionStorage, networkInfoProvider, memoryCache, actionHandlerRegistry, scheduledExecutorService, context, authenticationProvider, applicationConfiguration, pushRegistrationProvider, machineIdStorage);
        AbstractC2763s0.delta(provideCoreSdkModule);
        return provideCoreSdkModule;
    }

    @Override // Kd.a
    public CoreModule get() {
        return provideCoreSdkModule((SettingsProvider) this.settingsProvider.get(), (RestServiceProvider) this.restServiceProvider.get(), (BlipsProvider) this.blipsProvider.get(), (SessionStorage) this.sessionStorageProvider.get(), (NetworkInfoProvider) this.networkInfoProvider.get(), (MemoryCache) this.memoryCacheProvider.get(), (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get(), (ScheduledExecutorService) this.executorProvider.get(), (Context) this.contextProvider.get(), (AuthenticationProvider) this.authenticationProvider.get(), (ApplicationConfiguration) this.zendeskConfigurationProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get(), (MachineIdStorage) this.machineIdStorageProvider.get());
    }
}
