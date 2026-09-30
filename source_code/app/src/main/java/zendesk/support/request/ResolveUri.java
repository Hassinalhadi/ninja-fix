package zendesk.support.request;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.core.Callback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ResolveUri {
    private final Executor executor;
    private final Executor mainThreadExecutor;
    private final MediaResultUtility mediaResultUtility;

    public ResolveUri(MediaResultUtility mediaResultUtility, Executor executor, Executor executor2) {
        this.mediaResultUtility = mediaResultUtility;
        this.executor = executor;
        this.mainThreadExecutor = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1(List list, String str, final Callback callback) {
        final List<MediaResult> resolvedUris = this.mediaResultUtility.getResolvedUris(list, str);
        this.mainThreadExecutor.execute(new Runnable() { // from class: zendesk.support.request.c
            @Override // java.lang.Runnable
            public final void run() {
                Callback.this.internalSuccess(resolvedUris);
            }
        });
    }

    public void start(final List<Uri> list, final String str, final Callback<List<MediaResult>> callback) {
        this.executor.execute(new Runnable() { // from class: zendesk.support.request.d
            @Override // java.lang.Runnable
            public final void run() {
                ResolveUri.this.lambda$start$1(list, str, callback);
            }
        });
    }
}
