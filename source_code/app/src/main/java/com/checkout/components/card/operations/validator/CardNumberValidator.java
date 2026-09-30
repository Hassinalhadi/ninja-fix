package com.checkout.components.card.operations.validator;

import com.checkout.components.card.R;
import com.checkout.components.card.model.CardNumberValidationRequest;
import com.checkout.components.card.operations.validator.contract.Checker;
import com.checkout.components.card.operations.validator.contract.Validator;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.error.ValidationError;
import com.clevertap.android.sdk.db.Column;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/card/operations/validator/CardNumberValidator;", "Lcom/checkout/components/card/operations/validator/contract/Validator;", "Lcom/checkout/components/card/model/CardNumberValidationRequest;", "Lcom/checkout/components/ui/model/CardScheme;", "Lcom/checkout/components/card/operations/validator/contract/Checker;", "", "checker", "Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "supportedSchemesRepository", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "<init>", "(Lcom/checkout/components/card/operations/validator/contract/Checker;Lcom/checkout/components/ui/data/SupportedSchemesRepository;Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", Column.DATA, "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate", "(Lcom/checkout/components/card/model/CardNumberValidationRequest;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardNumberValidator implements Validator<CardNumberValidationRequest, CardScheme> {
    public static final int $stable = ResourceProvider.$stable | SupportedSchemesRepository.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final Checker f4369a;

    /* renamed from: b, reason: collision with root package name */
    private final SupportedSchemesRepository f4370b;

    /* renamed from: c, reason: collision with root package name */
    private final ResourceProvider f4371c;

    public CardNumberValidator(@NotNull Checker<String> checker, @NotNull SupportedSchemesRepository supportedSchemesRepository, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(checker, "checker");
        Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.f4369a = checker;
        this.f4370b = supportedSchemesRepository;
        this.f4371c = resourceProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0034, code lost:
    
        if (r1 == null) goto L12;
     */
    @Override // com.checkout.components.card.operations.validator.contract.Validator
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ValidationResult<CardScheme> validate(@NotNull CardNumberValidationRequest data) {
        CardScheme metadataScheme;
        Intrinsics.echo(data, "data");
        String foxtrot = new Regex("\\s").foxtrot(data.getCardNumber(), "");
        if (foxtrot.length() == 0) {
            metadataScheme = CardScheme.UNKNOWN;
        } else {
            metadataScheme = data.getMetadataScheme();
            if (metadataScheme != null) {
                if (!this.f4370b.items().contains(metadataScheme)) {
                    metadataScheme = null;
                }
            }
            metadataScheme = data.getMetadataSchemeLocal();
            if (metadataScheme == null || !this.f4370b.items().contains(metadataScheme)) {
                metadataScheme = null;
            }
            if (metadataScheme == null && (metadataScheme = data.getMetadataScheme()) == null && (metadataScheme = data.getMetadataSchemeLocal()) == null) {
                metadataScheme = CardScheme.INSTANCE.detectScheme(foxtrot);
            }
        }
        boolean z2 = true;
        boolean z10 = this.f4370b.items().isEmpty() || !this.f4370b.items().contains(metadataScheme);
        try {
            if (data.isValidatePartialCardNumber()) {
                if (z10) {
                    metadataScheme = CardScheme.UNKNOWN;
                }
                return new ValidationResult.Success(metadataScheme);
            }
            if (z10) {
                return new ValidationResult.Failure(new ValidationError(ValidationError.CARD_NOT_SUPPORTED, CommonExtensionsKt.prepareCardSchemeNotSupportedMessage(metadataScheme, this.f4371c)));
            }
            if (this.f4369a.check(foxtrot)) {
                List<Integer> lengths = metadataScheme.getLengths();
                if (lengths == null) {
                    z2 = false;
                }
                if (!z2 || !lengths.isEmpty()) {
                    Iterator<T> it = lengths.iterator();
                    while (it.hasNext()) {
                        if (((Number) it.next()).intValue() == foxtrot.length()) {
                            return new ValidationResult.Success(metadataScheme);
                        }
                    }
                }
            }
            return new ValidationResult.Failure(new ValidationError(ValidationError.INVALID_CARD_NUMBER, this.f4371c.getString(R.string.cko_card_number_invalid)));
        } catch (ValidationError e) {
            return new ValidationResult.Failure(e);
        }
    }
}
