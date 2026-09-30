package com.checkout.components.rememberme;

import b5.AbstractC0717a;
import com.checkout.components.rememberme.data.ConsumerApi;
import com.checkout.components.rememberme.data.ConsumerRepository;
import com.checkout.components.rememberme.model.CreateMerchantTokenRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.rememberme.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0966o extends Pd.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConsumerRepository f6163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6164c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6165d;
    public final /* synthetic */ String e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0966o(ConsumerRepository consumerRepository, String str, String str2, String str3, String str4, Nd.c cVar) {
        super(1, cVar);
        this.f6163b = consumerRepository;
        this.f6164c = str;
        this.f6165d = str2;
        this.e = str3;
        this.f6166f = str4;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C0966o(this.f6163b, this.f6164c, this.f6165d, this.e, this.f6166f, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0966o) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ConsumerApi consumerApi;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f6162a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        consumerApi = this.f6163b.f5883a;
        String str = this.f6164c;
        CreateMerchantTokenRequest createMerchantTokenRequest = new CreateMerchantTokenRequest(this.f6165d);
        String str2 = this.e;
        String str3 = this.f6166f;
        this.f6162a = 1;
        Object alpha = AbstractC0717a.alpha(consumerApi, str, null, null, createMerchantTokenRequest, str2, str3, this, 6, null);
        if (alpha == aVar) {
            return aVar;
        }
        return alpha;
    }
}
