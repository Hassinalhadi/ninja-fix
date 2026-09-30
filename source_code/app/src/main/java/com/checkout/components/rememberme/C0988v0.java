package com.checkout.components.rememberme;

import com.checkout.components.rememberme.rememberme.RememberMeNavHostViewModel;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.rememberme.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0988v0 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f6358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RememberMeNavHostViewModel f6359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0988v0(RememberMeNavHostViewModel rememberMeNavHostViewModel, Nd.c cVar) {
        super(2, cVar);
        this.f6359b = rememberMeNavHostViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0988v0(this.f6359b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0988v0(this.f6359b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (((yf.InterfaceC3439i) r5).collect(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f6358a;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            mapJWTTokenToWalletUseCase = this.f6359b.f6208b;
            this.f6358a = 1;
            obj = mapJWTTokenToWalletUseCase.invoke$rememberme_standardRelease(this);
        }
        C0985u0 c0985u0 = new C0985u0(this.f6359b);
        this.f6358a = 2;
    }
}
