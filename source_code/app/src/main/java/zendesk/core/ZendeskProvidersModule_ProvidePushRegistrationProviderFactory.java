package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ProvidePushRegistrationProviderFactory implements b {
    private final a blipsProvider;
    private final a contextProvider;
    private final a identityManagerProvider;
    private final a pushDeviceIdStorageProvider;
    private final a pushRegistrationServiceProvider;
    private final a settingsProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6) {
        this.pushRegistrationServiceProvider = aVar;
        this.identityManagerProvider = aVar2;
        this.settingsProvider = aVar3;
        this.blipsProvider = aVar4;
        this.pushDeviceIdStorageProvider = aVar5;
        this.contextProvider = aVar6;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationProviderFactory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static PushRegistrationProvider providePushRegistrationProvider(Object obj, Object obj2, SettingsProvider settingsProvider, Object obj3, Object obj4, Context context) {
        PushRegistrationProvider providePushRegistrationProvider = ZendeskProvidersModule.providePushRegistrationProvider((PushRegistrationService) obj, (IdentityManager) obj2, settingsProvider, (BlipsCoreProvider) obj3, (PushDeviceIdStorage) obj4, context);
        AbstractC2763s0.delta(providePushRegistrationProvider);
        return providePushRegistrationProvider;
    }

    @Override // Kd.a
    public PushRegistrationProvider get() {
        return providePushRegistrationProvider(this.pushRegistrationServiceProvider.get(), this.identityManagerProvider.get(), (SettingsProvider) this.settingsProvider.get(), this.blipsProvider.get(), this.pushDeviceIdStorageProvider.get(), (Context) this.contextProvider.get());
    }
}
