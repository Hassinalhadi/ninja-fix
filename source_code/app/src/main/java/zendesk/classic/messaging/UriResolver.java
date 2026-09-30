package zendesk.classic.messaging;

import android.net.Uri;
import com.zendesk.logger.Logger;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import wa.n;
import zendesk.core.Callback;
import zendesk.core.MediaFileResolver;

@MessagingActivityScope
/* loaded from: classes.dex */
public class UriResolver {
    private static final String TAG = "UriTaskResolver";
    private final ExecutorService executorService;
    private final MediaFileResolver mediaFileResolver;

    public UriResolver(MediaFileResolver mediaFileResolver, ExecutorService executorService) {
        this.mediaFileResolver = mediaFileResolver;
        this.executorService = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(List list, Callback callback) {
        List<File> fetchFilesFromUris = this.mediaFileResolver.fetchFilesFromUris(list);
        if (callback != null) {
            Logger.d(TAG, "Sending to callback success", new Object[0]);
            callback.internalSuccess(fetchFilesFromUris);
        }
    }

    public void start(List<Uri> list, Callback<List<File>> callback) {
        this.executorService.execute(new n(this, list, callback, 3));
    }
}
