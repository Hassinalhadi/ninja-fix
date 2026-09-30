package com.checkout.components.card.ui.component.address;

import Kd.a;
import dagger.internal.d;
import v9.InterfaceC3179a;

/* loaded from: classes3.dex */
public final class AddressViewModelFactory_MembersInjector implements InterfaceC3179a {

    /* renamed from: a, reason: collision with root package name */
    private final d f4414a;

    public AddressViewModelFactory_MembersInjector(d dVar) {
        this.f4414a = dVar;
    }

    public static InterfaceC3179a create(d dVar) {
        return new AddressViewModelFactory_MembersInjector(dVar);
    }

    public static void injectSubComponentProvider(AddressViewModelFactory addressViewModelFactory, a aVar) {
        addressViewModelFactory.subComponentProvider = aVar;
    }

    public final void injectMembers(Object obj) {
        ((AddressViewModelFactory) obj).subComponentProvider = this.f4414a;
    }

    public final void injectMembers(AddressViewModelFactory addressViewModelFactory) {
        addressViewModelFactory.subComponentProvider = this.f4414a;
    }
}
