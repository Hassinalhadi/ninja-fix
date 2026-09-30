package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ServiceModule_ProvideZendeskUploadServiceFactory implements b {
    private final a uploadServiceProvider;

    public ServiceModule_ProvideZendeskUploadServiceFactory(a aVar) {
        this.uploadServiceProvider = aVar;
    }

    public static ServiceModule_ProvideZendeskUploadServiceFactory create(a aVar) {
        return new ServiceModule_ProvideZendeskUploadServiceFactory(aVar);
    }

    public static ZendeskUploadService provideZendeskUploadService(Object obj) {
        ZendeskUploadService provideZendeskUploadService = ServiceModule.provideZendeskUploadService((UploadService) obj);
        AbstractC2763s0.delta(provideZendeskUploadService);
        return provideZendeskUploadService;
    }

    @Override // Kd.a
    public ZendeskUploadService get() {
        return provideZendeskUploadService(this.uploadServiceProvider.get());
    }
}
