package com.checkout.components.address;

import androidx.compose.runtime.ax;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.ui.utils.extensions.Utils;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* renamed from: com.checkout.components.address.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0880u implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddressEditViewModel f3912a;

    public C0880u(AddressEditViewModel addressEditViewModel) {
        this.f3912a = addressEditViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        AddressFieldItem.Phone phone;
        boolean z2;
        Country country = (Country) obj;
        AddressFieldItem addressFieldItem = this.f3912a.getAddressFieldMap$address_standardRelease().get(AddressField.Companion.Name.Phone);
        if (addressFieldItem instanceof AddressFieldItem.Phone) {
            phone = (AddressFieldItem.Phone) addressFieldItem;
        } else {
            phone = null;
        }
        if (phone != null) {
            AddressEditViewModel addressEditViewModel = this.f3912a;
            ax text = phone.getCountryState().getInputFieldState().getText();
            Utils utils = Utils.INSTANCE;
            z2 = addressEditViewModel.e;
            text.setValue(Utils.buildPhoneCountryText$default(utils, country, z2, false, 4, null));
        }
        return Unit.INSTANCE;
    }
}
