package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportEngineModule_EmailValidatorFactory implements b {
    private final SupportEngineModule module;

    public SupportEngineModule_EmailValidatorFactory(SupportEngineModule supportEngineModule) {
        this.module = supportEngineModule;
    }

    public static SupportEngineModule_EmailValidatorFactory create(SupportEngineModule supportEngineModule) {
        return new SupportEngineModule_EmailValidatorFactory(supportEngineModule);
    }

    public static EmailValidator emailValidator(SupportEngineModule supportEngineModule) {
        EmailValidator emailValidator = supportEngineModule.emailValidator();
        AbstractC2763s0.delta(emailValidator);
        return emailValidator;
    }

    @Override // Kd.a
    public EmailValidator get() {
        return emailValidator(this.module);
    }
}
