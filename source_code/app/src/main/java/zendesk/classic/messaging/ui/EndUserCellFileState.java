package zendesk.classic.messaging.ui;

import android.content.Context;
import ao.ad;
import com.zendesk.util.FileUtils;
import java.util.Locale;
import zendesk.classic.messaging.Attachment;
import zendesk.classic.messaging.AttachmentSettings;
import zendesk.classic.messaging.MessagingItem;

/* loaded from: classes.dex */
class EndUserCellFileState extends EndUserCellBaseState {
    private static final String FILE_DESCRIPTOR_FORMATTER = "%s %s";
    private final Attachment attachment;
    private final AttachmentSettings attachmentSettings;
    private final MessagingItem.FileQuery.FailureReason failureReason;

    public EndUserCellFileState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener, Attachment attachment, MessagingItem.FileQuery.FailureReason failureReason, AttachmentSettings attachmentSettings) {
        super(str, messagingCellProps, status, messageActionListener);
        this.attachment = attachment;
        this.failureReason = failureReason;
        this.attachmentSettings = attachmentSettings;
    }

    @Override // zendesk.classic.messaging.ui.EndUserCellBaseState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        EndUserCellFileState endUserCellFileState = (EndUserCellFileState) obj;
        Attachment attachment = this.attachment;
        if (attachment == null ? endUserCellFileState.attachment != null : !attachment.equals(endUserCellFileState.attachment)) {
            return false;
        }
        if (this.failureReason != endUserCellFileState.failureReason) {
            return false;
        }
        AttachmentSettings attachmentSettings = this.attachmentSettings;
        if (attachmentSettings != null) {
            return attachmentSettings.equals(endUserCellFileState.attachmentSettings);
        }
        if (endUserCellFileState.attachmentSettings == null) {
            return true;
        }
        return false;
    }

    public Attachment getAttachment() {
        return this.attachment;
    }

    public AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public MessagingItem.FileQuery.FailureReason getFailureReason() {
        return this.failureReason;
    }

    public String getFileDescriptor(Context context) {
        Locale locale = Locale.US;
        return ad.amber(UtilsAttachment.formatFileSize(context, this.attachment.getSize()), " ", FileUtils.getFileExtension(this.attachment.getName()));
    }

    @Override // zendesk.classic.messaging.ui.EndUserCellBaseState
    public int hashCode() {
        int i4;
        int i5;
        int hashCode = super.hashCode() * 31;
        Attachment attachment = this.attachment;
        int i10 = 0;
        if (attachment != null) {
            i4 = attachment.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (hashCode + i4) * 31;
        MessagingItem.FileQuery.FailureReason failureReason = this.failureReason;
        if (failureReason != null) {
            i5 = failureReason.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        AttachmentSettings attachmentSettings = this.attachmentSettings;
        if (attachmentSettings != null) {
            i10 = attachmentSettings.hashCode();
        }
        return i12 + i10;
    }
}
