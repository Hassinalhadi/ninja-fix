package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.RestServiceProvider;

/* loaded from: classes.dex */
public final class ServiceModule_ProvidesRequestServiceFactory implements b {
    private final a restServiceProvider;

    public ServiceModule_ProvidesRequestServiceFactory(a aVar) {
        this.restServiceProvider = aVar;
    }

    public static ServiceModule_ProvidesRequestServiceFactory create(a aVar) {
        return new ServiceModule_ProvidesRequestServiceFactory(aVar);
    }

    public static RequestService providesRequestService(RestServiceProvider restServiceProvider) {
        RequestService providesRequestService = ServiceModule.providesRequestService(restServiceProvider);
        AbstractC2763s0.delta(providesRequestService);
        return providesRequestService;
    }

    @Override // Kd.a
    public RequestService get() {
        return providesRequestService((RestServiceProvider) this.restServiceProvider.get());
    }
}
