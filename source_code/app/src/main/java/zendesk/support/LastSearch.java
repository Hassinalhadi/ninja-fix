package zendesk.support;

/* loaded from: classes.dex */
class LastSearch {
    private final String origin = "mobile_sdk";
    private final String query;
    private final int resultsCount;

    public LastSearch(String str, int i4) {
        this.query = str;
        this.resultsCount = i4;
    }

    public String getQuery() {
        return this.query;
    }

    public int getResultsCount() {
        return this.resultsCount;
    }
}
