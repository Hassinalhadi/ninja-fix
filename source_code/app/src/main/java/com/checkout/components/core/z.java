package com.checkout.components.core;

import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.network.model.request.PayPaymentSessionRequest;
import com.checkout.components.core.usecase.PayPaymentSessionUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class z extends Pd.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayPaymentSessionUseCase f5102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5104d;
    public final /* synthetic */ String e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayPaymentSessionRequest f5105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(PayPaymentSessionUseCase payPaymentSessionUseCase, String str, String str2, String str3, PayPaymentSessionRequest payPaymentSessionRequest, Nd.c cVar) {
        super(1, cVar);
        this.f5102b = payPaymentSessionUseCase;
        this.f5103c = str;
        this.f5104d = str2;
        this.e = str3;
        this.f5105f = payPaymentSessionRequest;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new z(this.f5102b, this.f5103c, this.f5104d, this.e, this.f5105f, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((z) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        PaymentRepository paymentRepository;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5101a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        paymentRepository = this.f5102b.f5058b;
        String echo = av.q.echo("Bearer ", this.f5103c);
        String str = this.f5104d;
        String str2 = this.e;
        PayPaymentSessionRequest payPaymentSessionRequest = this.f5105f;
        this.f5101a = 1;
        Object submitPaymentSession = paymentRepository.submitPaymentSession(echo, str, str2, payPaymentSessionRequest, this);
        if (submitPaymentSession == aVar) {
            return aVar;
        }
        return submitPaymentSession;
    }
}
