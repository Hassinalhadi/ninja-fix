package zendesk.support;

import P8.c;
import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public class CategoryItem implements HelpItem {
    private boolean expanded = true;

    /* renamed from: id, reason: collision with root package name */
    @c(com.clevertap.android.sdk.Constants.KEY_ID)
    private Long f14238id;

    @c("name")
    private String name;

    @c("section_count")
    private int sectionCount;
    private List<SectionItem> sections;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Long l10 = this.f14238id;
            Long l11 = ((CategoryItem) obj).f14238id;
            if (l10 != null) {
                return l10.equals(l11);
            }
            if (l11 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // zendesk.support.HelpItem
    public Long getId() {
        return this.f14238id;
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
        return null;
    }

    public List<SectionItem> getSections() {
        return CollectionUtils.copyOf(this.sections);
    }

    @Override // zendesk.support.HelpItem
    public int getViewType() {
        return 1;
    }

    public int hashCode() {
        Long l10 = this.f14238id;
        if (l10 != null) {
            return l10.hashCode();
        }
        return 0;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean setExpanded(boolean z2) {
        this.expanded = z2;
        return z2;
    }

    public void setSections(List<SectionItem> list) {
        this.sections = CollectionUtils.copyOf(list);
    }
}
