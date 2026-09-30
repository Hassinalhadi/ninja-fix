package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.AuthenticationProvider;

/* loaded from: classes.dex */
public final class SupportEngineModule_SupportEngineModelFactory implements b {
    private final a authenticationProvider;
    private final a botMessageDispatcherProvider;
    private final a configurationHelperProvider;
    private final a emailValidatorProvider;
    private final SupportEngineModule module;
    private final a requestCreatorProvider;
    private final a settingsProvider;

    public SupportEngineModule_SupportEngineModelFactory(SupportEngineModule supportEngineModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6) {
        this.module = supportEngineModule;
        this.settingsProvider = aVar;
        this.requestCreatorProvider = aVar2;
        this.authenticationProvider = aVar3;
        this.configurationHelperProvider = aVar4;
        this.emailValidatorProvider = aVar5;
        this.botMessageDispatcherProvider = aVar6;
    }

    public static SupportEngineModule_SupportEngineModelFactory create(SupportEngineModule supportEngineModule, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6) {
        return new SupportEngineModule_SupportEngineModelFactory(supportEngineModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static SupportEngineModel supportEngineModel(SupportEngineModule supportEngineModule, SupportSettingsProvider supportSettingsProvider, RequestCreator requestCreator, AuthenticationProvider authenticationProvider, ConfigurationHelper configurationHelper, Object obj, BotMessageDispatcher<MessagingItem> botMessageDispatcher) {
        SupportEngineModel supportEngineModel = supportEngineModule.supportEngineModel(supportSettingsProvider, requestCreator, authenticationProvider, configurationHelper, (EmailValidator) obj, botMessageDispatcher);
        AbstractC2763s0.delta(supportEngineModel);
        return supportEngineModel;
    }

    @Override // Kd.a
    public SupportEngineModel get() {
        return supportEngineModel(this.module, (SupportSettingsProvider) this.settingsProvider.get(), (RequestCreator) this.requestCreatorProvider.get(), (AuthenticationProvider) this.authenticationProvider.get(), (ConfigurationHelper) this.configurationHelperProvider.get(), this.emailValidatorProvider.get(), (BotMessageDispatcher) this.botMessageDispatcherProvider.get());
    }
}
