package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.l;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import i9.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.ActionHandler;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.SessionStorage;
import zendesk.support.requestlist.RequestInfoDataSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SupportSdkModule {
    private static final int MAX_DISK_CACHE_SIZE = 20971520;

    public ConfigurationHelper configurationHelper() {
        return new ConfigurationHelper();
    }

    public Executor mainThreadExecutor() {
        return new Executor() { // from class: zendesk.support.SupportSdkModule.1
            Handler handler = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        };
    }

    public OkHttp3Downloader okHttp3Downloader(OkHttpClient okHttpClient) {
        return new OkHttp3Downloader(okHttpClient);
    }

    public l provides() {
        return new l();
    }

    public List<ActionHandler> providesActionHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DeepLinkToRequestActionHandler());
        return arrayList;
    }

    public Picasso providesPicasso(Context context, OkHttp3Downloader okHttp3Downloader, ExecutorService executorService) {
        return new Picasso.Builder(context).downloader(okHttp3Downloader).executor(executorService).defaultBitmapConfig(Bitmap.Config.RGB_565).build();
    }

    public f providesRequestDiskLruCache(SessionStorage sessionStorage) {
        try {
            return f.papa(new File(sessionStorage.getZendeskDataDir(), "request"), 20971520L);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public String providesZendeskUrl(ApplicationConfiguration applicationConfiguration) {
        return applicationConfiguration.getZendeskUrl();
    }

    public RequestInfoDataSource.LocalDataSource requestInfoDataSource(SupportUiStorage supportUiStorage, Executor executor, ExecutorService executorService) {
        return new RequestInfoDataSource.LocalDataSource(new RequestInfoDataSource.Disk(executor, executorService, supportUiStorage, RequestInfoDataSource.LOCAL));
    }

    public SupportUiStorage supportUiStorage(f fVar, l lVar) {
        return new SupportUiStorage(fVar, lVar);
    }
}
