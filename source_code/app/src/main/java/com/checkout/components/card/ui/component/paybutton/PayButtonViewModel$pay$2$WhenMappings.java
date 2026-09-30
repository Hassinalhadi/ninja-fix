package com.checkout.components.card.ui.component.paybutton;

import com.checkout.components.interfaces.component.PaymentButtonAction;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class PayButtonViewModel$pay$2$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PaymentButtonAction.values().length];
        try {
            iArr[PaymentButtonAction.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentButtonAction.TOKENIZE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
