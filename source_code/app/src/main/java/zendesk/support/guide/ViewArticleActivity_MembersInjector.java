package zendesk.support.guide;

import Kd.a;
import okhttp3.OkHttpClient;
import v9.InterfaceC3179a;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;

/* loaded from: classes.dex */
public final class ViewArticleActivity_MembersInjector implements InterfaceC3179a {
    private final a actionHandlerRegistryProvider;
    private final a applicationConfigurationProvider;
    private final a articleVoteStorageProvider;
    private final a configurationHelperProvider;
    private final a helpCenterProvider;
    private final a networkInfoProvider;
    private final a okHttpClientProvider;
    private final a settingsProvider;

    public ViewArticleActivity_MembersInjector(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        this.okHttpClientProvider = aVar;
        this.applicationConfigurationProvider = aVar2;
        this.helpCenterProvider = aVar3;
        this.articleVoteStorageProvider = aVar4;
        this.networkInfoProvider = aVar5;
        this.settingsProvider = aVar6;
        this.actionHandlerRegistryProvider = aVar7;
        this.configurationHelperProvider = aVar8;
    }

    public static InterfaceC3179a create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        return new ViewArticleActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static void injectActionHandlerRegistry(ViewArticleActivity viewArticleActivity, ActionHandlerRegistry actionHandlerRegistry) {
        viewArticleActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectApplicationConfiguration(ViewArticleActivity viewArticleActivity, ApplicationConfiguration applicationConfiguration) {
        viewArticleActivity.applicationConfiguration = applicationConfiguration;
    }

    public static void injectArticleVoteStorage(ViewArticleActivity viewArticleActivity, ArticleVoteStorage articleVoteStorage) {
        viewArticleActivity.articleVoteStorage = articleVoteStorage;
    }

    public static void injectConfigurationHelper(ViewArticleActivity viewArticleActivity, ConfigurationHelper configurationHelper) {
        viewArticleActivity.configurationHelper = configurationHelper;
    }

    public static void injectHelpCenterProvider(ViewArticleActivity viewArticleActivity, HelpCenterProvider helpCenterProvider) {
        viewArticleActivity.helpCenterProvider = helpCenterProvider;
    }

    public static void injectNetworkInfoProvider(ViewArticleActivity viewArticleActivity, NetworkInfoProvider networkInfoProvider) {
        viewArticleActivity.networkInfoProvider = networkInfoProvider;
    }

    public static void injectOkHttpClient(ViewArticleActivity viewArticleActivity, OkHttpClient okHttpClient) {
        viewArticleActivity.okHttpClient = okHttpClient;
    }

    public static void injectSettingsProvider(ViewArticleActivity viewArticleActivity, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        viewArticleActivity.settingsProvider = helpCenterSettingsProvider;
    }

    public void injectMembers(ViewArticleActivity viewArticleActivity) {
        injectOkHttpClient(viewArticleActivity, (OkHttpClient) this.okHttpClientProvider.get());
        injectApplicationConfiguration(viewArticleActivity, (ApplicationConfiguration) this.applicationConfigurationProvider.get());
        injectHelpCenterProvider(viewArticleActivity, (HelpCenterProvider) this.helpCenterProvider.get());
        injectArticleVoteStorage(viewArticleActivity, (ArticleVoteStorage) this.articleVoteStorageProvider.get());
        injectNetworkInfoProvider(viewArticleActivity, (NetworkInfoProvider) this.networkInfoProvider.get());
        injectSettingsProvider(viewArticleActivity, (HelpCenterSettingsProvider) this.settingsProvider.get());
        injectActionHandlerRegistry(viewArticleActivity, (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get());
        injectConfigurationHelper(viewArticleActivity, (ConfigurationHelper) this.configurationHelperProvider.get());
    }
}
