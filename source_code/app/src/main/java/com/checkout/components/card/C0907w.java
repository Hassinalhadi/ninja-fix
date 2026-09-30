package com.checkout.components.card;

import com.checkout.components.card.model.RetryCardMataDataApiContext;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* renamed from: com.checkout.components.card.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0907w extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public String f4607a;

    /* renamed from: b, reason: collision with root package name */
    public int f4608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f4610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0907w(String str, CardNumberViewModel cardNumberViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f4609c = str;
        this.f4610d = cardNumberViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0907w(this.f4609c, this.f4610d, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0907w(this.f4609c, this.f4610d, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4608b;
        if (i4 != 0) {
            if (i4 == 1) {
                str = this.f4607a;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            String yellow = StringsKt.yellow(8, this.f4609c);
            CardNumberViewModel cardNumberViewModel = this.f4610d;
            C0906v c0906v = new C0906v(cardNumberViewModel, yellow, null);
            this.f4607a = yellow;
            this.f4608b = 1;
            Object access$executeWithRetry = CardNumberViewModel.access$executeWithRetry(cardNumberViewModel, c0906v, this);
            if (access$executeWithRetry == aVar) {
                return aVar;
            }
            str = yellow;
            obj = access$executeWithRetry;
        }
        Pair pair = (Pair) obj;
        CardNumberViewModel.access$handleCardMetaDataResult(this.f4610d, ((Result) pair.first).alpha, (RetryCardMataDataApiContext) pair.second, str, this.f4609c);
        return Unit.INSTANCE;
    }
}
