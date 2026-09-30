package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import zendesk.support.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CellAgentMessage extends CellBase implements CellType.Message, CellType.Agent {
    private final Rect insets;
    private final StateMessage message;
    private boolean showAgentName;
    private final CharSequence textMessage;
    private final StateRequestUser user;

    public CellAgentMessage(CellBindHelper cellBindHelper, StateMessage stateMessage, CharSequence charSequence, StateRequestUser stateRequestUser) {
        super(cellBindHelper, R.layout.zs_request_agent_message, stateMessage.getId(), stateMessage.getUserId(), stateMessage.getDate());
        this.textMessage = charSequence;
        this.message = stateMessage;
        this.user = stateRequestUser;
        this.insets = cellBindHelper.getInsets(0, R.dimen.zs_request_message_inset_agent_top, 0, R.dimen.zs_request_message_inset_agent_bottom);
        this.showAgentName = false;
    }

    private String buildTalkBackString(Context context) {
        return context.getString(R.string.zs_request_message_agent_text_accessibility, this.textMessage) + " " + context.getString(R.string.zs_request_message_agent_sent_accessibility, DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true), this.user.getName());
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public boolean areContentsTheSame(CellType.Base base) {
        boolean areMessageContentsTheSame = this.utils.areMessageContentsTheSame(this, base);
        boolean areAgentCellContentsTheSame = this.utils.areAgentCellContentsTheSame(this, base);
        if (areMessageContentsTheSame && areAgentCellContentsTheSame) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ViewRequestText viewRequestText = (ViewRequestText) requestViewHolder.findCachedView(R.id.request_agent_message_text);
        viewRequestText.setText(this.textMessage);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(R.id.request_agent_name), this.showAgentName, this.user);
        View findCachedView = requestViewHolder.findCachedView(R.id.request_agent_message_bubble);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
        viewRequestText.requestLayout();
    }

    @Override // zendesk.support.request.CellType.Agent
    public StateRequestUser getAgent() {
        return this.user;
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public Rect getInsets() {
        return this.insets;
    }

    @Override // zendesk.support.request.CellType.Message
    public CharSequence getMessage() {
        return this.message.getBody();
    }

    @Override // zendesk.support.request.CellType.Agent
    public boolean isAgentNameVisible() {
        return this.showAgentName;
    }

    @Override // zendesk.support.request.CellType.Agent
    public void showAgentName(boolean z2) {
        this.showAgentName = z2;
    }
}
