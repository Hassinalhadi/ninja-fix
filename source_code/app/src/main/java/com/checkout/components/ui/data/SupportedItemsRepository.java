package com.checkout.components.ui.data;

import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/checkout/components/ui/data/SupportedItemsRepository;", "T", "", "cardSupportedItems", "", "rememberMeSupportedItems", "getComponentName", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "items", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SupportedItemsRepository<T> {
    public static final int $stable = 8;

    @NotNull
    private final List<T> cardSupportedItems;

    @NotNull
    private final Function0<ComponentName> getComponentName;

    @NotNull
    private final List<T> rememberMeSupportedItems;

    /* JADX WARN: Multi-variable type inference failed */
    public SupportedItemsRepository(@NotNull List<? extends T> cardSupportedItems, @NotNull List<? extends T> rememberMeSupportedItems, @NotNull Function0<? extends ComponentName> getComponentName) {
        Intrinsics.echo(cardSupportedItems, "cardSupportedItems");
        Intrinsics.echo(rememberMeSupportedItems, "rememberMeSupportedItems");
        Intrinsics.echo(getComponentName, "getComponentName");
        this.cardSupportedItems = cardSupportedItems;
        this.rememberMeSupportedItems = rememberMeSupportedItems;
        this.getComponentName = getComponentName;
    }

    @NotNull
    public final List<T> items() {
        ComponentName invoke = this.getComponentName.invoke();
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        if (Intrinsics.areEqual(invoke, companion.getCard())) {
            return this.cardSupportedItems;
        }
        if (Intrinsics.areEqual(invoke, companion.getRememberMe())) {
            return this.rememberMeSupportedItems;
        }
        return CollectionsKt.emptyList();
    }
}
