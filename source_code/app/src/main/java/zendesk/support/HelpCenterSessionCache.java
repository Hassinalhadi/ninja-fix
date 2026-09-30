package zendesk.support;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface HelpCenterSessionCache {
    LastSearch getLastSearch();

    boolean isUniqueSearchResultClick();

    void setLastSearch(String str, int i4);

    void unsetUniqueSearchResultClick();
}
