package zendesk.support.request;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesResolveUriTaskFactory implements dagger.internal.b {
    private final Kd.a executorProvider;
    private final Kd.a mainThreadExecutorProvider;
    private final Kd.a mediaResultUtilityProvider;

    public RequestModule_ProvidesResolveUriTaskFactory(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        this.mediaResultUtilityProvider = aVar;
        this.executorProvider = aVar2;
        this.mainThreadExecutorProvider = aVar3;
    }

    public static RequestModule_ProvidesResolveUriTaskFactory create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        return new RequestModule_ProvidesResolveUriTaskFactory(aVar, aVar2, aVar3);
    }

    public static ResolveUri providesResolveUriTask(Object obj, ExecutorService executorService, Executor executor) {
        ResolveUri providesResolveUriTask = RequestModule.providesResolveUriTask((MediaResultUtility) obj, executorService, executor);
        AbstractC2763s0.delta(providesResolveUriTask);
        return providesResolveUriTask;
    }

    @Override // Kd.a
    public ResolveUri get() {
        return providesResolveUriTask(this.mediaResultUtilityProvider.get(), (ExecutorService) this.executorProvider.get(), (Executor) this.mainThreadExecutorProvider.get());
    }
}
