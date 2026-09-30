package zendesk.support;

import Kd.a;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.ActionListener;
import zendesk.classic.messaging.components.CompositeActionListener;
import zendesk.classic.messaging.components.Timer;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;

/* loaded from: classes.dex */
final class DaggerSupportEngineComponent {

    /* loaded from: classes.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private SupportEngineModule supportEngineModule;
        private SupportModule supportModule;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public SupportEngineComponent build() {
            AbstractC2763s0.bravo(CoreModule.class, this.coreModule);
            AbstractC2763s0.bravo(SupportModule.class, this.supportModule);
            if (this.supportEngineModule == null) {
                this.supportEngineModule = new SupportEngineModule();
            }
            return new SupportEngineComponentImpl(this.coreModule, this.supportModule, this.supportEngineModule, 0);
        }

        public Builder coreModule(CoreModule coreModule) {
            coreModule.getClass();
            this.coreModule = coreModule;
            return this;
        }

        public Builder supportEngineModule(SupportEngineModule supportEngineModule) {
            supportEngineModule.getClass();
            this.supportEngineModule = supportEngineModule;
            return this;
        }

        public Builder supportModule(SupportModule supportModule) {
            supportModule.getClass();
            this.supportModule = supportModule;
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes.dex */
    public static final class SupportEngineComponentImpl implements SupportEngineComponent {
        private final CoreModule coreModule;
        private a interactionIdentifierProvider;
        private a stateCompositeActionListenerProvider;
        private final SupportEngineComponentImpl supportEngineComponentImpl;
        private final SupportEngineModule supportEngineModule;
        private final SupportModule supportModule;
        private a updateViewObserverProvider;

        public /* synthetic */ SupportEngineComponentImpl(CoreModule coreModule, SupportModule supportModule, SupportEngineModule supportEngineModule, int i4) {
            this(coreModule, supportModule, supportEngineModule);
        }

        private ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> actionListenerOfConversationStateOfMessagingItem() {
            return SupportEngineModule_StateActionListenerFactory.stateActionListener(this.supportEngineModule, (CompositeActionListener) this.stateCompositeActionListenerProvider.get());
        }

        private ActionListener<Update> actionListenerOfUpdate() {
            return SupportEngineModule_UpdateActionListenerFactory.updateActionListener(this.supportEngineModule, (CompositeActionListener) this.updateViewObserverProvider.get());
        }

        private BotMessageDispatcher<MessagingItem> botMessageDispatcherOfMessagingItem() {
            return SupportEngineModule_BotMessageDispatcherFactory.botMessageDispatcher(this.supportEngineModule, (BotMessageDispatcher.MessageIdentifier) this.interactionIdentifierProvider.get(), actionListenerOfConversationStateOfMessagingItem(), actionListenerOfUpdate(), timerFactory());
        }

        private void initialize(CoreModule coreModule, SupportModule supportModule, SupportEngineModule supportEngineModule) {
            this.interactionIdentifierProvider = dagger.internal.a.alpha(SupportEngineModule_InteractionIdentifierFactory.create(supportEngineModule));
            this.stateCompositeActionListenerProvider = dagger.internal.a.alpha(SupportEngineModule_StateCompositeActionListenerFactory.create(supportEngineModule));
            this.updateViewObserverProvider = dagger.internal.a.alpha(SupportEngineModule_UpdateViewObserverFactory.create(supportEngineModule));
        }

        private RequestCreator requestCreator() {
            return SupportEngineModule_RequestCreatorFactory.requestCreator(this.supportEngineModule, SupportModule_ProvidesRequestProviderFactory.providesRequestProvider(this.supportModule), SupportModule_ProvidesUploadProviderFactory.providesUploadProvider(this.supportModule));
        }

        private SupportEngineModel supportEngineModel() {
            return SupportEngineModule_SupportEngineModelFactory.supportEngineModel(this.supportEngineModule, SupportModule_ProvidesSettingsProviderFactory.providesSettingsProvider(this.supportModule), requestCreator(), CoreModule_GetAuthenticationProviderFactory.getAuthenticationProvider(this.coreModule), SupportEngineModule_ConfigurationHelperFactory.configurationHelper(this.supportEngineModule), SupportEngineModule_EmailValidatorFactory.emailValidator(this.supportEngineModule), botMessageDispatcherOfMessagingItem());
        }

        private Timer.Factory timerFactory() {
            SupportEngineModule supportEngineModule = this.supportEngineModule;
            return SupportEngineModule_TimerFactoryFactory.timerFactory(supportEngineModule, SupportEngineModule_ProvideHandlerFactory.provideHandler(supportEngineModule));
        }

        @Override // zendesk.support.SupportEngineComponent
        public SupportEngine supportEngine() {
            return SupportEngineModule_SupportEngineFactory.supportEngine(this.supportEngineModule, CoreModule_GetApplicationContextFactory.getApplicationContext(this.coreModule), supportEngineModel(), (CompositeActionListener) this.stateCompositeActionListenerProvider.get(), (CompositeActionListener) this.updateViewObserverProvider.get());
        }

        private SupportEngineComponentImpl(CoreModule coreModule, SupportModule supportModule, SupportEngineModule supportEngineModule) {
            this.supportEngineComponentImpl = this;
            this.supportEngineModule = supportEngineModule;
            this.coreModule = coreModule;
            this.supportModule = supportModule;
            initialize(coreModule, supportModule, supportEngineModule);
        }
    }

    private DaggerSupportEngineComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
