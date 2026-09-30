package com.checkout.components.card;

import kotlin.jvm.functions.Function0;

/* renamed from: com.checkout.components.card.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0902r extends kotlin.jvm.internal.i implements Function0 {
    public C0902r(Object obj) {
        super(0, 0, CardComponent.class, obj, "getCurrentCardMetadata", "getCurrentCardMetadata()Lcom/checkout/components/interfaces/model/CardMetadata;");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((CardComponent) this.receiver).getCurrentCardMetadata();
    }
}
