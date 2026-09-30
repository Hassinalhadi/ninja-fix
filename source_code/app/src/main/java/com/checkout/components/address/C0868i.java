package com.checkout.components.address;

import com.checkout.address.ui.edit.AddressEditViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.checkout.components.address.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0868i extends kotlin.jvm.internal.i implements Xd.l {
    public C0868i(AddressEditViewModel addressEditViewModel) {
        super(2, 0, AddressEditViewModel.class, addressEditViewModel, "onFieldValueChange", "onFieldValueChange(ILjava/lang/String;)V");
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String p12 = (String) obj2;
        Intrinsics.echo(p12, "p1");
        ((AddressEditViewModel) this.receiver).onFieldValueChange(intValue, p12);
        return Unit.INSTANCE;
    }
}
