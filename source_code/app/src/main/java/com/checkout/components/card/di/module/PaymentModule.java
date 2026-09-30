package com.checkout.components.card.di.module;

import com.checkout.components.card.ui.manager.PaymentFormStateManager;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.model.CardholderNamePosition;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.L;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/card/di/module/PaymentModule;", "", "<init>", "()V", "Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "supportedSchemesRepository", "Lcom/checkout/components/ui/data/DisplayCvvRepository;", "displayCvvRepository", "Lyf/L;", "Lcom/checkout/components/interfaces/model/PaymentState;", "paymentStatusFlow", "Lcom/checkout/components/interfaces/component/CardConfiguration;", "cardConfiguration", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "(Lcom/checkout/components/ui/data/SupportedSchemesRepository;Lcom/checkout/components/ui/data/DisplayCvvRepository;Lyf/L;Lcom/checkout/components/interfaces/component/CardConfiguration;)Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentModule {
    public static final int $stable = 0;

    @NotNull
    public final PaymentStateManager paymentStateManager(@NotNull SupportedSchemesRepository supportedSchemesRepository, @NotNull DisplayCvvRepository displayCvvRepository, @NotNull L paymentStatusFlow, @Nullable CardConfiguration cardConfiguration) {
        CardholderNamePosition cardholderNamePosition;
        boolean z2;
        Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
        Intrinsics.echo(displayCvvRepository, "displayCvvRepository");
        Intrinsics.echo(paymentStatusFlow, "paymentStatusFlow");
        if (cardConfiguration != null) {
            cardholderNamePosition = cardConfiguration.getDisplayCardholderName();
        } else {
            cardholderNamePosition = null;
        }
        if (cardholderNamePosition == CardholderNamePosition.HIDDEN) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new PaymentFormStateManager(z2, displayCvvRepository, supportedSchemesRepository, paymentStatusFlow);
    }
}
