package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideZendeskLocaleConverterFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final GuideProviderModule_ProvideZendeskLocaleConverterFactory INSTANCE = new GuideProviderModule_ProvideZendeskLocaleConverterFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideZendeskLocaleConverterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter() {
        ZendeskLocaleConverter provideZendeskLocaleConverter = GuideProviderModule.provideZendeskLocaleConverter();
        AbstractC2763s0.delta(provideZendeskLocaleConverter);
        return provideZendeskLocaleConverter;
    }

    @Override // Kd.a
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter();
    }
}
