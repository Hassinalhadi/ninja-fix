package com.checkout.components.card;

import com.checkout.components.ui.model.CardScheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class a0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f3987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardScheme f3988b;

    public a0(Function1 function1, CardScheme cardScheme) {
        this.f3987a = function1;
        this.f3988b = cardScheme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f3987a.invoke(this.f3988b);
        return Unit.INSTANCE;
    }
}
