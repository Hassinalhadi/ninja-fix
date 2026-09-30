package zendesk.support.request;

import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import zendesk.commonui.BottomSheetAttachmentViewMenu;
import zendesk.support.R;
import zendesk.support.RequestStatus;
import zendesk.support.UiUtils;
import zendesk.support.request.ViewMessageComposer;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComponentMessageComposer implements Listener<MessageComposerModel>, ViewMessageComposer.InputListener {
    private final ActionFactory actionFactory;
    private final BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu;
    private final Dispatcher dispatcher;
    private final ViewMessageComposer messageComposerView;
    private final MessageComposerSelector messageFieldSelector = new MessageComposerSelector();
    private final AttachmentHelper attachmentHelper = new AttachmentHelper(R.id.attachments_indicator_icon, R.id.message_composer_send_btn);

    /* loaded from: classes.dex */
    public static class MessageComposerModel {
        private final boolean attachmentsButtonEnabled;
        private final List<StateRequestAttachment> extraAttachments;
        private final long maxFileSize;
        private final boolean messageComposerVisible;
        private final List<StateRequestAttachment> requestAttachments;
        private final boolean sendButtonEnabled;

        public MessageComposerModel(List<StateRequestAttachment> list, List<StateRequestAttachment> list2, long j5, boolean z2, boolean z10, boolean z11) {
            this.requestAttachments = list;
            this.extraAttachments = list2;
            this.maxFileSize = j5;
            this.sendButtonEnabled = z2;
            this.attachmentsButtonEnabled = z10;
            this.messageComposerVisible = z11;
        }

        public long getMaxFileSize() {
            return this.maxFileSize;
        }

        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }

        public boolean isAttachmentsButtonEnabled() {
            return this.attachmentsButtonEnabled;
        }

        public boolean isMessageComposerVisible() {
            return this.messageComposerVisible;
        }

        public boolean isSendButtonEnabled() {
            return this.sendButtonEnabled;
        }
    }

    /* loaded from: classes.dex */
    public static class MessageComposerSelector implements StateSelector<MessageComposerModel> {
        @Override // zendesk.support.suas.StateSelector
        public MessageComposerModel selectData(State state) {
            StateAttachments fromState = StateAttachments.fromState(state);
            StateConfig fromState2 = StateConfig.fromState(state);
            StateConversation fromState3 = StateConversation.fromState(state);
            return new MessageComposerModel(CollectionUtils.copyOf(fromState.getSelectedAttachments()), new ArrayList(fromState.getAllSelectedAttachments()), fromState2.getSettings().getMaxAttachmentSize(), StringUtils.hasLength(fromState3.getRemoteId()), fromState2.getSettings().isAttachmentsEnabled(), fromState3.getStatus() != RequestStatus.Closed);
        }
    }

    public ComponentMessageComposer(ViewMessageComposer viewMessageComposer, Dispatcher dispatcher, ActionFactory actionFactory, BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu) {
        this.messageComposerView = viewMessageComposer;
        this.dispatcher = dispatcher;
        this.actionFactory = actionFactory;
        this.bottomSheetAttachmentViewMenu = bottomSheetAttachmentViewMenu;
        viewMessageComposer.addListener(this);
    }

    public StateSelector<MessageComposerModel> getSelector() {
        return this.messageFieldSelector;
    }

    public boolean hasUnsavedInput() {
        if (!StringUtils.hasLength(this.messageComposerView.getMessage()) && !CollectionUtils.isNotEmpty(this.attachmentHelper.getSelectedAttachments())) {
            return false;
        }
        return true;
    }

    @Override // zendesk.support.request.ViewMessageComposer.InputListener
    public void onAddAttachmentsRequested() {
        this.bottomSheetAttachmentViewMenu.showMenu();
    }

    @Override // zendesk.support.request.ViewMessageComposer.InputListener
    public void onSendMessageRequested(String str) {
        this.dispatcher.dispatch(this.actionFactory.createCommentAsync(str, this.attachmentHelper.getSelectedAttachments()));
        this.dispatcher.dispatch(this.actionFactory.clearAttachments());
        this.dispatcher.dispatch(this.actionFactory.updateCommentsAsync());
    }

    @Override // zendesk.support.suas.Listener
    public void update(MessageComposerModel messageComposerModel) {
        this.attachmentHelper.updateMaxFileSize(messageComposerModel.getMaxFileSize());
        this.attachmentHelper.updateAttachments(messageComposerModel.getRequestAttachments());
        this.messageComposerView.setAttachmentsCount(messageComposerModel.getRequestAttachments().size());
        this.messageComposerView.enableSendButton(messageComposerModel.isSendButtonEnabled());
        this.messageComposerView.enableAttachmentsButton(messageComposerModel.isAttachmentsButtonEnabled());
        this.messageComposerView.hide(!messageComposerModel.isMessageComposerVisible());
        if (messageComposerModel.isMessageComposerVisible()) {
            return;
        }
        UiUtils.dismissKeyboard(this.messageComposerView);
    }
}
