package com.checkout.components.card.ui.component.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes3.dex */
public final /* synthetic */ class InputComponentViewKt$InputComponent$1$1 extends i implements Function1<Boolean, Unit> {
    public InputComponentViewKt$InputComponent$1$1(Object obj) {
        super(1, 0, InputComponentViewModel.class, obj, "onFocusChanged", "onFocusChanged$card_standardRelease(Z)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((InputComponentViewModel) this.receiver).onFocusChanged$card_standardRelease(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z2) {
        ((InputComponentViewModel) this.receiver).onFocusChanged$card_standardRelease(z2);
    }
}
