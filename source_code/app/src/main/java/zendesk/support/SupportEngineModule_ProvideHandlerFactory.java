package zendesk.support;

import android.os.Handler;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportEngineModule_ProvideHandlerFactory implements b {
    private final SupportEngineModule module;

    public SupportEngineModule_ProvideHandlerFactory(SupportEngineModule supportEngineModule) {
        this.module = supportEngineModule;
    }

    public static SupportEngineModule_ProvideHandlerFactory create(SupportEngineModule supportEngineModule) {
        return new SupportEngineModule_ProvideHandlerFactory(supportEngineModule);
    }

    public static Handler provideHandler(SupportEngineModule supportEngineModule) {
        Handler provideHandler = supportEngineModule.provideHandler();
        AbstractC2763s0.delta(provideHandler);
        return provideHandler;
    }

    @Override // Kd.a
    public Handler get() {
        return provideHandler(this.module);
    }
}
