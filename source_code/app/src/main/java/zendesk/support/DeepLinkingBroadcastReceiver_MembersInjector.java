package zendesk.support;

import Kd.a;
import v9.InterfaceC3179a;
import zendesk.core.ActionHandlerRegistry;

/* loaded from: classes.dex */
public final class DeepLinkingBroadcastReceiver_MembersInjector implements InterfaceC3179a {
    private final a registryProvider;

    public DeepLinkingBroadcastReceiver_MembersInjector(a aVar) {
        this.registryProvider = aVar;
    }

    public static InterfaceC3179a create(a aVar) {
        return new DeepLinkingBroadcastReceiver_MembersInjector(aVar);
    }

    public static void injectRegistry(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver, ActionHandlerRegistry actionHandlerRegistry) {
        deepLinkingBroadcastReceiver.registry = actionHandlerRegistry;
    }

    public void injectMembers(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        injectRegistry(deepLinkingBroadcastReceiver, (ActionHandlerRegistry) this.registryProvider.get());
    }
}
