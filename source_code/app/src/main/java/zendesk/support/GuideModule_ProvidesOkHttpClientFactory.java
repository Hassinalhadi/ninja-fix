package zendesk.support;

import dagger.internal.b;
import okhttp3.OkHttpClient;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideModule_ProvidesOkHttpClientFactory implements b {
    private final GuideModule module;

    public GuideModule_ProvidesOkHttpClientFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesOkHttpClientFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesOkHttpClientFactory(guideModule);
    }

    public static OkHttpClient providesOkHttpClient(GuideModule guideModule) {
        OkHttpClient providesOkHttpClient = guideModule.providesOkHttpClient();
        AbstractC2763s0.delta(providesOkHttpClient);
        return providesOkHttpClient;
    }

    @Override // Kd.a
    public OkHttpClient get() {
        return providesOkHttpClient(this.module);
    }
}
