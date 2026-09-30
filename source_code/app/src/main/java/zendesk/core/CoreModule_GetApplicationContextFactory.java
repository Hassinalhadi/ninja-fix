package zendesk.core;

import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetApplicationContextFactory implements b {
    private final CoreModule module;

    public CoreModule_GetApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationContextFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationContextFactory(coreModule);
    }

    public static Context getApplicationContext(CoreModule coreModule) {
        Context applicationContext = coreModule.getApplicationContext();
        AbstractC2763s0.delta(applicationContext);
        return applicationContext;
    }

    @Override // Kd.a
    public Context get() {
        return getApplicationContext(this.module);
    }
}
