package zendesk.support.request;

import Tf.aj;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponseAdapter;
import com.zendesk.service.ZendeskCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zendesk.support.Streams;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AttachmentDownloadService {
    private final Executor executor;
    private final OkHttpClient okHttpClient;

    /* loaded from: classes.dex */
    public static class SaveToFileTask implements Runnable {
        private final ZendeskCallback<MediaResult> callback;
        private final MediaResult destFile;
        private final ResponseBody responseBody;

        public /* synthetic */ SaveToFileTask(ResponseBody responseBody, MediaResult mediaResult, ZendeskCallback zendeskCallback, int i4) {
            this(responseBody, mediaResult, zendeskCallback);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            aj ajVar;
            IOException e;
            ZendeskCallback<MediaResult> zendeskCallback;
            aj ajVar2 = null;
            ErrorResponseAdapter errorResponseAdapter = null;
            try {
                File file = this.destFile.getFile();
                Intrinsics.echo(file, "<this>");
                ajVar = Tf.b.bravo(Tf.b.hotel(new FileOutputStream(file, false)));
                try {
                    try {
                        ajVar.f(this.responseBody.getSource());
                        Streams.closeQuietly(ajVar);
                        Streams.closeQuietly(this.responseBody);
                    } catch (IOException e4) {
                        e = e4;
                        Logger.e("RequestActivity", "Unable to save attachment to disk. Error: '%s'", e.getMessage());
                        ErrorResponseAdapter errorResponseAdapter2 = new ErrorResponseAdapter(e.getMessage());
                        Streams.closeQuietly(ajVar);
                        Streams.closeQuietly(this.responseBody);
                        errorResponseAdapter = errorResponseAdapter2;
                        zendeskCallback = this.callback;
                        if (zendeskCallback == null) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    ajVar2 = ajVar;
                    Streams.closeQuietly(ajVar2);
                    Streams.closeQuietly(this.responseBody);
                    throw th;
                }
            } catch (IOException e5) {
                ajVar = null;
                e = e5;
            } catch (Throwable th2) {
                th = th2;
                Streams.closeQuietly(ajVar2);
                Streams.closeQuietly(this.responseBody);
                throw th;
            }
            zendeskCallback = this.callback;
            if (zendeskCallback == null) {
                if (errorResponseAdapter == null) {
                    zendeskCallback.onSuccess(this.destFile);
                } else {
                    zendeskCallback.onError(errorResponseAdapter);
                }
            }
        }

        private SaveToFileTask(ResponseBody responseBody, MediaResult mediaResult, ZendeskCallback<MediaResult> zendeskCallback) {
            this.responseBody = responseBody;
            this.destFile = mediaResult;
            this.callback = zendeskCallback;
        }
    }

    public AttachmentDownloadService(OkHttpClient okHttpClient, Executor executor) {
        this.okHttpClient = okHttpClient;
        this.executor = executor;
    }

    public void downloadAttachment(String str, final ZendeskCallback<ResponseBody> zendeskCallback) {
        FirebasePerfOkHttpClient.enqueue(this.okHttpClient.newCall(new Request.Builder().get().url(str).build()), new Callback() { // from class: zendesk.support.request.AttachmentDownloadService.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                zendeskCallback.onError(new ErrorResponseAdapter(iOException.getMessage()));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                if (response.getIsSuccessful()) {
                    zendeskCallback.onSuccess(response.body());
                } else {
                    zendeskCallback.onError(new ErrorResponseAdapter(response.message()));
                }
            }
        });
    }

    public void storeAttachment(ResponseBody responseBody, MediaResult mediaResult, ZendeskCallback<MediaResult> zendeskCallback) {
        this.executor.execute(new SaveToFileTask(responseBody, mediaResult, zendeskCallback, 0));
    }
}
