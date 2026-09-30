package zendesk.support;

import P8.c;

/* loaded from: classes.dex */
public class ArticleItem implements HelpItem {

    /* renamed from: id, reason: collision with root package name */
    private Long f14234id;
    private String name;

    @c("section_id")
    private Long sectionId;

    public ArticleItem(Long l10, Long l11, String str) {
        this.f14234id = l10;
        this.sectionId = l11;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ArticleItem articleItem = (ArticleItem) obj;
            Long l10 = this.f14234id;
            if (l10 == null ? articleItem.f14234id != null : !l10.equals(articleItem.f14234id)) {
                return false;
            }
            Long l11 = this.sectionId;
            Long l12 = articleItem.sectionId;
            if (l11 != null) {
                return l11.equals(l12);
            }
            if (l12 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // zendesk.support.HelpItem
    public Long getId() {
        return this.f14234id;
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
        return this.sectionId;
    }

    @Override // zendesk.support.HelpItem
    public int getViewType() {
        return 3;
    }

    public int hashCode() {
        int i4;
        Long l10 = this.f14234id;
        int i5 = 0;
        if (l10 != null) {
            i4 = l10.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        Long l11 = this.sectionId;
        if (l11 != null) {
            i5 = l11.hashCode();
        }
        return i10 + i5;
    }
}
