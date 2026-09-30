package com.checkout.components.address;

import com.checkout.address.ui.edit.AddressEditViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.address.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0872m extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressEditViewModel f3895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0872m(AddressEditViewModel addressEditViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3895b = addressEditViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0872m(this.f3895b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0872m(this.f3895b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3894a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            AddressEditViewModel addressEditViewModel = this.f3895b;
            this.f3894a = 1;
            if (AddressEditViewModel.access$subscribeAddressCountryUpdated(addressEditViewModel, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
