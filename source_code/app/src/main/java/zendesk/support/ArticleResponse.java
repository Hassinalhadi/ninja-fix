package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
class ArticleResponse {
    private Article article;
    private List<zendesk.core.User> users;

    public Article getArticle() {
        return this.article;
    }

    public List<zendesk.core.User> getUsers() {
        return CollectionUtils.copyOf(this.users);
    }
}
