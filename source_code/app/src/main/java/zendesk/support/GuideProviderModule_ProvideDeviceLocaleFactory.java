package zendesk.support;

import dagger.internal.b;
import java.util.Locale;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideDeviceLocaleFactory implements b {
    private final GuideProviderModule module;

    public GuideProviderModule_ProvideDeviceLocaleFactory(GuideProviderModule guideProviderModule) {
        this.module = guideProviderModule;
    }

    public static GuideProviderModule_ProvideDeviceLocaleFactory create(GuideProviderModule guideProviderModule) {
        return new GuideProviderModule_ProvideDeviceLocaleFactory(guideProviderModule);
    }

    public static Locale provideDeviceLocale(GuideProviderModule guideProviderModule) {
        Locale provideDeviceLocale = guideProviderModule.provideDeviceLocale();
        AbstractC2763s0.delta(provideDeviceLocale);
        return provideDeviceLocale;
    }

    @Override // Kd.a
    public Locale get() {
        return provideDeviceLocale(this.module);
    }
}
