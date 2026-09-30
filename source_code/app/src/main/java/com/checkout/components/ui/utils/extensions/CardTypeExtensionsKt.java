package com.checkout.components.ui.utils.extensions;

import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"buildNotSupportedErrorMessage", "", "Lcom/checkout/components/interfaces/model/CardTypeName;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardTypeExtensionsKt {
    @NotNull
    public static final String buildNotSupportedErrorMessage(@NotNull CardTypeName cardTypeName, @NotNull ResourceProvider resourceProvider) {
        String string;
        Intrinsics.echo(cardTypeName, "<this>");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        if (Intrinsics.areEqual(cardTypeName, CardTypeName.Charge.INSTANCE)) {
            string = resourceProvider.getString(R.string.cko_card_type_charge);
        } else if (Intrinsics.areEqual(cardTypeName, CardTypeName.Credit.INSTANCE)) {
            string = resourceProvider.getString(R.string.cko_card_type_credit);
        } else if (Intrinsics.areEqual(cardTypeName, CardTypeName.Debit.INSTANCE)) {
            string = resourceProvider.getString(R.string.cko_card_type_debit);
        } else if (Intrinsics.areEqual(cardTypeName, CardTypeName.DeferredDebit.INSTANCE)) {
            string = resourceProvider.getString(R.string.cko_card_type_deferred_debit);
        } else if (Intrinsics.areEqual(cardTypeName, CardTypeName.Prepaid.INSTANCE)) {
            string = resourceProvider.getString(R.string.cko_card_type_prepaid);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return resourceProvider.getString(R.string.cko_card_type_not_supported, string);
    }
}
