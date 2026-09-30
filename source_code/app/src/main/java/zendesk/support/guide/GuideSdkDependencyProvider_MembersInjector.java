package zendesk.support.guide;

import Kd.a;
import v9.InterfaceC3179a;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;

/* loaded from: classes.dex */
public final class GuideSdkDependencyProvider_MembersInjector implements InterfaceC3179a {
    private final a actionHandlerProvider;
    private final a registryProvider;

    public GuideSdkDependencyProvider_MembersInjector(a aVar, a aVar2) {
        this.registryProvider = aVar;
        this.actionHandlerProvider = aVar2;
    }

    public static InterfaceC3179a create(a aVar, a aVar2) {
        return new GuideSdkDependencyProvider_MembersInjector(aVar, aVar2);
    }

    public static void injectActionHandler(Object obj, ActionHandler actionHandler) {
        ((GuideSdkDependencyProvider) obj).actionHandler = actionHandler;
    }

    public static void injectRegistry(Object obj, ActionHandlerRegistry actionHandlerRegistry) {
        ((GuideSdkDependencyProvider) obj).registry = actionHandlerRegistry;
    }

    public void injectMembers(GuideSdkDependencyProvider guideSdkDependencyProvider) {
        injectRegistry(guideSdkDependencyProvider, (ActionHandlerRegistry) this.registryProvider.get());
        injectActionHandler(guideSdkDependencyProvider, (ActionHandler) this.actionHandlerProvider.get());
    }
}
