package zendesk.support;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface ZendeskTracker {

    /* loaded from: classes.dex */
    public static class DefaultTracker implements ZendeskTracker {
        @Override // zendesk.support.ZendeskTracker
        public void requestCreated() {
        }

        @Override // zendesk.support.ZendeskTracker
        public void requestUpdated() {
        }
    }

    void requestCreated();

    void requestUpdated();
}
