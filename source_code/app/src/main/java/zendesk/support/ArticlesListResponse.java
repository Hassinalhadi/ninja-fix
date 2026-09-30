package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
class ArticlesListResponse implements ArticlesResponse {
    private List<Article> articles;
    private List<Category> categories;
    private String nextPage;
    private String previousPage;
    private List<Section> sections;
    private List<zendesk.core.User> users;

    @Override // zendesk.support.ArticlesResponse
    public List<Article> getArticles() {
        return CollectionUtils.copyOf(this.articles);
    }

    @Override // zendesk.support.ArticlesResponse
    public List<Category> getCategories() {
        return CollectionUtils.copyOf(this.categories);
    }

    public String getNextPage() {
        return this.nextPage;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    @Override // zendesk.support.ArticlesResponse
    public List<Section> getSections() {
        return CollectionUtils.copyOf(this.sections);
    }

    @Override // zendesk.support.ArticlesResponse
    public List<zendesk.core.User> getUsers() {
        return CollectionUtils.copyOf(this.users);
    }
}
