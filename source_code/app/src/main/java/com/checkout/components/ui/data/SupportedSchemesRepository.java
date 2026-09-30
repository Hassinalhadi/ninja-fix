package com.checkout.components.ui.data;

import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.ui.model.CardScheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "Lcom/checkout/components/ui/data/SupportedItemsRepository;", "Lcom/checkout/components/ui/model/CardScheme;", "cardSupportedSchemes", "", "rememberMeSupportedSchemes", "getComponentName", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SupportedSchemesRepository extends SupportedItemsRepository<CardScheme> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedSchemesRepository(@NotNull List<? extends CardScheme> cardSupportedSchemes, @NotNull List<? extends CardScheme> rememberMeSupportedSchemes, @NotNull Function0<? extends ComponentName> getComponentName) {
        super(cardSupportedSchemes, rememberMeSupportedSchemes, getComponentName);
        Intrinsics.echo(cardSupportedSchemes, "cardSupportedSchemes");
        Intrinsics.echo(rememberMeSupportedSchemes, "rememberMeSupportedSchemes");
        Intrinsics.echo(getComponentName, "getComponentName");
    }
}
