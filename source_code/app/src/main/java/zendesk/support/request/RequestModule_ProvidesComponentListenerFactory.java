package zendesk.support.request;

import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesComponentListenerFactory implements dagger.internal.b {
    private final Kd.a attachmentDownloaderProvider;
    private final Kd.a persistenceProvider;
    private final Kd.a updatesComponentProvider;

    public RequestModule_ProvidesComponentListenerFactory(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        this.persistenceProvider = aVar;
        this.attachmentDownloaderProvider = aVar2;
        this.updatesComponentProvider = aVar3;
    }

    public static RequestModule_ProvidesComponentListenerFactory create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        return new RequestModule_ProvidesComponentListenerFactory(aVar, aVar2, aVar3);
    }

    public static HeadlessComponentListener providesComponentListener(Object obj, Object obj2, Object obj3) {
        HeadlessComponentListener providesComponentListener = RequestModule.providesComponentListener((ComponentPersistence) obj, (AttachmentDownloaderComponent) obj2, (ComponentUpdateActionHandlers) obj3);
        AbstractC2763s0.delta(providesComponentListener);
        return providesComponentListener;
    }

    @Override // Kd.a
    public HeadlessComponentListener get() {
        return providesComponentListener(this.persistenceProvider.get(), this.attachmentDownloaderProvider.get(), this.updatesComponentProvider.get());
    }
}
