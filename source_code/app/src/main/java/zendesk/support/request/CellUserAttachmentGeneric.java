package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.util.Date;
import java.util.List;
import zendesk.support.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CellUserAttachmentGeneric extends CellBase implements CellType.Attachment, CellType.Stateful {
    private final ResolveInfo appInfo;
    private final List<StateMessage> erroredMessages;
    private final Rect insets;
    private final boolean lastErrorCellOfBlock;
    private final boolean markAsDelivered;
    private final StateMessage message;
    private final StateRequestAttachment requestAttachment;
    private final boolean showError;

    public CellUserAttachmentGeneric(CellBindHelper cellBindHelper, StateMessage stateMessage, StateRequestAttachment stateRequestAttachment, Date date, boolean z2, boolean z10, List<StateMessage> list, boolean z11) {
        super(cellBindHelper, R.layout.zs_request_user_attachment_generic, stateRequestAttachment.getId(), -2147483647L, date);
        this.requestAttachment = stateRequestAttachment;
        this.markAsDelivered = z2;
        this.message = stateMessage;
        this.showError = z10;
        this.erroredMessages = list;
        this.lastErrorCellOfBlock = z11;
        this.appInfo = cellBindHelper.getAppInfo(stateRequestAttachment.getName());
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.zs_request_message_inset_user_bottom);
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R.string.zs_request_message_user_file_accessibility, this.requestAttachment.getName()));
        sb2.append(" ");
        if (!this.showError) {
            sb2.append(context.getString(R.string.zs_request_message_user_sent_accessibility, DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true)));
        } else {
            sb2.append(context.getString(R.string.zs_request_message_user_error_accessibility));
        }
        return sb2.toString();
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public boolean areContentsTheSame(CellType.Base base) {
        boolean areAttachmentCellContentsTheSame = this.utils.areAttachmentCellContentsTheSame(this, base);
        boolean areStatefulCellContentsTheSame = this.utils.areStatefulCellContentsTheSame(this, base);
        if (areAttachmentCellContentsTheSame && areStatefulCellContentsTheSame) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ((TextView) requestViewHolder.findCachedView(R.id.request_user_attachment_generic_name)).setText(this.requestAttachment.getName());
        this.utils.bindAppInfo(this.appInfo, (TextView) requestViewHolder.findCachedView(R.id.request_user_attachment_generic_type), (ImageView) requestViewHolder.findCachedView(R.id.request_user_attachment_generic_icon));
        CardView cardView = (CardView) requestViewHolder.findCachedView(R.id.request_user_attachment_generic_container);
        this.utils.addOnClickListenerForFileAttachment(cardView, this.requestAttachment);
        this.utils.bindStatusLabel((TextView) requestViewHolder.findCachedView(R.id.request_user_attachment_generic_status), this.lastErrorCellOfBlock, this.markAsDelivered);
        View.OnClickListener errorClickListener = this.utils.errorClickListener(this.showError, this.erroredMessages);
        requestViewHolder.itemView.setOnClickListener(errorClickListener);
        cardView.setCardBackgroundColor(this.utils.colorForError(this.showError));
        if (errorClickListener != null) {
            cardView.setOnClickListener(errorClickListener);
        }
        cardView.setContentDescription(buildTalkBackString(cardView.getContext()));
    }

    @Override // zendesk.support.request.CellType.Attachment
    public StateRequestAttachment getAttachment() {
        return this.requestAttachment;
    }

    @Override // zendesk.support.request.CellType.Stateful
    public List<StateMessage> getErrorGroupMessages() {
        return this.erroredMessages;
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public Rect getInsets() {
        return this.insets;
    }

    @Override // zendesk.support.request.CellType.Stateful
    public StateMessage getStateMessage() {
        return this.message;
    }

    @Override // zendesk.support.request.CellType.Stateful
    public boolean isErrorShown() {
        return this.showError;
    }

    @Override // zendesk.support.request.CellType.Stateful
    public boolean isLastErrorCellOfBlock() {
        return this.lastErrorCellOfBlock;
    }

    @Override // zendesk.support.request.CellType.Stateful
    public boolean isMarkedAsDelivered() {
        return this.markAsDelivered;
    }

    @Override // zendesk.support.request.CellType.Stateful
    public CellType.Stateful markAsDelivered() {
        return new CellUserAttachmentGeneric(this.utils, this.message, this.requestAttachment, getTimeStamp(), true, this.showError, this.erroredMessages, this.lastErrorCellOfBlock);
    }

    @Override // zendesk.support.request.CellType.Stateful
    public CellType.Stateful markAsErrored(List<StateMessage> list, boolean z2) {
        return new CellUserAttachmentGeneric(this.utils, this.message, this.requestAttachment, getTimeStamp(), this.markAsDelivered, true, list, z2);
    }
}
