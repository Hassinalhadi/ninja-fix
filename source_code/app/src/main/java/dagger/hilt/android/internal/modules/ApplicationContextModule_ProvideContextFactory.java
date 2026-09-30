package dagger.hilt.android.internal.modules;

import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class ApplicationContextModule_ProvideContextFactory implements b {
    private final ApplicationContextModule module;

    private ApplicationContextModule_ProvideContextFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideContextFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideContextFactory(applicationContextModule);
    }

    public static Context provideContext(ApplicationContextModule applicationContextModule) {
        Context provideContext = applicationContextModule.provideContext();
        AbstractC2763s0.delta(provideContext);
        return provideContext;
    }

    @Override // Kd.a
    public Context get() {
        return provideContext(this.module);
    }
}
