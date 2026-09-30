package zendesk.support;

/* loaded from: classes.dex */
public class SeeAllArticlesItem implements HelpItem {
    private boolean isLoading;
    private SectionItem section;

    public SeeAllArticlesItem(SectionItem sectionItem) {
        this.section = sectionItem;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SectionItem sectionItem = this.section;
            SectionItem sectionItem2 = ((SeeAllArticlesItem) obj).section;
            if (sectionItem != null) {
                return sectionItem.equals(sectionItem2);
            }
            if (sectionItem2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // zendesk.support.HelpItem
    public Long getId() {
        return this.section.getId();
    }

    @Override // zendesk.support.HelpItem
    public String getName() {
        return "";
    }

    @Override // zendesk.support.HelpItem
    public Long getParentId() {
        return this.section.getParentId();
    }

    public SectionItem getSection() {
        return this.section;
    }

    @Override // zendesk.support.HelpItem
    public int getViewType() {
        return 4;
    }

    public int hashCode() {
        SectionItem sectionItem = this.section;
        if (sectionItem != null) {
            return sectionItem.hashCode();
        }
        return 0;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public void setLoading(boolean z2) {
        this.isLoading = z2;
    }
}
