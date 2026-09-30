package com.checkout.components.card.di.component;

import com.checkout.components.card.di.component.SaveCardContainerViewModelSubComponent;

/* loaded from: classes3.dex */
public final class s implements SaveCardContainerViewModelSubComponent.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final j f4105a;

    public s(j jVar) {
        this.f4105a = jVar;
    }

    @Override // com.checkout.components.card.di.component.SaveCardContainerViewModelSubComponent.Builder
    public final SaveCardContainerViewModelSubComponent build() {
        return new t(this.f4105a);
    }
}
