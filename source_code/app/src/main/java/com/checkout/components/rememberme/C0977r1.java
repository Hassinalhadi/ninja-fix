package com.checkout.components.rememberme;

import com.checkout.components.rememberme.data.ConsumerRepository;
import com.checkout.components.rememberme.model.SubmitSavedCardUseCaseRequest;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: com.checkout.components.rememberme.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0977r1 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f6203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubmitSavedCardUseCaseRequest f6204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6206d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0977r1(SubmitSavedCardUseCaseRequest submitSavedCardUseCaseRequest, String str, String str2, String str3, Nd.c cVar) {
        super(2, cVar);
        this.f6204b = submitSavedCardUseCaseRequest;
        this.f6205c = str;
        this.f6206d = str2;
        this.e = str3;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0977r1(this.f6204b, this.f6205c, this.f6206d, this.e, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0977r1) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m127createMerchantTokenyxL6bBk;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f6203a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                m127createMerchantTokenyxL6bBk = ((Result) obj).alpha;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            ConsumerRepository consumerRepository = this.f6204b.getConsumerRepository();
            String str = this.f6205c;
            String publicKey = this.f6204b.getPublicKey();
            String str2 = this.f6206d;
            String str3 = this.e;
            this.f6203a = 1;
            m127createMerchantTokenyxL6bBk = consumerRepository.m127createMerchantTokenyxL6bBk(str, publicKey, str2, str3, this);
            if (m127createMerchantTokenyxL6bBk == aVar) {
                return aVar;
            }
        }
        return new Result(m127createMerchantTokenyxL6bBk);
    }
}
