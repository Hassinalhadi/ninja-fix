package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportEngineModule_RequestCreatorFactory implements b {
    private final SupportEngineModule module;
    private final a requestProvider;
    private final a uploadProvider;

    public SupportEngineModule_RequestCreatorFactory(SupportEngineModule supportEngineModule, a aVar, a aVar2) {
        this.module = supportEngineModule;
        this.requestProvider = aVar;
        this.uploadProvider = aVar2;
    }

    public static SupportEngineModule_RequestCreatorFactory create(SupportEngineModule supportEngineModule, a aVar, a aVar2) {
        return new SupportEngineModule_RequestCreatorFactory(supportEngineModule, aVar, aVar2);
    }

    public static RequestCreator requestCreator(SupportEngineModule supportEngineModule, RequestProvider requestProvider, UploadProvider uploadProvider) {
        RequestCreator requestCreator = supportEngineModule.requestCreator(requestProvider, uploadProvider);
        AbstractC2763s0.delta(requestCreator);
        return requestCreator;
    }

    @Override // Kd.a
    public RequestCreator get() {
        return requestCreator(this.module, (RequestProvider) this.requestProvider.get(), (UploadProvider) this.uploadProvider.get());
    }
}
