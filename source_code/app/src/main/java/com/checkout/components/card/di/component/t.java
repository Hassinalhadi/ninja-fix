package com.checkout.components.card.di.component;

import com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;

/* loaded from: classes3.dex */
public final class t implements SaveCardContainerViewModelSubComponent {

    /* renamed from: a, reason: collision with root package name */
    public final j f4106a;

    public t(j jVar) {
        this.f4106a = jVar;
    }

    @Override // com.checkout.components.card.di.component.SaveCardContainerViewModelSubComponent
    public final SaveCardContainerViewModel getSaveCardContainerViewModel() {
        j jVar = this.f4106a;
        return new SaveCardContainerViewModel(jVar.f4079i, (PaymentStateManager) jVar.f4045F.get());
    }
}
