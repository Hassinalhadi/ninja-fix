package com.checkout.components.ui.data;

import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.DisplayCvvConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/ui/data/DisplayCvvRepository;", "Lcom/checkout/components/ui/data/SupportedItemRepository;", "Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;", "cardDisplayCvvConfiguration", "rememberMeDisplayCvvConfiguration", "getComponentName", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;Lcom/checkout/components/interfaces/model/DisplayCvvConfiguration;Lkotlin/jvm/functions/Function0;)V", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisplayCvvRepository extends SupportedItemRepository<DisplayCvvConfiguration> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayCvvRepository(@NotNull DisplayCvvConfiguration cardDisplayCvvConfiguration, @NotNull DisplayCvvConfiguration rememberMeDisplayCvvConfiguration, @NotNull Function0<? extends ComponentName> getComponentName) {
        super(cardDisplayCvvConfiguration, rememberMeDisplayCvvConfiguration, getComponentName);
        Intrinsics.echo(cardDisplayCvvConfiguration, "cardDisplayCvvConfiguration");
        Intrinsics.echo(rememberMeDisplayCvvConfiguration, "rememberMeDisplayCvvConfiguration");
        Intrinsics.echo(getComponentName, "getComponentName");
    }
}
