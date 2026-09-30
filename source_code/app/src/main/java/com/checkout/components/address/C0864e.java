package com.checkout.components.address;

import com.checkout.components.ui.model.CountryPickerType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.address.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0864e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f3883a;

    public C0864e(Function1 function1) {
        this.f3883a = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f3883a.invoke(CountryPickerType.Address);
        return Unit.INSTANCE;
    }
}
