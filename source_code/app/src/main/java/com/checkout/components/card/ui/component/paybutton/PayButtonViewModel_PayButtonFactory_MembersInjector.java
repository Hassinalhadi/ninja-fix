package com.checkout.components.card.ui.component.paybutton;

import Kd.a;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import dagger.internal.d;
import v9.InterfaceC3179a;

/* loaded from: classes3.dex */
public final class PayButtonViewModel_PayButtonFactory_MembersInjector implements InterfaceC3179a {

    /* renamed from: a, reason: collision with root package name */
    private final d f4542a;

    public PayButtonViewModel_PayButtonFactory_MembersInjector(d dVar) {
        this.f4542a = dVar;
    }

    public static InterfaceC3179a create(d dVar) {
        return new PayButtonViewModel_PayButtonFactory_MembersInjector(dVar);
    }

    public static void injectSubComponentProvider(PayButtonViewModel.PayButtonFactory payButtonFactory, a aVar) {
        payButtonFactory.subComponentProvider = aVar;
    }

    public final void injectMembers(Object obj) {
        ((PayButtonViewModel.PayButtonFactory) obj).subComponentProvider = this.f4542a;
    }

    public final void injectMembers(PayButtonViewModel.PayButtonFactory payButtonFactory) {
        payButtonFactory.subComponentProvider = this.f4542a;
    }
}
