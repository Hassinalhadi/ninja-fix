package com.checkout.components.card;

import com.checkout.components.card.ui.component.address.AddressViewModel;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.card.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0886b extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressViewModel f3990b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0886b(AddressViewModel addressViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f3990b = addressViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0886b(this.f3990b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0886b(this.f3990b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3989a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            AddressViewModel addressViewModel = this.f3990b;
            this.f3989a = 1;
            if (AddressViewModel.access$subscribeFormValidation(addressViewModel, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
