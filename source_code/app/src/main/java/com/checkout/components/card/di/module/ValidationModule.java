package com.checkout.components.card.di.module;

import android.content.Context;
import com.checkout.components.card.operations.api.CardValidator;
import com.checkout.components.card.operations.usecase.DetermineSchemeChoiceUiVisibilityUseCase;
import com.checkout.components.card.operations.validator.CardNumberValidator;
import com.checkout.components.card.operations.validator.CardValidatorImpl;
import com.checkout.components.card.operations.validator.CvvValidator;
import com.checkout.components.card.operations.validator.ExpiryDateValidator;
import com.checkout.components.card.operations.validator.LuhnChecker;
import com.checkout.components.card.utils.ResourceProviderImpl;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.style.base.ImageStyle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011H\u0007J*\u0010\u0012\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u000e0\u00132\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/card/di/module/ValidationModule;", "", "<init>", "()V", "provideCardValidator", "Lcom/checkout/components/card/operations/api/CardValidator;", "supportedSchemesRepository", "Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "provideResourceProvider", "context", "Landroid/content/Context;", "translation", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "provideSchemeChoiceUiVisibilityUseCase", "Lcom/checkout/components/interfaces/usecase/UseCase;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "Lcom/checkout/components/ui/model/CardScheme;", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidationModule {
    public static final int $stable = 0;

    @NotNull
    public final CardValidator provideCardValidator(@NotNull SupportedSchemesRepository supportedSchemesRepository, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        return new CardValidatorImpl(new ExpiryDateValidator(resourceProvider), new CvvValidator(resourceProvider), new CardNumberValidator(new LuhnChecker(), supportedSchemesRepository, resourceProvider));
    }

    @NotNull
    public final ResourceProvider provideResourceProvider(@NotNull Context context, @Nullable Map<ComponentTranslationKey, String> translation) {
        Intrinsics.echo(context, "context");
        return new ResourceProviderImpl(context, translation);
    }

    @NotNull
    public final UseCase<CardMetadata, Map<CardScheme, ImageStyle>> provideSchemeChoiceUiVisibilityUseCase(@NotNull SupportedSchemesRepository supportedSchemesRepository) {
        Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
        return new DetermineSchemeChoiceUiVisibilityUseCase(supportedSchemesRepository);
    }
}
