package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes.dex */
public final class ProviderModule_ProvideZendeskLocaleConverterFactory implements b {
    private final ProviderModule module;

    public ProviderModule_ProvideZendeskLocaleConverterFactory(ProviderModule providerModule) {
        this.module = providerModule;
    }

    public static ProviderModule_ProvideZendeskLocaleConverterFactory create(ProviderModule providerModule) {
        return new ProviderModule_ProvideZendeskLocaleConverterFactory(providerModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ProviderModule providerModule) {
        ZendeskLocaleConverter provideZendeskLocaleConverter = providerModule.provideZendeskLocaleConverter();
        AbstractC2763s0.delta(provideZendeskLocaleConverter);
        return provideZendeskLocaleConverter;
    }

    @Override // Kd.a
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
