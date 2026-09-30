package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.ApplicationConfiguration;

/* loaded from: classes.dex */
public final class SupportSdkModule_ProvidesZendeskUrlFactory implements b {
    private final a applicationConfigurationProvider;
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesZendeskUrlFactory(SupportSdkModule supportSdkModule, a aVar) {
        this.module = supportSdkModule;
        this.applicationConfigurationProvider = aVar;
    }

    public static SupportSdkModule_ProvidesZendeskUrlFactory create(SupportSdkModule supportSdkModule, a aVar) {
        return new SupportSdkModule_ProvidesZendeskUrlFactory(supportSdkModule, aVar);
    }

    public static String providesZendeskUrl(SupportSdkModule supportSdkModule, ApplicationConfiguration applicationConfiguration) {
        String providesZendeskUrl = supportSdkModule.providesZendeskUrl(applicationConfiguration);
        AbstractC2763s0.delta(providesZendeskUrl);
        return providesZendeskUrl;
    }

    @Override // Kd.a
    public String get() {
        return providesZendeskUrl(this.module, (ApplicationConfiguration) this.applicationConfigurationProvider.get());
    }
}
