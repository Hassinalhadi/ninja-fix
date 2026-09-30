package zendesk.support;

import java.util.HashMap;
import java.util.Map;
import zendesk.core.BaseStorage;

/* loaded from: classes.dex */
class ZendeskArticleVoteStorage implements ArticleVoteStorage {
    private static final String ARTICLE_VOTE_KEY = "help_center_stored_article_votes";
    private final BaseStorage baseStorage;

    /* loaded from: classes.dex */
    public static class ArticleVoteMapWrapper {
        Map<Long, ArticleVote> map;
    }

    public ZendeskArticleVoteStorage(BaseStorage baseStorage) {
        this.baseStorage = baseStorage;
    }

    private Map<Long, ArticleVote> getStoredArticleVotes() {
        ArticleVoteMapWrapper articleVoteMapWrapper = (ArticleVoteMapWrapper) this.baseStorage.get(ARTICLE_VOTE_KEY, ArticleVoteMapWrapper.class);
        if (articleVoteMapWrapper != null) {
            return articleVoteMapWrapper.map;
        }
        return null;
    }

    private void storeArticleVoteHolder(Map<Long, ArticleVote> map) {
        ArticleVoteMapWrapper articleVoteMapWrapper = new ArticleVoteMapWrapper();
        articleVoteMapWrapper.map = map;
        this.baseStorage.put(ARTICLE_VOTE_KEY, articleVoteMapWrapper);
    }

    @Override // zendesk.support.ArticleVoteStorage
    public ArticleVote getStoredArticleVote(Long l10) {
        Map<Long, ArticleVote> storedArticleVotes = getStoredArticleVotes();
        if (storedArticleVotes != null && storedArticleVotes.containsKey(l10)) {
            return storedArticleVotes.get(l10);
        }
        return null;
    }

    @Override // zendesk.support.ArticleVoteStorage
    public void removeStoredArticleVote(Long l10) {
        Map<Long, ArticleVote> storedArticleVotes;
        if (l10 != null && (storedArticleVotes = getStoredArticleVotes()) != null && storedArticleVotes.containsKey(l10)) {
            storedArticleVotes.remove(l10);
            storeArticleVoteHolder(storedArticleVotes);
        }
    }

    @Override // zendesk.support.ArticleVoteStorage
    public void storeArticleVote(Long l10, ArticleVote articleVote) {
        Map<Long, ArticleVote> storedArticleVotes = getStoredArticleVotes();
        if (storedArticleVotes == null) {
            storedArticleVotes = new HashMap<>();
        }
        if (articleVote != null) {
            storedArticleVotes.put(l10, articleVote);
            storeArticleVoteHolder(storedArticleVotes);
        }
    }
}
