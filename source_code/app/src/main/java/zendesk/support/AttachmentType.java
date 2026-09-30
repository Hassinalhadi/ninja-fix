package zendesk.support;

/* loaded from: classes.dex */
public enum AttachmentType {
    INLINE("inline"),
    BLOCK("block");

    private String attachmentType;

    AttachmentType(String str) {
        this.attachmentType = str;
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }
}
