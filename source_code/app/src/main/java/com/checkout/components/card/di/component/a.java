package com.checkout.components.card.di.component;

import com.checkout.components.card.di.component.AddressViewModelSubComponent;

/* loaded from: classes3.dex */
public final class a implements AddressViewModelSubComponent.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final j f4010a;

    public a(j jVar) {
        this.f4010a = jVar;
    }

    @Override // com.checkout.components.card.di.component.AddressViewModelSubComponent.Builder
    public final AddressViewModelSubComponent build() {
        return new b(this.f4010a);
    }
}
