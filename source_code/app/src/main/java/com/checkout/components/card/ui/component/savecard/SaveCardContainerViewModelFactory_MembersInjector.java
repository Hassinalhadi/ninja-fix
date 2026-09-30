package com.checkout.components.card.ui.component.savecard;

import Kd.a;
import dagger.internal.d;
import v9.InterfaceC3179a;

/* loaded from: classes3.dex */
public final class SaveCardContainerViewModelFactory_MembersInjector implements InterfaceC3179a {

    /* renamed from: a, reason: collision with root package name */
    private final d f4555a;

    public SaveCardContainerViewModelFactory_MembersInjector(d dVar) {
        this.f4555a = dVar;
    }

    public static InterfaceC3179a create(d dVar) {
        return new SaveCardContainerViewModelFactory_MembersInjector(dVar);
    }

    public static void injectSubComponentProvider(SaveCardContainerViewModelFactory saveCardContainerViewModelFactory, a aVar) {
        saveCardContainerViewModelFactory.subComponentProvider = aVar;
    }

    public final void injectMembers(Object obj) {
        ((SaveCardContainerViewModelFactory) obj).subComponentProvider = this.f4555a;
    }

    public final void injectMembers(SaveCardContainerViewModelFactory saveCardContainerViewModelFactory) {
        saveCardContainerViewModelFactory.subComponentProvider = this.f4555a;
    }
}
