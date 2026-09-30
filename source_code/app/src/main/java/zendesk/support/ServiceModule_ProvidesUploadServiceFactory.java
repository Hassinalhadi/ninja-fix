package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.RestServiceProvider;

/* loaded from: classes.dex */
public final class ServiceModule_ProvidesUploadServiceFactory implements b {
    private final a restServiceProvider;

    public ServiceModule_ProvidesUploadServiceFactory(a aVar) {
        this.restServiceProvider = aVar;
    }

    public static ServiceModule_ProvidesUploadServiceFactory create(a aVar) {
        return new ServiceModule_ProvidesUploadServiceFactory(aVar);
    }

    public static UploadService providesUploadService(RestServiceProvider restServiceProvider) {
        UploadService providesUploadService = ServiceModule.providesUploadService(restServiceProvider);
        AbstractC2763s0.delta(providesUploadService);
        return providesUploadService;
    }

    @Override // Kd.a
    public UploadService get() {
        return providesUploadService((RestServiceProvider) this.restServiceProvider.get());
    }
}
