package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesAttachmentToDiskServiceFactory implements dagger.internal.b {
    private final Kd.a executorProvider;
    private final Kd.a okHttpClientProvider;

    public RequestModule_ProvidesAttachmentToDiskServiceFactory(Kd.a aVar, Kd.a aVar2) {
        this.okHttpClientProvider = aVar;
        this.executorProvider = aVar2;
    }

    public static RequestModule_ProvidesAttachmentToDiskServiceFactory create(Kd.a aVar, Kd.a aVar2) {
        return new RequestModule_ProvidesAttachmentToDiskServiceFactory(aVar, aVar2);
    }

    public static AttachmentDownloadService providesAttachmentToDiskService(OkHttpClient okHttpClient, ExecutorService executorService) {
        AttachmentDownloadService providesAttachmentToDiskService = RequestModule.providesAttachmentToDiskService(okHttpClient, executorService);
        AbstractC2763s0.delta(providesAttachmentToDiskService);
        return providesAttachmentToDiskService;
    }

    @Override // Kd.a
    public AttachmentDownloadService get() {
        return providesAttachmentToDiskService((OkHttpClient) this.okHttpClientProvider.get(), (ExecutorService) this.executorProvider.get());
    }
}
