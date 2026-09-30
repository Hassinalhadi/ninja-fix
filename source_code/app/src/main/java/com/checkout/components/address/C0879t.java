package com.checkout.components.address;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.address.ui.edit.AddressEditViewModel;

/* renamed from: com.checkout.components.address.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0879t extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressEditViewModel f3910b;

    /* renamed from: c, reason: collision with root package name */
    public int f3911c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0879t(AddressEditViewModel addressEditViewModel, Nd.c cVar) {
        super(cVar);
        this.f3910b = addressEditViewModel;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f3909a = obj;
        this.f3911c |= RecyclerView.UNDEFINED_DURATION;
        return AddressEditViewModel.access$subscribePhoneStateUpdated(this.f3910b, this);
    }
}
