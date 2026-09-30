package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import okhttp3.ResponseBody;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AttachmentDownloaderComponent implements Listener<StateConversation> {
    private final ActionFactory actionFactory;
    private final AttachmentDownloader attachmentDownloader;
    private final Dispatcher dispatcher;
    private final AttachmentDownloaderSelector selector = new AttachmentDownloaderSelector();

    /* loaded from: classes.dex */
    public static class AttachmentDownloader {
        private final AttachmentDownloadService attachmentIo;
        private final Set<String> downloadingHistory = new HashSet();
        private final MediaResultUtility mediaResultUtility;

        /* loaded from: classes.dex */
        public class CacheCallback extends ZendeskCallback<MediaResult> {
            private final ZendeskCallback<MediaResult> callback;
            private final StateRequestAttachment requestAttachment;

            public CacheCallback(StateRequestAttachment stateRequestAttachment, ZendeskCallback<MediaResult> zendeskCallback) {
                this.requestAttachment = stateRequestAttachment;
                this.callback = zendeskCallback;
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), errorResponse, this.callback);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(MediaResult mediaResult) {
                this.callback.onSuccess(mediaResult);
                AttachmentDownloader.this.downloadingHistory.remove(this.requestAttachment.getUrl());
            }
        }

        /* loaded from: classes.dex */
        public class HttpCallback extends ZendeskCallback<ResponseBody> {
            private final ZendeskCallback<MediaResult> callback;
            private final MediaResultUtility mediaResultUtility;
            private final Request request;
            private final StateRequestAttachment requestAttachment;

            public HttpCallback(Request request, StateRequestAttachment stateRequestAttachment, ZendeskCallback<MediaResult> zendeskCallback, MediaResultUtility mediaResultUtility) {
                this.request = request;
                this.requestAttachment = stateRequestAttachment;
                this.callback = zendeskCallback;
                this.mediaResultUtility = mediaResultUtility;
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), errorResponse, this.callback);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(ResponseBody responseBody) {
                AttachmentDownloader.this.attachmentIo.storeAttachment(responseBody, this.mediaResultUtility.getLocalFile(this.request.getRequestId(), this.request.getRemoteAttachmentId(), this.requestAttachment.getName()), new CacheCallback(this.requestAttachment, this.callback));
            }
        }

        /* loaded from: classes.dex */
        public static class Request {
            private final long remoteAttachmentId;
            private final StateRequestAttachment requestAttachment;
            private final String requestId;

            public Request(String str, long j5, StateRequestAttachment stateRequestAttachment) {
                this.requestId = str;
                this.remoteAttachmentId = j5;
                this.requestAttachment = stateRequestAttachment;
            }

            public long getRemoteAttachmentId() {
                return this.remoteAttachmentId;
            }

            public StateRequestAttachment getRequestAttachment() {
                return this.requestAttachment;
            }

            public String getRequestId() {
                return this.requestId;
            }
        }

        public AttachmentDownloader(AttachmentDownloadService attachmentDownloadService, MediaResultUtility mediaResultUtility) {
            this.mediaResultUtility = mediaResultUtility;
            this.attachmentIo = attachmentDownloadService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleError(String str, ErrorResponse errorResponse, ZendeskCallback zendeskCallback) {
            this.downloadingHistory.remove(str);
            if (zendeskCallback != null) {
                zendeskCallback.onError(errorResponse);
            }
        }

        public void download(Request request, ZendeskCallback<MediaResult> zendeskCallback) {
            StateRequestAttachment requestAttachment = request.getRequestAttachment();
            String url = requestAttachment.getUrl();
            if (!this.downloadingHistory.contains(url)) {
                this.downloadingHistory.add(url);
                this.attachmentIo.downloadAttachment(url, new HttpCallback(request, requestAttachment, zendeskCallback, this.mediaResultUtility));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class AttachmentDownloaderSelector {
        public List<AttachmentDownloader.Request> selectData(StateConversation stateConversation) {
            boolean z2;
            StateIdMapper attachmentIdMapper = stateConversation.getAttachmentIdMapper();
            String localId = stateConversation.getLocalId();
            List<StateMessage> messages = stateConversation.getMessages();
            LinkedList linkedList = new LinkedList();
            Iterator<StateMessage> it = messages.iterator();
            while (it.hasNext()) {
                for (StateRequestAttachment stateRequestAttachment : it.next().getAttachments()) {
                    long id2 = stateRequestAttachment.getId();
                    if (stateRequestAttachment.getLocalFile() != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean hasRemoteId = attachmentIdMapper.hasRemoteId(Long.valueOf(id2));
                    boolean hasLength = StringUtils.hasLength(stateRequestAttachment.getUrl());
                    if (!z2 && hasRemoteId && hasLength) {
                        linkedList.add(new AttachmentDownloader.Request(localId, attachmentIdMapper.getRemoteId(Long.valueOf(id2)).longValue(), stateRequestAttachment));
                    }
                }
            }
            return linkedList;
        }
    }

    /* loaded from: classes.dex */
    public class DownloadCallback extends ZendeskCallback<MediaResult> {
        private final StateRequestAttachment requestAttachment;

        public DownloadCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onError(ErrorResponse errorResponse) {
            Logger.d("RequestActivity", "Unable to download attachment. Error: %s", errorResponse.getReason());
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onSuccess(MediaResult mediaResult) {
            AttachmentDownloaderComponent.this.dispatcher.dispatch(AttachmentDownloaderComponent.this.actionFactory.attachmentDownloaded(this.requestAttachment, mediaResult));
        }
    }

    public AttachmentDownloaderComponent(Dispatcher dispatcher, ActionFactory actionFactory, AttachmentDownloader attachmentDownloader) {
        this.dispatcher = dispatcher;
        this.actionFactory = actionFactory;
        this.attachmentDownloader = attachmentDownloader;
    }

    @Override // zendesk.support.suas.Listener
    public void update(StateConversation stateConversation) {
        for (AttachmentDownloader.Request request : this.selector.selectData(stateConversation)) {
            this.attachmentDownloader.download(request, new DownloadCallback(request.getRequestAttachment()));
        }
    }
}
