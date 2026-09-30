package zendesk.support.request;

import android.content.Context;
import s6.AbstractC2763s0;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.requestlist.RequestInfoDataSource;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesConUpdatesComponentFactory implements dagger.internal.b {
    private final Kd.a actionHandlerRegistryProvider;
    private final Kd.a contextProvider;
    private final Kd.a dataSourceProvider;

    public RequestModule_ProvidesConUpdatesComponentFactory(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        this.contextProvider = aVar;
        this.actionHandlerRegistryProvider = aVar2;
        this.dataSourceProvider = aVar3;
    }

    public static RequestModule_ProvidesConUpdatesComponentFactory create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        return new RequestModule_ProvidesConUpdatesComponentFactory(aVar, aVar2, aVar3);
    }

    public static ComponentUpdateActionHandlers providesConUpdatesComponent(Context context, ActionHandlerRegistry actionHandlerRegistry, RequestInfoDataSource.LocalDataSource localDataSource) {
        ComponentUpdateActionHandlers providesConUpdatesComponent = RequestModule.providesConUpdatesComponent(context, actionHandlerRegistry, localDataSource);
        AbstractC2763s0.delta(providesConUpdatesComponent);
        return providesConUpdatesComponent;
    }

    @Override // Kd.a
    public ComponentUpdateActionHandlers get() {
        return providesConUpdatesComponent((Context) this.contextProvider.get(), (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get(), (RequestInfoDataSource.LocalDataSource) this.dataSourceProvider.get());
    }
}
