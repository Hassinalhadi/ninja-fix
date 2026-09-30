package zendesk.support;

import vg.d;
import yg.a;
import yg.b;
import yg.f;
import yg.o;
import yg.s;
import yg.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface HelpCenterService {
    @b("/api/v2/help_center/votes/{vote_id}.json")
    d<Void> deleteVote(@s("vote_id") Long l10);

    @o("/api/v2/help_center/articles/{article_id}/down.json")
    d<ArticleVoteResponse> downvoteArticle(@s("article_id") Long l10, @a String str);

    @f("/hc/api/mobile/{locale}/articles/{article_id}.json?respect_sanitization_settings=true")
    d<ArticleResponse> getArticle(@s("locale") String str, @s("article_id") Long l10, @t("include") String str2);

    @f("/api/v2/help_center/{locale}/sections/{id}/articles.json?respect_sanitization_settings=true")
    d<ArticlesListResponse> getArticles(@s("locale") String str, @s("id") Long l10, @t("label_names") String str2, @t("include") String str3, @t("per_page") int i4);

    @f("/api/v2/help_center/{locale}/articles/{article_id}/attachments/{attachment_type}.json")
    d<AttachmentResponse> getAttachments(@s("locale") String str, @s("article_id") Long l10, @s("attachment_type") String str2);

    @f("/api/v2/help_center/{locale}/categories.json?per_page=1000")
    d<CategoriesResponse> getCategories(@s("locale") String str);

    @f("/api/v2/help_center/{locale}/categories/{category_id}.json")
    d<CategoryResponse> getCategoryById(@s("locale") String str, @s("category_id") Long l10);

    @f("/hc/api/mobile/{locale}/article_tree.json")
    d<HelpResponse> getHelp(@s("locale") String str, @t("category_ids") String str2, @t("section_ids") String str3, @t("include") String str4, @t("limit") int i4, @t("article_labels") String str5, @t("per_page") int i5, @t("sort_by") String str6, @t("sort_order") String str7);

    @f("/api/v2/help_center/{locale}/sections/{section_id}.json")
    d<SectionResponse> getSectionById(@s("locale") String str, @s("section_id") Long l10);

    @f("/api/v2/help_center/{locale}/categories/{id}/sections.json")
    d<SectionsResponse> getSections(@s("locale") String str, @s("id") Long l10, @t("per_page") int i4);

    @f("/api/mobile/help_center/search/deflect.json?respect_sanitization_settings=true")
    d<SuggestedArticleResponse> getSuggestedArticles(@t("query") String str, @t("locale") String str2, @t("label_names") String str3, @t("category") Long l10, @t("section") Long l11);

    @f("/api/v2/help_center/{locale}/articles.json?respect_sanitization_settings=true")
    d<ArticlesListResponse> listArticles(@s("locale") String str, @t("label_names") String str2, @t("include") String str3, @t("sort_by") String str4, @t("sort_order") String str5, @t("page") Integer num, @t("per_page") Integer num2);

    @f("/api/v2/help_center/articles/search.json?respect_sanitization_settings=true&origin=mobile_sdk")
    d<ArticlesSearchResponse> searchArticles(@t("query") String str, @t("locale") String str2, @t("include") String str3, @t("label_names") String str4, @t("category") String str5, @t("section") String str6, @t("page") Integer num, @t("per_page") Integer num2);

    @o("/api/v2/help_center/{locale}/articles/{article_id}/stats/view.json")
    d<Void> submitRecordArticleView(@s("article_id") Long l10, @s("locale") String str, @a RecordArticleViewRequest recordArticleViewRequest);

    @o("/api/v2/help_center/articles/{article_id}/up.json")
    d<ArticleVoteResponse> upvoteArticle(@s("article_id") Long l10, @a String str);
}
