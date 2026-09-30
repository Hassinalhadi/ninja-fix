package zendesk.support;

import Kd.a;
import android.content.Context;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import dagger.internal.b;
import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportSdkModule_ProvidesPicassoFactory implements b {
    private final a contextProvider;
    private final a executorServiceProvider;
    private final SupportSdkModule module;
    private final a okHttp3DownloaderProvider;

    public SupportSdkModule_ProvidesPicassoFactory(SupportSdkModule supportSdkModule, a aVar, a aVar2, a aVar3) {
        this.module = supportSdkModule;
        this.contextProvider = aVar;
        this.okHttp3DownloaderProvider = aVar2;
        this.executorServiceProvider = aVar3;
    }

    public static SupportSdkModule_ProvidesPicassoFactory create(SupportSdkModule supportSdkModule, a aVar, a aVar2, a aVar3) {
        return new SupportSdkModule_ProvidesPicassoFactory(supportSdkModule, aVar, aVar2, aVar3);
    }

    public static Picasso providesPicasso(SupportSdkModule supportSdkModule, Context context, OkHttp3Downloader okHttp3Downloader, ExecutorService executorService) {
        Picasso providesPicasso = supportSdkModule.providesPicasso(context, okHttp3Downloader, executorService);
        AbstractC2763s0.delta(providesPicasso);
        return providesPicasso;
    }

    @Override // Kd.a
    public Picasso get() {
        return providesPicasso(this.module, (Context) this.contextProvider.get(), (OkHttp3Downloader) this.okHttp3DownloaderProvider.get(), (ExecutorService) this.executorServiceProvider.get());
    }
}
