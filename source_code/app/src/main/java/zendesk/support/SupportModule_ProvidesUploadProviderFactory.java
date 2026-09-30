package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportModule_ProvidesUploadProviderFactory implements b {
    private final SupportModule module;

    public SupportModule_ProvidesUploadProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesUploadProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesUploadProviderFactory(supportModule);
    }

    public static UploadProvider providesUploadProvider(SupportModule supportModule) {
        UploadProvider providesUploadProvider = supportModule.providesUploadProvider();
        AbstractC2763s0.delta(providesUploadProvider);
        return providesUploadProvider;
    }

    @Override // Kd.a
    public UploadProvider get() {
        return providesUploadProvider(this.module);
    }
}
