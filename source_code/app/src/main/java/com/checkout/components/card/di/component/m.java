package com.checkout.components.card.di.component;

import com.checkout.components.card.di.component.InputComponentViewModelSubComponent;

/* loaded from: classes3.dex */
public final class m implements InputComponentViewModelSubComponent.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final j f4099a;

    public m(j jVar) {
        this.f4099a = jVar;
    }

    @Override // com.checkout.components.card.di.component.InputComponentViewModelSubComponent.Builder
    public final InputComponentViewModelSubComponent build() {
        return new n(this.f4099a);
    }
}
