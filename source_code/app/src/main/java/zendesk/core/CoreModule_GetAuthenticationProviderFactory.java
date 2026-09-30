package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_GetAuthenticationProviderFactory implements b {
    private final CoreModule module;

    public CoreModule_GetAuthenticationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetAuthenticationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetAuthenticationProviderFactory(coreModule);
    }

    public static AuthenticationProvider getAuthenticationProvider(CoreModule coreModule) {
        AuthenticationProvider authenticationProvider = coreModule.getAuthenticationProvider();
        AbstractC2763s0.delta(authenticationProvider);
        return authenticationProvider;
    }

    @Override // Kd.a
    public AuthenticationProvider get() {
        return getAuthenticationProvider(this.module);
    }
}
