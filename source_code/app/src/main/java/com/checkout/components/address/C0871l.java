package com.checkout.components.address;

import com.checkout.address.ui.edit.AddressEditViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.address.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0871l extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressEditViewModel f3893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0871l(AddressEditViewModel addressEditViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3893b = addressEditViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0871l(this.f3893b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0871l(this.f3893b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3892a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            AddressEditViewModel addressEditViewModel = this.f3893b;
            this.f3892a = 1;
            if (AddressEditViewModel.access$subscribePhoneStateUpdated(addressEditViewModel, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
