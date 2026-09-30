package com.checkout.components.card;

import kotlin.jvm.functions.Function0;

/* renamed from: com.checkout.components.card.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0901q extends kotlin.jvm.internal.i implements Function0 {
    public C0901q(Object obj) {
        super(0, 0, CardComponent.class, obj, "isTokenizationInProgress", "isTokenizationInProgress()Z");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(((CardComponent) this.receiver).isTokenizationInProgress());
    }
}
