package zendesk.support;

/* loaded from: classes.dex */
class AttachmentSettings {
    private static AttachmentSettings DEFAULT = new AttachmentSettings(false, 0);
    private boolean enabled;
    private long maxAttachmentSize;

    public AttachmentSettings(boolean z2, long j5) {
        this.enabled = z2;
        this.maxAttachmentSize = j5;
    }

    public static AttachmentSettings defaultSettings() {
        return DEFAULT;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public AttachmentSettings() {
    }
}
