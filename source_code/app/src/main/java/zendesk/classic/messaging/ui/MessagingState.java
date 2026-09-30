package zendesk.classic.messaging.ui;

import com.zendesk.util.CollectionUtils;
import java.util.List;
import zendesk.classic.messaging.AgentDetails;
import zendesk.classic.messaging.AttachmentSettings;
import zendesk.classic.messaging.ConnectionState;
import zendesk.classic.messaging.MessagingItem;

/* loaded from: classes.dex */
public class MessagingState {
    final AttachmentSettings attachmentSettings;
    final ConnectionState connectionState;
    final boolean enabled;
    final String hint;
    final int keyboardInputType;
    final List<MessagingItem> messagingItems;
    final boolean progressBarVisible;
    final TypingState typingState;

    /* loaded from: classes.dex */
    public static class TypingState {
        private final AgentDetails agentDetails;
        private final boolean isTyping;

        public TypingState(boolean z2) {
            this(z2, null);
        }

        public AgentDetails getAgentDetails() {
            return this.agentDetails;
        }

        public boolean isTyping() {
            return this.isTyping;
        }

        public TypingState(boolean z2, AgentDetails agentDetails) {
            this.isTyping = z2;
            this.agentDetails = agentDetails;
        }
    }

    public /* synthetic */ MessagingState(List list, boolean z2, boolean z10, TypingState typingState, ConnectionState connectionState, String str, AttachmentSettings attachmentSettings, int i4, int i5) {
        this(list, z2, z10, typingState, connectionState, str, attachmentSettings, i4);
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    private MessagingState(List<MessagingItem> list, boolean z2, boolean z10, TypingState typingState, ConnectionState connectionState, String str, AttachmentSettings attachmentSettings, int i4) {
        this.messagingItems = list;
        this.progressBarVisible = z2;
        this.enabled = z10;
        this.typingState = typingState;
        this.connectionState = connectionState;
        this.hint = str;
        this.attachmentSettings = attachmentSettings;
        this.keyboardInputType = i4;
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private AttachmentSettings attachmentSettings;
        private ConnectionState connectionState;
        private boolean enabled;
        private String hint;
        private int keyboardInputType;
        private List<MessagingItem> messagingItems;
        private boolean progressBarVisible;
        private TypingState typingState;

        public Builder() {
            this.typingState = new TypingState(false);
            this.connectionState = ConnectionState.DISCONNECTED;
            this.keyboardInputType = 131073;
        }

        public MessagingState build() {
            return new MessagingState(CollectionUtils.ensureEmpty(this.messagingItems), this.progressBarVisible, this.enabled, this.typingState, this.connectionState, this.hint, this.attachmentSettings, this.keyboardInputType, 0);
        }

        public Builder withAttachmentSettings(AttachmentSettings attachmentSettings) {
            this.attachmentSettings = attachmentSettings;
            return this;
        }

        public Builder withComposerHint(String str) {
            this.hint = str;
            return this;
        }

        public Builder withConnectionState(ConnectionState connectionState) {
            this.connectionState = connectionState;
            return this;
        }

        public Builder withEnabled(boolean z2) {
            this.enabled = z2;
            return this;
        }

        public Builder withKeyboardInputType(int i4) {
            this.keyboardInputType = i4;
            return this;
        }

        public Builder withMessagingItems(List<MessagingItem> list) {
            this.messagingItems = list;
            return this;
        }

        public Builder withProgressBarVisible(boolean z2) {
            this.progressBarVisible = z2;
            return this;
        }

        public Builder withTypingIndicatorState(TypingState typingState) {
            this.typingState = typingState;
            return this;
        }

        public Builder(MessagingState messagingState) {
            this.typingState = new TypingState(false);
            this.connectionState = ConnectionState.DISCONNECTED;
            this.keyboardInputType = 131073;
            this.messagingItems = messagingState.messagingItems;
            this.enabled = messagingState.enabled;
            this.typingState = messagingState.typingState;
            this.connectionState = messagingState.connectionState;
            this.hint = messagingState.hint;
            this.attachmentSettings = messagingState.attachmentSettings;
            this.keyboardInputType = messagingState.keyboardInputType;
        }
    }
}
