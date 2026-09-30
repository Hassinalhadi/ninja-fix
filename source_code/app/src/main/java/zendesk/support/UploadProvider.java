package zendesk.support;

import com.zendesk.service.ZendeskCallback;
import java.io.File;

/* loaded from: classes.dex */
public interface UploadProvider {
    void deleteAttachment(String str, ZendeskCallback<Void> zendeskCallback);

    void uploadAttachment(String str, File file, String str2, ZendeskCallback<UploadResponse> zendeskCallback);
}
