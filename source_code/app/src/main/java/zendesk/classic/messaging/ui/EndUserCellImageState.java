package zendesk.classic.messaging.ui;

import com.squareup.picasso.Picasso;
import zendesk.classic.messaging.Attachment;
import zendesk.classic.messaging.AttachmentSettings;
import zendesk.classic.messaging.MessagingItem;

/* loaded from: classes.dex */
class EndUserCellImageState extends EndUserCellFileState {
    private final Picasso picasso;

    public EndUserCellImageState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener, Attachment attachment, MessagingItem.FileQuery.FailureReason failureReason, AttachmentSettings attachmentSettings, Picasso picasso) {
        super(str, messagingCellProps, status, messageActionListener, attachment, failureReason, attachmentSettings);
        this.picasso = picasso;
    }

    @Override // zendesk.classic.messaging.ui.EndUserCellFileState, zendesk.classic.messaging.ui.EndUserCellBaseState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Picasso picasso = this.picasso;
        Picasso picasso2 = ((EndUserCellImageState) obj).picasso;
        if (picasso != null) {
            return picasso.equals(picasso2);
        }
        if (picasso2 == null) {
            return true;
        }
        return false;
    }

    public Picasso getPicasso() {
        return this.picasso;
    }

    @Override // zendesk.classic.messaging.ui.EndUserCellFileState, zendesk.classic.messaging.ui.EndUserCellBaseState
    public int hashCode() {
        int i4;
        int hashCode = super.hashCode() * 31;
        Picasso picasso = this.picasso;
        if (picasso != null) {
            i4 = picasso.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }
}
