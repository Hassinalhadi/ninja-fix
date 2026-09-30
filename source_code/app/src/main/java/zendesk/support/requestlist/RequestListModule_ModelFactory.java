package zendesk.support.requestlist;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.MemoryCache;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.requestlist.RequestInfoDataSource;

/* loaded from: classes.dex */
public final class RequestListModule_ModelFactory implements b {
    private final a blipsProvider;
    private final a memoryCacheProvider;
    private final RequestListModule module;
    private final a requestInfoDataSourceProvider;
    private final a settingsProvider;

    public RequestListModule_ModelFactory(RequestListModule requestListModule, a aVar, a aVar2, a aVar3, a aVar4) {
        this.module = requestListModule;
        this.requestInfoDataSourceProvider = aVar;
        this.memoryCacheProvider = aVar2;
        this.blipsProvider = aVar3;
        this.settingsProvider = aVar4;
    }

    public static RequestListModule_ModelFactory create(RequestListModule requestListModule, a aVar, a aVar2, a aVar3, a aVar4) {
        return new RequestListModule_ModelFactory(requestListModule, aVar, aVar2, aVar3, aVar4);
    }

    public static RequestListModel model(RequestListModule requestListModule, RequestInfoDataSource.Repository repository, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        RequestListModel model = requestListModule.model(repository, memoryCache, supportBlipsProvider, supportSettingsProvider);
        AbstractC2763s0.delta(model);
        return model;
    }

    @Override // Kd.a
    public RequestListModel get() {
        return model(this.module, (RequestInfoDataSource.Repository) this.requestInfoDataSourceProvider.get(), (MemoryCache) this.memoryCacheProvider.get(), (SupportBlipsProvider) this.blipsProvider.get(), (SupportSettingsProvider) this.settingsProvider.get());
    }
}
