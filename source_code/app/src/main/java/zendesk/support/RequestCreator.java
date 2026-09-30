package zendesk.support;

import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import zendesk.support.request.RequestConfiguration;

/* loaded from: classes.dex */
public class RequestCreator {
    private final RequestProvider requestProvider;
    private final UploadProvider uploadProvider;

    public RequestCreator(RequestProvider requestProvider, UploadProvider uploadProvider) {
        this.requestProvider = requestProvider;
        this.uploadProvider = uploadProvider;
    }

    private CreateRequest buildCreateRequestObject(String str, RequestConfiguration requestConfiguration) {
        CreateRequest createRequest = new CreateRequest();
        createRequest.setDescription(str);
        if (StringUtils.hasLength(requestConfiguration.getRequestSubject())) {
            createRequest.setSubject(requestConfiguration.getRequestSubject());
        }
        if (CollectionUtils.isNotEmpty(requestConfiguration.getTags())) {
            createRequest.setTags(requestConfiguration.getTags());
        }
        if (requestConfiguration.getTicketFormId() != -1) {
            createRequest.setTicketFormId(Long.valueOf(requestConfiguration.getTicketFormId()));
        }
        if (CollectionUtils.isNotEmpty(requestConfiguration.getCustomFields())) {
            createRequest.setCustomFields(requestConfiguration.getCustomFields());
        }
        return createRequest;
    }

    private void uploadAttachments(final CreateRequest createRequest, List<AttachmentFile> list, final ZendeskCallback<Request> zendeskCallback) {
        final int size = list.size();
        final AtomicInteger atomicInteger = new AtomicInteger();
        final ArrayList arrayList = new ArrayList(size);
        for (AttachmentFile attachmentFile : list) {
            this.uploadProvider.uploadAttachment(attachmentFile.getFileName(), attachmentFile.getFile(), attachmentFile.getMimeType(), new ZendeskCallback<UploadResponse>() { // from class: zendesk.support.RequestCreator.1
                private void proceedWithRequestCreationIfFinishedUploading() {
                    if (atomicInteger.incrementAndGet() == size) {
                        createRequest.setAttachments(arrayList);
                        RequestCreator.this.requestProvider.createRequest(createRequest, zendeskCallback);
                    }
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    proceedWithRequestCreationIfFinishedUploading();
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(UploadResponse uploadResponse) {
                    arrayList.add(uploadResponse.getToken());
                    proceedWithRequestCreationIfFinishedUploading();
                }
            });
        }
    }

    public void createRequest(String str, RequestConfiguration requestConfiguration, ZendeskCallback<Request> zendeskCallback) {
        CreateRequest buildCreateRequestObject = buildCreateRequestObject(str, requestConfiguration);
        List<AttachmentFile> filesAsAttachments = requestConfiguration.getFilesAsAttachments();
        if (CollectionUtils.isNotEmpty(filesAsAttachments)) {
            uploadAttachments(buildCreateRequestObject, filesAsAttachments, zendeskCallback);
        } else {
            this.requestProvider.createRequest(buildCreateRequestObject, zendeskCallback);
        }
    }
}
