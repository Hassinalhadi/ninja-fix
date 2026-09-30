package zendesk.support;

import com.zendesk.service.ZendeskCallback;
import java.io.File;

/* loaded from: classes.dex */
class ZendeskUploadProvider implements UploadProvider {
    private final ZendeskUploadService uploadService;

    public ZendeskUploadProvider(ZendeskUploadService zendeskUploadService) {
        this.uploadService = zendeskUploadService;
    }

    @Override // zendesk.support.UploadProvider
    public void deleteAttachment(String str, ZendeskCallback<Void> zendeskCallback) {
        this.uploadService.deleteAttachment(str, zendeskCallback);
    }

    @Override // zendesk.support.UploadProvider
    public void uploadAttachment(String str, File file, String str2, final ZendeskCallback<UploadResponse> zendeskCallback) {
        this.uploadService.uploadAttachment(str, file, str2, new ZendeskCallbackSuccess<UploadResponseWrapper>(zendeskCallback) { // from class: zendesk.support.ZendeskUploadProvider.1
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(UploadResponseWrapper uploadResponseWrapper) {
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(uploadResponseWrapper.getUpload());
                }
            }
        });
    }
}
