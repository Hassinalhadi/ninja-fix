package zendesk.support;

/* loaded from: classes.dex */
public enum SortOrder {
    ASCENDING("asc"),
    DESCENDING("desc");

    private final String apiValue;

    SortOrder(String str) {
        this.apiValue = str;
    }

    public String getApiValue() {
        return this.apiValue;
    }
}
