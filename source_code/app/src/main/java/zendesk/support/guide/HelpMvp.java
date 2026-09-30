package zendesk.support.guide;

import com.zendesk.service.ZendeskCallback;
import java.util.List;
import zendesk.support.ArticleItem;
import zendesk.support.CategoryItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
import zendesk.support.guide.HelpCenterMvp;

/* loaded from: classes.dex */
interface HelpMvp {

    /* loaded from: classes.dex */
    public interface Model {
        void getArticles(List<Long> list, List<Long> list2, String[] strArr, ZendeskCallback<List<HelpItem>> zendeskCallback);

        void getArticlesForSection(SectionItem sectionItem, String[] strArr, ZendeskCallback<List<ArticleItem>> zendeskCallback);
    }

    /* loaded from: classes.dex */
    public interface Presenter {
        HelpItem getItem(int i4);

        int getItemCount();

        HelpItem getItemForBinding(int i4);

        int getItemViewType(int i4);

        void onAttached();

        boolean onCategoryClick(CategoryItem categoryItem, int i4);

        void onDetached();

        void onSeeAllClick(SeeAllArticlesItem seeAllArticlesItem);

        void setContentPresenter(HelpCenterMvp.Presenter presenter);
    }

    /* loaded from: classes.dex */
    public interface View {
        void addItem(int i4, HelpItem helpItem);

        void removeItem(int i4);

        void showItems(List<HelpItem> list);
    }
}
