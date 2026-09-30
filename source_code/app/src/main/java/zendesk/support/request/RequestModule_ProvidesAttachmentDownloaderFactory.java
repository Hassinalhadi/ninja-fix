package zendesk.support.request;

import s6.AbstractC2763s0;
import zendesk.support.request.AttachmentDownloaderComponent;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesAttachmentDownloaderFactory implements dagger.internal.b {
    private final Kd.a attachmentToDiskServiceProvider;
    private final Kd.a mediaResultUtilityProvider;

    public RequestModule_ProvidesAttachmentDownloaderFactory(Kd.a aVar, Kd.a aVar2) {
        this.attachmentToDiskServiceProvider = aVar;
        this.mediaResultUtilityProvider = aVar2;
    }

    public static RequestModule_ProvidesAttachmentDownloaderFactory create(Kd.a aVar, Kd.a aVar2) {
        return new RequestModule_ProvidesAttachmentDownloaderFactory(aVar, aVar2);
    }

    public static AttachmentDownloaderComponent.AttachmentDownloader providesAttachmentDownloader(Object obj, Object obj2) {
        AttachmentDownloaderComponent.AttachmentDownloader providesAttachmentDownloader = RequestModule.providesAttachmentDownloader((AttachmentDownloadService) obj, (MediaResultUtility) obj2);
        AbstractC2763s0.delta(providesAttachmentDownloader);
        return providesAttachmentDownloader;
    }

    @Override // Kd.a
    public AttachmentDownloaderComponent.AttachmentDownloader get() {
        return providesAttachmentDownloader(this.attachmentToDiskServiceProvider.get(), this.mediaResultUtilityProvider.get());
    }
}
