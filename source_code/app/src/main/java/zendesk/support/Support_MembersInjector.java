package zendesk.support;

import Kd.a;
import v9.InterfaceC3179a;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;

/* loaded from: classes.dex */
public final class Support_MembersInjector implements InterfaceC3179a {
    private final a actionHandlerRegistryProvider;
    private final a authenticationProvider;
    private final a blipsProvider;
    private final a providerStoreProvider;
    private final a requestMigratorProvider;
    private final a requestProvider;
    private final a supportModuleProvider;

    public Support_MembersInjector(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        this.providerStoreProvider = aVar;
        this.supportModuleProvider = aVar2;
        this.requestMigratorProvider = aVar3;
        this.blipsProvider = aVar4;
        this.actionHandlerRegistryProvider = aVar5;
        this.requestProvider = aVar6;
        this.authenticationProvider = aVar7;
    }

    public static InterfaceC3179a create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        return new Support_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectActionHandlerRegistry(Support support, ActionHandlerRegistry actionHandlerRegistry) {
        support.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectAuthenticationProvider(Support support, AuthenticationProvider authenticationProvider) {
        support.authenticationProvider = authenticationProvider;
    }

    public static void injectBlipsProvider(Support support, SupportBlipsProvider supportBlipsProvider) {
        support.blipsProvider = supportBlipsProvider;
    }

    public static void injectProviderStore(Support support, ProviderStore providerStore) {
        support.providerStore = providerStore;
    }

    public static void injectRequestMigrator(Support support, Object obj) {
        support.requestMigrator = (RequestMigrator) obj;
    }

    public static void injectRequestProvider(Support support, RequestProvider requestProvider) {
        support.requestProvider = requestProvider;
    }

    public static void injectSupportModule(Support support, SupportModule supportModule) {
        support.supportModule = supportModule;
    }

    public void injectMembers(Support support) {
        injectProviderStore(support, (ProviderStore) this.providerStoreProvider.get());
        injectSupportModule(support, (SupportModule) this.supportModuleProvider.get());
        injectRequestMigrator(support, this.requestMigratorProvider.get());
        injectBlipsProvider(support, (SupportBlipsProvider) this.blipsProvider.get());
        injectActionHandlerRegistry(support, (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get());
        injectRequestProvider(support, (RequestProvider) this.requestProvider.get());
        injectAuthenticationProvider(support, (AuthenticationProvider) this.authenticationProvider.get());
    }
}
