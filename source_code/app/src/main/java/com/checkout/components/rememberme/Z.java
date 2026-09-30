package com.checkout.components.rememberme;

import com.checkout.components.rememberme.data.ConsumerRepository;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class Z extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapJWTTokenToWalletUseCase f5839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase, String str, String str2, Nd.c cVar) {
        super(2, cVar);
        this.f5839b = mapJWTTokenToWalletUseCase;
        this.f5840c = str;
        this.f5841d = str2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Z(this.f5839b, this.f5840c, this.f5841d, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ConsumerRepository consumerRepository;
        Object m128getWallet0E7RQCE;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5838a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                m128getWallet0E7RQCE = ((Result) obj).alpha;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            consumerRepository = this.f5839b.f6334b;
            String str = this.f5840c;
            String str2 = this.f5841d;
            this.f5838a = 1;
            m128getWallet0E7RQCE = consumerRepository.m128getWallet0E7RQCE(str, str2, this);
            if (m128getWallet0E7RQCE == aVar) {
                return aVar;
            }
        }
        return new Result(m128getWallet0E7RQCE);
    }
}
