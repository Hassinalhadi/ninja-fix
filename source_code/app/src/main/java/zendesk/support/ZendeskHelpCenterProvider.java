package zendesk.support;

import android.annotation.SuppressLint;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ErrorResponseAdapter;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.LocaleUtil;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZendeskHelpCenterProvider implements HelpCenterProvider {
    private static final String EMPTY_JSON_BODY = "{}";
    private static final String LOG_TAG = "ZendeskHelpCenterProvider";
    private final HelpCenterBlipsProvider blipsProvider;
    private final ZendeskHelpCenterService helpCenterService;
    private final HelpCenterSessionCache helpCenterSessionCache;
    private final HelpCenterTracker helpCenterTracker;
    private final HelpCenterSettingsProvider settingsProvider;

    /* loaded from: classes.dex */
    public static abstract class ZendeskCallbackSuccess<E> extends ZendeskCallback<E> {
        private final ZendeskCallback callback;

        public ZendeskCallbackSuccess(ZendeskCallback zendeskCallback) {
            this.callback = zendeskCallback;
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onError(ErrorResponse errorResponse) {
            ZendeskCallback zendeskCallback = this.callback;
            if (zendeskCallback != null) {
                zendeskCallback.onError(errorResponse);
            }
        }

        @Override // com.zendesk.service.ZendeskCallback
        public abstract void onSuccess(E e);
    }

    public ZendeskHelpCenterProvider(HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache, HelpCenterTracker helpCenterTracker) {
        this.settingsProvider = helpCenterSettingsProvider;
        this.blipsProvider = helpCenterBlipsProvider;
        this.helpCenterService = zendeskHelpCenterService;
        this.helpCenterSessionCache = helpCenterSessionCache;
        this.helpCenterTracker = helpCenterTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkSettingsAndVotingEnabled(ZendeskCallback<?> zendeskCallback, HelpCenterSettings helpCenterSettings) {
        if (!sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
            if (helpCenterSettings.isArticleVotingEnabled()) {
                return true;
            }
            Logger.e(LOG_TAG, "Help Center voting is disabled in your app's settings. Can not continue with the call", new Object[0]);
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("Help Center voting is disabled in your app's settings. Can not continue with the call"));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HelpItem> convert(HelpResponse helpResponse) {
        if (helpResponse == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (CategoryItem categoryItem : helpResponse.getCategories()) {
            arrayList.add(categoryItem);
            for (SectionItem sectionItem : categoryItem.getSections()) {
                arrayList.add(sectionItem);
                arrayList.addAll(sectionItem.getChildren());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.util.List<zendesk.support.FlatArticle>] */
    @SuppressLint({"UseSparseArrays"})
    public List<FlatArticle> asFlatArticleList(ArticlesResponse articlesResponse) {
        if (articlesResponse == null) {
            return new ArrayList();
        }
        List<Category> categories = articlesResponse.getCategories();
        List<Section> sections = articlesResponse.getSections();
        List<Article> articles = articlesResponse.getArticles();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ?? arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(articles)) {
            for (Category category : categories) {
                hashMap.put(category.getId(), category);
            }
            for (Section section : sections) {
                hashMap2.put(section.getId(), section);
            }
            for (Article article : articles) {
                Section section2 = (Section) hashMap2.get(article.getSectionId());
                arrayList.add(new FlatArticle((Category) hashMap.get(section2.getCategoryId()), section2, article));
            }
        } else {
            Logger.d(LOG_TAG, "There are no articles contained in this account", new Object[0]);
            arrayList = Collections.EMPTY_LIST;
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    public List<SearchArticle> asSearchArticleList(ArticlesResponse articlesResponse) {
        Section section;
        ArrayList arrayList = new ArrayList();
        if (articlesResponse != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            List<Article> ensureEmpty = CollectionUtils.ensureEmpty(articlesResponse.getArticles());
            List<Section> ensureEmpty2 = CollectionUtils.ensureEmpty(articlesResponse.getSections());
            List<Category> ensureEmpty3 = CollectionUtils.ensureEmpty(articlesResponse.getCategories());
            List<zendesk.core.User> ensureEmpty4 = CollectionUtils.ensureEmpty(articlesResponse.getUsers());
            for (Section section2 : ensureEmpty2) {
                if (section2.getId() != null) {
                    hashMap.put(section2.getId(), section2);
                }
            }
            for (Category category : ensureEmpty3) {
                if (category.getId() != null) {
                    hashMap2.put(category.getId(), category);
                }
            }
            for (zendesk.core.User user : ensureEmpty4) {
                if (user.getId() != null) {
                    hashMap3.put(user.getId(), user);
                }
            }
            for (Article article : ensureEmpty) {
                Category category2 = null;
                if (article.getSectionId() != null) {
                    section = (Section) hashMap.get(article.getSectionId());
                } else {
                    Logger.w(LOG_TAG, "Unable to determine section as section id was null.", new Object[0]);
                    section = null;
                }
                if (section != null && section.getCategoryId() != null) {
                    category2 = (Category) hashMap2.get(section.getCategoryId());
                } else {
                    Logger.w(LOG_TAG, "Unable to determine category as section was null.", new Object[0]);
                }
                if (article.getAuthorId() != null) {
                    article.setAuthor((zendesk.core.User) hashMap3.get(article.getAuthorId()));
                } else {
                    Logger.w(LOG_TAG, "Unable to determine author as author id was null.", new Object[0]);
                }
                arrayList.add(new SearchArticle(article, section, category2));
            }
        }
        return arrayList;
    }

    @Override // zendesk.support.HelpCenterProvider
    public void deleteVote(final Long l10, final ZendeskCallback<Void> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.14
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(zendeskCallback, helpCenterSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.deleteVote(l10, new ZendeskCallbackSuccess<Void>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.14.1
                        @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                        public void onSuccess(Void r22) {
                            ZendeskCallback zendeskCallback2 = zendeskCallback;
                            if (zendeskCallback2 != null) {
                                zendeskCallback2.onSuccess(r22);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void downvoteArticle(final Long l10, final ZendeskCallback<ArticleVote> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.13
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(zendeskCallback, helpCenterSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.downvoteArticle(l10, ZendeskHelpCenterProvider.EMPTY_JSON_BODY, new ZendeskCallbackSuccess<ArticleVoteResponse>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.13.1
                        @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                        public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                            ZendeskCallback zendeskCallback2 = zendeskCallback;
                            if (zendeskCallback2 != null) {
                                zendeskCallback2.onSuccess(articleVoteResponse.getVote());
                            }
                            ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l10, -1);
                        }
                    });
                }
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getArticle(final Long l10, final ZendeskCallback<Article> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.8
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getArticle(l10, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), "users", new ZendeskCallbackSuccess<Article>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.8.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                    public void onSuccess(Article article) {
                        ZendeskHelpCenterProvider.this.submitRecordArticleView(article, LocaleUtil.forLanguageTag(article.getLocale()), new ZendeskCallback<Void>() { // from class: zendesk.support.ZendeskHelpCenterProvider.8.1.1
                            @Override // com.zendesk.service.ZendeskCallback
                            public void onError(ErrorResponse errorResponse) {
                                Logger.e(ZendeskHelpCenterProvider.LOG_TAG, "Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", errorResponse.getReason(), Boolean.valueOf(errorResponse.isHttpError()), Integer.valueOf(errorResponse.getStatus()));
                            }

                            @Override // com.zendesk.service.ZendeskCallback
                            public void onSuccess(Void r12) {
                            }
                        });
                        ZendeskCallback zendeskCallback2 = zendeskCallback;
                        if (zendeskCallback2 != null) {
                            zendeskCallback2.onSuccess(article);
                        }
                    }
                });
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getArticles(Long l10, ZendeskCallback<List<Article>> zendeskCallback) {
        getArticles(l10, null, zendeskCallback);
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getAttachments(final Long l10, final AttachmentType attachmentType, final ZendeskCallback<List<HelpCenterAttachment>> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10, attachmentType)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.11
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getAttachments(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), l10, attachmentType, zendeskCallback);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getCategories(final ZendeskCallback<List<Category>> zendeskCallback) {
        if (sanityCheck(zendeskCallback, new Object[0])) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.2
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getCategories(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), zendeskCallback);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getCategory(final Long l10, final ZendeskCallback<Category> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.10
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getCategoryById(l10, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), zendeskCallback);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getHelp(final HelpRequest helpRequest, final ZendeskCallback<List<HelpItem>> zendeskCallback) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.1
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getHelp(ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), helpRequest.getCategoryIds(), helpRequest.getSectionIds(), helpRequest.getIncludes(), helpRequest.getArticlesPerPageLimit(), StringUtils.toCsvString(helpRequest.getLabelNames()), new ZendeskCallbackSuccess<HelpResponse>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.1.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                    public void onSuccess(HelpResponse helpResponse) {
                        ZendeskHelpCenterProvider.this.helpCenterTracker.helpCenterLoaded();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        ZendeskCallback zendeskCallback2 = zendeskCallback;
                        if (zendeskCallback2 != null) {
                            zendeskCallback2.onSuccess(ZendeskHelpCenterProvider.this.convert(helpResponse));
                        }
                    }
                });
            }
        });
    }

    public Locale getLocale(HelpCenterSettings helpCenterSettings) {
        String str;
        Guide guide = Guide.INSTANCE;
        if (guide.getHelpCenterLocaleOverride() != null) {
            return guide.getHelpCenterLocaleOverride();
        }
        if (helpCenterSettings != null) {
            str = helpCenterSettings.getLocale();
        } else {
            str = "";
        }
        if (StringUtils.isEmpty(str)) {
            return Locale.getDefault();
        }
        return LocaleUtil.forLanguageTag(str);
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getSection(final Long l10, final ZendeskCallback<Section> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.9
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getSectionById(l10, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), zendeskCallback);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getSections(final Long l10, final ZendeskCallback<List<Section>> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.3
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getSectionsForCategory(l10, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), zendeskCallback);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getSuggestedArticles(final SuggestedArticleSearch suggestedArticleSearch, final ZendeskCallback<SuggestedArticleResponse> zendeskCallback) {
        if (sanityCheck(zendeskCallback, suggestedArticleSearch)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.15
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getSuggestedArticles(suggestedArticleSearch.getQuery(), suggestedArticleSearch.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings) : suggestedArticleSearch.getLocale(), StringUtils.isEmpty(suggestedArticleSearch.getLabelNames()) ? null : StringUtils.toCsvString(suggestedArticleSearch.getLabelNames()), suggestedArticleSearch.getCategoryId(), suggestedArticleSearch.getSectionId(), zendeskCallback);
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void listArticles(final ListArticleQuery listArticleQuery, final ZendeskCallback<List<SearchArticle>> zendeskCallback) {
        if (sanityCheck(zendeskCallback, listArticleQuery)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.5
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                String include;
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                if (listArticleQuery.getInclude() == null) {
                    include = StringUtils.toCsvString("categories", "sections", "users");
                } else {
                    include = listArticleQuery.getInclude();
                }
                String str = include;
                ZendeskHelpCenterProvider.this.helpCenterService.listArticles(StringUtils.toCsvString(listArticleQuery.getLabelNames()), listArticleQuery.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings) : listArticleQuery.getLocale(), str, (listArticleQuery.getSortBy() == null ? SortBy.CREATED_AT : listArticleQuery.getSortBy()).getApiValue(), (listArticleQuery.getSortOrder() == null ? SortOrder.DESCENDING : listArticleQuery.getSortOrder()).getApiValue(), listArticleQuery.getPage(), listArticleQuery.getResultsPerPage(), new ZendeskCallbackSuccess<ArticlesListResponse>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.5.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                    public void onSuccess(ArticlesListResponse articlesListResponse) {
                        List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesListResponse);
                        ZendeskCallback zendeskCallback2 = zendeskCallback;
                        if (zendeskCallback2 != null) {
                            zendeskCallback2.onSuccess(asSearchArticleList);
                        }
                    }
                });
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void listArticlesFlat(final ListArticleQuery listArticleQuery, final ZendeskCallback<List<FlatArticle>> zendeskCallback) {
        if (sanityCheck(zendeskCallback, listArticleQuery)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.6
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.listArticles(StringUtils.toCsvString(listArticleQuery.getLabelNames()), listArticleQuery.getLocale() == null ? ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings) : listArticleQuery.getLocale(), "categories,sections", (listArticleQuery.getSortBy() == null ? SortBy.CREATED_AT : listArticleQuery.getSortBy()).getApiValue(), (listArticleQuery.getSortOrder() == null ? SortOrder.DESCENDING : listArticleQuery.getSortOrder()).getApiValue(), listArticleQuery.getPage(), listArticleQuery.getResultsPerPage(), new ZendeskCallbackSuccess<ArticlesListResponse>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.6.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                    public void onSuccess(ArticlesListResponse articlesListResponse) {
                        List<FlatArticle> asFlatArticleList = ZendeskHelpCenterProvider.this.asFlatArticleList(articlesListResponse);
                        ZendeskCallback zendeskCallback2 = zendeskCallback;
                        if (zendeskCallback2 != null) {
                            zendeskCallback2.onSuccess(asFlatArticleList);
                        }
                    }
                });
            }
        });
    }

    public boolean sanityCheck(ZendeskCallback<?> zendeskCallback, Object... objArr) {
        if (objArr != null) {
            boolean z2 = true;
            for (Object obj : objArr) {
                if (obj == null) {
                    z2 = false;
                }
            }
            if (!z2) {
                Logger.e(LOG_TAG, "One or more provided parameters are null.", new Object[0]);
                if (zendeskCallback != null) {
                    zendeskCallback.onError(new ErrorResponseAdapter("One or more provided parameters are null."));
                }
                return true;
            }
        }
        return false;
    }

    public boolean sanityCheckHelpCenterSettings(ZendeskCallback<?> zendeskCallback, HelpCenterSettings helpCenterSettings) {
        if (helpCenterSettings == null) {
            Logger.e(LOG_TAG, "Help Center settings are null. Can not continue with the call", new Object[0]);
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("Help Center settings are null. Can not continue with the call"));
            }
            return true;
        }
        if (helpCenterSettings.isEnabled()) {
            return false;
        }
        Logger.e(LOG_TAG, "Help Center is disabled in your app's settings. Can not continue with the call", new Object[0]);
        if (zendeskCallback != null) {
            zendeskCallback.onError(new ErrorResponseAdapter("Help Center is disabled in your app's settings. Can not continue with the call"));
        }
        return true;
    }

    @Override // zendesk.support.HelpCenterProvider
    public void searchArticles(final HelpCenterSearch helpCenterSearch, final ZendeskCallback<List<SearchArticle>> zendeskCallback) {
        if (sanityCheck(zendeskCallback, helpCenterSearch)) {
            return;
        }
        this.blipsProvider.helpCenterSearch(helpCenterSearch.getQuery());
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.7
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                String csvString;
                Locale locale;
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                if (StringUtils.isEmpty(helpCenterSearch.getInclude())) {
                    csvString = StringUtils.toCsvString("categories", "sections", "users");
                } else {
                    csvString = StringUtils.toCsvString(helpCenterSearch.getInclude());
                }
                String str = csvString;
                String csvString2 = StringUtils.isEmpty(helpCenterSearch.getLabelNames()) ? null : StringUtils.toCsvString(helpCenterSearch.getLabelNames());
                if (helpCenterSearch.getLocale() == null) {
                    locale = ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings);
                } else {
                    locale = helpCenterSearch.getLocale();
                }
                ZendeskHelpCenterProvider.this.helpCenterService.searchArticles(helpCenterSearch.getQuery(), locale, str, csvString2, helpCenterSearch.getCategoryIds(), helpCenterSearch.getSectionIds(), helpCenterSearch.getPage(), helpCenterSearch.getPerPage(), new ZendeskCallbackSuccess<ArticlesSearchResponse>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.7.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                    public void onSuccess(ArticlesSearchResponse articlesSearchResponse) {
                        ZendeskHelpCenterProvider.this.helpCenterTracker.helpCenterSearched(helpCenterSearch.getQuery());
                        ZendeskHelpCenterProvider.this.helpCenterSessionCache.setLastSearch(helpCenterSearch.getQuery(), (articlesSearchResponse == null || !CollectionUtils.isNotEmpty(articlesSearchResponse.getArticles())) ? 0 : articlesSearchResponse.getArticles().size());
                        List<SearchArticle> asSearchArticleList = ZendeskHelpCenterProvider.this.asSearchArticleList(articlesSearchResponse);
                        ZendeskCallback zendeskCallback2 = zendeskCallback;
                        if (zendeskCallback2 != null) {
                            zendeskCallback2.onSuccess(asSearchArticleList);
                        }
                    }
                });
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void submitRecordArticleView(final Article article, final Locale locale, final ZendeskCallback<Void> zendeskCallback) {
        if (sanityCheck(zendeskCallback, article)) {
            return;
        }
        this.helpCenterTracker.helpCenterArticleViewed();
        this.blipsProvider.articleView(article);
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.16
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.submitRecordArticleView(article.getId(), locale, new RecordArticleViewRequest(ZendeskHelpCenterProvider.this.helpCenterSessionCache.getLastSearch(), ZendeskHelpCenterProvider.this.helpCenterSessionCache.isUniqueSearchResultClick()), new ZendeskCallbackSuccess<Void>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.16.1
                    @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                    public void onSuccess(Void r22) {
                        ZendeskHelpCenterProvider.this.helpCenterSessionCache.unsetUniqueSearchResultClick();
                        ZendeskCallback zendeskCallback2 = zendeskCallback;
                        if (zendeskCallback2 != null) {
                            zendeskCallback2.onSuccess(r22);
                        }
                    }
                });
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void upvoteArticle(final Long l10, final ZendeskCallback<ArticleVote> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.12
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.checkSettingsAndVotingEnabled(zendeskCallback, helpCenterSettings)) {
                    ZendeskHelpCenterProvider.this.helpCenterService.upvoteArticle(l10, ZendeskHelpCenterProvider.EMPTY_JSON_BODY, new ZendeskCallbackSuccess<ArticleVoteResponse>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.12.1
                        @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                        public void onSuccess(ArticleVoteResponse articleVoteResponse) {
                            ZendeskCallback zendeskCallback2 = zendeskCallback;
                            if (zendeskCallback2 != null) {
                                zendeskCallback2.onSuccess(articleVoteResponse.getVote());
                            }
                            ZendeskHelpCenterProvider.this.blipsProvider.articleVote(l10, 1);
                        }
                    });
                }
            }
        });
    }

    @Override // zendesk.support.HelpCenterProvider
    public void getArticles(final Long l10, final String str, final ZendeskCallback<List<Article>> zendeskCallback) {
        if (sanityCheck(zendeskCallback, l10)) {
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<HelpCenterSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskHelpCenterProvider.4
            @Override // zendesk.support.ZendeskHelpCenterProvider.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (ZendeskHelpCenterProvider.this.sanityCheckHelpCenterSettings(zendeskCallback, helpCenterSettings)) {
                    return;
                }
                ZendeskHelpCenterProvider.this.helpCenterService.getArticlesForSection(l10, ZendeskHelpCenterProvider.this.getLocale(helpCenterSettings), "users", str, zendeskCallback);
            }
        });
    }
}
