package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;
import zendesk.support.request.ComponentPersistence;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesDiskQueueFactory implements dagger.internal.b {
    private final Kd.a executorServiceProvider;

    public RequestModule_ProvidesDiskQueueFactory(Kd.a aVar) {
        this.executorServiceProvider = aVar;
    }

    public static RequestModule_ProvidesDiskQueueFactory create(Kd.a aVar) {
        return new RequestModule_ProvidesDiskQueueFactory(aVar);
    }

    public static ComponentPersistence.PersistenceQueue providesDiskQueue(ExecutorService executorService) {
        ComponentPersistence.PersistenceQueue providesDiskQueue = RequestModule.providesDiskQueue(executorService);
        AbstractC2763s0.delta(providesDiskQueue);
        return providesDiskQueue;
    }

    @Override // Kd.a
    public ComponentPersistence.PersistenceQueue get() {
        return providesDiskQueue((ExecutorService) this.executorServiceProvider.get());
    }
}
