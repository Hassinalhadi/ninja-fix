package zendesk.support;

import java.util.UUID;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public class SupportModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final SupportBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;

    /* renamed from: id, reason: collision with root package name */
    private final UUID f14255id = UUID.randomUUID();
    private final OkHttpClient okHttpClient;
    private final RequestProvider requestProvider;
    private final SupportSettingsProvider settingsProvider;
    private final UploadProvider uploadProvider;
    private final ZendeskTracker zendeskTracker;

    public SupportModule(RequestProvider requestProvider, UploadProvider uploadProvider, HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, OkHttpClient okHttpClient, ZendeskTracker zendeskTracker, ArticleVoteStorage articleVoteStorage) {
        this.requestProvider = requestProvider;
        this.uploadProvider = uploadProvider;
        this.helpCenterProvider = helpCenterProvider;
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.okHttpClient = okHttpClient;
        this.zendeskTracker = zendeskTracker;
        this.articleVoteStorage = articleVoteStorage;
    }

    public UUID getId() {
        return this.f14255id;
    }

    public ArticleVoteStorage providesArticleVoteStorage() {
        return this.articleVoteStorage;
    }

    public SupportBlipsProvider providesBlipsProvider() {
        return this.blipsProvider;
    }

    public HelpCenterProvider providesHelpCenterProvider() {
        return this.helpCenterProvider;
    }

    public OkHttpClient providesOkHttpClient() {
        return this.okHttpClient;
    }

    public RequestProvider providesRequestProvider() {
        return this.requestProvider;
    }

    public SupportSettingsProvider providesSettingsProvider() {
        return this.settingsProvider;
    }

    public UploadProvider providesUploadProvider() {
        return this.uploadProvider;
    }

    public ZendeskTracker providesZendeskTracker() {
        return this.zendeskTracker;
    }
}
