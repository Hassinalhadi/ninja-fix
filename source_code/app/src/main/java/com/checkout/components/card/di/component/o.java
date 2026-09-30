package com.checkout.components.card.di.component;

import com.checkout.components.card.di.component.PayButtonViewModelSubComponent;

/* loaded from: classes3.dex */
public final class o implements PayButtonViewModelSubComponent.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final j f4101a;

    public o(j jVar) {
        this.f4101a = jVar;
    }

    @Override // com.checkout.components.card.di.component.PayButtonViewModelSubComponent.Builder
    public final PayButtonViewModelSubComponent build() {
        return new p(this.f4101a);
    }
}
