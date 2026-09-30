package zendesk.support;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface HelpCenterTracker {

    /* loaded from: classes.dex */
    public static class DefaultTracker implements HelpCenterTracker {
        @Override // zendesk.support.HelpCenterTracker
        public void helpCenterArticleViewed() {
        }

        @Override // zendesk.support.HelpCenterTracker
        public void helpCenterLoaded() {
        }

        @Override // zendesk.support.HelpCenterTracker
        public void helpCenterSearched(String str) {
        }
    }

    void helpCenterArticleViewed();

    void helpCenterLoaded();

    void helpCenterSearched(String str);
}
