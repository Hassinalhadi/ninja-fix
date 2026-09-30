package zendesk.support.request;

import s6.AbstractC2763s0;
import zendesk.support.request.AttachmentDownloaderComponent;
import zendesk.support.suas.Dispatcher;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesAttachmentDownloaderComponentFactory implements dagger.internal.b {
    private final Kd.a actionFactoryProvider;
    private final Kd.a attachmentDownloaderProvider;
    private final Kd.a dispatcherProvider;

    public RequestModule_ProvidesAttachmentDownloaderComponentFactory(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        this.dispatcherProvider = aVar;
        this.actionFactoryProvider = aVar2;
        this.attachmentDownloaderProvider = aVar3;
    }

    public static RequestModule_ProvidesAttachmentDownloaderComponentFactory create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3) {
        return new RequestModule_ProvidesAttachmentDownloaderComponentFactory(aVar, aVar2, aVar3);
    }

    public static AttachmentDownloaderComponent providesAttachmentDownloaderComponent(Dispatcher dispatcher, Object obj, Object obj2) {
        AttachmentDownloaderComponent providesAttachmentDownloaderComponent = RequestModule.providesAttachmentDownloaderComponent(dispatcher, (ActionFactory) obj, (AttachmentDownloaderComponent.AttachmentDownloader) obj2);
        AbstractC2763s0.delta(providesAttachmentDownloaderComponent);
        return providesAttachmentDownloaderComponent;
    }

    @Override // Kd.a
    public AttachmentDownloaderComponent get() {
        return providesAttachmentDownloaderComponent((Dispatcher) this.dispatcherProvider.get(), this.actionFactoryProvider.get(), this.attachmentDownloaderProvider.get());
    }
}
