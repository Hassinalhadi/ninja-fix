package zendesk.support;

import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class HelpCenterSearch implements Serializable, Cloneable {
    private String categoryIds;
    private String include;
    private String labelNames;
    private Locale locale;
    private Integer page;
    private Integer perPage;
    private String query;
    private String sectionIds;

    /* loaded from: classes.dex */
    public static class Builder {
        private String categoryIds;
        private String[] include;
        private String[] labelNames;
        private Locale locale;
        private Integer page;
        private Integer perPage;
        private String query;
        private String sectionIds;

        public HelpCenterSearch build() {
            HelpCenterSearch helpCenterSearch = new HelpCenterSearch(0);
            helpCenterSearch.query = this.query;
            helpCenterSearch.locale = this.locale;
            helpCenterSearch.include = StringUtils.toCsvString(this.include);
            helpCenterSearch.labelNames = StringUtils.toCsvString(this.labelNames);
            helpCenterSearch.categoryIds = this.categoryIds;
            helpCenterSearch.sectionIds = this.sectionIds;
            helpCenterSearch.page = this.page;
            helpCenterSearch.perPage = this.perPage;
            return helpCenterSearch;
        }

        public Builder forLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public Builder page(Integer num) {
            this.page = num;
            return this;
        }

        public Builder perPage(Integer num) {
            this.perPage = num;
            return this;
        }

        public Builder withCategoryId(Long l10) {
            if (l10 != null) {
                this.categoryIds = Long.toString(l10.longValue());
            }
            return this;
        }

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = StringUtils.toCsvStringNumber((List<? extends Number>) CollectionUtils.copyOf(list));
            return this;
        }

        public Builder withIncludes(String... strArr) {
            this.include = strArr;
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public Builder withQuery(String str) {
            this.query = str;
            return this;
        }

        public Builder withSectionId(Long l10) {
            if (l10 != null) {
                this.sectionIds = Long.toString(l10.longValue());
            }
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = StringUtils.toCsvStringNumber((List<? extends Number>) CollectionUtils.copyOf(list));
            return this;
        }
    }

    public /* synthetic */ HelpCenterSearch(int i4) {
        this();
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getInclude() {
        return this.include;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Integer getPage() {
        return this.page;
    }

    public Integer getPerPage() {
        return this.perPage;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    public HelpCenterSearch withQuery(String str) {
        HelpCenterSearch helpCenterSearch = new HelpCenterSearch();
        try {
            HelpCenterSearch helpCenterSearch2 = (HelpCenterSearch) clone();
            try {
                helpCenterSearch2.query = str;
                return helpCenterSearch2;
            } catch (CloneNotSupportedException e) {
                e = e;
                helpCenterSearch = helpCenterSearch2;
                e.printStackTrace();
                return helpCenterSearch;
            }
        } catch (CloneNotSupportedException e4) {
            e = e4;
        }
    }

    private HelpCenterSearch() {
    }
}
