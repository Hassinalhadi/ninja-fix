package com.checkout.components.core;

import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.usecase.GetPaymentSessionUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class m extends Pd.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetPaymentSessionUseCase f4824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4826d;
    public final /* synthetic */ String e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4827f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(GetPaymentSessionUseCase getPaymentSessionUseCase, String str, String str2, String str3, String str4, Nd.c cVar) {
        super(1, cVar);
        this.f4824b = getPaymentSessionUseCase;
        this.f4825c = str;
        this.f4826d = str2;
        this.e = str3;
        this.f4827f = str4;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new m(this.f4824b, this.f4825c, this.f4826d, this.e, this.f4827f, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PaymentRepository paymentRepository;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4823a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        paymentRepository = this.f4824b.f5055b;
        String echo = av.q.echo("Bearer ", this.f4825c);
        String str = this.f4826d;
        String str2 = this.e;
        String str3 = this.f4827f;
        this.f4823a = 1;
        Object paymentSession = paymentRepository.getPaymentSession(echo, str, str2, str3, this);
        if (paymentSession == aVar) {
            return aVar;
        }
        return paymentSession;
    }
}
