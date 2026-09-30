package zendesk.support;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface HelpCenterBlipsProvider {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ArticleVote {
        public static final int ARTICLE_VOTE_DOWN = -1;
        public static final int ARTICLE_VOTE_UP = 1;
    }

    void articleView(Article article);

    void articleVote(Long l10, int i4);

    void helpCenterSearch(String str);
}
