package com.checkout.components.rememberme;

import b5.AbstractC0717a;
import com.checkout.components.rememberme.data.ConsumerApi;
import com.checkout.components.rememberme.data.ConsumerRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.rememberme.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0972q extends Pd.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConsumerRepository f6178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0972q(ConsumerRepository consumerRepository, String str, String str2, Nd.c cVar) {
        super(1, cVar);
        this.f6178b = consumerRepository;
        this.f6179c = str;
        this.f6180d = str2;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C0972q(this.f6178b, this.f6179c, this.f6180d, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0972q) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ConsumerApi consumerApi;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f6177a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        consumerApi = this.f6178b.f5883a;
        String str = this.f6179c;
        String str2 = this.f6180d;
        this.f6177a = 1;
        Object bravo = AbstractC0717a.bravo(consumerApi, str, str2, null, null, this, 12, null);
        if (bravo == aVar) {
            return aVar;
        }
        return bravo;
    }
}
