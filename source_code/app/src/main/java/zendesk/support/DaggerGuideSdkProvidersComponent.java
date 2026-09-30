package zendesk.support;

import Kd.a;
import dagger.internal.d;
import dagger.internal.e;
import s6.AbstractC2763s0;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;

/* loaded from: classes.dex */
final class DaggerGuideSdkProvidersComponent {

    /* loaded from: classes.dex */
    public static final class Builder {
        private CoreModule coreModule;
        private GuideProviderModule guideProviderModule;

        public /* synthetic */ Builder(int i4) {
            this();
        }

        public GuideSdkProvidersComponent build() {
            AbstractC2763s0.bravo(CoreModule.class, this.coreModule);
            AbstractC2763s0.bravo(GuideProviderModule.class, this.guideProviderModule);
            return new GuideSdkProvidersComponentImpl(this.coreModule, this.guideProviderModule, 0);
        }

        public Builder coreModule(CoreModule coreModule) {
            coreModule.getClass();
            this.coreModule = coreModule;
            return this;
        }

        public Builder guideProviderModule(GuideProviderModule guideProviderModule) {
            guideProviderModule.getClass();
            this.guideProviderModule = guideProviderModule;
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes.dex */
    public static final class GuideSdkProvidersComponentImpl implements GuideSdkProvidersComponent {
        private a getBlipsProvider;
        private a getRestServiceProvider;
        private a getSessionStorageProvider;
        private a getSettingsProvider;
        private final GuideSdkProvidersComponentImpl guideSdkProvidersComponentImpl;
        private a provideArticleVoteStorageProvider;
        private a provideCustomNetworkConfigProvider;
        private a provideDeviceLocaleProvider;
        private a provideGuideModuleProvider;
        private a provideHelpCenterCachingInterceptorProvider;
        private a provideHelpCenterProvider;
        private a provideHelpCenterSessionCacheProvider;
        private a provideSettingsProvider;
        private a provideZendeskHelpCenterServiceProvider;
        private a provideZendeskLocaleConverterProvider;
        private a providesHelpCenterBlipsProvider;
        private a providesHelpCenterServiceProvider;

        public /* synthetic */ GuideSdkProvidersComponentImpl(CoreModule coreModule, GuideProviderModule guideProviderModule, int i4) {
            this(coreModule, guideProviderModule);
        }

        private void initialize(CoreModule coreModule, GuideProviderModule guideProviderModule) {
            this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule);
            this.provideZendeskLocaleConverterProvider = dagger.internal.a.alpha(GuideProviderModule_ProvideZendeskLocaleConverterFactory.create());
            d alpha = dagger.internal.a.alpha(GuideProviderModule_ProvideDeviceLocaleFactory.create(guideProviderModule));
            this.provideDeviceLocaleProvider = alpha;
            this.provideSettingsProvider = dagger.internal.a.alpha(GuideProviderModule_ProvideSettingsProviderFactory.create(guideProviderModule, this.getSettingsProvider, this.provideZendeskLocaleConverterProvider, alpha));
            CoreModule_GetBlipsProviderFactory create = CoreModule_GetBlipsProviderFactory.create(coreModule);
            this.getBlipsProvider = create;
            this.providesHelpCenterBlipsProvider = dagger.internal.a.alpha(GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory.create(guideProviderModule, create, this.provideDeviceLocaleProvider));
            this.getRestServiceProvider = CoreModule_GetRestServiceProviderFactory.create(coreModule);
            d alpha2 = e.alpha(GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory.create());
            this.provideHelpCenterCachingInterceptorProvider = alpha2;
            d alpha3 = e.alpha(GuideProviderModule_ProvideCustomNetworkConfigFactory.create(alpha2));
            this.provideCustomNetworkConfigProvider = alpha3;
            d alpha4 = dagger.internal.a.alpha(GuideProviderModule_ProvidesHelpCenterServiceFactory.create(this.getRestServiceProvider, alpha3));
            this.providesHelpCenterServiceProvider = alpha4;
            this.provideZendeskHelpCenterServiceProvider = dagger.internal.a.alpha(GuideProviderModule_ProvideZendeskHelpCenterServiceFactory.create(alpha4, this.provideZendeskLocaleConverterProvider));
            d alpha5 = dagger.internal.a.alpha(GuideProviderModule_ProvideHelpCenterSessionCacheFactory.create());
            this.provideHelpCenterSessionCacheProvider = alpha5;
            this.provideHelpCenterProvider = dagger.internal.a.alpha(GuideProviderModule_ProvideHelpCenterProviderFactory.create(guideProviderModule, this.provideSettingsProvider, this.providesHelpCenterBlipsProvider, this.provideZendeskHelpCenterServiceProvider, alpha5));
            CoreModule_GetSessionStorageFactory create2 = CoreModule_GetSessionStorageFactory.create(coreModule);
            this.getSessionStorageProvider = create2;
            d alpha6 = dagger.internal.a.alpha(GuideProviderModule_ProvideArticleVoteStorageFactory.create(create2));
            this.provideArticleVoteStorageProvider = alpha6;
            this.provideGuideModuleProvider = dagger.internal.a.alpha(GuideProviderModule_ProvideGuideModuleFactory.create(guideProviderModule, this.provideHelpCenterProvider, this.provideSettingsProvider, this.providesHelpCenterBlipsProvider, alpha6, this.getRestServiceProvider));
        }

        private Guide injectGuide(Guide guide) {
            Guide_MembersInjector.injectGuideModule(guide, (GuideModule) this.provideGuideModuleProvider.get());
            Guide_MembersInjector.injectBlipsProvider(guide, (HelpCenterBlipsProvider) this.providesHelpCenterBlipsProvider.get());
            return guide;
        }

        @Override // zendesk.support.GuideSdkProvidersComponent
        public Guide inject(Guide guide) {
            return injectGuide(guide);
        }

        private GuideSdkProvidersComponentImpl(CoreModule coreModule, GuideProviderModule guideProviderModule) {
            this.guideSdkProvidersComponentImpl = this;
            initialize(coreModule, guideProviderModule);
        }
    }

    private DaggerGuideSdkProvidersComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
