package zendesk.support.request;

import android.content.Context;
import com.squareup.picasso.Picasso;
import s6.AbstractC2763s0;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.suas.Dispatcher;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesMessageFactoryFactory implements dagger.internal.b {
    private final Kd.a actionFactoryProvider;
    private final Kd.a configHelperProvider;
    private final Kd.a contextProvider;
    private final Kd.a dispatcherProvider;
    private final Kd.a mediaResultUtilityProvider;
    private final RequestModule module;
    private final Kd.a picassoProvider;
    private final Kd.a registryProvider;

    public RequestModule_ProvidesMessageFactoryFactory(RequestModule requestModule, Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4, Kd.a aVar5, Kd.a aVar6, Kd.a aVar7) {
        this.module = requestModule;
        this.contextProvider = aVar;
        this.picassoProvider = aVar2;
        this.actionFactoryProvider = aVar3;
        this.dispatcherProvider = aVar4;
        this.registryProvider = aVar5;
        this.configHelperProvider = aVar6;
        this.mediaResultUtilityProvider = aVar7;
    }

    public static RequestModule_ProvidesMessageFactoryFactory create(RequestModule requestModule, Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4, Kd.a aVar5, Kd.a aVar6, Kd.a aVar7) {
        return new RequestModule_ProvidesMessageFactoryFactory(requestModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static CellFactory providesMessageFactory(RequestModule requestModule, Context context, Picasso picasso, Object obj, Dispatcher dispatcher, ActionHandlerRegistry actionHandlerRegistry, ConfigurationHelper configurationHelper, Object obj2) {
        CellFactory providesMessageFactory = requestModule.providesMessageFactory(context, picasso, (ActionFactory) obj, dispatcher, actionHandlerRegistry, configurationHelper, (MediaResultUtility) obj2);
        AbstractC2763s0.delta(providesMessageFactory);
        return providesMessageFactory;
    }

    @Override // Kd.a
    public CellFactory get() {
        return providesMessageFactory(this.module, (Context) this.contextProvider.get(), (Picasso) this.picassoProvider.get(), this.actionFactoryProvider.get(), (Dispatcher) this.dispatcherProvider.get(), (ActionHandlerRegistry) this.registryProvider.get(), (ConfigurationHelper) this.configHelperProvider.get(), this.mediaResultUtilityProvider.get());
    }
}
