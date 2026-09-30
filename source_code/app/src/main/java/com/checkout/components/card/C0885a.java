package com.checkout.components.card;

import com.checkout.components.card.ui.component.address.AddressViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.card.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0885a extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressViewModel f3986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0885a(AddressViewModel addressViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3986b = addressViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0885a(this.f3986b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0885a(this.f3986b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3985a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            AddressViewModel addressViewModel = this.f3986b;
            this.f3985a = 1;
            if (AddressViewModel.access$subscribeIsCheckBoxCheckedUpdated(addressViewModel, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
