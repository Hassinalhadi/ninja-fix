package com.checkout.components.rememberme;

import com.checkout.components.rememberme.data.TokeniseRepository;
import com.checkout.components.rememberme.model.SubmitSavedCardUseCaseRequest;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.rememberme.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0980s1 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f6267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubmitSavedCardUseCaseRequest f6268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980s1(SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest, String str, Nd.c cVar) {
        super(2, cVar);
        this.f6268b = submitSavedCardUseCaseRequest;
        this.f6269c = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0980s1(this.f6268b, this.f6269c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0980s1(this.f6268b, this.f6269c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m129createCvvToken0E7RQCE;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f6267a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                m129createCvvToken0E7RQCE = ((Result) obj).alpha;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            TokeniseRepository tokeniseRepository = this.f6268b.getTokeniseRepository();
            String str = this.f6269c;
            String publicKey = this.f6268b.getPublicKey();
            this.f6267a = 1;
            m129createCvvToken0E7RQCE = tokeniseRepository.m129createCvvToken0E7RQCE(str, publicKey, this);
            if (m129createCvvToken0E7RQCE == aVar) {
                return aVar;
            }
        }
        return new Result(m129createCvvToken0E7RQCE);
    }
}
