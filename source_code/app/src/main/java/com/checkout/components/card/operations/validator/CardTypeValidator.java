package com.checkout.components.card.operations.validator;

import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.data.SupportedTypesRepository;
import com.checkout.components.ui.utils.extensions.CardTypeExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.N;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/card/operations/validator/CardTypeValidator;", "", "Lcom/checkout/components/ui/data/SupportedTypesRepository;", "supportedTypesRepository", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "<init>", "(Lcom/checkout/components/ui/data/SupportedTypesRepository;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "Lcom/checkout/components/interfaces/model/CardMetadata;", "metadata", "", "validate$card_standardRelease", "(Lcom/checkout/components/interfaces/model/CardMetadata;)V", "validate", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardTypeValidator {
    public static final int $stable = ResourceProvider.$stable | SupportedTypesRepository.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final SupportedTypesRepository f4372a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentStateManager f4373b;

    /* renamed from: c, reason: collision with root package name */
    private final ResourceProvider f4374c;

    public CardTypeValidator(@NotNull SupportedTypesRepository supportedTypesRepository, @NotNull PaymentStateManager paymentStateManager, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(supportedTypesRepository, "supportedTypesRepository");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.f4372a = supportedTypesRepository;
        this.f4373b = paymentStateManager;
        this.f4374c = resourceProvider;
    }

    public final void validate$card_standardRelease(@NotNull CardMetadata metadata) {
        Intrinsics.echo(metadata, "metadata");
        CardTypeName fromString = CardTypeName.INSTANCE.fromString(metadata.getCardType());
        if (fromString != null && !this.f4372a.items().contains(fromString)) {
            ((N) this.f4373b.getMerchantCardNotSupportedErrorMessage()).india(CardTypeExtensionsKt.buildNotSupportedErrorMessage(fromString, this.f4374c));
        }
    }
}
