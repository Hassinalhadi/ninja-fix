package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import zendesk.support.R;
import zendesk.support.UiUtils;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CellUserMessage extends CellBase implements CellType.Message, CellType.Stateful {
    private final List<StateMessage> erroredMessages;
    private final Rect insets;
    private final boolean lastErrorCellOfBlock;
    private final boolean markAsDelivered;
    private final StateMessage message;
    private final boolean showError;
    private final CharSequence textMessage;

    public CellUserMessage(CellBindHelper cellBindHelper, StateMessage stateMessage, boolean z2, boolean z10, CharSequence charSequence, List<StateMessage> list, boolean z11) {
        super(cellBindHelper, R.layout.zs_request_user_message, stateMessage.getId(), -2147483647L, stateMessage.getDate());
        this.textMessage = charSequence;
        this.message = stateMessage;
        this.markAsDelivered = z2;
        this.showError = z10;
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.zs_request_message_inset_user_bottom);
        this.erroredMessages = list;
        this.lastErrorCellOfBlock = z11;
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R.string.zs_request_message_user_text_accessibility, this.textMessage));
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
        boolean areMessageContentsTheSame = this.utils.areMessageContentsTheSame(this, base);
        boolean areStatefulCellContentsTheSame = this.utils.areStatefulCellContentsTheSame(this, base);
        if (areMessageContentsTheSame && areStatefulCellContentsTheSame) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ViewRequestText viewRequestText = (ViewRequestText) requestViewHolder.findCachedView(R.id.request_user_message_text);
        viewRequestText.setText(this.textMessage);
        TextView textView = (TextView) requestViewHolder.findCachedView(R.id.request_user_message_status);
        this.utils.bindStatusLabel(textView, this.lastErrorCellOfBlock, this.markAsDelivered);
        View findCachedView = requestViewHolder.findCachedView(R.id.request_user_message_bubble);
        View.OnClickListener errorClickListener = this.utils.errorClickListener(this.showError, this.erroredMessages);
        UiUtils.setTint(this.utils.colorForError(isErrorShown()), findCachedView.getBackground(), findCachedView);
        requestViewHolder.itemView.setOnClickListener(errorClickListener);
        findCachedView.setOnClickListener(errorClickListener);
        viewRequestText.setOnClickListener(errorClickListener);
        textView.setOnClickListener(errorClickListener);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
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
        CellUserMessage cellUserMessage = new CellUserMessage(this.utils, this.message, true, this.showError, this.textMessage, this.erroredMessages, this.lastErrorCellOfBlock);
        cellUserMessage.setPositionType(getPositionType());
        return cellUserMessage;
    }

    @Override // zendesk.support.request.CellType.Stateful
    public CellType.Stateful markAsErrored(List<StateMessage> list, boolean z2) {
        CellUserMessage cellUserMessage = new CellUserMessage(this.utils, this.message, this.markAsDelivered, true, this.textMessage, list, z2);
        cellUserMessage.setPositionType(getPositionType());
        return cellUserMessage;
    }

    @Override // zendesk.support.request.CellType.Message
    public String getMessage() {
        return this.message.getBody();
    }
}
