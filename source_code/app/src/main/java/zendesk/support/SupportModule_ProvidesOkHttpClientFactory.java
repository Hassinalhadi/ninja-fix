package zendesk.support;

import dagger.internal.b;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportModule_ProvidesOkHttpClientFactory implements b {
    private final SupportModule module;

    public SupportModule_ProvidesOkHttpClientFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesOkHttpClientFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesOkHttpClientFactory(supportModule);
    }

    public static OkHttpClient providesOkHttpClient(SupportModule supportModule) {
        OkHttpClient providesOkHttpClient = supportModule.providesOkHttpClient();
        AbstractC2763s0.delta(providesOkHttpClient);
        return providesOkHttpClient;
    }

    @Override // Kd.a
    public OkHttpClient get() {
        return providesOkHttpClient(this.module);
    }
}
