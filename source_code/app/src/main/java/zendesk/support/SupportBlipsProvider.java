package zendesk.support;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface SupportBlipsProvider {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ArticleVote {
        public static final int ARTICLE_VOTE_DOWN = -1;
        public static final int ARTICLE_VOTE_UP = 1;
    }

    void requestCreated(String str);

    void requestListViewed();

    void requestUpdated(String str);

    void requestViewed(String str);

    void supportSdkInit();
}
