package com.checkout.components.card.di.component;

import com.checkout.components.card.di.component.ErrorLabelViewModelSubComponent;

/* loaded from: classes3.dex */
public final class k implements ErrorLabelViewModelSubComponent.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final j f4097a;

    public k(j jVar) {
        this.f4097a = jVar;
    }

    @Override // com.checkout.components.card.di.component.ErrorLabelViewModelSubComponent.Builder
    public final ErrorLabelViewModelSubComponent build() {
        return new l(this.f4097a);
    }
}
