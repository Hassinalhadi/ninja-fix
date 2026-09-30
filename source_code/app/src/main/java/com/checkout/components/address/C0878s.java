package com.checkout.components.address;

import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.Country;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* renamed from: com.checkout.components.address.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0878s implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddressEditViewModel f3908a;

    public C0878s(AddressEditViewModel addressEditViewModel) {
        this.f3908a = addressEditViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        String a6;
        AddressEditViewModel addressEditViewModel = this.f3908a;
        AddressField.Companion.Name name = AddressField.Companion.Name.Country;
        a6 = addressEditViewModel.a((Country) obj);
        addressEditViewModel.a(name, a6);
        return Unit.INSTANCE;
    }
}
