package zendesk.support.request;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ErrorResponseAdapter;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zendesk.core.Callback;
import zendesk.support.Attachment;
import zendesk.support.UploadProvider;
import zendesk.support.UploadResponse;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AttachmentUploadService {
    private final List<StateRequestAttachment> errorItems;
    private final List<StateRequestAttachment> itemsForUpload;
    private final MediaResultUtility mediaResultUtility;
    private final List<StateRequestAttachment> processedItems;
    private final ResolveUri resolveUri;
    private ZendeskCallback<AttachmentUploadResult> resultListener;
    private final UploadProvider uploadProvider;
    private final Object lock = new Object();
    private String subDirectory = UtilsAttachment.getTemporaryRequestCacheDir();
    private final Map<Long, Long> localToRemoteMap = new HashMap();

    /* loaded from: classes.dex */
    public static class AttachmentUploadResult {
        private final Map<Long, Long> localToRemoteIdMap;
        private final List<StateRequestAttachment> requestAttachments;

        public AttachmentUploadResult(List<StateRequestAttachment> list, Map<Long, Long> map) {
            this.requestAttachments = list;
            this.localToRemoteIdMap = map;
        }

        public Map<Long, Long> getLocalToRemoteIdMap() {
            return this.localToRemoteIdMap;
        }

        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }
    }

    /* loaded from: classes.dex */
    public class AttachmentsCallback extends ZendeskCallback<UploadResponse> {
        private final StateRequestAttachment requestAttachment;

        public AttachmentsCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onError(ErrorResponse errorResponse) {
            Logger.w("RequestActivity", "Error uploading file: %s | Error: %s", this.requestAttachment, errorResponse.getReason());
            AttachmentUploadService.this.errorUpload(this.requestAttachment);
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onSuccess(UploadResponse uploadResponse) {
            Logger.d("RequestActivity", "Successfully uploaded file: %s | Result: %s", this.requestAttachment, uploadResponse);
            AttachmentUploadService.this.localToRemoteMap.put(Long.valueOf(this.requestAttachment.getId()), uploadResponse.getAttachment().getId());
            AttachmentUploadService.this.uploadSuccess(this.requestAttachment, uploadResponse);
        }
    }

    /* loaded from: classes.dex */
    public class ResolveCallback extends Callback<List<MediaResult>> {
        private final StateRequestAttachment requestAttachment;

        public /* synthetic */ ResolveCallback(AttachmentUploadService attachmentUploadService, StateRequestAttachment stateRequestAttachment, int i4) {
            this(stateRequestAttachment);
        }

        private ResolveCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        @Override // zendesk.core.Callback
        /* renamed from: success, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void lambda$internalSuccess$0(List<MediaResult> list) {
            Uri parsedLocalUri = this.requestAttachment.getParsedLocalUri();
            if (!list.isEmpty() && !AttachmentUploadService.this.isUploadFinished()) {
                Logger.w("RequestActivity", "Successfully resolved attachment: %s", parsedLocalUri);
                StateRequestAttachment updateRequestAttachment = AttachmentUploadService.this.updateRequestAttachment(this.requestAttachment, list.get(0));
                AttachmentUploadService.this.uploadProvider.uploadAttachment(updateRequestAttachment.getName(), updateRequestAttachment.getLocalFile(), updateRequestAttachment.getMimeType(), new AttachmentsCallback(updateRequestAttachment));
            } else {
                Logger.w("RequestActivity", "Unable to resolve attachment: %s", parsedLocalUri);
                AttachmentUploadService.this.errorUpload(this.requestAttachment);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public AttachmentUploadService(UploadProvider uploadProvider, List<StateRequestAttachment> list, MediaResultUtility mediaResultUtility, ResolveUri resolveUri) {
        this.uploadProvider = uploadProvider;
        this.itemsForUpload = list;
        this.processedItems = new ArrayList(list.size());
        this.errorItems = new ArrayList(list.size());
        this.resolveUri = resolveUri;
        this.mediaResultUtility = mediaResultUtility;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void errorUpload(StateRequestAttachment stateRequestAttachment) {
        synchronized (this.lock) {
            this.errorItems.add(stateRequestAttachment);
        }
        notifyIfFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUploadFinished() {
        boolean z2;
        boolean z10;
        synchronized (this.lock) {
            boolean isNotEmpty = CollectionUtils.isNotEmpty(this.errorItems);
            z2 = false;
            if (this.processedItems.size() == this.itemsForUpload.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isNotEmpty || z10) {
                z2 = true;
            }
        }
        return z2;
    }

    private void notifyIfFinished() {
        Logger.d("RequestActivity", "Notify if finished. Listener: %s, isUploadFinished: %s", this.resultListener, Boolean.valueOf(isUploadFinished()));
        if (isUploadFinished() && this.resultListener != null) {
            if (CollectionUtils.isEmpty(this.errorItems)) {
                this.resultListener.onSuccess(new AttachmentUploadResult(CollectionUtils.copyOf(this.processedItems), this.localToRemoteMap));
            } else {
                this.resultListener.onError(new ErrorResponseAdapter("Error uploading attachments."));
            }
            this.resultListener = null;
        }
    }

    private MediaResult renameFile(File file, long j5) {
        MediaResult file2 = this.mediaResultUtility.getFile(this.subDirectory, j5, file.getName());
        Logger.d("RequestActivity", "Rename local file: %s -> %s", file.getAbsolutePath(), file2.getFile().getAbsolutePath());
        if (file.renameTo(file2.getFile())) {
            return file2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StateRequestAttachment updateRequestAttachment(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
        return stateRequestAttachment.newBuilder().setLocalFile(mediaResult.getFile()).setName(mediaResult.getName()).setMimeType(mediaResult.getMimeType()).setLocalUri(mediaResult.getUri().toString()).build();
    }

    private void uploadAttachment(StateRequestAttachment stateRequestAttachment) {
        int i4 = 0;
        Uri parsedLocalUri = stateRequestAttachment.getParsedLocalUri();
        if (parsedLocalUri != null && !isUploadFinished()) {
            resolveUris(Collections.singletonList(parsedLocalUri), this.subDirectory, new ResolveCallback(this, stateRequestAttachment, i4));
        } else {
            Logger.w("RequestActivity", "Unable to parse uri, skipping. | %s", stateRequestAttachment.getLocalUri());
            errorUpload(stateRequestAttachment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadSuccess(StateRequestAttachment stateRequestAttachment, UploadResponse uploadResponse) {
        String localUri;
        File localFile;
        Attachment attachment = uploadResponse.getAttachment();
        MediaResult renameFile = renameFile(stateRequestAttachment.getLocalFile(), attachment.getId().longValue());
        if (renameFile != null) {
            localUri = renameFile.getUri().toString();
            localFile = renameFile.getFile();
        } else {
            localUri = stateRequestAttachment.getLocalUri();
            localFile = stateRequestAttachment.getLocalFile();
        }
        StateRequestAttachment build = stateRequestAttachment.newBuilder().setLocalUri(localUri).setLocalFile(localFile).setToken(uploadResponse.getToken()).setUrl(attachment.getContentUrl()).setMimeType(attachment.getContentType()).setName(attachment.getFileName()).build();
        synchronized (this.lock) {
            this.processedItems.add(build);
        }
        notifyIfFinished();
    }

    public void resolveUris(List<Uri> list, String str, Callback<List<MediaResult>> callback) {
        if (!list.isEmpty()) {
            this.resolveUri.start(list, str, callback);
        } else {
            callback.internalSuccess(new ArrayList(0));
        }
    }

    public void setResultListener(ZendeskCallback<AttachmentUploadResult> zendeskCallback) {
        this.resultListener = zendeskCallback;
        notifyIfFinished();
    }

    public void start(String str) {
        if (StringUtils.hasLength(str)) {
            this.subDirectory = UtilsAttachment.getCacheDirForRequestId(str);
        }
        Logger.d("RequestActivity", "Start uploading attachments", new Object[0]);
        Iterator<StateRequestAttachment> it = this.itemsForUpload.iterator();
        while (it.hasNext()) {
            uploadAttachment(it.next());
        }
    }
}
