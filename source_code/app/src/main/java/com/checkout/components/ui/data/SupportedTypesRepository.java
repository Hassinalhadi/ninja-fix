package com.checkout.components.ui.data;

import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.ComponentName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/ui/data/SupportedTypesRepository;", "Lcom/checkout/components/ui/data/SupportedItemsRepository;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "cardSupportedItems", "", "rememberMeSupportedItems", "getComponentName", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SupportedTypesRepository extends SupportedItemsRepository<CardTypeName> {
    public static final int $stable = 8;

    public /* synthetic */ SupportedTypesRepository(List list, List list2, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? CardTypeName.INSTANCE.getEntries() : list, (i4 & 2) != 0 ? CardTypeName.INSTANCE.getEntries() : list2, function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedTypesRepository(@NotNull List<? extends CardTypeName> cardSupportedItems, @NotNull List<? extends CardTypeName> rememberMeSupportedItems, @NotNull Function0<? extends ComponentName> getComponentName) {
        super(cardSupportedItems, rememberMeSupportedItems, getComponentName);
        Intrinsics.echo(cardSupportedItems, "cardSupportedItems");
        Intrinsics.echo(rememberMeSupportedItems, "rememberMeSupportedItems");
        Intrinsics.echo(getComponentName, "getComponentName");
    }
}
