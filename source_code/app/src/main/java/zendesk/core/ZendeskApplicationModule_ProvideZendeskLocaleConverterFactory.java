package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory implements b {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(zendeskApplicationModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ZendeskApplicationModule zendeskApplicationModule) {
        ZendeskLocaleConverter provideZendeskLocaleConverter = zendeskApplicationModule.provideZendeskLocaleConverter();
        AbstractC2763s0.delta(provideZendeskLocaleConverter);
        return provideZendeskLocaleConverter;
    }

    @Override // Kd.a
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
