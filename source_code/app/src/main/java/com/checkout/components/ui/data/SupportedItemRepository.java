package com.checkout.components.ui.data;

import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.clevertap.android.sdk.leanplum.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\fR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/checkout/components/ui/data/SupportedItemRepository;", "T", "", "cardSupportedItem", "rememberMeSupportedItem", "getComponentName", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Object;", Constants.IAP_ITEM_PARAM, "()Ljava/lang/Object;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SupportedItemRepository<T> {
    public static final int $stable = 0;
    private final T cardSupportedItem;

    @NotNull
    private final Function0<ComponentName> getComponentName;
    private final T rememberMeSupportedItem;

    /* JADX WARN: Multi-variable type inference failed */
    public SupportedItemRepository(T t5, T t10, @NotNull Function0<? extends ComponentName> getComponentName) {
        Intrinsics.echo(getComponentName, "getComponentName");
        this.cardSupportedItem = t5;
        this.rememberMeSupportedItem = t10;
        this.getComponentName = getComponentName;
    }

    @Nullable
    public final T item() {
        ComponentName invoke = this.getComponentName.invoke();
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        if (Intrinsics.areEqual(invoke, companion.getCard())) {
            return this.cardSupportedItem;
        }
        if (Intrinsics.areEqual(invoke, companion.getRememberMe())) {
            return this.rememberMeSupportedItem;
        }
        return null;
    }
}
