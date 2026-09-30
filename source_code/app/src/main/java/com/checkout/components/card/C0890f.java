package com.checkout.components.card;

import com.checkout.address.AddressComponent;
import com.checkout.components.card.ui.component.address.AddressViewModel;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.model.contact.ContactData;
import kotlin.Unit;
import yf.InterfaceC3440j;
import yf.at;

/* renamed from: com.checkout.components.card.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0890f implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddressViewModel f4192a;

    public C0890f(AddressViewModel addressViewModel) {
        this.f4192a = addressViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        ContactData contactData;
        AddressConfiguration addressConfiguration;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        at contactData2 = this.f4192a.getPaymentStateManager().getContactData();
        if (booleanValue && (addressConfiguration = this.f4192a.getAddressConfiguration()) != null) {
            contactData = addressConfiguration.getData();
        } else {
            contactData = null;
        }
        ((yf.N) contactData2).india(contactData);
        if (booleanValue) {
            at isAddressValid = this.f4192a.getPaymentStateManager().getIsAddressValid();
            Boolean bool = Boolean.TRUE;
            yf.N n5 = (yf.N) isAddressValid;
            n5.getClass();
            n5.juliet(null, bool);
            AddressComponent addressComponent = this.f4192a.getAddressComponent();
            if (addressComponent != null) {
                addressComponent.hideError();
            }
        }
        return Unit.INSTANCE;
    }
}
