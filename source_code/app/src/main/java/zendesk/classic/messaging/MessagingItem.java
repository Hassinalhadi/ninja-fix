package zendesk.classic.messaging;

import java.io.File;
import java.util.Date;
import java.util.List;
import zendesk.classic.messaging.Engine;

/* loaded from: classes.dex */
public abstract class MessagingItem implements MessagingEvent {

    /* renamed from: id, reason: collision with root package name */
    private final String f14225id;
    private final Date timestamp;

    /* loaded from: classes.dex */
    public static class Action {
        private final String actionId;
        private final String displayName;

        public Action(String str, String str2) {
            this.actionId = str;
            this.displayName = str2;
        }

        public String getActionId() {
            return this.actionId;
        }

        public String getDisplayName() {
            return this.displayName;
        }
    }

    /* loaded from: classes.dex */
    public static class ActionResponse extends Response {
        private List<Action> actions;
        private final String message;

        public ActionResponse(Date date, String str, AgentDetails agentDetails, String str2, List<Action> list) {
            super(date, str, agentDetails);
            this.message = str2;
            this.actions = list;
        }

        public List<Action> getActions() {
            return this.actions;
        }

        public String getMessage() {
            return this.message;
        }
    }

    /* loaded from: classes.dex */
    public static class ArticlesResponse extends Response {
        private final List<ArticleSuggestion> articleSuggestions;

        /* loaded from: classes.dex */
        public static class ArticleSuggestion {
            private final long articleId;
            private final String articleInteractionId;
            private final String articleUrl;
            private final String snippet;
            private final String title;

            public ArticleSuggestion(String str, String str2, long j5, String str3, String str4) {
                this.articleInteractionId = str;
                this.articleUrl = str2;
                this.articleId = j5;
                this.title = str3;
                this.snippet = str4;
            }

            public long getArticleId() {
                return this.articleId;
            }

            public String getArticleInteractionId() {
                return this.articleInteractionId;
            }

            public String getArticleUrl() {
                return this.articleUrl;
            }

            public String getSnippet() {
                return this.snippet;
            }

            public String getTitle() {
                return this.title;
            }
        }

        public ArticlesResponse(Date date, String str, AgentDetails agentDetails, List<ArticleSuggestion> list) {
            super(date, str, agentDetails);
            this.articleSuggestions = list;
        }

        public List<ArticleSuggestion> getArticleSuggestions() {
            return this.articleSuggestions;
        }
    }

    /* loaded from: classes.dex */
    public static class ImageQuery extends FileQuery {
        public ImageQuery(Date date, String str, Query.Status status, Attachment attachment, FileQuery.FailureReason failureReason) {
            super(date, str, status, attachment, failureReason);
        }

        @Deprecated
        public ImageQuery(Date date, String str, Query.Status status, File file, String str2, FileQuery.FailureReason failureReason) {
            super(date, str, status, file, str2, failureReason);
        }

        @Deprecated
        public ImageQuery(Date date, String str, Query.Status status, File file, FileQuery.FailureReason failureReason) {
            super(date, str, status, file, failureReason);
        }

        @Deprecated
        public ImageQuery(Date date, String str, Query.Status status, String str2, FileQuery.FailureReason failureReason) {
            super(date, str, status, str2, failureReason);
        }
    }

    /* loaded from: classes.dex */
    public static class ImageResponse extends FileResponse {
        public ImageResponse(Date date, String str, AgentDetails agentDetails, Attachment attachment) {
            super(date, str, agentDetails, attachment);
        }

        @Deprecated
        public ImageResponse(Date date, String str, AgentDetails agentDetails, File file, String str2) {
            super(date, str, agentDetails, file, str2);
        }

        @Deprecated
        public ImageResponse(Date date, String str, AgentDetails agentDetails, File file) {
            super(date, str, agentDetails, file);
        }

        @Deprecated
        public ImageResponse(Date date, String str, AgentDetails agentDetails, String str2) {
            super(date, str, agentDetails, str2);
        }
    }

    /* loaded from: classes.dex */
    public static class Option {

        /* renamed from: id, reason: collision with root package name */
        private final String f14226id;
        private final String text;

        public Option(String str, String str2) {
            this.f14226id = str;
            this.text = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Option option = (Option) obj;
            if (!this.f14226id.equals(option.f14226id)) {
                return false;
            }
            return this.text.equals(option.text);
        }

        public String getId() {
            return this.f14226id;
        }

        public String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.f14226id.hashCode() * 31);
        }
    }

    /* loaded from: classes.dex */
    public static class OptionsResponse extends MessagingItem {
        private final List<Option> options;

        public OptionsResponse(Date date, String str, List<Option> list) {
            super(date, str);
            this.options = list;
        }

        public List<Option> getOptions() {
            return this.options;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Query extends MessagingItem {
        private final Status status;

        /* loaded from: classes.dex */
        public enum Status {
            PENDING,
            DELIVERED,
            FAILED,
            FAILED_NO_RETRY
        }

        public Query(Date date, String str, Status status) {
            super(date, str);
            this.status = status;
        }

        public Status getStatus() {
            return this.status;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Response extends MessagingItem {
        private final AgentDetails agentDetails;

        public Response(Date date, String str, AgentDetails agentDetails) {
            super(date, str);
            this.agentDetails = agentDetails;
        }

        public AgentDetails getAgentDetails() {
            return this.agentDetails;
        }
    }

    /* loaded from: classes.dex */
    public static class SystemMessage extends MessagingItem {
        private final String systemMessage;

        public SystemMessage(Date date, String str, String str2) {
            super(date, str);
            this.systemMessage = str2;
        }

        public String getSystemMessage() {
            return this.systemMessage;
        }
    }

    /* loaded from: classes.dex */
    public static class TextQuery extends Query {
        private final String message;

        public TextQuery(Date date, String str, Query.Status status, String str2) {
            super(date, str, status);
            this.message = str2;
        }

        public String getMessage() {
            return this.message;
        }
    }

    /* loaded from: classes.dex */
    public static class TextResponse extends Response {
        private final String message;

        public TextResponse(Date date, String str, AgentDetails agentDetails, String str2) {
            super(date, str, agentDetails);
            this.message = str2;
        }

        public String getMessage() {
            return this.message;
        }
    }

    /* loaded from: classes.dex */
    public static class TransferResponse extends Response {
        private final boolean enabled;
        private final List<Engine.TransferOptionDescription> engineOptions;
        private final String message;

        public TransferResponse(Date date, String str, AgentDetails agentDetails, String str2, List<Engine.TransferOptionDescription> list) {
            this(date, str, agentDetails, str2, list, true);
        }

        public List<Engine.TransferOptionDescription> getEngineOptions() {
            return this.engineOptions;
        }

        public String getMessage() {
            return this.message;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public TransferResponse(Date date, String str, AgentDetails agentDetails, String str2, List<Engine.TransferOptionDescription> list, boolean z2) {
            super(date, str, agentDetails);
            this.message = str2;
            this.engineOptions = list;
            this.enabled = z2;
        }
    }

    public MessagingItem(Date date, String str) {
        this.timestamp = date;
        this.f14225id = str;
    }

    public String getId() {
        return this.f14225id;
    }

    @Override // zendesk.classic.messaging.MessagingEvent
    public Date getTimestamp() {
        return this.timestamp;
    }

    /* loaded from: classes.dex */
    public static class FileResponse extends Response {
        private final Attachment attachment;

        public FileResponse(Date date, String str, AgentDetails agentDetails, Attachment attachment) {
            super(date, str, agentDetails);
            this.attachment = attachment;
        }

        public Attachment getAttachment() {
            return this.attachment;
        }

        @Deprecated
        public File getLocalFile() {
            return this.attachment.getFile();
        }

        @Deprecated
        public String getRemotePath() {
            return this.attachment.getUrl();
        }

        @Deprecated
        public FileResponse(Date date, String str, AgentDetails agentDetails, File file, String str2) {
            super(date, str, agentDetails);
            String name;
            long j5;
            if (file != null) {
                name = file.getName();
                j5 = file.length();
            } else {
                name = new File(str2).getName();
                j5 = -1;
            }
            this.attachment = new Attachment(name, j5, str2, file);
        }

        @Deprecated
        public FileResponse(Date date, String str, AgentDetails agentDetails, File file) {
            this(date, str, agentDetails, file, null);
        }

        @Deprecated
        public FileResponse(Date date, String str, AgentDetails agentDetails, String str2) {
            this(date, str, agentDetails, null, str2);
        }
    }

    /* loaded from: classes.dex */
    public static class FileQuery extends Query {
        private final Attachment attachment;
        private final FailureReason failureReason;

        /* loaded from: classes.dex */
        public enum FailureReason {
            FILE_SIZE_TOO_LARGE,
            FILE_SENDING_DISABLED,
            UNSUPPORTED_FILE_TYPE
        }

        public FileQuery(Date date, String str, Query.Status status, Attachment attachment, FailureReason failureReason) {
            super(date, str, status);
            this.attachment = attachment;
            this.failureReason = failureReason;
        }

        public Attachment getAttachment() {
            return this.attachment;
        }

        public FailureReason getFailureReason() {
            return this.failureReason;
        }

        @Deprecated
        public File getLocalFile() {
            return this.attachment.getFile();
        }

        @Deprecated
        public String getRemotePath() {
            return this.attachment.getUrl();
        }

        @Deprecated
        public FileQuery(Date date, String str, Query.Status status, File file, String str2, FailureReason failureReason) {
            super(date, str, status);
            String name;
            long j5;
            if (file != null) {
                name = file.getName();
                j5 = file.length();
            } else {
                name = new File(str2).getName();
                j5 = -1;
            }
            this.attachment = new Attachment(name, j5, str2, file);
            this.failureReason = failureReason;
        }

        @Deprecated
        public FileQuery(Date date, String str, Query.Status status, File file, FailureReason failureReason) {
            this(date, str, status, file, null, failureReason);
        }

        @Deprecated
        public FileQuery(Date date, String str, Query.Status status, String str2, FailureReason failureReason) {
            this(date, str, status, null, str2, failureReason);
        }
    }
}
