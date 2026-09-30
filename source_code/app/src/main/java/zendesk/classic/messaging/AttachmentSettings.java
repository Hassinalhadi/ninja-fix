package zendesk.classic.messaging;

/* loaded from: classes.dex */
public class AttachmentSettings {
    private final long maxFileSize;
    private final boolean sendingEnabled;

    public AttachmentSettings(long j5, boolean z2) {
        this.maxFileSize = j5;
        this.sendingEnabled = z2;
    }

    public long getMaxFileSize() {
        return this.maxFileSize;
    }

    public boolean isSendingEnabled() {
        return this.sendingEnabled;
    }
}
