package com.checkout.components.rememberme;

import b5.AbstractC0718b;
import com.checkout.components.rememberme.data.TokeniseApi;
import com.checkout.components.rememberme.data.TokeniseRepository;
import com.checkout.components.rememberme.model.CvvTokenPayload;
import com.checkout.components.rememberme.model.TokenData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.rememberme.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0989v1 extends Pd.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TokeniseRepository f6361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6362c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0989v1(TokeniseRepository tokeniseRepository, String str, String str2, Nd.c cVar) {
        super(1, cVar);
        this.f6361b = tokeniseRepository;
        this.f6362c = str;
        this.f6363d = str2;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C0989v1(this.f6361b, this.f6362c, this.f6363d, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0989v1) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        TokeniseApi tokeniseApi;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f6360a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        tokeniseApi = this.f6361b.f5886a;
        CvvTokenPayload cvvTokenPayload = new CvvTokenPayload(new TokenData(this.f6362c), null, 2, null);
        String echo = av.q.echo("Bearer ", this.f6363d);
        this.f6360a = 1;
        Object alpha = AbstractC0718b.alpha(tokeniseApi, echo, null, null, cvvTokenPayload, this, 6, null);
        if (alpha == aVar) {
            return aVar;
        }
        return alpha;
    }
}
