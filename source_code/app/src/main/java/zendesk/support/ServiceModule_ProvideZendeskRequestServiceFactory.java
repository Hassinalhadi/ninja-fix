package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ServiceModule_ProvideZendeskRequestServiceFactory implements b {
    private final a requestServiceProvider;

    public ServiceModule_ProvideZendeskRequestServiceFactory(a aVar) {
        this.requestServiceProvider = aVar;
    }

    public static ServiceModule_ProvideZendeskRequestServiceFactory create(a aVar) {
        return new ServiceModule_ProvideZendeskRequestServiceFactory(aVar);
    }

    public static ZendeskRequestService provideZendeskRequestService(Object obj) {
        ZendeskRequestService provideZendeskRequestService = ServiceModule.provideZendeskRequestService((RequestService) obj);
        AbstractC2763s0.delta(provideZendeskRequestService);
        return provideZendeskRequestService;
    }

    @Override // Kd.a
    public ZendeskRequestService get() {
        return provideZendeskRequestService(this.requestServiceProvider.get());
    }
}
