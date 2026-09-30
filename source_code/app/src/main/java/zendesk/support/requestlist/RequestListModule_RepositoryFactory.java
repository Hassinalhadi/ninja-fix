package zendesk.support.requestlist;

import Kd.a;
import dagger.internal.b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;
import zendesk.support.RequestProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.requestlist.RequestInfoDataSource;

/* loaded from: classes.dex */
public final class RequestListModule_RepositoryFactory implements b {
    private final a backgroundThreadExecutorProvider;
    private final a localDataSourceProvider;
    private final a mainThreadExecutorProvider;
    private final a requestProvider;
    private final a supportUiStorageProvider;

    public RequestListModule_RepositoryFactory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.localDataSourceProvider = aVar;
        this.supportUiStorageProvider = aVar2;
        this.requestProvider = aVar3;
        this.mainThreadExecutorProvider = aVar4;
        this.backgroundThreadExecutorProvider = aVar5;
    }

    public static RequestListModule_RepositoryFactory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new RequestListModule_RepositoryFactory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static RequestInfoDataSource.Repository repository(RequestInfoDataSource.LocalDataSource localDataSource, SupportUiStorage supportUiStorage, RequestProvider requestProvider, Executor executor, ExecutorService executorService) {
        RequestInfoDataSource.Repository repository = RequestListModule.repository(localDataSource, supportUiStorage, requestProvider, executor, executorService);
        AbstractC2763s0.delta(repository);
        return repository;
    }

    @Override // Kd.a
    public RequestInfoDataSource.Repository get() {
        return repository((RequestInfoDataSource.LocalDataSource) this.localDataSourceProvider.get(), (SupportUiStorage) this.supportUiStorageProvider.get(), (RequestProvider) this.requestProvider.get(), (Executor) this.mainThreadExecutorProvider.get(), (ExecutorService) this.backgroundThreadExecutorProvider.get());
    }
}
