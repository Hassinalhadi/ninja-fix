package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.ui.component.address.AddressViewModel;

/* renamed from: com.checkout.components.card.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0887c extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressViewModel f3998b;

    /* renamed from: c, reason: collision with root package name */
    public int f3999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0887c(AddressViewModel addressViewModel, Nd.c cVar) {
        super(cVar);
        this.f3998b = addressViewModel;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f3997a = obj;
        this.f3999c |= RecyclerView.UNDEFINED_DURATION;
        return AddressViewModel.access$subscribeFormValidation(this.f3998b, this);
    }
}
