package com.checkout.components.card.di.module;

import com.checkout.components.card.operations.api.CardValidator;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class ValidationModule_ProvideCardValidatorFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ValidationModule f4181a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4182b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4183c;

    public ValidationModule_ProvideCardValidatorFactory(ValidationModule validationModule, d dVar, d dVar2) {
        this.f4181a = validationModule;
        this.f4182b = dVar;
        this.f4183c = dVar2;
    }

    public static ValidationModule_ProvideCardValidatorFactory create(ValidationModule validationModule, d dVar, d dVar2) {
        return new ValidationModule_ProvideCardValidatorFactory(validationModule, dVar, dVar2);
    }

    public static CardValidator provideCardValidator(ValidationModule validationModule, SupportedSchemesRepository supportedSchemesRepository, ResourceProvider resourceProvider) {
        CardValidator provideCardValidator = validationModule.provideCardValidator(supportedSchemesRepository, resourceProvider);
        AbstractC2763s0.delta(provideCardValidator);
        return provideCardValidator;
    }

    @Override // Kd.a
    public final CardValidator get() {
        CardValidator provideCardValidator = this.f4181a.provideCardValidator((SupportedSchemesRepository) this.f4182b.get(), (ResourceProvider) this.f4183c.get());
        AbstractC2763s0.delta(provideCardValidator);
        return provideCardValidator;
    }
}
