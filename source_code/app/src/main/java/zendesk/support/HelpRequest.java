package zendesk.support;

import com.zendesk.util.StringUtils;
import java.util.List;

/* loaded from: classes.dex */
public class HelpRequest {
    private static final int DEFAULT_ARTICLES_PER_SECTION = 5;
    private static final String INCLUDE_ALL = "categories,sections";
    private static final String INCLUDE_CATEGORIES = "categories";
    private static final String INCLUDE_SECTIONS = "sections";
    private static final String LOG_TAG = "HelpRequest";
    private int articlesPerPageLimit;
    private String categoryIds;
    private String includes;
    private String[] labelNames;
    private String sectionIds;

    /* loaded from: classes.dex */
    public static class Builder {
        private int articlesPerSectionLimit = 5;
        private String categoryIds;
        private String includes;
        private String[] labelNames;
        private String sectionIds;

        public HelpRequest build() {
            return new HelpRequest(this, 0);
        }

        public Builder includeCategories() {
            if (StringUtils.isEmpty(this.includes)) {
                this.includes = HelpRequest.INCLUDE_CATEGORIES;
                return this;
            }
            if (this.includes.equals(HelpRequest.INCLUDE_SECTIONS)) {
                this.includes = HelpRequest.INCLUDE_ALL;
            }
            return this;
        }

        public Builder includeSections() {
            if (StringUtils.isEmpty(this.includes)) {
                this.includes = HelpRequest.INCLUDE_SECTIONS;
                return this;
            }
            if (this.includes.equals(HelpRequest.INCLUDE_CATEGORIES)) {
                this.includes = HelpRequest.INCLUDE_ALL;
            }
            return this;
        }

        public Builder withArticlesPerSectionLimit(int i4) {
            this.articlesPerSectionLimit = i4;
            return this;
        }

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = StringUtils.toCsvStringNumber(list);
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = StringUtils.toCsvStringNumber(list);
            return this;
        }
    }

    public /* synthetic */ HelpRequest(Builder builder, int i4) {
        this(builder);
    }

    public int getArticlesPerPageLimit() {
        return this.articlesPerPageLimit;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getIncludes() {
        return this.includes;
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    private HelpRequest(Builder builder) {
        this.categoryIds = builder.categoryIds;
        this.sectionIds = builder.sectionIds;
        this.includes = builder.includes;
        this.articlesPerPageLimit = builder.articlesPerSectionLimit;
        this.labelNames = builder.labelNames;
    }
}
