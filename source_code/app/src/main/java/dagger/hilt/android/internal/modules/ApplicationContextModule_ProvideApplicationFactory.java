package dagger.hilt.android.internal.modules;

import android.app.Application;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class ApplicationContextModule_ProvideApplicationFactory implements b {
    private final ApplicationContextModule module;

    private ApplicationContextModule_ProvideApplicationFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideApplicationFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideApplicationFactory(applicationContextModule);
    }

    public static Application provideApplication(ApplicationContextModule applicationContextModule) {
        Application provideApplication = applicationContextModule.provideApplication();
        AbstractC2763s0.delta(provideApplication);
        return provideApplication;
    }

    @Override // Kd.a
    public Application get() {
        return provideApplication(this.module);
    }
}
