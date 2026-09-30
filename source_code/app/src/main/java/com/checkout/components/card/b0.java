package com.checkout.components.card;

import com.checkout.components.card.operations.network.NetworkApiClient;
import com.checkout.components.card.operations.network.model.NetworkApiResponse;
import com.checkout.components.card.operations.tokenisation.network.model.CardTokenRequest;
import com.checkout.components.card.operations.tokenisation.network.model.TokenRequest;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepositoryImpl;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.Headers;
import vf.ab;
import vf.ad;
import vf.ao;

/* loaded from: classes3.dex */
public final class b0 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3991a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NetworkApiClient f3993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CardTokenRequest f3994d;
    public final /* synthetic */ Headers e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TokenRepositoryImpl f3995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f3996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(NetworkApiClient networkApiClient, CardTokenRequest cardTokenRequest, Headers headers, TokenRepositoryImpl tokenRepositoryImpl, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.f3993c = networkApiClient;
        this.f3994d = cardTokenRequest;
        this.e = headers;
        this.f3995f = tokenRepositoryImpl;
        this.f3996g = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        b0 b0Var = new b0(this.f3993c, this.f3994d, this.e, this.f3995f, this.f3996g, cVar);
        b0Var.f3992b = obj;
        return b0Var;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ab abVar = (ab) this.f3992b;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3991a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            NetworkApiClient networkApiClient = this.f3993c;
            TokenRequest tokenRequest = this.f3994d.getTokenRequest();
            Headers headers = this.e;
            this.f3992b = abVar;
            this.f3991a = 1;
            obj = networkApiClient.sendCardTokenRequest(tokenRequest, headers, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        NetworkApiResponse networkApiResponse = (NetworkApiResponse) obj;
        Cf.e eVar = ao.alpha;
        ad.zulu(abVar, Af.n.alpha, null, new com.checkout.components.card.operations.tokenisation.repository.a(networkApiResponse, this.f3995f, this.f3994d, this.f3996g, this.f3993c, null), 2);
        return Unit.INSTANCE;
    }
}
