package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetSessionStorageFactory implements b {
    private final CoreModule module;

    public CoreModule_GetSessionStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSessionStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetSessionStorageFactory(coreModule);
    }

    public static SessionStorage getSessionStorage(CoreModule coreModule) {
        SessionStorage sessionStorage = coreModule.getSessionStorage();
        AbstractC2763s0.delta(sessionStorage);
        return sessionStorage;
    }

    @Override // Kd.a
    public SessionStorage get() {
        return getSessionStorage(this.module);
    }
}
