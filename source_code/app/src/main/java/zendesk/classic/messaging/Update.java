package zendesk.classic.messaging;

import android.app.Activity;
import android.content.Intent;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Update {
    public static final String APPLY_MENU_ITEMS = "apply_menu_items";
    public static final String APPLY_MESSAGING_ITEMS = "apply_messaging_items";
    public static final String HIDE_TYPING = "hide_typing";
    public static final String NAVIGATION = "navigation";
    public static final String SHOW_BANNER = "show_banner";
    public static final String SHOW_DIALOG = "show_dialog";
    public static final String SHOW_TYPING = "show_typing";
    public static final String UPDATE_CONNECTION_STATE = "update_connection_state";
    public static final String UPDATE_INPUT_FIELD_STATE = "update_input_field_state";
    private final String type;

    /* loaded from: classes.dex */
    public static abstract class Action extends Update {

        /* loaded from: classes.dex */
        public static class Navigation extends Action {
            private static int NO_REQUEST_CODE = -1;
            private final Intent intent;
            private final int requestCode;

            public Navigation(Intent intent) {
                this(intent, NO_REQUEST_CODE);
            }

            @Override // zendesk.classic.messaging.Update.Action
            public void navigate(Activity activity) {
                int i4 = this.requestCode;
                if (i4 == NO_REQUEST_CODE) {
                    activity.startActivity(this.intent);
                } else {
                    activity.startActivityForResult(this.intent, i4);
                }
            }

            public Navigation(Intent intent, int i4) {
                super(Update.NAVIGATION);
                this.intent = intent;
                this.requestCode = i4;
            }
        }

        public Action(String str) {
            super(str);
        }

        public abstract void navigate(Activity activity);
    }

    /* loaded from: classes.dex */
    public static class ShowBanner extends State {
        private final Banner banner;

        public ShowBanner(Banner banner) {
            super(Update.SHOW_BANNER);
            this.banner = banner;
        }

        public Banner getBanner() {
            return this.banner;
        }
    }

    /* loaded from: classes.dex */
    public static class ShowDialog extends State {
        private final DialogContent dialogContent;

        public ShowDialog(DialogContent dialogContent) {
            super(Update.SHOW_DIALOG);
            this.dialogContent = dialogContent;
        }

        public DialogContent getDialogContent() {
            return this.dialogContent;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class State extends Update {

        /* loaded from: classes.dex */
        public static class ApplyMessagingItems extends State {
            private final List<MessagingItem> messagingItems;

            public ApplyMessagingItems(List<MessagingItem> list) {
                super(Update.APPLY_MESSAGING_ITEMS);
                this.messagingItems = list;
            }

            public List<MessagingItem> getMessagingItems() {
                return this.messagingItems;
            }
        }

        /* loaded from: classes.dex */
        public static class HideTyping extends State {
            public HideTyping() {
                super(Update.HIDE_TYPING);
            }
        }

        /* loaded from: classes.dex */
        public static class ShowTyping extends State {
            private final AgentDetails agentDetails;

            public ShowTyping(AgentDetails agentDetails) {
                super(Update.SHOW_TYPING);
                this.agentDetails = agentDetails;
            }

            public AgentDetails getAgentDetails() {
                return this.agentDetails;
            }
        }

        /* loaded from: classes.dex */
        public static class UpdateConnectionState extends State {
            private final ConnectionState connectionState;

            public UpdateConnectionState(ConnectionState connectionState) {
                super(Update.UPDATE_CONNECTION_STATE);
                this.connectionState = connectionState;
            }

            public ConnectionState getConnectionState() {
                return this.connectionState;
            }
        }

        /* loaded from: classes.dex */
        public static class UpdateInputFieldState extends State {
            public static final String DEFAULT_HINT = "";
            private final AttachmentSettings attachmentSettings;
            private final Boolean enabled;
            private final String hint;
            private final Integer inputType;

            public UpdateInputFieldState(String str, Boolean bool, AttachmentSettings attachmentSettings, Integer num) {
                super(Update.UPDATE_INPUT_FIELD_STATE);
                this.hint = str;
                this.enabled = bool;
                this.attachmentSettings = attachmentSettings;
                this.inputType = num;
            }

            public static UpdateInputFieldState resetHintToDefault() {
                return updateHint("");
            }

            public static UpdateInputFieldState resetInputType() {
                return updateInputType(131073);
            }

            public static UpdateInputFieldState updateAttachmentSettings(AttachmentSettings attachmentSettings) {
                return new UpdateInputFieldState(null, null, attachmentSettings, null);
            }

            public static UpdateInputFieldState updateHint(String str) {
                return new UpdateInputFieldState(str, null, null, null);
            }

            public static UpdateInputFieldState updateInputFieldEnabled(boolean z2) {
                return new UpdateInputFieldState(null, Boolean.valueOf(z2), null, null);
            }

            public static UpdateInputFieldState updateInputType(int i4) {
                return new UpdateInputFieldState(null, null, null, Integer.valueOf(i4));
            }

            public AttachmentSettings getAttachmentSettings() {
                return this.attachmentSettings;
            }

            public String getHint() {
                return this.hint;
            }

            public Integer getInputType() {
                return this.inputType;
            }

            public Boolean isEnabled() {
                return this.enabled;
            }
        }

        public State(String str) {
            super(str);
        }
    }

    public Update(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }

    /* loaded from: classes.dex */
    public static class ApplyMenuItems extends State {
        private final List<MenuItem> menuItems;

        public ApplyMenuItems(MenuItem... menuItemArr) {
            super(Update.APPLY_MENU_ITEMS);
            List<MenuItem> asList;
            if (menuItemArr == null) {
                asList = Collections.EMPTY_LIST;
            } else {
                asList = Arrays.asList(menuItemArr);
            }
            this.menuItems = asList;
        }

        public List<MenuItem> getMenuItems() {
            return this.menuItems;
        }

        public ApplyMenuItems(List<MenuItem> list) {
            super(Update.APPLY_MENU_ITEMS);
            this.menuItems = list;
        }
    }
}
