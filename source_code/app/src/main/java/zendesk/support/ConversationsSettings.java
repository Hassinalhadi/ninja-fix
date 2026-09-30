package zendesk.support;

/* loaded from: classes.dex */
class ConversationsSettings {
    private static ConversationsSettings DEFAULT = new ConversationsSettings(false);
    private boolean enabled;

    public ConversationsSettings(boolean z2) {
        this.enabled = z2;
    }

    public static ConversationsSettings defaultSettings() {
        return DEFAULT;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public ConversationsSettings() {
    }
}
