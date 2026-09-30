package zendesk.support.requestlist;

import Kd.a;
import v9.InterfaceC3179a;
import zendesk.core.ActionHandlerRegistry;

/* loaded from: classes.dex */
public final class RequestListActivity_MembersInjector implements InterfaceC3179a {
    private final a actionHandlerRegistryProvider;
    private final a modelProvider;
    private final a presenterProvider;
    private final a syncHandlerProvider;
    private final a viewProvider;

    public RequestListActivity_MembersInjector(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.presenterProvider = aVar;
        this.viewProvider = aVar2;
        this.modelProvider = aVar3;
        this.actionHandlerRegistryProvider = aVar4;
        this.syncHandlerProvider = aVar5;
    }

    public static InterfaceC3179a create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new RequestListActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectActionHandlerRegistry(RequestListActivity requestListActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestListActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectModel(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.model = (RequestListModel) obj;
    }

    public static void injectPresenter(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.presenter = (RequestListPresenter) obj;
    }

    public static void injectSyncHandler(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.syncHandler = (RequestListSyncHandler) obj;
    }

    public static void injectView(RequestListActivity requestListActivity, Object obj) {
        requestListActivity.view = (RequestListView) obj;
    }

    public void injectMembers(RequestListActivity requestListActivity) {
        injectPresenter(requestListActivity, this.presenterProvider.get());
        injectView(requestListActivity, this.viewProvider.get());
        injectModel(requestListActivity, this.modelProvider.get());
        injectActionHandlerRegistry(requestListActivity, (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get());
        injectSyncHandler(requestListActivity, this.syncHandlerProvider.get());
    }
}
