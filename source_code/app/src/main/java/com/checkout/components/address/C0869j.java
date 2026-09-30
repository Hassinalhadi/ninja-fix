package com.checkout.components.address;

import com.checkout.address.ui.edit.AddressEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.checkout.components.address.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0869j extends kotlin.jvm.internal.i implements Function0 {
    public C0869j(AddressEditViewModel addressEditViewModel) {
        super(0, 0, AddressEditViewModel.class, addressEditViewModel, "onConfirmButtonClick", "onConfirmButtonClick()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((AddressEditViewModel) this.receiver).onConfirmButtonClick();
        return Unit.INSTANCE;
    }
}
