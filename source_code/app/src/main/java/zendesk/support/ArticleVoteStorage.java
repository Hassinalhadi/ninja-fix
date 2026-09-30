package zendesk.support;

/* loaded from: classes.dex */
public interface ArticleVoteStorage {
    ArticleVote getStoredArticleVote(Long l10);

    void removeStoredArticleVote(Long l10);

    void storeArticleVote(Long l10, ArticleVote articleVote);
}
