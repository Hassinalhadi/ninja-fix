package com.checkout.components.card.di.module;

import com.checkout.components.card.operations.usecase.DetermineSchemeChoiceUiVisibilityUseCase;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.style.base.ImageStyle;
import dagger.internal.b;
import dagger.internal.d;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ValidationModule_ProvideSchemeChoiceUiVisibilityUseCaseFactory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ValidationModule f4187a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4188b;

    public ValidationModule_ProvideSchemeChoiceUiVisibilityUseCaseFactory(ValidationModule validationModule, d dVar) {
        this.f4187a = validationModule;
        this.f4188b = dVar;
    }

    public static ValidationModule_ProvideSchemeChoiceUiVisibilityUseCaseFactory create(ValidationModule validationModule, d dVar) {
        return new ValidationModule_ProvideSchemeChoiceUiVisibilityUseCaseFactory(validationModule, dVar);
    }

    public static UseCase<CardMetadata, Map<CardScheme, ImageStyle>> provideSchemeChoiceUiVisibilityUseCase(ValidationModule validationModule, SupportedSchemesRepository supportedSchemesRepository) {
        validationModule.getClass();
        Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
        return new DetermineSchemeChoiceUiVisibilityUseCase(supportedSchemesRepository);
    }

    @Override // Kd.a
    public final UseCase<CardMetadata, Map<CardScheme, ImageStyle>> get() {
        return provideSchemeChoiceUiVisibilityUseCase(this.f4187a, (SupportedSchemesRepository) this.f4188b.get());
    }
}
