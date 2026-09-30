package com.checkout.components.address;

import com.checkout.address.ui.edit.AddressEditActivity;
import com.checkout.components.interfaces.model.contact.ContactData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.address.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0862c extends kotlin.jvm.internal.i implements Function1 {
    public C0862c(AddressEditActivity addressEditActivity) {
        super(1, 0, AddressEditActivity.class, addressEditActivity, "setResultAndFinish", "setResultAndFinish(Lcom/checkout/components/interfaces/model/contact/ContactData;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AddressEditActivity.access$setResultAndFinish((AddressEditActivity) this.receiver, (ContactData) obj);
        return Unit.INSTANCE;
    }
}
