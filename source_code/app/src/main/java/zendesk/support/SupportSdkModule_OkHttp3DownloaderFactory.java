package zendesk.support;

import Kd.a;
import com.squareup.picasso.OkHttp3Downloader;
import dagger.internal.b;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportSdkModule_OkHttp3DownloaderFactory implements b {
    private final SupportSdkModule module;
    private final a okHttpClientProvider;

    public SupportSdkModule_OkHttp3DownloaderFactory(SupportSdkModule supportSdkModule, a aVar) {
        this.module = supportSdkModule;
        this.okHttpClientProvider = aVar;
    }

    public static SupportSdkModule_OkHttp3DownloaderFactory create(SupportSdkModule supportSdkModule, a aVar) {
        return new SupportSdkModule_OkHttp3DownloaderFactory(supportSdkModule, aVar);
    }

    public static OkHttp3Downloader okHttp3Downloader(SupportSdkModule supportSdkModule, OkHttpClient okHttpClient) {
        OkHttp3Downloader okHttp3Downloader = supportSdkModule.okHttp3Downloader(okHttpClient);
        AbstractC2763s0.delta(okHttp3Downloader);
        return okHttp3Downloader;
    }

    @Override // Kd.a
    public OkHttp3Downloader get() {
        return okHttp3Downloader(this.module, (OkHttpClient) this.okHttpClientProvider.get());
    }
}
