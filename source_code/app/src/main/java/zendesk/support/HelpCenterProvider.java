package zendesk.support;

import com.zendesk.service.ZendeskCallback;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public interface HelpCenterProvider {
    void deleteVote(Long l10, ZendeskCallback<Void> zendeskCallback);

    void downvoteArticle(Long l10, ZendeskCallback<ArticleVote> zendeskCallback);

    void getArticle(Long l10, ZendeskCallback<Article> zendeskCallback);

    void getArticles(Long l10, ZendeskCallback<List<Article>> zendeskCallback);

    void getArticles(Long l10, String str, ZendeskCallback<List<Article>> zendeskCallback);

    void getAttachments(Long l10, AttachmentType attachmentType, ZendeskCallback<List<HelpCenterAttachment>> zendeskCallback);

    void getCategories(ZendeskCallback<List<Category>> zendeskCallback);

    void getCategory(Long l10, ZendeskCallback<Category> zendeskCallback);

    void getHelp(HelpRequest helpRequest, ZendeskCallback<List<HelpItem>> zendeskCallback);

    void getSection(Long l10, ZendeskCallback<Section> zendeskCallback);

    void getSections(Long l10, ZendeskCallback<List<Section>> zendeskCallback);

    void getSuggestedArticles(SuggestedArticleSearch suggestedArticleSearch, ZendeskCallback<SuggestedArticleResponse> zendeskCallback);

    void listArticles(ListArticleQuery listArticleQuery, ZendeskCallback<List<SearchArticle>> zendeskCallback);

    void listArticlesFlat(ListArticleQuery listArticleQuery, ZendeskCallback<List<FlatArticle>> zendeskCallback);

    void searchArticles(HelpCenterSearch helpCenterSearch, ZendeskCallback<List<SearchArticle>> zendeskCallback);

    void submitRecordArticleView(Article article, Locale locale, ZendeskCallback<Void> zendeskCallback);

    void upvoteArticle(Long l10, ZendeskCallback<ArticleVote> zendeskCallback);
}
