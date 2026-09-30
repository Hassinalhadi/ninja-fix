package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.usecase.CheckIsAccountAvailablePrefilledUseCase;
import com.checkout.components.rememberme.utils.ExtensionsKt;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.rememberme.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0948i extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckIsAccountAvailablePrefilledUseCase f5951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0948i(CheckIsAccountAvailablePrefilledUseCase checkIsAccountAvailablePrefilledUseCase, String str, Nd.c cVar) {
        super(2, cVar);
        this.f5951b = checkIsAccountAvailablePrefilledUseCase;
        this.f5952c = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0948i(this.f5951b, this.f5952c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0948i(this.f5951b, this.f5952c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        CheckoutKMPRememberMe checkoutKMPRememberMe;
        PrimitiveStateFlowRepository primitiveStateFlowRepository;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5950a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            checkoutKMPRememberMe = this.f5951b.f6325a;
            String str = this.f5952c;
            this.f5950a = 1;
            obj = ExtensionsKt.isAccountAvailableForEmail(checkoutKMPRememberMe, str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        primitiveStateFlowRepository = this.f5951b.f6326b;
        primitiveStateFlowRepository.update((PrimitiveStateFlowRepository) bool);
        return Unit.INSTANCE;
    }
}
