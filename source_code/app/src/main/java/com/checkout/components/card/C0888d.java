package com.checkout.components.card;

import com.checkout.address.AddressComponent;
import com.checkout.components.card.ui.component.address.AddressViewModel;
import com.checkout.components.card.utils.extensions.CommonExtensionsKt;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.ContactData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import yf.InterfaceC3440j;
import yf.at;

/* renamed from: com.checkout.components.card.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0888d implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddressViewModel f4009a;

    public C0888d(AddressViewModel addressViewModel) {
        this.f4009a = addressViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        AddressConfiguration addressConfiguration;
        List<AddressField> fields;
        boolean z2;
        if (((Boolean) obj).booleanValue() && !((Boolean) this.f4009a.isCheckBoxChecked().getValue()).booleanValue() && (addressConfiguration = this.f4009a.getAddressConfiguration()) != null && (fields = addressConfiguration.getFields()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : fields) {
                if (!((AddressField) obj2).getIsOptional()) {
                    arrayList.add(obj2);
                }
            }
            AddressViewModel addressViewModel = this.f4009a;
            boolean z10 = false;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    AddressField addressField = (AddressField) obj3;
                    ContactData contactData = (ContactData) ((yf.N) addressViewModel.getPaymentStateManager().getContactData()).getValue();
                    if (contactData != null) {
                        z2 = CommonExtensionsKt.isFieldInvalid(contactData, addressField.getName());
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        z10 = true;
                        break;
                    }
                }
            }
            AddressViewModel addressViewModel2 = this.f4009a;
            if (z10) {
                AddressComponent addressComponent = addressViewModel2.getAddressComponent();
                if (addressComponent != null) {
                    addressComponent.showError(addressViewModel2.getResourceProvider().getString(com.checkout.components.ui.R.string.cko_form_required));
                }
            } else {
                AddressComponent addressComponent2 = addressViewModel2.getAddressComponent();
                if (addressComponent2 != null) {
                    addressComponent2.hideError();
                }
            }
            at isAddressValid = addressViewModel2.getPaymentStateManager().getIsAddressValid();
            Boolean valueOf = Boolean.valueOf(!z10);
            yf.N n5 = (yf.N) isAddressValid;
            n5.getClass();
            n5.juliet(null, valueOf);
        }
        return Unit.INSTANCE;
    }
}
