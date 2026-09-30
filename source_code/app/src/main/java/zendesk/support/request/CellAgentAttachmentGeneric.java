package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import zendesk.support.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CellAgentAttachmentGeneric extends CellBase implements CellType.Attachment, CellType.Agent {
    private final ResolveInfo appInfo;
    private final Rect insets;
    private boolean isAgentNameVisible;
    private final StateRequestAttachment requestAttachment;
    private final StateRequestUser user;

    public CellAgentAttachmentGeneric(CellBindHelper cellBindHelper, StateRequestAttachment stateRequestAttachment, StateRequestUser stateRequestUser, Date date) {
        super(cellBindHelper, R.layout.zs_request_agent_attachment_generic, stateRequestAttachment.getId(), stateRequestUser.getId(), date);
        this.requestAttachment = stateRequestAttachment;
        this.user = stateRequestUser;
        this.isAgentNameVisible = false;
        this.appInfo = cellBindHelper.getAppInfo(stateRequestAttachment.getName());
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.zs_request_message_inset_agent_attachment_bottom);
    }

    private String buildTalkBackString(Context context) {
        return context.getString(R.string.zs_request_message_agent_file_accessibility, this.requestAttachment.getName()) + " " + context.getString(R.string.zs_request_message_agent_sent_accessibility, DateUtils.getRelativeTimeSpanString(context, getTimeStamp().getTime(), true), this.user.getName());
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public boolean areContentsTheSame(CellType.Base base) {
        boolean areAttachmentCellContentsTheSame = this.utils.areAttachmentCellContentsTheSame(this, base);
        boolean areAgentCellContentsTheSame = this.utils.areAgentCellContentsTheSame(this, base);
        if (areAttachmentCellContentsTheSame && areAgentCellContentsTheSame) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ((TextView) requestViewHolder.findCachedView(R.id.request_agent_attachment_generic_name)).setText(this.requestAttachment.getName());
        this.utils.bindAppInfo(this.appInfo, (TextView) requestViewHolder.findCachedView(R.id.request_agent_attachment_generic_type), (ImageView) requestViewHolder.findCachedView(R.id.request_agent_attachment_generic_icon));
        View findCachedView = requestViewHolder.findCachedView(R.id.request_agent_attachment_generic_container);
        this.utils.addOnClickListenerForFileAttachment(findCachedView, this.requestAttachment);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(R.id.request_agent_attachment_generic_agent_name), this.isAgentNameVisible, this.user);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    @Override // zendesk.support.request.CellType.Agent
    public StateRequestUser getAgent() {
        return this.user;
    }

    @Override // zendesk.support.request.CellType.Attachment
    public StateRequestAttachment getAttachment() {
        return this.requestAttachment;
    }

    @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
    public Rect getInsets() {
        return this.insets;
    }

    @Override // zendesk.support.request.CellType.Agent
    public boolean isAgentNameVisible() {
        return this.isAgentNameVisible;
    }

    @Override // zendesk.support.request.CellType.Agent
    public void showAgentName(boolean z2) {
        this.isAgentNameVisible = z2;
    }
}
