package zendesk.support;

import Kd.a;
import java.util.List;
import v9.InterfaceC3179a;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;

/* loaded from: classes.dex */
public final class SdkDependencyProvider_MembersInjector implements InterfaceC3179a {
    private final a actionHandlersProvider;
    private final a registryProvider;

    public SdkDependencyProvider_MembersInjector(a aVar, a aVar2) {
        this.registryProvider = aVar;
        this.actionHandlersProvider = aVar2;
    }

    public static InterfaceC3179a create(a aVar, a aVar2) {
        return new SdkDependencyProvider_MembersInjector(aVar, aVar2);
    }

    public static void injectActionHandlers(SdkDependencyProvider sdkDependencyProvider, List<ActionHandler> list) {
        sdkDependencyProvider.actionHandlers = list;
    }

    public static void injectRegistry(SdkDependencyProvider sdkDependencyProvider, ActionHandlerRegistry actionHandlerRegistry) {
        sdkDependencyProvider.registry = actionHandlerRegistry;
    }

    public void injectMembers(SdkDependencyProvider sdkDependencyProvider) {
        injectRegistry(sdkDependencyProvider, (ActionHandlerRegistry) this.registryProvider.get());
        injectActionHandlers(sdkDependencyProvider, (List) this.actionHandlersProvider.get());
    }
}
