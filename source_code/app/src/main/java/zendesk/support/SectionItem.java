package zendesk.support;

import P8.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SectionItem implements HelpItem {
    private List<ArticleItem> articles;

    @c("category_id")
    private Long categoryId;

    @c("name")
    private String name;

    @c(com.clevertap.android.sdk.Constants.KEY_ID)
    private Long sectionId;

    @c("article_count")
    private int totalArticlesCount;

    public void addArticle(ArticleItem articleItem) {
        if (this.articles == null) {
            this.articles = new ArrayList();
        }
        this.articles.add(articleItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SectionItem sectionItem = (SectionItem) obj;
            Long l10 = this.sectionId;
            if (l10 == null ? sectionItem.sectionId != null : !l10.equals(sectionItem.sectionId)) {
                return false;
            }
            Long l11 = this.categoryId;
            Long l12 = sectionItem.categoryId;
            if (l11 != null) {
                return l11.equals(l12);
            }
            if (l12 == null) {
                return true;
            }
        }
        return false;
    }

    public List<HelpItem> getChildren() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.articles);
        if (this.articles.size() < this.totalArticlesCount) {
            arrayList.add(new SeeAllArticlesItem(this));
        }
        return arrayList;
    }

    @Override // zendesk.support.HelpItem
    public Long getId() {
        return this.sectionId;
    }

    @Override // zendesk.support.HelpItem
    public String getName() {
        String str = this.name;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // zendesk.support.HelpItem
    public Long getParentId() {
        return this.categoryId;
    }

    public int getTotalArticlesCount() {
        return this.totalArticlesCount;
    }

    @Override // zendesk.support.HelpItem
    public int getViewType() {
        return 2;
    }

    public int hashCode() {
        int i4;
        Long l10 = this.sectionId;
        int i5 = 0;
        if (l10 != null) {
            i4 = l10.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        Long l11 = this.categoryId;
        if (l11 != null) {
            i5 = l11.hashCode();
        }
        return i10 + i5;
    }
}
