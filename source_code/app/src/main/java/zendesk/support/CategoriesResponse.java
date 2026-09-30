package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
class CategoriesResponse {
    private List<Category> categories;

    public List<Category> getCategories() {
        return CollectionUtils.copyOf(this.categories);
    }
}
