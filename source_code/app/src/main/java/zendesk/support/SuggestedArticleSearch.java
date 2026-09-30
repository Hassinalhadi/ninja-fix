package zendesk.support;

import com.zendesk.util.StringUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public class SuggestedArticleSearch {
    private Long categoryId;
    private String labelNames;
    private Locale locale;
    private String query;
    private Long sectionId;

    /* loaded from: classes.dex */
    public static class Builder {
        private Long categoryId;
        private String[] labelNames;
        private Locale locale;
        private String query;
        private Long sectionId;

        public SuggestedArticleSearch build() {
            SuggestedArticleSearch suggestedArticleSearch = new SuggestedArticleSearch(0);
            suggestedArticleSearch.query = this.query;
            suggestedArticleSearch.locale = this.locale;
            suggestedArticleSearch.labelNames = StringUtils.toCsvString(this.labelNames);
            suggestedArticleSearch.categoryId = this.categoryId;
            suggestedArticleSearch.sectionId = this.sectionId;
            return suggestedArticleSearch;
        }

        public Builder forLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public Builder withCategoryId(Long l10) {
            this.categoryId = l10;
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
            this.sectionId = l10;
            return this;
        }
    }

    public /* synthetic */ SuggestedArticleSearch(int i4) {
        this();
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getQuery() {
        return this.query;
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    private SuggestedArticleSearch() {
    }
}
