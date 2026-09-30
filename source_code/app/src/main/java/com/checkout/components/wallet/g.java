package com.checkout.components.wallet;

import Xd.l;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.ao;

/* loaded from: classes3.dex */
public final class g extends Pd.i implements l {

    /* renamed from: a, reason: collision with root package name */
    public Object f6510a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6511b;

    /* renamed from: c, reason: collision with root package name */
    public int f6512c;

    /* renamed from: d, reason: collision with root package name */
    public int f6513d;
    public final /* synthetic */ WalletComponent e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WalletComponent walletComponent, Nd.c cVar) {
        super(2, cVar);
        this.e = walletComponent;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.e, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.e, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (vf.ad.blue(r8, r2, r7) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WalletComponent walletComponent;
        ComponentCallback componentCallback;
        int i4;
        ComponentCallback componentCallback2;
        Od.a aVar = Od.a.alpha;
        int i5 = this.f6513d;
        boolean z2 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.f6512c;
            walletComponent = (WalletComponent) this.f6510a;
            ResultKt.alpha(obj);
            if (!((Boolean) obj).booleanValue()) {
                z2 = true;
            }
        } else {
            ResultKt.alpha(obj);
            if (this.e.getMediator() != null) {
                walletComponent = this.e;
                if (!WalletComponent.access$isPaymentInProgress(walletComponent)) {
                    componentCallback = walletComponent.getComponentCallback();
                    l handleTap = componentCallback.getHandleTap();
                    if (handleTap != null) {
                        this.f6510a = walletComponent;
                        this.f6511b = null;
                        this.f6512c = 0;
                        this.f6513d = 1;
                        obj = handleTap.invoke(walletComponent, this);
                        if (obj != aVar) {
                            i4 = 0;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        return aVar;
                    }
                    i4 = 0;
                }
                return Unit.INSTANCE;
            }
            this.e.handleComponentNotChecked$wallet_standardRelease();
            return Unit.INSTANCE;
        }
        if (!z2) {
            componentCallback2 = walletComponent.getComponentCallback();
            Function1<PaymentMethodComponent, Unit> onSubmit = componentCallback2.getOnSubmit();
            if (onSubmit != null) {
                onSubmit.invoke(walletComponent);
            }
            Cf.e eVar = ao.alpha;
            Cf.d dVar = Cf.d.purple;
            f fVar = new f(walletComponent, null);
            this.f6510a = null;
            this.f6511b = null;
            this.f6512c = i4;
            this.f6513d = 2;
        }
        return Unit.INSTANCE;
    }
}
