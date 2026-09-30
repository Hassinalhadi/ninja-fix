package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.usecase.CheckIsAccountAvailableUseCase;
import com.checkout.components.rememberme.utils.ExtensionsKt;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.rememberme.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0954k extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckIsAccountAvailableUseCase f5971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0954k(CheckIsAccountAvailableUseCase checkIsAccountAvailableUseCase, String str, Nd.c cVar) {
        super(2, cVar);
        this.f5971b = checkIsAccountAvailableUseCase;
        this.f5972c = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0954k(this.f5971b, this.f5972c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0954k(this.f5971b, this.f5972c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CheckoutKMPRememberMe checkoutKMPRememberMe;
        PrimitiveSharedFlowRepository primitiveSharedFlowRepository;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5970a;
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
            checkoutKMPRememberMe = this.f5971b.f6328a;
            String str = this.f5972c;
            this.f5970a = 1;
            obj = ExtensionsKt.isAccountAvailableForEmail(checkoutKMPRememberMe, str, this);
        }
        if (((Boolean) obj).booleanValue()) {
            primitiveSharedFlowRepository = this.f5971b.f6329b;
            RememberMeScreen.Authentication authentication = RememberMeScreen.Authentication.INSTANCE;
            this.f5970a = 2;
        }
        return Unit.INSTANCE;
    }
}
