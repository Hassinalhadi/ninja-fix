package zendesk.support.request;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s6.AbstractC2763s0;
import zendesk.core.AuthenticationProvider;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesActionFactoryFactory implements dagger.internal.b {
    private final Kd.a authProvider;
    private final Kd.a blipsProvider;
    private final Kd.a executorProvider;
    private final Kd.a mainThreadExecutorProvider;
    private final Kd.a mediaResultUtilityProvider;
    private final Kd.a requestProvider;
    private final Kd.a resolveUriProvider;
    private final Kd.a settingsProvider;
    private final Kd.a supportUiStorageProvider;
    private final Kd.a uploadProvider;

    public RequestModule_ProvidesActionFactoryFactory(Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4, Kd.a aVar5, Kd.a aVar6, Kd.a aVar7, Kd.a aVar8, Kd.a aVar9, Kd.a aVar10) {
        this.requestProvider = aVar;
        this.settingsProvider = aVar2;
        this.uploadProvider = aVar3;
        this.supportUiStorageProvider = aVar4;
        this.executorProvider = aVar5;
        this.mainThreadExecutorProvider = aVar6;
        this.authProvider = aVar7;
        this.blipsProvider = aVar8;
        this.mediaResultUtilityProvider = aVar9;
        this.resolveUriProvider = aVar10;
    }

    public static RequestModule_ProvidesActionFactoryFactory create(Kd.a aVar, Kd.a aVar2, Kd.a aVar3, Kd.a aVar4, Kd.a aVar5, Kd.a aVar6, Kd.a aVar7, Kd.a aVar8, Kd.a aVar9, Kd.a aVar10) {
        return new RequestModule_ProvidesActionFactoryFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static ActionFactory providesActionFactory(RequestProvider requestProvider, SupportSettingsProvider supportSettingsProvider, UploadProvider uploadProvider, SupportUiStorage supportUiStorage, ExecutorService executorService, Executor executor, AuthenticationProvider authenticationProvider, SupportBlipsProvider supportBlipsProvider, Object obj, Object obj2) {
        ActionFactory providesActionFactory = RequestModule.providesActionFactory(requestProvider, supportSettingsProvider, uploadProvider, supportUiStorage, executorService, executor, authenticationProvider, supportBlipsProvider, (MediaResultUtility) obj, (ResolveUri) obj2);
        AbstractC2763s0.delta(providesActionFactory);
        return providesActionFactory;
    }

    @Override // Kd.a
    public ActionFactory get() {
        return providesActionFactory((RequestProvider) this.requestProvider.get(), (SupportSettingsProvider) this.settingsProvider.get(), (UploadProvider) this.uploadProvider.get(), (SupportUiStorage) this.supportUiStorageProvider.get(), (ExecutorService) this.executorProvider.get(), (Executor) this.mainThreadExecutorProvider.get(), (AuthenticationProvider) this.authProvider.get(), (SupportBlipsProvider) this.blipsProvider.get(), this.mediaResultUtilityProvider.get(), this.resolveUriProvider.get());
    }
}
