package zendesk.support.request;

import com.squareup.picasso.Picasso;
import v9.InterfaceC3179a;
import zendesk.support.suas.Store;

/* loaded from: classes.dex */
public final class RequestViewConversationsDisabled_MembersInjector implements InterfaceC3179a {
    private final Kd.a actionFactoryProvider;
    private final Kd.a mediaResultUtilityProvider;
    private final Kd.a picassoProvider;
    private final Kd.a storeProvider;

    public RequestViewConversationsDisabled_MembersInjector(Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4) {
        this.storeProvider = aVar;
        this.actionFactoryProvider = aVar2;
        this.picassoProvider = aVar3;
        this.mediaResultUtilityProvider = aVar4;
    }

    public static InterfaceC3179a create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4) {
        return new RequestViewConversationsDisabled_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectActionFactory(RequestViewConversationsDisabled requestViewConversationsDisabled, Object obj) {
        requestViewConversationsDisabled.actionFactory = (ActionFactory) obj;
    }

    public static void injectMediaResultUtility(RequestViewConversationsDisabled requestViewConversationsDisabled, Object obj) {
        requestViewConversationsDisabled.mediaResultUtility = (MediaResultUtility) obj;
    }

    public static void injectPicasso(RequestViewConversationsDisabled requestViewConversationsDisabled, Picasso picasso) {
        requestViewConversationsDisabled.picasso = picasso;
    }

    public static void injectStore(RequestViewConversationsDisabled requestViewConversationsDisabled, Store store) {
        requestViewConversationsDisabled.store = store;
    }

    public void injectMembers(RequestViewConversationsDisabled requestViewConversationsDisabled) {
        injectStore(requestViewConversationsDisabled, (Store) this.storeProvider.get());
        injectActionFactory(requestViewConversationsDisabled, this.actionFactoryProvider.get());
        injectPicasso(requestViewConversationsDisabled, (Picasso) this.picassoProvider.get());
        injectMediaResultUtility(requestViewConversationsDisabled, this.mediaResultUtilityProvider.get());
    }
}
