package com.checkout.components.address;

import com.checkout.components.ui.model.CountryPickerType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.address.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0863d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f3882a;

    public C0863d(Function1 function1) {
        this.f3882a = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f3882a.invoke(CountryPickerType.Phone);
        return Unit.INSTANCE;
    }
}
