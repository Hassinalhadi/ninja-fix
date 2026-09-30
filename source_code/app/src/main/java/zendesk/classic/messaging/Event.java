package zendesk.classic.messaging;

import android.content.Intent;
import java.io.File;
import java.util.Date;
import java.util.List;
import zendesk.classic.messaging.DialogContent;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.MessagingItem;

/* loaded from: classes.dex */
public abstract class Event implements MessagingEvent {
    public static final String ACTION_OPTION_CLICKED = "action_option_clicked";
    public static final String ACTIVITY_RESULT_RECEIVED = "activity_result_received";
    public static final String ARTICLE_SUGGESTION_CLICKED = "article_suggestion_clicked";
    public static final String DIALOG_ITEM_CLICKED = "dialog_item_clicked";
    public static final String FILE_SELECTED = "file_selected";
    public static final String MENU_ITEM_CLICKED = "menu_item_clicked";
    public static final String MESSAGE_COPIED = "message_copied";
    public static final String MESSAGE_DELETED = "message_deleted";
    public static final String MESSAGE_RESENT = "message_resent";
    public static final String MESSAGE_SUBMITTED = "message_submitted";
    public static final String RECONNECT_BUTTON_CLICKED = "reconnect_button_clicked";
    public static final String RESPONSE_OPTION_CLICKED = "response_option_clicked";
    public static final String RETRY_SEND_ATTACHMENT_CLICKED = "retry_send_attachment_clicked";
    public static final String TRANSFER_OPTION_CLICKED = "transfer_option_clicked";
    public static final String TYPING_STARTED = "typing_started";
    public static final String TYPING_STOPPED = "typing_stopped";
    private final Date timestamp;
    private final String type;

    /* loaded from: classes.dex */
    public static class ActionOptionClicked extends Event {
        private final MessagingItem.Action action;

        public ActionOptionClicked(MessagingItem.Action action, Date date) {
            super(Event.ACTION_OPTION_CLICKED, date);
            this.action = action;
        }

        public MessagingItem.Action getAction() {
            return this.action;
        }
    }

    /* loaded from: classes.dex */
    public static class ActivityResult extends Event {
        private final Intent data;
        private final int requestCode;
        private final int resultCode;

        public ActivityResult(int i4, int i5, Intent intent, Date date) {
            super(Event.ACTIVITY_RESULT_RECEIVED, date);
            this.requestCode = i4;
            this.resultCode = i5;
            this.data = intent;
        }

        public Intent getData() {
            return this.data;
        }

        public int getRequestCode() {
            return this.requestCode;
        }

        public int getResultCode() {
            return this.resultCode;
        }
    }

    /* loaded from: classes.dex */
    public static class ArticleSuggestionClicked extends Event {
        private final MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion;

        public ArticleSuggestionClicked(MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion, Date date) {
            super(Event.ARTICLE_SUGGESTION_CLICKED, date);
            this.articleSuggestion = articleSuggestion;
        }

        public MessagingItem.ArticlesResponse.ArticleSuggestion getArticleSuggestion() {
            return this.articleSuggestion;
        }
    }

    /* loaded from: classes.dex */
    public static class CopyQueryClick extends Event {
        private final MessagingItem.Query query;

        public CopyQueryClick(MessagingItem.Query query, Date date) {
            super(Event.MESSAGE_COPIED, date);
            this.query = query;
        }

        public MessagingItem.Query getQuery() {
            return this.query;
        }
    }

    /* loaded from: classes.dex */
    public static class DialogItemClicked extends Event {
        private final DialogContent.Config config;
        private final boolean isPositive;
        private final String payload;
        private final DialogContent.Config previousConfig;

        /* loaded from: classes.dex */
        public static class Builder {
            private final DialogContent.Config config;
            private final boolean isPositive;
            private String payload = null;
            private DialogContent.Config previousConfig = null;
            private final Date timestamp;

            public Builder(Date date, DialogContent.Config config, boolean z2) {
                this.timestamp = date;
                this.config = config;
                this.isPositive = z2;
            }

            public DialogItemClicked build() {
                return new DialogItemClicked(this.timestamp, this.config, this.isPositive, this.payload, this.previousConfig, 0);
            }

            public Builder setPayload(String str) {
                this.payload = str;
                return this;
            }

            public Builder setPreviousConfig(DialogContent.Config config) {
                this.previousConfig = config;
                return this;
            }
        }

        public /* synthetic */ DialogItemClicked(Date date, DialogContent.Config config, boolean z2, String str, DialogContent.Config config2, int i4) {
            this(date, config, z2, str, config2);
        }

        public DialogContent.Config getConfig() {
            return this.config;
        }

        public String getPayload() {
            return this.payload;
        }

        public DialogContent.Config getPreviousConfig() {
            return this.previousConfig;
        }

        public boolean isPositive() {
            return this.isPositive;
        }

        private DialogItemClicked(Date date, DialogContent.Config config, boolean z2, String str, DialogContent.Config config2) {
            super(Event.DIALOG_ITEM_CLICKED, date);
            this.config = config;
            this.isPositive = z2;
            this.payload = str;
            this.previousConfig = config2;
        }
    }

    /* loaded from: classes.dex */
    public static class EngineSelection extends Event {
        private final Engine.TransferOptionDescription selectedEngine;

        public EngineSelection(Engine.TransferOptionDescription transferOptionDescription, Date date) {
            super(Event.TRANSFER_OPTION_CLICKED, date);
            this.selectedEngine = transferOptionDescription;
        }

        public Engine.TransferOptionDescription getSelectedEngine() {
            return this.selectedEngine;
        }
    }

    /* loaded from: classes.dex */
    public static class FileSelected extends Event {
        private final List<File> attachments;

        public FileSelected(List<File> list, Date date) {
            super(Event.FILE_SELECTED, date);
            this.attachments = list;
        }

        public List<File> getAttachments() {
            return this.attachments;
        }
    }

    /* loaded from: classes.dex */
    public static class MenuItemClicked extends Event {
        private final int menuItemId;

        public MenuItemClicked(Date date, int i4) {
            super(Event.MENU_ITEM_CLICKED, date);
            this.menuItemId = i4;
        }

        public int getMenuItemId() {
            return this.menuItemId;
        }
    }

    /* loaded from: classes.dex */
    public static class MessageDeleted extends Event {
        private final MessagingItem.Query message;

        public MessageDeleted(MessagingItem.Query query, Date date) {
            super(Event.MESSAGE_DELETED, date);
            this.message = query;
        }

        public MessagingItem.Query getMessage() {
            return this.message;
        }
    }

    /* loaded from: classes.dex */
    public static class MessageResent extends Event {
        private final MessagingItem.Query query;

        public MessageResent(MessagingItem.Query query, Date date) {
            super(Event.MESSAGE_RESENT, date);
            this.query = query;
        }

        public MessagingItem.Query getQuery() {
            return this.query;
        }
    }

    /* loaded from: classes.dex */
    public static class MessageSubmitted extends Event {
        private final String textInput;

        public MessageSubmitted(String str, Date date) {
            super(Event.MESSAGE_SUBMITTED, date);
            this.textInput = str;
        }

        public String getTextInput() {
            return this.textInput;
        }
    }

    /* loaded from: classes.dex */
    public static class ReconnectButtonClicked extends Event {
        public ReconnectButtonClicked(Date date) {
            super(Event.RECONNECT_BUTTON_CLICKED, date);
        }
    }

    /* loaded from: classes.dex */
    public static class ResponseOptionClicked extends Event {
        private final MessagingItem.Option clickedOption;
        private final MessagingItem.OptionsResponse optionsResponse;

        public ResponseOptionClicked(MessagingItem.OptionsResponse optionsResponse, MessagingItem.Option option, Date date) {
            super(Event.RESPONSE_OPTION_CLICKED, date);
            this.optionsResponse = optionsResponse;
            this.clickedOption = option;
        }

        public MessagingItem.Option getClickedOption() {
            return this.clickedOption;
        }

        public MessagingItem.OptionsResponse getOptionsResponse() {
            return this.optionsResponse;
        }
    }

    /* loaded from: classes.dex */
    public static class RetrySendAttachmentClick extends Event {
        private final MessagingItem.FileQuery failedFileQuery;

        public RetrySendAttachmentClick(MessagingItem.FileQuery fileQuery, Date date) {
            super(Event.RETRY_SEND_ATTACHMENT_CLICKED, date);
            this.failedFileQuery = fileQuery;
        }

        public MessagingItem.FileQuery getFailedFileQuery() {
            return this.failedFileQuery;
        }
    }

    /* loaded from: classes.dex */
    public static class TypingStarted extends Event {
        public TypingStarted(Date date) {
            super(Event.TYPING_STARTED, date);
        }
    }

    /* loaded from: classes.dex */
    public static class TypingStopped extends Event {
        public TypingStopped(Date date) {
            super(Event.TYPING_STOPPED, date);
        }
    }

    public Event(String str, Date date) {
        this.type = str;
        this.timestamp = date;
    }

    @Override // zendesk.classic.messaging.MessagingEvent
    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }
}
