package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.ui.component.address.AddressViewModel;

/* renamed from: com.checkout.components.card.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0889e extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressViewModel f4190b;

    /* renamed from: c, reason: collision with root package name */
    public int f4191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0889e(AddressViewModel addressViewModel, Nd.c cVar) {
        super(cVar);
        this.f4190b = addressViewModel;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4189a = obj;
        this.f4191c |= RecyclerView.UNDEFINED_DURATION;
        return AddressViewModel.access$subscribeIsCheckBoxCheckedUpdated(this.f4190b, this);
    }
}
