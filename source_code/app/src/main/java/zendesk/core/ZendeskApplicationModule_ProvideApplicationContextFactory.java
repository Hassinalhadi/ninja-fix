package zendesk.core;

import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideApplicationContextFactory implements b {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationContextFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationContextFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationContextFactory(zendeskApplicationModule);
    }

    public static Context provideApplicationContext(ZendeskApplicationModule zendeskApplicationModule) {
        Context provideApplicationContext = zendeskApplicationModule.provideApplicationContext();
        AbstractC2763s0.delta(provideApplicationContext);
        return provideApplicationContext;
    }

    @Override // Kd.a
    public Context get() {
        return provideApplicationContext(this.module);
    }
}
