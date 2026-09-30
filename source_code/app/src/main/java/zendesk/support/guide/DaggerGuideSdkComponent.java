package zendesk.support.guide;

import Kd.a;
import s6.AbstractC2763s0;
import zendesk.core.ActionHandler;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationConfigurationFactory;
import zendesk.core.CoreModule_GetNetworkInfoProviderFactory;
import zendesk.support.GuideModule;
import zendesk.support.GuideModule_ProvidesArticleVoteStorageFactory;
import zendesk.support.GuideModule_ProvidesHelpCenterProviderFactory;
import zendesk.support.GuideModule_ProvidesOkHttpClientFactory;
import zendesk.support.GuideModule_ProvidesSettingsProviderFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DaggerGuideSdkComponent {

    /* loaded from: classes.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private GuideModule guideModule;
        private GuideSdkModule guideSdkModule;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public GuideSdkComponent build() {
            AbstractC2763s0.bravo(CoreModule.class, this.coreModule);
            AbstractC2763s0.bravo(GuideModule.class, this.guideModule);
            if (this.guideSdkModule == null) {
                this.guideSdkModule = new GuideSdkModule();
            }
            return new GuideSdkComponentImpl(this.coreModule, this.guideModule, this.guideSdkModule, 0);
        }

        public Builder coreModule(CoreModule coreModule) {
            coreModule.getClass();
            this.coreModule = coreModule;
            return this;
        }

        public Builder guideModule(GuideModule guideModule) {
            guideModule.getClass();
            this.guideModule = guideModule;
            return this;
        }

        public Builder guideSdkModule(GuideSdkModule guideSdkModule) {
            guideSdkModule.getClass();
            this.guideSdkModule = guideSdkModule;
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes.dex */
    public static final class GuideSdkComponentImpl implements GuideSdkComponent {
        private final CoreModule coreModule;
        private final GuideModule guideModule;
        private final GuideSdkComponentImpl guideSdkComponentImpl;
        private final GuideSdkModule guideSdkModule;
        private a viewArticleActionHandlerProvider;

        public /* synthetic */ GuideSdkComponentImpl(CoreModule coreModule, GuideModule guideModule, GuideSdkModule guideSdkModule, int i4) {
            this(coreModule, guideModule, guideSdkModule);
        }

        private void initialize(CoreModule coreModule, GuideModule guideModule, GuideSdkModule guideSdkModule) {
            this.viewArticleActionHandlerProvider = dagger.internal.a.alpha(GuideSdkModule_ViewArticleActionHandlerFactory.create());
        }

        private GuideSdkDependencyProvider injectGuideSdkDependencyProvider(GuideSdkDependencyProvider guideSdkDependencyProvider) {
            GuideSdkDependencyProvider_MembersInjector.injectRegistry(guideSdkDependencyProvider, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
            GuideSdkDependencyProvider_MembersInjector.injectActionHandler(guideSdkDependencyProvider, (ActionHandler) this.viewArticleActionHandlerProvider.get());
            return guideSdkDependencyProvider;
        }

        private HelpCenterActivity injectHelpCenterActivity(HelpCenterActivity helpCenterActivity) {
            HelpCenterActivity_MembersInjector.injectHelpCenterProvider(helpCenterActivity, GuideModule_ProvidesHelpCenterProviderFactory.providesHelpCenterProvider(this.guideModule));
            HelpCenterActivity_MembersInjector.injectSettingsProvider(helpCenterActivity, GuideModule_ProvidesSettingsProviderFactory.providesSettingsProvider(this.guideModule));
            HelpCenterActivity_MembersInjector.injectNetworkInfoProvider(helpCenterActivity, CoreModule_GetNetworkInfoProviderFactory.getNetworkInfoProvider(this.coreModule));
            HelpCenterActivity_MembersInjector.injectActionHandlerRegistry(helpCenterActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
            HelpCenterActivity_MembersInjector.injectConfigurationHelper(helpCenterActivity, GuideSdkModule_ConfigurationHelperFactory.configurationHelper(this.guideSdkModule));
            return helpCenterActivity;
        }

        private HelpCenterFragment injectHelpCenterFragment(HelpCenterFragment helpCenterFragment) {
            HelpCenterFragment_MembersInjector.injectHelpCenterProvider(helpCenterFragment, GuideModule_ProvidesHelpCenterProviderFactory.providesHelpCenterProvider(this.guideModule));
            HelpCenterFragment_MembersInjector.injectNetworkInfoProvider(helpCenterFragment, CoreModule_GetNetworkInfoProviderFactory.getNetworkInfoProvider(this.coreModule));
            return helpCenterFragment;
        }

        private ViewArticleActivity injectViewArticleActivity(ViewArticleActivity viewArticleActivity) {
            ViewArticleActivity_MembersInjector.injectOkHttpClient(viewArticleActivity, GuideModule_ProvidesOkHttpClientFactory.providesOkHttpClient(this.guideModule));
            ViewArticleActivity_MembersInjector.injectApplicationConfiguration(viewArticleActivity, CoreModule_GetApplicationConfigurationFactory.getApplicationConfiguration(this.coreModule));
            ViewArticleActivity_MembersInjector.injectHelpCenterProvider(viewArticleActivity, GuideModule_ProvidesHelpCenterProviderFactory.providesHelpCenterProvider(this.guideModule));
            ViewArticleActivity_MembersInjector.injectArticleVoteStorage(viewArticleActivity, GuideModule_ProvidesArticleVoteStorageFactory.providesArticleVoteStorage(this.guideModule));
            ViewArticleActivity_MembersInjector.injectNetworkInfoProvider(viewArticleActivity, CoreModule_GetNetworkInfoProviderFactory.getNetworkInfoProvider(this.coreModule));
            ViewArticleActivity_MembersInjector.injectSettingsProvider(viewArticleActivity, GuideModule_ProvidesSettingsProviderFactory.providesSettingsProvider(this.guideModule));
            ViewArticleActivity_MembersInjector.injectActionHandlerRegistry(viewArticleActivity, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
            ViewArticleActivity_MembersInjector.injectConfigurationHelper(viewArticleActivity, GuideSdkModule_ConfigurationHelperFactory.configurationHelper(this.guideSdkModule));
            return viewArticleActivity;
        }

        @Override // zendesk.support.guide.GuideSdkComponent
        public void inject(GuideSdkDependencyProvider guideSdkDependencyProvider) {
            injectGuideSdkDependencyProvider(guideSdkDependencyProvider);
        }

        private GuideSdkComponentImpl(CoreModule coreModule, GuideModule guideModule, GuideSdkModule guideSdkModule) {
            this.guideSdkComponentImpl = this;
            this.coreModule = coreModule;
            this.guideModule = guideModule;
            this.guideSdkModule = guideSdkModule;
            initialize(coreModule, guideModule, guideSdkModule);
        }

        @Override // zendesk.support.guide.GuideSdkComponent
        public void inject(ViewArticleActivity viewArticleActivity) {
            injectViewArticleActivity(viewArticleActivity);
        }

        @Override // zendesk.support.guide.GuideSdkComponent
        public void inject(HelpCenterActivity helpCenterActivity) {
            injectHelpCenterActivity(helpCenterActivity);
        }

        @Override // zendesk.support.guide.GuideSdkComponent
        public void inject(HelpCenterFragment helpCenterFragment) {
            injectHelpCenterFragment(helpCenterFragment);
        }
    }

    private DaggerGuideSdkComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
