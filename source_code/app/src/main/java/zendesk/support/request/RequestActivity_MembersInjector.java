package zendesk.support.request;

import com.squareup.picasso.Picasso;
import v9.InterfaceC3179a;
import zendesk.commonui.PermissionsHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.suas.Store;

/* loaded from: classes.dex */
public final class RequestActivity_MembersInjector implements InterfaceC3179a {
    private final Kd.a actionFactoryProvider;
    private final Kd.a actionHandlerRegistryProvider;
    private final Kd.a headlessComponentListenerProvider;
    private final Kd.a mediaResultUtilityProvider;
    private final Kd.a permissionsHandlerProvider;
    private final Kd.a picassoProvider;
    private final Kd.a storeProvider;

    public RequestActivity_MembersInjector(Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4, Kd.a aVar5, Kd.a aVar6, Kd.a aVar7) {
        this.storeProvider = aVar;
        this.actionFactoryProvider = aVar2;
        this.headlessComponentListenerProvider = aVar3;
        this.picassoProvider = aVar4;
        this.actionHandlerRegistryProvider = aVar5;
        this.mediaResultUtilityProvider = aVar6;
        this.permissionsHandlerProvider = aVar7;
    }

    public static InterfaceC3179a create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4, Kd.a aVar5, Kd.a aVar6, Kd.a aVar7) {
        return new RequestActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectActionFactory(RequestActivity requestActivity, Object obj) {
        requestActivity.actionFactory = (ActionFactory) obj;
    }

    public static void injectActionHandlerRegistry(RequestActivity requestActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectHeadlessComponentListener(RequestActivity requestActivity, Object obj) {
        requestActivity.headlessComponentListener = (HeadlessComponentListener) obj;
    }

    public static void injectMediaResultUtility(RequestActivity requestActivity, Object obj) {
        requestActivity.mediaResultUtility = (MediaResultUtility) obj;
    }

    public static void injectPermissionsHandler(RequestActivity requestActivity, PermissionsHandler permissionsHandler) {
        requestActivity.permissionsHandler = permissionsHandler;
    }

    public static void injectPicasso(RequestActivity requestActivity, Picasso picasso) {
        requestActivity.picasso = picasso;
    }

    public static void injectStore(RequestActivity requestActivity, Store store) {
        requestActivity.store = store;
    }

    public void injectMembers(RequestActivity requestActivity) {
        injectStore(requestActivity, (Store) this.storeProvider.get());
        injectActionFactory(requestActivity, this.actionFactoryProvider.get());
        injectHeadlessComponentListener(requestActivity, this.headlessComponentListenerProvider.get());
        injectPicasso(requestActivity, (Picasso) this.picassoProvider.get());
        injectActionHandlerRegistry(requestActivity, (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get());
        injectMediaResultUtility(requestActivity, this.mediaResultUtilityProvider.get());
        injectPermissionsHandler(requestActivity, (PermissionsHandler) this.permissionsHandlerProvider.get());
    }
}
