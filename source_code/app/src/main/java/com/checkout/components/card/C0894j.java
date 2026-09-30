package com.checkout.components.card;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.checkout.components.card.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0894j extends kotlin.jvm.internal.i implements Function0 {
    public C0894j(CardComponent cardComponent) {
        super(0, 0, CardComponent.class, cardComponent, "triggerOnChange", "triggerOnChange$card_standardRelease()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((CardComponent) this.receiver).triggerOnChange$card_standardRelease();
        return Unit.INSTANCE;
    }
}
