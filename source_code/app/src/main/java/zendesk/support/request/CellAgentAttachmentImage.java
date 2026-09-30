package zendesk.support.request;

import android.content.Context;
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
public class CellAgentAttachmentImage extends CellBase implements CellType.Attachment, CellType.Agent {
    private final StateRequestAttachment attachment;
    private final Rect insets;
    private boolean isAgentNameVisible;
    private final StateRequestUser user;

    public CellAgentAttachmentImage(CellBindHelper cellBindHelper, StateRequestAttachment stateRequestAttachment, StateRequestUser stateRequestUser, Date date) {
        super(cellBindHelper, R.layout.zs_request_agent_attachment_image, stateRequestAttachment.getId(), stateRequestUser.getId(), date);
        this.user = stateRequestUser;
        this.attachment = stateRequestAttachment;
        this.isAgentNameVisible = false;
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.zs_request_message_inset_agent_attachment_bottom);
    }

    private String buildTalkBackString(Context context) {
        return context.getString(R.string.zs_request_message_agent_image_accessibility, this.attachment.getName()) + " " + context.getString(R.string.zs_request_message_agent_sent_accessibility, DateUtils.getRelativeTimeSpanString(context, getTimeStamp().getTime(), true), this.user.getName());
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
        ImageView imageView = (ImageView) requestViewHolder.findCachedView(R.id.request_agent_message_attachment_image);
        this.utils.bindImage(imageView, this.attachment);
        this.utils.addOnClickListenerForImageAttachment(imageView, this.attachment);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(R.id.request_agent_attachment_name), this.isAgentNameVisible, this.user);
        View findCachedView = requestViewHolder.findCachedView(R.id.request_agent_attachment_card);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    @Override // zendesk.support.request.CellType.Agent
    public StateRequestUser getAgent() {
        return this.user;
    }

    @Override // zendesk.support.request.CellType.Attachment
    public StateRequestAttachment getAttachment() {
        return this.attachment;
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
