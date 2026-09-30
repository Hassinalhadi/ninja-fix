package com.checkout.components.card;

import com.checkout.components.card.operations.network.model.CardMetaDataRequest;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepository;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.card.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0906v extends Pd.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardNumberViewModel f4605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0906v(CardNumberViewModel cardNumberViewModel, String str, Nd.c cVar) {
        super(1, cVar);
        this.f4605b = cardNumberViewModel;
        this.f4606c = str;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C0906v(this.f4605b, this.f4606c, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C0906v(this.f4605b, this.f4606c, (Nd.c) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object mo76sendCardMetaDataRequestgIAlus;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4604a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                mo76sendCardMetaDataRequestgIAlus = ((Result) obj).alpha;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            CardMetaDataRepository cardMetaDataRepository = this.f4605b.getCardMetaDataRepository();
            CardMetaDataRequest cardMetaDataRequest = new CardMetaDataRequest(this.f4606c);
            this.f4604a = 1;
            mo76sendCardMetaDataRequestgIAlus = cardMetaDataRepository.mo76sendCardMetaDataRequestgIAlus(cardMetaDataRequest, this);
            if (mo76sendCardMetaDataRequestgIAlus == aVar) {
                return aVar;
            }
        }
        return new Result(mo76sendCardMetaDataRequestgIAlus);
    }
}
