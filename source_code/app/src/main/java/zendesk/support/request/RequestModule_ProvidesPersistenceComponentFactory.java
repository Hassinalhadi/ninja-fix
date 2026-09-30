package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.ComponentPersistence;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesPersistenceComponentFactory implements dagger.internal.b {
    private final Kd.a executorServiceProvider;
    private final Kd.a queueProvider;
    private final Kd.a supportUiStorageProvider;

    public RequestModule_ProvidesPersistenceComponentFactory(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        this.supportUiStorageProvider = aVar;
        this.queueProvider = aVar2;
        this.executorServiceProvider = aVar3;
    }

    public static RequestModule_ProvidesPersistenceComponentFactory create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        return new RequestModule_ProvidesPersistenceComponentFactory(aVar, aVar2, aVar3);
    }

    public static ComponentPersistence providesPersistenceComponent(SupportUiStorage supportUiStorage, Object obj, ExecutorService executorService) {
        ComponentPersistence providesPersistenceComponent = RequestModule.providesPersistenceComponent(supportUiStorage, (ComponentPersistence.PersistenceQueue) obj, executorService);
        AbstractC2763s0.delta(providesPersistenceComponent);
        return providesPersistenceComponent;
    }

    @Override // Kd.a
    public ComponentPersistence get() {
        return providesPersistenceComponent((SupportUiStorage) this.supportUiStorageProvider.get(), this.queueProvider.get(), (ExecutorService) this.executorServiceProvider.get());
    }
}
