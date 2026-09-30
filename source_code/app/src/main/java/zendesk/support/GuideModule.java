package zendesk.support;

import java.util.UUID;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public class GuideModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final HelpCenterBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;
    private final HelpCenterTracker helpCenterTracker;

    /* renamed from: id, reason: collision with root package name */
    private final UUID f14243id = UUID.randomUUID();
    private final OkHttpClient okHttpClient;
    private final HelpCenterSettingsProvider settingsProvider;

    public GuideModule(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, HelpCenterTracker helpCenterTracker, ArticleVoteStorage articleVoteStorage, OkHttpClient okHttpClient) {
        this.helpCenterProvider = helpCenterProvider;
        this.settingsProvider = helpCenterSettingsProvider;
        this.blipsProvider = helpCenterBlipsProvider;
        this.helpCenterTracker = helpCenterTracker;
        this.articleVoteStorage = articleVoteStorage;
        this.okHttpClient = okHttpClient;
    }

    public UUID getId() {
        return this.f14243id;
    }

    public ArticleVoteStorage providesArticleVoteStorage() {
        return this.articleVoteStorage;
    }

    public HelpCenterBlipsProvider providesBlipsProvider() {
        return this.blipsProvider;
    }

    public HelpCenterProvider providesHelpCenterProvider() {
        return this.helpCenterProvider;
    }

    public HelpCenterTracker providesHelpCenterTracker() {
        return this.helpCenterTracker;
    }

    public OkHttpClient providesOkHttpClient() {
        return this.okHttpClient;
    }

    public HelpCenterSettingsProvider providesSettingsProvider() {
        return this.settingsProvider;
    }
}
