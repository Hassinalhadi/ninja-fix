package com.checkout.components.card.operations.tokenisation.repository;

import Nd.c;
import Pd.i;
import Xd.l;
import com.checkout.components.card.operations.network.NetworkApiClient;
import com.checkout.components.card.operations.network.model.NetworkApiResponse;
import com.checkout.components.card.operations.tokenisation.network.model.CardTokenRequest;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import vf.ab;

/* loaded from: classes3.dex */
public final class a extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f4362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkApiResponse f4363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TokenRepositoryImpl f4364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CardTokenRequest f4365d;
    public final /* synthetic */ boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NetworkApiClient f4366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NetworkApiResponse networkApiResponse, TokenRepositoryImpl tokenRepositoryImpl, CardTokenRequest cardTokenRequest, boolean z2, NetworkApiClient networkApiClient, c cVar) {
        super(2, cVar);
        this.f4363b = networkApiResponse;
        this.f4364c = tokenRepositoryImpl;
        this.f4365d = cardTokenRequest;
        this.e = z2;
        this.f4366f = networkApiClient;
    }

    @Override // Pd.a
    public final c create(Object obj, c cVar) {
        return new a(this.f4363b, this.f4364c, this.f4365d, this.e, this.f4366f, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ab) obj, (c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        NetworkApiClient networkApiClient;
        NetworkApiClient networkApiClient2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4362a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            NetworkApiResponse networkApiResponse = this.f4363b;
            if (networkApiResponse instanceof NetworkApiResponse.Success) {
                TokenRepositoryImpl tokenRepositoryImpl = this.f4364c;
                TokenDetailsResponse tokenDetailsResponse = (TokenDetailsResponse) ((NetworkApiResponse.Success) networkApiResponse).getBody();
                Headers headers = ((NetworkApiResponse.Success) this.f4363b).getHeaders();
                Function0<Unit> onSuccess = this.f4365d.getOnSuccess();
                boolean z2 = this.e;
                this.f4362a = 1;
                if (TokenRepositoryImpl.access$handleSuccess(tokenRepositoryImpl, tokenDetailsResponse, headers, onSuccess, z2, this) == aVar) {
                    return aVar;
                }
            } else if (networkApiResponse instanceof NetworkApiResponse.Error) {
                NetworkApiClient networkApiClient3 = this.f4366f;
                networkApiClient = this.f4364c.f4354b;
                if (!Intrinsics.areEqual(networkApiClient3, networkApiClient)) {
                    this.f4364c.a((NetworkApiResponse.Error) this.f4363b, this.f4365d.getOnFailure());
                } else {
                    TokenRepositoryImpl tokenRepositoryImpl2 = this.f4364c;
                    CardTokenRequest cardTokenRequest = this.f4365d;
                    boolean z10 = this.e;
                    networkApiClient2 = tokenRepositoryImpl2.f4353a;
                    TokenRepositoryImpl.a(tokenRepositoryImpl2, cardTokenRequest, z10, networkApiClient2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
