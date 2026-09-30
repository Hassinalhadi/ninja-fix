package zendesk.support;

import java.util.Locale;
import zendesk.core.BlipsProvider;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class GuideProviderModule {
    private HelpCenterTracker tracker;

    public GuideProviderModule(HelpCenterTracker helpCenterTracker) {
        this.tracker = helpCenterTracker;
    }

    public static ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        return new ZendeskArticleVoteStorage(sessionStorage.getAdditionalSdkStorage());
    }

    public static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        return new HelpCenterCachingNetworkConfig(helpCenterCachingInterceptor);
    }

    public static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        return new HelpCenterCachingInterceptor();
    }

    public static HelpCenterSessionCache provideHelpCenterSessionCache() {
        return new ZendeskHelpCenterSessionCache();
    }

    public static ZendeskHelpCenterService provideZendeskHelpCenterService(HelpCenterService helpCenterService, ZendeskLocaleConverter zendeskLocaleConverter) {
        return new ZendeskHelpCenterService(helpCenterService, zendeskLocaleConverter);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return new ZendeskLocaleConverter();
    }

    public static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider, HelpCenterCachingNetworkConfig helpCenterCachingNetworkConfig) {
        return (HelpCenterService) restServiceProvider.createRestService(HelpCenterService.class, com.zendesk.sdk.guide.providers.BuildConfig.VERSION_NAME, GuideConstants.USER_AGENT_VARIANT, helpCenterCachingNetworkConfig);
    }

    public Locale provideDeviceLocale() {
        return Locale.getDefault();
    }

    public GuideModule provideGuideModule(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ArticleVoteStorage articleVoteStorage, RestServiceProvider restServiceProvider) {
        return new GuideModule(helpCenterProvider, helpCenterSettingsProvider, helpCenterBlipsProvider, this.tracker, articleVoteStorage, restServiceProvider.getMediaOkHttpClient());
    }

    public HelpCenterProvider provideHelpCenterProvider(HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache) {
        return new ZendeskHelpCenterProvider(helpCenterSettingsProvider, helpCenterBlipsProvider, zendeskHelpCenterService, helpCenterSessionCache, this.tracker);
    }

    public HelpCenterSettingsProvider provideSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        return new ZendeskHelpCenterSettingsProvider(settingsProvider, zendeskLocaleConverter, locale);
    }

    public HelpCenterBlipsProvider providesHelpCenterBlipsProvider(BlipsProvider blipsProvider, Locale locale) {
        return new ZendeskHelpCenterBlipsProvider(blipsProvider, locale);
    }
}
