package com.checkout.components.card;

import com.checkout.components.card.ui.component.cvv.CVVViewModel;
import com.checkout.components.ui.model.CardScheme;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import yf.InterfaceC3440j;

/* renamed from: com.checkout.components.card.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0891g implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CVVViewModel f4193a;

    public C0891g(CVVViewModel cVVViewModel) {
        this.f4193a = cVVViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        this.f4193a.getState$card_standardRelease().getInputFieldState().getMaxLength().setValue(CollectionsKt.purple(((CardScheme) obj).getCvvLength()));
        return Unit.INSTANCE;
    }
}
