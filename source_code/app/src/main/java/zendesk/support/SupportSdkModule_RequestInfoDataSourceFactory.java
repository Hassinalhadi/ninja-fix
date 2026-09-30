package zendesk.support;

import Kd.a;
import dagger.internal.b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;
import zendesk.support.requestlist.RequestInfoDataSource;

/* loaded from: classes.dex */
public final class SupportSdkModule_RequestInfoDataSourceFactory implements b {
    private final a backgroundThreadExecutorProvider;
    private final a mainThreadExecutorProvider;
    private final SupportSdkModule module;
    private final a supportUiStorageProvider;

    public SupportSdkModule_RequestInfoDataSourceFactory(SupportSdkModule supportSdkModule, a aVar, a aVar2, a aVar3) {
        this.module = supportSdkModule;
        this.supportUiStorageProvider = aVar;
        this.mainThreadExecutorProvider = aVar2;
        this.backgroundThreadExecutorProvider = aVar3;
    }

    public static SupportSdkModule_RequestInfoDataSourceFactory create(SupportSdkModule supportSdkModule, a aVar, a aVar2, a aVar3) {
        return new SupportSdkModule_RequestInfoDataSourceFactory(supportSdkModule, aVar, aVar2, aVar3);
    }

    public static RequestInfoDataSource.LocalDataSource requestInfoDataSource(SupportSdkModule supportSdkModule, SupportUiStorage supportUiStorage, Executor executor, ExecutorService executorService) {
        RequestInfoDataSource.LocalDataSource requestInfoDataSource = supportSdkModule.requestInfoDataSource(supportUiStorage, executor, executorService);
        AbstractC2763s0.delta(requestInfoDataSource);
        return requestInfoDataSource;
    }

    @Override // Kd.a
    public RequestInfoDataSource.LocalDataSource get() {
        return requestInfoDataSource(this.module, (SupportUiStorage) this.supportUiStorageProvider.get(), (Executor) this.mainThreadExecutorProvider.get(), (ExecutorService) this.backgroundThreadExecutorProvider.get());
    }
}
