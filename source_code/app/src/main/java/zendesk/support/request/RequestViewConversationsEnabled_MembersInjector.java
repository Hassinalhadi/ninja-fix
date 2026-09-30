package zendesk.support.request;

import com.squareup.picasso.Picasso;
import v9.InterfaceC3179a;
import zendesk.support.suas.Store;

/* loaded from: classes.dex */
public final class RequestViewConversationsEnabled_MembersInjector implements InterfaceC3179a {
    private final Kd.a actionFactoryProvider;
    private final Kd.a cellFactoryProvider;
    private final Kd.a picassoProvider;
    private final Kd.a storeProvider;

    public RequestViewConversationsEnabled_MembersInjector(Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4) {
        this.storeProvider = aVar;
        this.actionFactoryProvider = aVar2;
        this.cellFactoryProvider = aVar3;
        this.picassoProvider = aVar4;
    }

    public static InterfaceC3179a create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4) {
        return new RequestViewConversationsEnabled_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectActionFactory(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.actionFactory = (ActionFactory) obj;
    }

    public static void injectCellFactory(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.cellFactory = (CellFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsEnabled requestViewConversationsEnabled, Picasso picasso) {
        requestViewConversationsEnabled.picasso = picasso;
    }

    public static void injectStore(RequestViewConversationsEnabled requestViewConversationsEnabled, Store store) {
        requestViewConversationsEnabled.store = store;
    }

    public void injectMembers(RequestViewConversationsEnabled requestViewConversationsEnabled) {
        injectStore(requestViewConversationsEnabled, (Store) this.storeProvider.get());
        injectActionFactory(requestViewConversationsEnabled, this.actionFactoryProvider.get());
        injectCellFactory(requestViewConversationsEnabled, this.cellFactoryProvider.get());
        injectPicasso(requestViewConversationsEnabled, (Picasso) this.picassoProvider.get());
    }
}
