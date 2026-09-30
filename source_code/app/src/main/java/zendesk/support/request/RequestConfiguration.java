package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.FileUtils;
import com.zendesk.util.MimeUtils;
import com.zendesk.util.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationUtil;
import zendesk.support.AttachmentFile;
import zendesk.support.CustomField;
import zendesk.support.DeepLinkingBroadcastReceiver;
import zendesk.support.Request;
import zendesk.support.RequestStatus;
import zendesk.support.requestlist.RequestInfo;

/* loaded from: classes.dex */
public class RequestConfiguration implements Configuration {
    public static final long NO_TICKET_FORM_ID = -1;
    private final List<Configuration> configurations;
    private final List<CustomField> customFields;
    private final List<AttachmentFile> files;
    private final boolean hasAgentReplies;
    private final String localRequestId;
    private final String requestId;
    private final RequestStatus requestStatus;
    private final String requestSubject;
    private final List<String> tags;
    private final long ticketFormId;

    /* loaded from: classes.dex */
    public static class Builder {
        private String requestSubject = "";
        private List<String> tags = new ArrayList(0);
        private String requestId = "";
        private String localRequestId = "";
        private RequestStatus requestStatus = null;
        private boolean hasAgentReplies = false;
        private List<CustomField> customFields = new ArrayList(0);
        private long ticketFormId = -1;
        private List<AttachmentFile> files = new ArrayList(0);
        private List<Configuration> configurations = new ArrayList();

        private void setConfigurations(List<Configuration> list) {
            this.configurations = list;
            RequestConfiguration requestConfiguration = (RequestConfiguration) ConfigurationUtil.findConfigForType(list, RequestConfiguration.class);
            if (requestConfiguration != null) {
                this.requestSubject = requestConfiguration.getRequestSubject();
                this.tags = requestConfiguration.getTags();
                this.ticketFormId = requestConfiguration.ticketFormId;
                this.customFields = requestConfiguration.customFields;
                this.files = requestConfiguration.getFilesAsAttachments();
            }
        }

        public Configuration config() {
            return new RequestConfiguration(this.requestSubject, this.tags, this.requestId, this.localRequestId, this.requestStatus, this.customFields, this.ticketFormId, this.files, this.hasAgentReplies, this.configurations);
        }

        public Intent deepLinkIntent(Context context, Intent... intentArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(intentArr));
            Intent intent = new Intent(context, (Class<?>) DeepLinkingBroadcastReceiver.class);
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_REQUEST_INTENT, intent(context, new Configuration[0]));
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_BACK_STACK_ACTIVITIES, arrayList);
            return intent;
        }

        public Intent intent(Context context, Configuration... configurationArr) {
            return intent(context, Arrays.asList(configurationArr));
        }

        public void show(Context context, Configuration... configurationArr) {
            context.startActivity(intent(context, configurationArr));
        }

        public Builder withCustomFields(List<CustomField> list) {
            this.customFields = list;
            return this;
        }

        public Builder withFiles(List<File> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (File file : list) {
                arrayList.add(new AttachmentFile(file.getName(), MimeUtils.guessMimeTypeFromExtension(FileUtils.getFileExtension(file.getName())), file));
            }
            this.files = arrayList;
            return this;
        }

        public Builder withRequest(Request request) {
            this.requestId = request.getId();
            this.requestStatus = request.getStatus();
            this.hasAgentReplies = CollectionUtils.isNotEmpty(request.getLastCommentingAgents());
            return this;
        }

        public Builder withRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder withRequestInfo(RequestInfo requestInfo) {
            String localId = requestInfo.getLocalId();
            if (StringUtils.hasLength(localId)) {
                this.localRequestId = localId;
            }
            String remoteId = requestInfo.getRemoteId();
            if (StringUtils.hasLength(remoteId)) {
                this.requestId = remoteId;
            }
            this.requestStatus = requestInfo.getRequestStatus();
            this.hasAgentReplies = CollectionUtils.isNotEmpty(requestInfo.getAgentInfos());
            return this;
        }

        public Builder withRequestSubject(String str) {
            this.requestSubject = str;
            return this;
        }

        public Builder withTags(String... strArr) {
            this.tags = CollectionUtils.copyOf(Arrays.asList(strArr));
            return this;
        }

        public Builder withTicketForm(long j5, List<CustomField> list) {
            this.ticketFormId = j5;
            this.customFields = list;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<Configuration> list) {
            setConfigurations(list);
            Configuration config = config();
            Intent intent = new Intent(context, (Class<?>) RequestActivity.class);
            ConfigurationUtil.addToIntent(intent, config);
            return intent;
        }

        public void show(Context context, List<Configuration> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withTags(List<String> list) {
            this.tags = CollectionUtils.copyOf(list);
            return this;
        }

        public Intent deepLinkIntent(Context context, List<Configuration> list, Intent... intentArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(intentArr));
            Intent intent = new Intent(context, (Class<?>) DeepLinkingBroadcastReceiver.class);
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_REQUEST_INTENT, intent(context, list));
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_BACK_STACK_ACTIVITIES, arrayList);
            return intent;
        }

        public Builder withFiles(File... fileArr) {
            return withFiles(Arrays.asList(fileArr));
        }
    }

    public RequestConfiguration(String str, List<String> list, String str2, String str3, RequestStatus requestStatus, List<CustomField> list2, long j5, List<AttachmentFile> list3, boolean z2, List<Configuration> list4) {
        this.requestSubject = str;
        this.tags = CollectionUtils.ensureEmpty(list);
        this.requestId = str2;
        this.localRequestId = str3;
        this.requestStatus = requestStatus;
        this.hasAgentReplies = z2;
        this.customFields = list2;
        this.ticketFormId = j5;
        this.files = list3;
        this.configurations = list4;
    }

    @Override // zendesk.configurations.Configuration
    @SuppressLint({"RestrictedApi"})
    public List<Configuration> getConfigurations() {
        return ConfigurationUtil.addSelfIfNotInList(this.configurations, this);
    }

    public List<CustomField> getCustomFields() {
        return this.customFields;
    }

    public List<StateRequestAttachment> getFiles() {
        ArrayList arrayList = new ArrayList(this.files.size());
        Iterator<AttachmentFile> it = this.files.iterator();
        while (it.hasNext()) {
            arrayList.add(StateRequestAttachment.convert(it.next()));
        }
        return arrayList;
    }

    public List<AttachmentFile> getFilesAsAttachments() {
        return this.files;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public String getRequestSubject() {
        return this.requestSubject;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public StateRequestTicketForm getTicketForm() {
        return new StateRequestTicketForm(this.ticketFormId, this.customFields);
    }

    public long getTicketFormId() {
        return this.ticketFormId;
    }

    public boolean hasAgentReplies() {
        return this.hasAgentReplies;
    }
}
