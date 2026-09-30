package zendesk.support;

import P8.c;
import com.zendesk.util.CollectionUtils;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelpResponse {
    private List<CategoryItem> categories;

    @c("category_count")
    private int categoryCount;

    public List<CategoryItem> getCategories() {
        return CollectionUtils.copyOf(this.categories);
    }

    public int getCategoryCount() {
        return this.categoryCount;
    }
}
