package zendesk.support;

import java.util.List;

/* loaded from: classes.dex */
interface ArticlesResponse {
    List<Article> getArticles();

    List<Category> getCategories();

    List<Section> getSections();

    List<zendesk.core.User> getUsers();
}
