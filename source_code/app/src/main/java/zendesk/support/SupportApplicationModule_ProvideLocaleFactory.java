package zendesk.support;

import dagger.internal.b;
import java.util.Locale;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportApplicationModule_ProvideLocaleFactory implements b {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideLocaleFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvideLocaleFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvideLocaleFactory(supportApplicationModule);
    }

    public static Locale provideLocale(SupportApplicationModule supportApplicationModule) {
        Locale provideLocale = supportApplicationModule.provideLocale();
        AbstractC2763s0.delta(provideLocale);
        return provideLocale;
    }

    @Override // Kd.a
    public Locale get() {
        return provideLocale(this.module);
    }
}
