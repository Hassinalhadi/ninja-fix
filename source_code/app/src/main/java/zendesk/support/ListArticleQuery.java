package zendesk.support;

import java.util.Locale;

/* loaded from: classes.dex */
public class ListArticleQuery {
    private String include;
    private String labelNames;
    private Locale locale;
    private Integer page;
    private Integer resultsPerPage;
    private SortBy sortBy;
    private SortOrder sortOrder;

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

    public Integer getResultsPerPage() {
        return this.resultsPerPage;
    }

    public SortBy getSortBy() {
        return this.sortBy;
    }

    public SortOrder getSortOrder() {
        return this.sortOrder;
    }

    public void setInclude(String str) {
        this.include = str;
    }

    public void setLabelNames(String str) {
        this.labelNames = str;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setPage(Integer num) {
        this.page = num;
    }

    public void setResultsPerPage(Integer num) {
        this.resultsPerPage = num;
    }

    public void setSortBy(SortBy sortBy) {
        this.sortBy = sortBy;
    }

    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }
}
