package zendesk.support;

/* loaded from: classes.dex */
class ZendeskHelpCenterSessionCache implements HelpCenterSessionCache {
    public static final LastSearch DEFAULT_SEARCH = new LastSearch("", 0);
    private LastSearch lastSearch;
    private boolean uniqueSearchResultClick = false;

    @Override // zendesk.support.HelpCenterSessionCache
    public LastSearch getLastSearch() {
        LastSearch lastSearch = this.lastSearch;
        if (lastSearch != null) {
            return lastSearch;
        }
        return DEFAULT_SEARCH;
    }

    @Override // zendesk.support.HelpCenterSessionCache
    public boolean isUniqueSearchResultClick() {
        return this.uniqueSearchResultClick;
    }

    @Override // zendesk.support.HelpCenterSessionCache
    public void setLastSearch(String str, int i4) {
        this.lastSearch = new LastSearch(str, i4);
        this.uniqueSearchResultClick = true;
    }

    @Override // zendesk.support.HelpCenterSessionCache
    public void unsetUniqueSearchResultClick() {
        this.uniqueSearchResultClick = false;
    }
}
