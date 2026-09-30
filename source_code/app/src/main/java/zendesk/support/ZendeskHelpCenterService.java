package zendesk.support;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponseAdapter;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import zendesk.core.ZendeskLocaleConverter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZendeskHelpCenterService {
    private static final String LOG_TAG = "ZendeskHelpCenterService";
    private static final int NUMBER_PER_PAGE = 1000;
    private final HelpCenterService helpCenterService;
    private final ZendeskLocaleConverter localeConverter;

    public ZendeskHelpCenterService(HelpCenterService helpCenterService, ZendeskLocaleConverter zendeskLocaleConverter) {
        this.helpCenterService = helpCenterService;
        this.localeConverter = zendeskLocaleConverter;
    }

    public void deleteVote(Long l10, ZendeskCallback<Void> zendeskCallback) {
        if (l10 == null) {
            Logger.e(LOG_TAG, "The vote id was null, can not delete the vote", new Object[0]);
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("The vote id was null, can not delete the vote"));
                return;
            }
            return;
        }
        this.helpCenterService.deleteVote(l10).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void downvoteArticle(Long l10, String str, ZendeskCallback<ArticleVoteResponse> zendeskCallback) {
        if (l10 == null) {
            Logger.e(LOG_TAG, "The article id was null, can not create down vote", new Object[0]);
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("The article id was null, can not create down vote"));
                return;
            }
            return;
        }
        this.helpCenterService.downvoteArticle(l10, str).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void getArticle(Long l10, Locale locale, String str, ZendeskCallback<Article> zendeskCallback) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(locale);
        this.helpCenterService.getArticle(helpCenterLocaleString, l10, str).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<ArticleResponse, Article>() { // from class: zendesk.support.ZendeskHelpCenterService.4
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public Article extract(ArticleResponse articleResponse) {
                return ZendeskHelpCenterService.this.matchArticleWithUsers(articleResponse.getArticle(), CollectionUtils.ensureEmpty(articleResponse.getUsers()));
            }
        }));
    }

    public void getArticlesForSection(Long l10, Locale locale, String str, String str2, ZendeskCallback<List<Article>> zendeskCallback) {
        this.helpCenterService.getArticles(this.localeConverter.toHelpCenterLocaleString(locale), l10, str2, str, 1000).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<ArticlesListResponse, List<Article>>() { // from class: zendesk.support.ZendeskHelpCenterService.3
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public List<Article> extract(ArticlesListResponse articlesListResponse) {
                return ZendeskHelpCenterService.this.matchArticlesWithUsers(articlesListResponse.getUsers(), articlesListResponse.getArticles());
            }
        }));
    }

    public void getAttachments(Locale locale, Long l10, AttachmentType attachmentType, ZendeskCallback<List<HelpCenterAttachment>> zendeskCallback) {
        if (attachmentType == null) {
            Logger.e(LOG_TAG, "getAttachments() was called with null attachment type", new Object[0]);
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("getAttachments() was called with null attachment type"));
                return;
            }
            return;
        }
        this.helpCenterService.getAttachments(this.localeConverter.toHelpCenterLocaleString(locale), l10, attachmentType.getAttachmentType()).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<AttachmentResponse, List<HelpCenterAttachment>>() { // from class: zendesk.support.ZendeskHelpCenterService.7
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public List<HelpCenterAttachment> extract(AttachmentResponse attachmentResponse) {
                return attachmentResponse.getArticleAttachments();
            }
        }));
    }

    public void getCategories(Locale locale, ZendeskCallback<List<Category>> zendeskCallback) {
        this.helpCenterService.getCategories(this.localeConverter.toHelpCenterLocaleString(locale)).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<CategoriesResponse, List<Category>>() { // from class: zendesk.support.ZendeskHelpCenterService.1
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public List<Category> extract(CategoriesResponse categoriesResponse) {
                return categoriesResponse.getCategories();
            }
        }));
    }

    public void getCategoryById(Long l10, Locale locale, ZendeskCallback<Category> zendeskCallback) {
        this.helpCenterService.getCategoryById(this.localeConverter.toHelpCenterLocaleString(locale), l10).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<CategoryResponse, Category>() { // from class: zendesk.support.ZendeskHelpCenterService.6
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public Category extract(CategoryResponse categoryResponse) {
                return categoryResponse.getCategory();
            }
        }));
    }

    public void getHelp(Locale locale, String str, String str2, String str3, int i4, String str4, ZendeskCallback<HelpResponse> zendeskCallback) {
        this.helpCenterService.getHelp(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, i4, str4, 1000, SortBy.CREATED_AT.getApiValue(), SortOrder.DESCENDING.getApiValue()).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void getSectionById(Long l10, Locale locale, ZendeskCallback<Section> zendeskCallback) {
        this.helpCenterService.getSectionById(this.localeConverter.toHelpCenterLocaleString(locale), l10).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<SectionResponse, Section>() { // from class: zendesk.support.ZendeskHelpCenterService.5
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public Section extract(SectionResponse sectionResponse) {
                return sectionResponse.getSection();
            }
        }));
    }

    public void getSectionsForCategory(Long l10, Locale locale, ZendeskCallback<List<Section>> zendeskCallback) {
        this.helpCenterService.getSections(this.localeConverter.toHelpCenterLocaleString(locale), l10, 1000).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<SectionsResponse, List<Section>>() { // from class: zendesk.support.ZendeskHelpCenterService.2
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public List<Section> extract(SectionsResponse sectionsResponse) {
                return sectionsResponse.getSections();
            }
        }));
    }

    public void getSuggestedArticles(String str, Locale locale, String str2, Long l10, Long l11, ZendeskCallback<SuggestedArticleResponse> zendeskCallback) {
        String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(locale);
        this.helpCenterService.getSuggestedArticles(str, helpCenterLocaleString, str2, l10, l11).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void listArticles(String str, Locale locale, String str2, String str3, String str4, Integer num, Integer num2, ZendeskCallback<ArticlesListResponse> zendeskCallback) {
        this.helpCenterService.listArticles(this.localeConverter.toHelpCenterLocaleString(locale), str, str2, str3, str4, num, num2).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public Article matchArticleWithUsers(Article article, List<zendesk.core.User> list) {
        if (article == null) {
            return new Article();
        }
        Iterator<zendesk.core.User> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zendesk.core.User next = it.next();
            if (next.getId() != null && next.getId().equals(article.getAuthorId())) {
                article.setAuthor(next);
                break;
            }
        }
        return article;
    }

    public List<Article> matchArticlesWithUsers(List<zendesk.core.User> list, List<Article> list2) {
        HashMap hashMap = new HashMap();
        for (zendesk.core.User user : list) {
            hashMap.put(user.getId(), user);
        }
        ArrayList arrayList = new ArrayList();
        for (Article article : list2) {
            zendesk.core.User user2 = (zendesk.core.User) hashMap.get(article.getAuthorId());
            if (user2 != null) {
                article.setAuthor(user2);
            }
            arrayList.add(article);
        }
        return arrayList;
    }

    public void searchArticles(String str, Locale locale, String str2, String str3, String str4, String str5, Integer num, Integer num2, ZendeskCallback<ArticlesSearchResponse> zendeskCallback) {
        this.helpCenterService.searchArticles(str, this.localeConverter.toHelpCenterLocaleString(locale), str2, str3, str4, str5, num, num2).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void submitRecordArticleView(Long l10, Locale locale, RecordArticleViewRequest recordArticleViewRequest, ZendeskCallback<Void> zendeskCallback) {
        this.helpCenterService.submitRecordArticleView(l10, this.localeConverter.toHelpCenterLocaleString(locale), recordArticleViewRequest).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void upvoteArticle(Long l10, String str, ZendeskCallback<ArticleVoteResponse> zendeskCallback) {
        if (l10 == null) {
            Logger.e(LOG_TAG, "The article id was null, can not create up vote", new Object[0]);
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("The article id was null, can not create up vote"));
                return;
            }
            return;
        }
        this.helpCenterService.upvoteArticle(l10, str).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }
}
